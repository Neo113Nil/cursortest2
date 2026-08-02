package defpackage;

import ru.yandex.taxi.delivery.router.primary.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class zki implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ hyf c;

    public /* synthetic */ zki(a aVar, hyf hyfVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = hyfVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hyf hyfVar = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.U(hyfVar);
                break;
            default:
                aVar.S(hyfVar);
                break;
        }
        return zy11Var;
    }
}
