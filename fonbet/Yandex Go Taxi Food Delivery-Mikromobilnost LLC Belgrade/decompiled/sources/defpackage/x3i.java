package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.b;
import ru.yandex.taxi.banners.c;

/* loaded from: classes14.dex */
public final class x3i extends h55 {
    public final /* synthetic */ int D;
    public final Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3i(int i, Object obj) {
        super(null);
        this.D = i;
        this.E = obj;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 0:
                if (!t()) {
                    i();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        int i = this.D;
        Object obj2 = this.E;
        switch (i) {
            case 1:
                if (obj != null) {
                    ny61.u();
                    break;
                } else {
                    c cVar = (c) obj2;
                    cVar.e();
                    cVar.o();
                    break;
                }
            case 2:
                b bVar = (b) obj2;
                bVar.c.Cg();
                w4e0 w4e0Var = bVar.f;
                if (w4e0Var != null) {
                    w4e0Var.d();
                }
                bVar.f = null;
                xm00 xm00Var = bVar.d;
                if (xm00Var != null) {
                    xm00Var.m();
                }
                xm00 xm00Var2 = bVar.d;
                if (xm00Var2 != null) {
                    xm00Var2.d();
                }
                bVar.d = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                A((m950) ((gw7) obj2).get(), (p4i) obj, new dl1(15, this));
                return;
            case 1:
                throw oyr.d(obj);
            default:
                ((b) obj2).a();
                return;
        }
    }
}
