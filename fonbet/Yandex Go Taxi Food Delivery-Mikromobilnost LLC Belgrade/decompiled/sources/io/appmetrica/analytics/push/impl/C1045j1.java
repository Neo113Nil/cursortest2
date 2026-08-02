package io.appmetrica.analytics.push.impl;

import defpackage.jl40;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.push.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1045j1 implements v2 {
    public final y2 a;

    public C1045j1(y2 y2Var) {
        this.a = y2Var;
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final boolean a(u2 u2Var) {
        t2 t2Var;
        y2 y2Var = this.a;
        if (y2Var == null) {
            return true;
        }
        String str = u2Var.a;
        synchronized (y2Var) {
            t2Var = (t2) ((Map) y2Var.c.getValue()).get(str);
        }
        return t2Var == null || !jl40.l(t2Var.a, u2Var.b) || System.currentTimeMillis() - t2Var.b > 86400000;
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final String a() {
        return "minInterval";
    }
}
