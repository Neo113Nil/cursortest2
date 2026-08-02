package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0823wd implements X2 {
    public final C0382h5 a;

    public C0823wd(C0382h5 c0382h5) {
        this.a = c0382h5;
    }

    @Override // io.appmetrica.analytics.impl.X2
    public final Ir a(Gr gr, Ir ir) {
        int i = gr.b;
        int i2 = this.a.a;
        if (i == i2) {
            if (((Ir) ((HashMap) gr.a.get(ir.b)).get(new String(ir.a))) != null) {
                ((HashMap) gr.a.get(ir.b)).put(new String(ir.a), ir);
                return ir;
            }
        } else if (i < i2) {
            ((HashMap) gr.a.get(ir.b)).put(new String(ir.a), ir);
            gr.b++;
        }
        return ir;
    }
}
