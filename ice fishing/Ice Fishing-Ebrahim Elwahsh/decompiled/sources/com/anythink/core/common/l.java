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
    static final int f14484a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final String f14485b = "InnerBroadcastManager";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f14486c = false;
    private static final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static l f14487j;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14488d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f14489e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f14490f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f14491g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f14492h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f14494a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f14495b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f14494a = intent;
            this.f14495b = arrayList;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f14501a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f14502b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14503c;

        /* renamed from: d, reason: collision with root package name */
        boolean f14504d;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f14501a = intentFilter;
            this.f14502b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f14502b);
            sb.append(" filter=");
            sb.append(this.f14501a);
            if (this.f14504d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private l(Context context) {
        this.f14488d = context;
        this.f14492h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.l.1
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
                if (f14487j == null) {
                    f14487j = new l(context.getApplicationContext());
                }
                lVar = f14487j;
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
        synchronized (this.f14489e) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<b> arrayList = this.f14489e.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f14489e.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList<b> arrayList2 = this.f14490f.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f14490f.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14489e) {
            try {
                ArrayList<b> remove = this.f14489e.remove(broadcastReceiver);
                if (remove != null) {
                    for (int size = remove.size() - 1; size >= 0; size--) {
                        b bVar = remove.get(size);
                        bVar.f14504d = true;
                        for (int i4 = 0; i4 < bVar.f14501a.countActions(); i4++) {
                            String action = bVar.f14501a.getAction(i4);
                            ArrayList<b> arrayList = this.f14490f.get(action);
                            if (arrayList != null) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    b bVar2 = arrayList.get(size2);
                                    if (bVar2.f14502b == broadcastReceiver) {
                                        bVar2.f14504d = true;
                                        arrayList.remove(size2);
                                    }
                                }
                                if (arrayList.size() <= 0) {
                                    this.f14490f.remove(action);
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
        synchronized (this.f14489e) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14488d.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z8 = (intent.getFlags() & 8) != 0;
                if (z8) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.f14490f.get(intent.getAction());
                if (arrayList != null) {
                    if (z8) {
                        Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        b bVar = arrayList.get(i4);
                        if (z8) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f14501a);
                        }
                        if (bVar.f14503c) {
                            if (z8) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = bVar.f14501a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z8) {
                                    str = action;
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f14503c = true;
                            } else {
                                str = action;
                                if (z8) {
                                    if (match == -4) {
                                        str2 = "category";
                                    } else if (match == -3) {
                                        str2 = NativeAdvancedJsUtils.f18064p;
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
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            ((b) arrayList2.get(i9)).f14503c = false;
                        }
                        this.f14491g.add(new a(intent, arrayList2));
                        if (!this.f14492h.hasMessages(1)) {
                            this.f14492h.sendEmptyMessage(1);
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
            synchronized (this.f14489e) {
                try {
                    size = this.f14491g.size();
                    if (size <= 0) {
                        return;
                    }
                    aVarArr = new a[size];
                    this.f14491g.toArray(aVarArr);
                    this.f14491g.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = aVarArr[i4];
                int size2 = aVar.f14495b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    b bVar = aVar.f14495b.get(i9);
                    if (!bVar.f14504d) {
                        bVar.f14502b.onReceive(this.f14488d, aVar.f14494a);
                    }
                }
            }
        }
    }
}
