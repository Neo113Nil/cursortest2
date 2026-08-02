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
    public static final String f16717b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16718c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16719d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16720e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16721f = "code";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16722g = "packageName";

    /* renamed from: j, reason: collision with root package name */
    private static volatile String f16723j;

    /* renamed from: n, reason: collision with root package name */
    private static volatile o f16724n;

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f16725a;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.core.common.h.w> f16726h = new CopyOnWriteArrayList<>();
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private volatile Boolean f16727k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.h.w f16728l;

    /* renamed from: m, reason: collision with root package name */
    private Context f16729m;

    /* renamed from: com.anythink.core.common.o$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        private com.anythink.core.common.h.w a(String str) {
            if (o.this.f16728l != null && TextUtils.equals(o.this.f16728l.I(), str)) {
                return o.this.f16728l;
            }
            if (o.this.f16726h == null || o.this.f16726h.size() <= 0) {
                return null;
            }
            Iterator it = o.this.f16726h.iterator();
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
            if (TextUtils.isEmpty(action) || action.equals(com.anythink.core.common.v.k.b(o.f16717b)) || action.equals(com.anythink.core.common.v.k.b(o.f16718c)) || !action.equals(com.anythink.core.common.v.k.b(o.f16719d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("code", -1);
            String string = extras.getString(o.f16722g, "");
            if (i == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (o.this.f16728l == null || !TextUtils.equals(o.this.f16728l.I(), string)) {
                if (o.this.f16726h != null && o.this.f16726h.size() > 0) {
                    Iterator it = o.this.f16726h.iterator();
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
                wVar = o.this.f16728l;
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
        return this.f16728l;
    }

    private void e() {
        if (this.f16727k == null || !this.f16727k.booleanValue() || this.f16729m == null) {
            return;
        }
        try {
            this.f16725a = new AnonymousClass1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16717b));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16718c));
            intentFilter.addAction(com.anythink.core.common.v.k.b(f16719d));
            this.f16729m.registerReceiver(this.f16725a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    private static Boolean f() {
        Cursor cursor;
        Context g9 = com.anythink.core.common.d.t.b().g();
        Boolean bool = null;
        if (g9 != null && g9.getContentResolver() != null) {
            try {
                cursor = g9.getContentResolver().query(Uri.parse(com.anythink.core.common.v.k.b(f16720e)), null, null, null, null);
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
                        f16723j = cursor.getString(cursor.getColumnIndex("detailStyle"));
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
        if (this.f16727k != null) {
            return this.f16727k.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static o a() {
        if (f16724n == null) {
            synchronized (o.class) {
                try {
                    if (f16724n == null) {
                        f16724n = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16724n;
    }

    public final void b(com.anythink.core.common.h.w wVar) {
        if (this.f16727k == null || wVar == null || !this.f16727k.booleanValue()) {
            return;
        }
        this.f16728l = null;
        try {
            this.f16726h.remove(wVar);
        } catch (Exception unused) {
        }
    }

    private void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.f16725a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.f16728l = null;
        this.f16726h.clear();
        this.f16726h = null;
        this.f16725a = null;
        this.f16729m = null;
    }

    public final void a(com.anythink.core.common.h.w wVar) {
        if (this.f16727k == null || wVar == null || !this.f16727k.booleanValue()) {
            return;
        }
        this.f16728l = wVar;
        this.f16726h.add(wVar);
    }

    public final void a(Context context) {
        this.f16729m = context;
        if (this.i.compareAndSet(false, true)) {
            try {
                this.f16727k = f();
                if (this.f16727k == null || !this.f16727k.booleanValue() || this.f16729m == null) {
                    return;
                }
                this.f16725a = new AnonymousClass1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16717b));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16718c));
                intentFilter.addAction(com.anythink.core.common.v.k.b(f16719d));
                this.f16729m.registerReceiver(this.f16725a, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        try {
            if (f16723j == null) {
                return "";
            }
            return "[" + f16723j + "]";
        } catch (Throwable unused) {
            return "";
        }
    }
}
