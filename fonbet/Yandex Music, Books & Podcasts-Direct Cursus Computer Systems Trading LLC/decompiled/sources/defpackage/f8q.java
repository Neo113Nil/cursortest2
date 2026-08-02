package defpackage;

import com.yandex.music.shared.search.network.SearchApi;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class f8q implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8q b;

    public /* synthetic */ f8q(g8q g8qVar, int i) {
        this.a = i;
        this.b = g8qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(SearchApi.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                g8q g8qVar = this.b;
                rp7Var.E(new f8q(g8qVar, 1));
                o18Var.c = hag.I(v2p.class);
                rp7Var.getClass();
                rp7Var.E(new f8q(g8qVar, 2));
                o18Var.c = hag.I(g5p.class);
                rp7Var.getClass();
                rp7Var.E(new f8q(g8qVar, 3));
                o18Var.c = hag.I(h1p.class);
                rp7Var.getClass();
                rp7Var.E(new e7q(18));
                o18Var.c = hag.I(vzo.class);
                rp7Var.getClass();
                rp7Var.E(new f8q(g8qVar, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (SearchApi) i0j.a(this.b.a, null, null, new h2q(3), null, 55).a.b(SearchApi.class);
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new v2p(this.b.b, (SearchApi) l13Var.a.D(hag.I(SearchApi.class), l13Var, l13Var.b));
            case 3:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                SearchApi searchApi = (SearchApi) l13Var2.a.D(hag.I(SearchApi.class), l13Var2, l13Var2.b);
                g8q g8qVar2 = this.b;
                return new g5p(searchApi, g8qVar2.c, g8qVar2.d, g8qVar2.e, g8qVar2.f, g8qVar2.g);
            default:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I = hag.I(v2p.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new vzo((v2p) qdcVar.D(I, l13Var3, set), (g5p) qdcVar.D(hag.I(g5p.class), l13Var3, set), this.b.h);
        }
    }
}
