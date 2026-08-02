package defpackage;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.a;

/* loaded from: classes6.dex */
public final class r9l0 implements nal0 {
    public final /* synthetic */ qa0 a;
    public final /* synthetic */ y9l0 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ ModalViewOrigin w;

    public r9l0(qa0 qa0Var, y9l0 y9l0Var, a aVar, ModalViewOrigin modalViewOrigin, bgc bgcVar) {
        this.a = qa0Var;
        this.b = y9l0Var;
        this.c = aVar;
        this.w = modalViewOrigin;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.c.Q.e.cancel();
    }

    @Override // defpackage.nal0
    public final void g() {
        a.P(this.c, this.w, PickupFromPhotoPayload$Origin.SUGGEST);
    }

    @Override // defpackage.nal0
    public final void t(pv0 pv0Var) {
        this.a.accept(pv0Var);
        if (this.b.f) {
            ModalViewOrigin modalViewOrigin = this.w;
            a aVar = this.c;
            aVar.r(new vxj0(16, modalViewOrigin, aVar));
        }
    }
}
