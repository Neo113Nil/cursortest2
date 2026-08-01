package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15930b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15931c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* renamed from: d, reason: collision with root package name */
    public static final String f15932d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";

    /* renamed from: e, reason: collision with root package name */
    public static final String f15933e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";

    /* renamed from: f, reason: collision with root package name */
    private static final String f15934f = "code";

    /* renamed from: g, reason: collision with root package name */
    private static final String f15935g = "packageName";

    /* renamed from: j, reason: collision with root package name */
    private static volatile String f15936j;

    /* renamed from: n, reason: collision with root package name */
    private static volatile o f15937n;

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f15938a;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.core.common.h.w> f15939h = new CopyOnWriteArrayList<>();
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private volatile Boolean f15940k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.h.w f15941l;

    /* renamed from: m, reason: collision with root package name */
    private Context f15942m;

    /* renamed from: com.anythink.core.common.o$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        private com.anythink.core.common.h.w a(String str) {
            if (o.this.f15941l != null && TextUtils.equals(o.this.f15941l.I(), str)) {
                return o.this.f15941l;
            }
            if (o.this.f15939h == null || o.this.f15939h.size() <= 0) {
                return null;
            }
            Iterator it = o.this.f15939h.iterator();
            while (it.hasNext()) {
                com.anythink.core.common.h.w wVar = (com.anythink.core.common.h.w) it.next();
                if (wVar != null && TextUtils.equals(wVar.I(), str)) {
                    return wVar;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            com.anythink.core.common.h.w wVar;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(com.anythink.core.common.v.k.b(o.f15930b)) || action.equals(com.anythink.core.common.v.k.b(o.f15931c)) || !action.equals(com.anythink.core.common.v.k.b(o.f15932d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("code", -1);
            String string = extras.getString(o.f15935g, "");
            if (i == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (o.this.f15941l == null || !TextUtils.equals(o.this.f15941l.I(), string)) {
                if (o.this.f15939h != null && o.this.f15939h.size() > 0) {
                    Iterator it = o.this.f15939h.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.h.w wVar2 = (com.anythink.core.common.h.w) it.next();
                        if (wVar2 != null && TextUtils.equals(wVar2.I(), string)) {
                            wVar = wVar2;
                            break;
                        }
                    }
                }
                wVar = null;
            } else {
                wVar = o.this.f15941l;
            }
            if (wVar == null) {
                return;
            }
            if (i == 4) {
                o.this.b(wVar);
            }
            com.anythink.core.common.u.e.a(wVar.q(), wVar.v(), "", i, "", 0L, 0L, wVar.ap(), wVar.aq());
        }
    }

    private o() {
    }

    private com.anythink.core.common.h.w d() {
        return this.f15941l;
    }

    private void e() {
        if (this.f15940k == null || !this.f15940k.booleanValue() || this.f15942m == null) {
            return;
        }
        try {
            this.f15938a = new AnonymousClass1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.v.k.b(f15930b));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f15931c));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f15932d));
            this.f15942m.registerReceiver(this.f15938a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    private static Boolean f() {
        Cursor cursor;
        Context g4 = com.anythink.core.common.d.t.b().g();
        Boolean bool = null;
        if (g4 != null && g4.getContentResolver() != null) {
            try {
                cursor = g4.getContentResolver().query(Uri.parse(com.anythink.core.common.v.k.b(f15933e)), null, null, null, null);
            } catch (Throwable unused) {
                cursor = null;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        f15936j = cursor.getString(cursor.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursor.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return bool;
    }

    public final int c() {
        if (this.f15940k != null) {
            return this.f15940k.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static o a() {
        if (f15937n == null) {
            synchronized (o.class) {
                try {
                    if (f15937n == null) {
                        f15937n = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15937n;
    }

    public final void b(com.anythink.core.common.h.w wVar) {
        if (this.f15940k == null || wVar == null || !this.f15940k.booleanValue()) {
            return;
        }
        this.f15941l = null;
        try {
            this.f15939h.remove(wVar);
        } catch (Exception unused) {
        }
    }

    private void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.f15938a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.f15941l = null;
        this.f15939h.clear();
        this.f15939h = null;
        this.f15938a = null;
        this.f15942m = null;
    }

    public final void a(com.anythink.core.common.h.w wVar) {
        if (this.f15940k == null || wVar == null || !this.f15940k.booleanValue()) {
            return;
        }
        this.f15941l = wVar;
        this.f15939h.add(wVar);
    }

    public final void a(Context context) {
        this.f15942m = context;
        if (this.i.compareAndSet(false, true)) {
            try {
                this.f15940k = f();
                if (this.f15940k == null || !this.f15940k.booleanValue() || this.f15942m == null) {
                    return;
                }
                this.f15938a = new AnonymousClass1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.anythink.core.common.v.k.b(f15930b));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f15931c));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f15932d));
                this.f15942m.registerReceiver(this.f15938a, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        try {
            if (f15936j == null) {
                return "";
            }
            return "[" + f15936j + "]";
        } catch (Throwable unused) {
            return "";
        }
    }
}
