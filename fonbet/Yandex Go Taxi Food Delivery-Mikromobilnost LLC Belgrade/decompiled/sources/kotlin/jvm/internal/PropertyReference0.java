package kotlin.jvm.internal;

import defpackage.hgx;
import defpackage.kfx;
import defpackage.qoi0;

/* loaded from: classes9.dex */
public abstract class PropertyReference0 extends PropertyReference implements hgx {
    @Override // kotlin.jvm.internal.CallableReference
    public final kfx computeReflected() {
        qoi0.a.getClass();
        return this;
    }

    @Override // defpackage.hgx
    public final void getGetter() {
        ((hgx) getReflected()).getGetter();
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return get();
    }
}
