package com.gamericefishpro.space.q4;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final p b = new p(1);
    public final Object a;

    public c0(i iVar) {
        u.a(iVar, "output");
        this.a = iVar;
        iVar.c = this;
    }

    public void a(int i, Object obj, t0 t0Var) {
        i iVar = (i) this.a;
        iVar.S0(i, 3);
        t0Var.i((a) obj, iVar.c);
        iVar.S0(i, 4);
    }

    public c0() {
        i0 i0Var;
        q0 q0Var = q0.c;
        try {
            i0Var = (i0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            i0Var = b;
        }
        i0[] i0VarArr = {p.b, i0Var};
        b0 b0Var = new b0();
        b0Var.a = i0VarArr;
        Charset charset = u.a;
        this.a = b0Var;
    }
}
