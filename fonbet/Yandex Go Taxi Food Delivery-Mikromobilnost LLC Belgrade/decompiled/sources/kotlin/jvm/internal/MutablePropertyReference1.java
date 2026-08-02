package kotlin.jvm.internal;

import defpackage.cgx;
import defpackage.dgx;
import defpackage.egx;
import defpackage.ggx;
import defpackage.igx;
import defpackage.kfx;
import defpackage.qoi0;

/* loaded from: classes9.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements egx {
    @Override // kotlin.jvm.internal.CallableReference
    public kfx computeReflected() {
        qoi0.a.getClass();
        return this;
    }

    @Override // defpackage.jgx
    public Object getDelegate(Object obj) {
        return ((egx) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.jgx
    /* renamed from: getGetter, reason: collision with other method in class */
    public igx mo490getGetter() {
        ((egx) getReflected()).mo490getGetter();
        return null;
    }

    @Override // defpackage.egx
    /* renamed from: getSetter, reason: collision with other method in class */
    public dgx mo491getSetter() {
        ((egx) getReflected()).mo491getSetter();
        return null;
    }

    @Override // defpackage.tls
    public Object invoke(Object obj) {
        return get(obj);
    }

    public /* bridge */ /* synthetic */ ggx getGetter() {
        mo490getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ cgx getSetter() {
        mo491getSetter();
        return null;
    }
}
