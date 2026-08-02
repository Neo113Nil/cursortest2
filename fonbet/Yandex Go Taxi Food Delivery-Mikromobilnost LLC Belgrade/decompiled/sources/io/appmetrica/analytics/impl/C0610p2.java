package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.jl40;
import defpackage.u081;
import io.appmetrica.analytics.impl.C0610p2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0610p2 {
    public final Ob a = new Ob();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public static final boolean a(C0610p2 c0610p2, Intent intent) {
        c0610p2.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) c0610p2.a.a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                InterfaceC0581o2 interfaceC0581o2 = (InterfaceC0581o2) entry.getKey();
                if (((InterfaceC0552n2) entry.getValue()).a(intent)) {
                    interfaceC0581o2.a(intent);
                }
            }
        }
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                InterfaceC0581o2 interfaceC0581o2 = (InterfaceC0581o2) entry.getKey();
                if (((InterfaceC0552n2) entry.getValue()).a(intent)) {
                    interfaceC0581o2.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Ob ob = this.a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) ob.a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && ob.b) {
                        ob.a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.c.entrySet()) {
                InterfaceC0581o2 interfaceC0581o2 = (InterfaceC0581o2) entry.getKey();
                if (((InterfaceC0552n2) entry.getValue()).a(intent)) {
                    interfaceC0581o2.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i) {
    }

    public final void a(Intent intent, int i, int i2) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(InterfaceC0581o2 interfaceC0581o2) {
        this.c.put(interfaceC0581o2, new u081(this, 1));
    }

    public final void a() {
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !jl40.l(data.getPath(), "/client")) {
            return -1;
        }
        try {
            return Integer.parseInt(data.getQueryParameter("pid"));
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void b() {
    }

    public final void c(InterfaceC0581o2 interfaceC0581o2) {
        this.b.put(interfaceC0581o2, new u081(this, 0));
    }

    public static final boolean c(C0610p2 c0610p2, Intent intent) {
        c0610p2.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(InterfaceC0581o2 interfaceC0581o2) {
        this.b.put(interfaceC0581o2, new InterfaceC0552n2() { // from class: t081
            @Override // io.appmetrica.analytics.impl.InterfaceC0552n2
            public final boolean a(Intent intent) {
                return C0610p2.b(C0610p2.this, intent);
            }
        });
    }

    public static final boolean b(C0610p2 c0610p2, Intent intent) {
        Collection collection;
        c0610p2.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) c0610p2.a.a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }
}
