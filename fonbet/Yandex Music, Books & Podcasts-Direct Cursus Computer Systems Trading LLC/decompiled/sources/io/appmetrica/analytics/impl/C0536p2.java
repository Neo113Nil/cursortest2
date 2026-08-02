package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.svw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0536p2 {
    public final C0804yb a = new C0804yb();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public static final boolean a(C0536p2 c0536p2, Intent intent) {
        c0536p2.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) c0536p2.a.a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                InterfaceC0507o2 interfaceC0507o2 = (InterfaceC0507o2) entry.getKey();
                if (((InterfaceC0478n2) entry.getValue()).a(intent)) {
                    interfaceC0507o2.a(intent);
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
                InterfaceC0507o2 interfaceC0507o2 = (InterfaceC0507o2) entry.getKey();
                if (((InterfaceC0478n2) entry.getValue()).a(intent)) {
                    interfaceC0507o2.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0804yb c0804yb = this.a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0804yb.a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0804yb.b) {
                        c0804yb.a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.c.entrySet()) {
                InterfaceC0507o2 interfaceC0507o2 = (InterfaceC0507o2) entry.getKey();
                if (((InterfaceC0478n2) entry.getValue()).a(intent)) {
                    interfaceC0507o2.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i) {
    }

    public final void a(@NotNull Intent intent, int i, int i2) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull InterfaceC0507o2 interfaceC0507o2) {
        this.c.put(interfaceC0507o2, new svw(this, 2));
    }

    public final void a() {
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !Intrinsics.d(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            queryParameter.getClass();
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void b() {
    }

    public final void c(@NotNull InterfaceC0507o2 interfaceC0507o2) {
        this.b.put(interfaceC0507o2, new svw(this, 1));
    }

    public static final boolean c(C0536p2 c0536p2, Intent intent) {
        c0536p2.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(@NotNull InterfaceC0507o2 interfaceC0507o2) {
        this.b.put(interfaceC0507o2, new svw(this, 0));
    }

    public static final boolean b(C0536p2 c0536p2, Intent intent) {
        Collection collection;
        c0536p2.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) c0536p2.a.a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }
}
