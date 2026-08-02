package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final int f15113a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final String f15114b = "InnerBroadcastManager";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15115c = false;
    private static final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static l f15116j;

    /* renamed from: d, reason: collision with root package name */
    private final Context f15117d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f15118e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f15119f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f15120g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f15121h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f15123a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f15124b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f15123a = intent;
            this.f15124b = arrayList;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f15130a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f15131b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15132c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15133d;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f15130a = intentFilter;
            this.f15131b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f15131b);
            sb.append(" filter=");
            sb.append(this.f15130a);
            if (this.f15133d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private l(Context context) {
        this.f15117d = context;
        this.f15121h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.l.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    l.this.a();
                }
            }
        };
    }

    public static l a(Context context) {
        l lVar;
        synchronized (i) {
            try {
                if (f15116j == null) {
                    f15116j = new l(context.getApplicationContext());
                }
                lVar = f15116j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    private void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f15118e) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<b> arrayList = this.f15118e.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f15118e.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList<b> arrayList2 = this.f15119f.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f15119f.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f15118e) {
            try {
                ArrayList<b> remove = this.f15118e.remove(broadcastReceiver);
                if (remove != null) {
                    for (int size = remove.size() - 1; size >= 0; size--) {
                        b bVar = remove.get(size);
                        bVar.f15133d = true;
                        for (int i4 = 0; i4 < bVar.f15130a.countActions(); i4++) {
                            String action = bVar.f15130a.getAction(i4);
                            ArrayList<b> arrayList = this.f15119f.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    b bVar2 = arrayList.get(size2);
                                    if (bVar2.f15131b == broadcastReceiver) {
                                        bVar2.f15133d = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    this.f15119f.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(Intent intent) {
        String str;
        String str2;
        synchronized (this.f15118e) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15117d.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.f15119f.get(intent.getAction());
                if (arrayList != null) {
                    if (z6) {
                        Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        b bVar = arrayList.get(i4);
                        if (z6) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f15130a);
                        }
                        if (bVar.f15132c) {
                            if (z6) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = bVar.f15130a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z6) {
                                    str = action;
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f15132c = true;
                            } else {
                                str = action;
                                if (z6) {
                                    if (match == -4) {
                                        str2 = "category";
                                    } else if (match == -3) {
                                        str2 = NativeAdvancedJsUtils.f18693p;
                                    } else if (match == -2) {
                                        str2 = "data";
                                    } else if (match != -1) {
                                        str2 = "unknown reason";
                                    } else {
                                        str2 = "type";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(str2));
                                }
                            }
                        }
                        i4++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            ((b) arrayList2.get(i6)).f15132c = false;
                        }
                        this.f15120g.add(new a(intent, arrayList2));
                        if (!this.f15121h.hasMessages(1)) {
                            this.f15121h.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f15118e) {
                try {
                    size = this.f15120g.size();
                    if (size <= 0) {
                        return;
                    }
                    aVarArr = new a[size];
                    this.f15120g.toArray(aVarArr);
                    this.f15120g.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = aVarArr[i4];
                int size2 = aVar.f15124b.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    b bVar = aVar.f15124b.get(i6);
                    if (!bVar.f15133d) {
                        bVar.f15131b.onReceive(this.f15117d, aVar.f15123a);
                    }
                }
            }
        }
    }
}
