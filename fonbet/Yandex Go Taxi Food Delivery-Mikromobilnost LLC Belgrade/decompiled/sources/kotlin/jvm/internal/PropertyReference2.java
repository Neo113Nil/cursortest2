package kotlin.jvm.internal;

import defpackage.kfx;
import defpackage.qoi0;
import defpackage.wls;

/* loaded from: classes9.dex */
public abstract class PropertyReference2 extends PropertyReference implements wls {
    @Override // kotlin.jvm.internal.CallableReference
    public final kfx computeReflected() {
        qoi0.a.getClass();
        return this;
    }

    public abstract Object i();

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        i();
        throw null;
    }

    public final void j() {
        ((PropertyReference2) getReflected()).j();
    }
}
