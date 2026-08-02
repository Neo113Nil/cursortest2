package defpackage;

import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;

/* loaded from: classes13.dex */
public final /* synthetic */ class rh80 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ rh80(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                ((nh80) gVar.Dg()).E5((c9c0) obj);
                break;
            default:
                gVar.getClass();
                int i2 = uh80.a[((ChangeModalStateAction.ModalState) obj).ordinal()];
                if (i2 == 1) {
                    ((nh80) gVar.Dg()).Tf(true);
                    break;
                } else if (i2 == 2) {
                    ((nh80) gVar.Dg()).Tf(false);
                    break;
                } else if (i2 != 3) {
                    w511.b();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
