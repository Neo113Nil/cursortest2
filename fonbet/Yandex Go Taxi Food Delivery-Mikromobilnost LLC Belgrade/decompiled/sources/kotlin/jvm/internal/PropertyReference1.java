package kotlin.jvm.internal;

import defpackage.igx;
import defpackage.jgx;
import defpackage.kfx;
import defpackage.qoi0;

/* loaded from: classes9.dex */
public abstract class PropertyReference1 extends PropertyReference implements jgx {
    @Override // kotlin.jvm.internal.CallableReference
    public final kfx computeReflected() {
        qoi0.a.getClass();
        return this;
    }

    @Override // defpackage.jgx
    /* renamed from: getGetter */
    public final igx mo490getGetter() {
        ((jgx) getReflected()).mo490getGetter();
        return null;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
