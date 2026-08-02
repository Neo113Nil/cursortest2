package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class To implements X2 {
    @Override // io.appmetrica.analytics.impl.X2
    public final Ir a(Gr gr, Ir ir) {
        ((HashMap) gr.a.get(ir.b)).put(new String(ir.a), ir);
        return ir;
    }
}
