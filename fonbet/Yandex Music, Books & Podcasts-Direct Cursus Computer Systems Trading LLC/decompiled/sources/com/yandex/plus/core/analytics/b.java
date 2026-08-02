package com.yandex.plus.core.analytics;

import defpackage.gld;
import defpackage.ocu;
import defpackage.tf6;
import defpackage.x97;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class b implements i {
    public final tf6 a;

    public b(kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.a = gld.e(aVar);
    }

    @Override // com.yandex.plus.core.analytics.e
    public final void a() {
        e b = b();
        if (b != null) {
            b.a();
        }
    }

    public abstract e b();

    public abstract f c();

    public abstract com.yandex.plus.home.analytics.g d();

    public abstract k e();

    public abstract o f();

    @Override // com.yandex.plus.core.analytics.c
    public final void reportDiagnosticEvent(String str, Map map) {
        str.getClass();
        k e = e();
        com.yandex.plus.home.analytics.g d = d();
        if (e == null || d == null) {
            return;
        }
        x97.y(this.a, null, null, new ocu(d, str, map, e, (Continuation) null, 26), 3);
    }

    @Override // com.yandex.plus.core.analytics.e
    public final void reportError(String str, String str2, Throwable th) {
        str.getClass();
        e b = b();
        if (b != null) {
            b.reportError(str, str2, th);
        }
    }

    @Override // com.yandex.plus.core.analytics.f
    public final void reportEvent(String str, String str2) {
        str.getClass();
        f c = c();
        if (c != null) {
            c.reportEvent(str, str2);
        }
    }

    @Override // com.yandex.plus.core.analytics.o
    public final void reportStatboxEvent(String str, String str2) {
        str.getClass();
        o f = f();
        if (f != null) {
            f.reportStatboxEvent(str, str2);
        }
    }

    @Override // com.yandex.plus.core.analytics.f
    public final void reportEvent(String str, Map map) {
        str.getClass();
        f c = c();
        if (c != null) {
            c.reportEvent(str, map);
        }
    }

    @Override // com.yandex.plus.core.analytics.o
    public final void reportStatboxEvent(String str, Map map) {
        str.getClass();
        o f = f();
        if (f != null) {
            f.reportStatboxEvent(str, map);
        }
    }
}
