package defpackage;

import ru.yandex.taxi.preorder.source.cars.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class vz8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vz8(wz8 wz8Var, String str, int i) {
        this.a = i;
        this.b = wz8Var;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        wz8 wz8Var = this.b;
        switch (i) {
            case 0:
                return wz8Var.c.b().b(wz8Var.b.b(str)).c().h(new ymu(27, new vz8(wz8Var, str, 1), new sp5(11, wz8Var, str)));
            default:
                a aVar = wz8Var.b;
                uz8 uz8Var = wz8Var.a;
                aVar.getClass();
                uz8Var.a(str, aVar.a(str));
                return zy11.a;
        }
    }
}
