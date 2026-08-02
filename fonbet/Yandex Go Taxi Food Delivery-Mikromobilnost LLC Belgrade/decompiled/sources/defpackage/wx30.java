package defpackage;

import ru.yandex.taxi.masstransit.overlay.routes.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class wx30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ wx30(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                gw30 gw30Var = aVar.d;
                break;
            case 2:
                aVar.l = false;
                break;
            default:
                aVar.l = true;
                break;
        }
        return zy11Var;
    }
}
