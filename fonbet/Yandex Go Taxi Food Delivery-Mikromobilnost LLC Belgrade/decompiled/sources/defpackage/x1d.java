package defpackage;

import ru.yandex.taxi.masstransit.stoproute.router.ComposableSingletons$MtStopRouteRouterKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class x1d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xfd b;

    public /* synthetic */ x1d(xfd xfdVar, int i) {
        this.a = i;
        this.b = xfdVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xfd xfdVar = this.b;
        switch (i) {
            case 0:
                y1d y1dVar = y1d.a;
                ((bgd) xfdVar).a.invoke((jf) obj);
                break;
            case 1:
                j9d j9dVar = j9d.a;
                ((bgd) xfdVar).a.invoke(new t040((ne61) obj));
                break;
            case 2:
                ComposableSingletons$MtStopRouteRouterKt composableSingletons$MtStopRouteRouterKt = ComposableSingletons$MtStopRouteRouterKt.a;
                ((bgd) xfdVar).a.invoke(new p240((ne61) obj));
                break;
            case 3:
                hfd hfdVar = hfd.a;
                ((bgd) xfdVar).a.invoke((d141) obj);
                break;
            default:
                ((bgd) xfdVar).a.invoke(new ov30((ne61) obj));
                break;
        }
        return zy11Var;
    }
}
