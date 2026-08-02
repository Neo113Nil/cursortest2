package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c6t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6t b;
    public final /* synthetic */ String c;

    public /* synthetic */ c6t(e6t e6tVar, String str, int i) {
        this.a = i;
        this.b = e6tVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((r4t) obj).getClass();
                t4t t4tVar = this.b.k;
                t4tVar.getClass();
                nmb.z(t4tVar.b(), t4tVar.a.a.G(), wjb.TrailerScreen, null, pkb.Trailer, t4tVar.a(), null, 0, false, "header", "header", 0, t4t.c(t4tVar.c).a, t4tVar.a(), 0, this.c, 52452);
                break;
            case 1:
                ((r4t) obj).getClass();
                t4t t4tVar2 = this.b.k;
                t4tVar2.getClass();
                nmb b = t4tVar2.b();
                String G = t4tVar2.a.a.G();
                wjb wjbVar = wjb.TrailerScreen;
                l5t l5tVar = t4tVar2.c;
                pkb c = t4t.c(l5tVar);
                String str = t4tVar2.b;
                nmb.z(b, G, wjbVar, null, c, str, null, 0, false, "button", "listen_in_full", 3, t4t.c(l5tVar).a, str, 0, this.c, 50404);
                break;
            default:
                t4t t4tVar3 = this.b.k;
                t4tVar3.getClass();
                nmb.z(t4tVar3.b(), t4tVar3.a.a.G(), wjb.TrailerScreen, null, pkb.Trailer, t4tVar3.a(), null, 0, false, "trailer", "trailer", 0, t4t.c(t4tVar3.c).a, t4tVar3.a(), 0, this.c, 52452);
                break;
        }
        return Unit.a;
    }
}
