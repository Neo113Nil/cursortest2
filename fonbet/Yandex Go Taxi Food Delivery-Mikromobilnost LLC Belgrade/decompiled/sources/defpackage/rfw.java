package defpackage;

import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final /* synthetic */ class rfw implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ zzs c;
    public final /* synthetic */ pv0 w;

    public /* synthetic */ rfw(PointType pointType, zzs zzsVar, pv0 pv0Var, int i) {
        this.a = i;
        this.b = pointType;
        this.c = zzsVar;
        this.w = pv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        pv0 pv0Var = this.w;
        zzs zzsVar = this.c;
        PointType pointType = this.b;
        switch (i) {
            case 0:
                iiw iiwVar = ((giw) obj).a;
                iiw.P(iiwVar);
                iiwVar.A((m950) iiwVar.E.get(), new ngw(iiwVar.J.b(), pointType, zzsVar, pv0Var), new hiw(iiwVar, pointType));
                break;
            default:
                ((sfw) obj).a.r(new rfw(pointType, zzsVar, pv0Var, 0));
                break;
        }
        return zy11Var;
    }
}
