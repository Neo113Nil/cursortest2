package j0;

import S0.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.FP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4605b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f38408f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C4605b f38409g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f38410a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38411b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38412c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f38413d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final FP f38414e;

    public C4605b(Context context) {
        this.f38410a = context;
        this.f38414e = new FP(this, context.getMainLooper());
    }

    public static C4605b a(Context context) {
        C4605b c4605b;
        synchronized (f38408f) {
            try {
                if (f38409g == null) {
                    f38409g = new C4605b(context.getApplicationContext());
                }
                c4605b = f38409g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4605b;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f38411b) {
            try {
                C4604a c4604a = new C4604a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f38411b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f38411b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c4604a);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f38412c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f38412c.put(action, arrayList2);
                    }
                    arrayList2.add(c4604a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f38411b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f38410a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f38412c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z6) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        C4604a c4604a = (C4604a) arrayList2.get(i);
                        if (z6) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + c4604a.f38404a);
                        }
                        if (c4604a.f38406c) {
                            if (z6) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = c4604a.f38404a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z6) {
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
                                arrayList3.add(c4604a);
                                c4604a.f38406c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z6) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : NativeAdvancedJsUtils.f18693p : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            ((C4604a) arrayList3.get(i4)).f38406c = false;
                        }
                        this.f38413d.add(new l(29, intent, arrayList3));
                        if (!this.f38414e.hasMessages(1)) {
                            this.f38414e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f38411b) {
            try {
                ArrayList arrayList = (ArrayList) this.f38411b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C4604a c4604a = (C4604a) arrayList.get(size);
                    c4604a.f38407d = true;
                    for (int i = 0; i < c4604a.f38404a.countActions(); i++) {
                        String action = c4604a.f38404a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f38412c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C4604a c4604a2 = (C4604a) arrayList2.get(size2);
                                if (c4604a2.f38405b == broadcastReceiver) {
                                    c4604a2.f38407d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f38412c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
