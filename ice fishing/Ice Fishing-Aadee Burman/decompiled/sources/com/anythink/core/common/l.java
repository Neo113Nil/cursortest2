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
    static final int f14327a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final String f14328b = "InnerBroadcastManager";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f14329c = false;
    private static final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static l f14330j;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14331d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f14332e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f14333f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f14334g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f14335h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f14337a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f14338b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f14337a = intent;
            this.f14338b = arrayList;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f14344a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f14345b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14346c;

        /* renamed from: d, reason: collision with root package name */
        boolean f14347d;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f14344a = intentFilter;
            this.f14345b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f14345b);
            sb.append(" filter=");
            sb.append(this.f14344a);
            if (this.f14347d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private l(Context context) {
        this.f14331d = context;
        this.f14335h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.l.1
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
                if (f14330j == null) {
                    f14330j = new l(context.getApplicationContext());
                }
                lVar = f14330j;
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
        synchronized (this.f14332e) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<b> arrayList = this.f14332e.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f14332e.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i6 = 0; i6 < intentFilter.countActions(); i6++) {
                    String action = intentFilter.getAction(i6);
                    ArrayList<b> arrayList2 = this.f14333f.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f14333f.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14332e) {
            try {
                ArrayList<b> remove = this.f14332e.remove(broadcastReceiver);
                if (remove != null) {
                    for (int size = remove.size() - 1; size >= 0; size--) {
                        b bVar = remove.get(size);
                        bVar.f14347d = true;
                        for (int i6 = 0; i6 < bVar.f14344a.countActions(); i6++) {
                            String action = bVar.f14344a.getAction(i6);
                            ArrayList<b> arrayList = this.f14333f.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    b bVar2 = arrayList.get(size2);
                                    if (bVar2.f14345b == broadcastReceiver) {
                                        bVar2.f14347d = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    this.f14333f.remove(action);
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
        synchronized (this.f14332e) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14331d.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.f14333f.get(intent.getAction());
                if (arrayList != null) {
                    if (z3) {
                        Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i6 = 0;
                    while (i6 < arrayList.size()) {
                        b bVar = arrayList.get(i6);
                        if (z3) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f14344a);
                        }
                        if (bVar.f14346c) {
                            if (z3) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = bVar.f14344a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z3) {
                                    str = action;
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f14346c = true;
                            } else {
                                str = action;
                                if (z3) {
                                    if (match == -4) {
                                        str2 = "category";
                                    } else if (match == -3) {
                                        str2 = NativeAdvancedJsUtils.f17906p;
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
                        i6++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            ((b) arrayList2.get(i9)).f14346c = false;
                        }
                        this.f14334g.add(new a(intent, arrayList2));
                        if (!this.f14335h.hasMessages(1)) {
                            this.f14335h.sendEmptyMessage(1);
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
            synchronized (this.f14332e) {
                try {
                    size = this.f14334g.size();
                    if (size <= 0) {
                        return;
                    }
                    aVarArr = new a[size];
                    this.f14334g.toArray(aVarArr);
                    this.f14334g.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = aVarArr[i6];
                int size2 = aVar.f14338b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    b bVar = aVar.f14338b.get(i9);
                    if (!bVar.f14347d) {
                        bVar.f14345b.onReceive(this.f14331d, aVar.f14337a);
                    }
                }
            }
        }
    }
}
