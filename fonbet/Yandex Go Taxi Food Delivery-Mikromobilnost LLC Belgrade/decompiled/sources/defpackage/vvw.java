package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;

/* loaded from: classes6.dex */
public final /* synthetic */ class vvw implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xvw b;

    public /* synthetic */ vvw(xvw xvwVar, int i) {
        this.a = i;
        this.b = xvwVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xvw xvwVar = this.b;
        switch (i) {
            case 0:
                u uVar = xvwVar.w;
                uVar.p.d();
                uVar.g.e(new tb(13, uVar, null));
                break;
            default:
                xvwVar.w.a(ModalViewOrigin.SUMMARY);
                break;
        }
        return zy11Var;
    }
}
