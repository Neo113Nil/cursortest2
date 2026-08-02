package com.yandex.passport.api;

import defpackage.eg7;
import defpackage.ild;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ome;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements p3d {
    public static final k1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k1 k1Var = new k1();
        a = k1Var;
        ome omeVar = new ome("com.yandex.passport.api.PassportPartition", k1Var);
        omeVar.k(Constants.KEY_VALUE, false);
        descriptor = omeVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        String A = eg7Var.j(descriptor).A();
        m1.a(A);
        return new m1(A);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        String str = ((m1) obj).a;
        l6bVar.getClass();
        str.getClass();
        l6b i = l6bVar.i(descriptor);
        if (i == null) {
            return;
        }
        i.E(str);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
