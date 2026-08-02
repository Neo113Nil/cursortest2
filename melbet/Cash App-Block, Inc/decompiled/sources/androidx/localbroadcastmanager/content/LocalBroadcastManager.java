package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import androidx.camera.video.Recorder;
import com.squareup.scannerview.CameraOperator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class LocalBroadcastManager {
    public static LocalBroadcastManager mInstance;
    public static final Object mLock = new Object();
    public final Context mAppContext;
    public final CameraOperator.AnonymousClass2 mHandler;
    public final HashMap mReceivers = new HashMap();
    public final HashMap mActions = new HashMap();
    public final ArrayList mPendingBroadcasts = new ArrayList();

    public final class ReceiverRecord {
        public boolean broadcasting;
        public boolean dead;
        public final IntentFilter filter;
        public final BroadcastReceiver receiver;

        public ReceiverRecord(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            if (this.dead) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new CameraOperator.AnonymousClass2(this, context.getMainLooper(), 2);
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(receiverRecord);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void sendBroadcast(Intent intent) {
        ArrayList arrayList;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.mActions.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        ReceiverRecord receiverRecord = (ReceiverRecord) arrayList2.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.filter);
                        }
                        if (receiverRecord.broadcasting) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = receiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(receiverRecord);
                                receiverRecord.broadcasting = true;
                            } else {
                                arrayList = arrayList2;
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            ((ReceiverRecord) arrayList3.get(i2)).broadcasting = false;
                        }
                        this.mPendingBroadcasts.add(new Recorder.AnonymousClass4(intent, arrayList3, false, 27));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
