package defpackage;

import com.yandex.plus.core.config.Environment;
import com.yandex.plus.domain.auth.impl.a;
import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import com.yandex.plus.home.graphql.plusstate.c;
import com.yandex.plus.home.internal.di.b;
import com.yandex.plus.home.internal.di.g;
import defpackage.cop0;
import defpackage.fro;
import defpackage.i3y;
import defpackage.kzs;
import defpackage.m2d0;
import defpackage.m6d0;
import defpackage.mio;
import defpackage.ol5;
import defpackage.ome0;
import defpackage.qo2;
import defpackage.qog;
import defpackage.tho;
import defpackage.w1d0;
import defpackage.wog;
import defpackage.wqo;
import defpackage.xhf;
import defpackage.ybf;
import defpackage.yhf;
import defpackage.yzt;
import defpackage.zhf;
import java.util.Map;

/* loaded from: classes8.dex */
public final class wog {
    public final i3y A;
    public final i3y B;
    public final i3y C;
    public final x75 a;
    public final cop0 b;
    public final b c;
    public final ol5 d;
    public final g e;
    public final cxq0 f;
    public final a g;
    public final ike h;
    public final i3y i;
    public final i3y j;
    public final i3y q;
    public final i3y r;
    public final i3y u;
    public final i3y y;
    public final i3y z;
    public final i3y k = kotlin.a.a(new qog(this, 3));
    public final i3y l = kotlin.a.a(new qog(this, 4));
    public final i3y m = kotlin.a.a(new qog(this, 5));
    public final i3y n = kotlin.a.a(new qog(this, 6));
    public final i3y o = kotlin.a.a(new qog(this, 7));
    public final i3y p = kotlin.a.a(new qog(this, 8));
    public final i3y s = kotlin.a.a(new qog(this, 9));
    public final i3y t = kotlin.a.a(new qog(this, 14));
    public final i3y v = kotlin.a.a(new qog(this, 15));
    public final i3y w = kotlin.a.a(new qog(this, 16));
    public final i3y x = kotlin.a.a(new qog(this, 17));

    public wog(x75 x75Var, cop0 cop0Var, b bVar, ol5 ol5Var, g gVar, cxq0 cxq0Var, a aVar, ike ikeVar) {
        this.a = x75Var;
        this.b = cop0Var;
        this.c = bVar;
        this.d = ol5Var;
        this.e = gVar;
        this.f = cxq0Var;
        this.g = aVar;
        this.h = ikeVar;
        final int i = 0;
        this.i = kotlin.a.a(new qog(this, i));
        this.j = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.c
            public final /* synthetic */ wog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                int i3 = 11;
                wog wogVar = this.b;
                switch (i2) {
                    case 0:
                        qo2 b = wogVar.e.b();
                        com.yandex.plus.core.graphql.target.a aVar2 = (com.yandex.plus.core.graphql.target.a) wogVar.q.getValue();
                        b bVar2 = wogVar.c;
                        tho thoVar = (tho) bVar2.r.getValue();
                        mio mioVar = (mio) bVar2.p.getValue();
                        w1d0 w1d0Var = (w1d0) wogVar.C.getValue();
                        ol5 ol5Var2 = wogVar.d;
                        DataModule$panelRepository$2$1 dataModule$panelRepository$2$1 = new DataModule$panelRepository$2$1(ol5Var2);
                        DataModule$panelRepository$2$2 dataModule$panelRepository$2$2 = new DataModule$panelRepository$2$2(ol5Var2);
                        cop0 cop0Var2 = wogVar.b;
                        return new yzt(b, aVar2, thoVar, mioVar, w1d0Var, dataModule$panelRepository$2$1, dataModule$panelRepository$2$2, cop0Var2.z, wogVar.h, cop0Var2.A, new ybf(11, wogVar));
                    case 1:
                        kzs kzsVar = (kzs) wogVar.p.getValue();
                        cop0 cop0Var3 = wogVar.b;
                        return new com.yandex.plus.core.graphql.target.a(kzsVar, cop0Var3.c, cop0Var3.v, cop0Var3.q, wogVar.a, new qog(wogVar, i3), new qog(wogVar, 12), new DataModule$targetingInputFactory$2$3(wogVar, null), new qog(wogVar, 13));
                    default:
                        DataModule$experimentsRepository$2$getPuid$1 dataModule$experimentsRepository$2$getPuid$1 = new DataModule$experimentsRepository$2$getPuid$1(wogVar, null);
                        zhf.a.getClass();
                        xhf xhfVar = yhf.b;
                        wqo wqoVar = (wqo) wogVar.t.getValue();
                        g gVar2 = wogVar.e;
                        CommonExperimentsControllerApi commonExperimentsControllerApi = (CommonExperimentsControllerApi) gVar2.e.getValue();
                        DataModule$experimentsRepository$2$1 dataModule$experimentsRepository$2$1 = new DataModule$experimentsRepository$2$1(0, gVar2, g.class, "getHomeExperimentsEndpoint", "getHomeExperimentsEndpoint()Ljava/lang/String;", 0);
                        DataModule$experimentsRepository$2$2 dataModule$experimentsRepository$2$2 = new DataModule$experimentsRepository$2$2(0, gVar2, g.class, "getPullFormatsExperimentsEndpoint", "getPullFormatsExperimentsEndpoint()Ljava/lang/String;", 0);
                        m6d0 m6d0Var = (m6d0) wogVar.B.getValue();
                        cop0 cop0Var4 = wogVar.b;
                        com.yandex.plus.home.graphql.experiments.c cVar = new com.yandex.plus.home.graphql.experiments.c(commonExperimentsControllerApi, dataModule$experimentsRepository$2$1, dataModule$experimentsRepository$2$2, m6d0Var, (Map) wogVar.s.getValue());
                        Environment environment = cop0Var4.b;
                        long j = cop0Var4.x;
                        i3y i3yVar = (i3y) wogVar.f.w;
                        com.yandex.plus.home.graphql.experiments.a aVar3 = new com.yandex.plus.home.graphql.experiments.a(xhfVar, j, environment, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        com.yandex.plus.home.graphql.experiments.b bVar3 = new com.yandex.plus.home.graphql.experiments.b(xhfVar, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        m2d0 m2d0Var = wqoVar.a;
                        return new com.yandex.plus.experiments.impl.providers.a(m2d0Var.b, m2d0Var.c, m2d0Var.d, (fro) wqoVar.c.getValue(), cVar, aVar3, bVar3, m2d0Var.i);
                }
            }
        });
        final int i2 = 1;
        this.q = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.c
            public final /* synthetic */ wog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                int i3 = 11;
                wog wogVar = this.b;
                switch (i22) {
                    case 0:
                        qo2 b = wogVar.e.b();
                        com.yandex.plus.core.graphql.target.a aVar2 = (com.yandex.plus.core.graphql.target.a) wogVar.q.getValue();
                        b bVar2 = wogVar.c;
                        tho thoVar = (tho) bVar2.r.getValue();
                        mio mioVar = (mio) bVar2.p.getValue();
                        w1d0 w1d0Var = (w1d0) wogVar.C.getValue();
                        ol5 ol5Var2 = wogVar.d;
                        DataModule$panelRepository$2$1 dataModule$panelRepository$2$1 = new DataModule$panelRepository$2$1(ol5Var2);
                        DataModule$panelRepository$2$2 dataModule$panelRepository$2$2 = new DataModule$panelRepository$2$2(ol5Var2);
                        cop0 cop0Var2 = wogVar.b;
                        return new yzt(b, aVar2, thoVar, mioVar, w1d0Var, dataModule$panelRepository$2$1, dataModule$panelRepository$2$2, cop0Var2.z, wogVar.h, cop0Var2.A, new ybf(11, wogVar));
                    case 1:
                        kzs kzsVar = (kzs) wogVar.p.getValue();
                        cop0 cop0Var3 = wogVar.b;
                        return new com.yandex.plus.core.graphql.target.a(kzsVar, cop0Var3.c, cop0Var3.v, cop0Var3.q, wogVar.a, new qog(wogVar, i3), new qog(wogVar, 12), new DataModule$targetingInputFactory$2$3(wogVar, null), new qog(wogVar, 13));
                    default:
                        DataModule$experimentsRepository$2$getPuid$1 dataModule$experimentsRepository$2$getPuid$1 = new DataModule$experimentsRepository$2$getPuid$1(wogVar, null);
                        zhf.a.getClass();
                        xhf xhfVar = yhf.b;
                        wqo wqoVar = (wqo) wogVar.t.getValue();
                        g gVar2 = wogVar.e;
                        CommonExperimentsControllerApi commonExperimentsControllerApi = (CommonExperimentsControllerApi) gVar2.e.getValue();
                        DataModule$experimentsRepository$2$1 dataModule$experimentsRepository$2$1 = new DataModule$experimentsRepository$2$1(0, gVar2, g.class, "getHomeExperimentsEndpoint", "getHomeExperimentsEndpoint()Ljava/lang/String;", 0);
                        DataModule$experimentsRepository$2$2 dataModule$experimentsRepository$2$2 = new DataModule$experimentsRepository$2$2(0, gVar2, g.class, "getPullFormatsExperimentsEndpoint", "getPullFormatsExperimentsEndpoint()Ljava/lang/String;", 0);
                        m6d0 m6d0Var = (m6d0) wogVar.B.getValue();
                        cop0 cop0Var4 = wogVar.b;
                        com.yandex.plus.home.graphql.experiments.c cVar = new com.yandex.plus.home.graphql.experiments.c(commonExperimentsControllerApi, dataModule$experimentsRepository$2$1, dataModule$experimentsRepository$2$2, m6d0Var, (Map) wogVar.s.getValue());
                        Environment environment = cop0Var4.b;
                        long j = cop0Var4.x;
                        i3y i3yVar = (i3y) wogVar.f.w;
                        com.yandex.plus.home.graphql.experiments.a aVar3 = new com.yandex.plus.home.graphql.experiments.a(xhfVar, j, environment, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        com.yandex.plus.home.graphql.experiments.b bVar3 = new com.yandex.plus.home.graphql.experiments.b(xhfVar, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        m2d0 m2d0Var = wqoVar.a;
                        return new com.yandex.plus.experiments.impl.providers.a(m2d0Var.b, m2d0Var.c, m2d0Var.d, (fro) wqoVar.c.getValue(), cVar, aVar3, bVar3, m2d0Var.i);
                }
            }
        });
        int i3 = 18;
        this.r = kotlin.a.a(new cue(i3));
        final int i4 = 2;
        this.u = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.c
            public final /* synthetic */ wog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                int i32 = 11;
                wog wogVar = this.b;
                switch (i22) {
                    case 0:
                        qo2 b = wogVar.e.b();
                        com.yandex.plus.core.graphql.target.a aVar2 = (com.yandex.plus.core.graphql.target.a) wogVar.q.getValue();
                        b bVar2 = wogVar.c;
                        tho thoVar = (tho) bVar2.r.getValue();
                        mio mioVar = (mio) bVar2.p.getValue();
                        w1d0 w1d0Var = (w1d0) wogVar.C.getValue();
                        ol5 ol5Var2 = wogVar.d;
                        DataModule$panelRepository$2$1 dataModule$panelRepository$2$1 = new DataModule$panelRepository$2$1(ol5Var2);
                        DataModule$panelRepository$2$2 dataModule$panelRepository$2$2 = new DataModule$panelRepository$2$2(ol5Var2);
                        cop0 cop0Var2 = wogVar.b;
                        return new yzt(b, aVar2, thoVar, mioVar, w1d0Var, dataModule$panelRepository$2$1, dataModule$panelRepository$2$2, cop0Var2.z, wogVar.h, cop0Var2.A, new ybf(11, wogVar));
                    case 1:
                        kzs kzsVar = (kzs) wogVar.p.getValue();
                        cop0 cop0Var3 = wogVar.b;
                        return new com.yandex.plus.core.graphql.target.a(kzsVar, cop0Var3.c, cop0Var3.v, cop0Var3.q, wogVar.a, new qog(wogVar, i32), new qog(wogVar, 12), new DataModule$targetingInputFactory$2$3(wogVar, null), new qog(wogVar, 13));
                    default:
                        DataModule$experimentsRepository$2$getPuid$1 dataModule$experimentsRepository$2$getPuid$1 = new DataModule$experimentsRepository$2$getPuid$1(wogVar, null);
                        zhf.a.getClass();
                        xhf xhfVar = yhf.b;
                        wqo wqoVar = (wqo) wogVar.t.getValue();
                        g gVar2 = wogVar.e;
                        CommonExperimentsControllerApi commonExperimentsControllerApi = (CommonExperimentsControllerApi) gVar2.e.getValue();
                        DataModule$experimentsRepository$2$1 dataModule$experimentsRepository$2$1 = new DataModule$experimentsRepository$2$1(0, gVar2, g.class, "getHomeExperimentsEndpoint", "getHomeExperimentsEndpoint()Ljava/lang/String;", 0);
                        DataModule$experimentsRepository$2$2 dataModule$experimentsRepository$2$2 = new DataModule$experimentsRepository$2$2(0, gVar2, g.class, "getPullFormatsExperimentsEndpoint", "getPullFormatsExperimentsEndpoint()Ljava/lang/String;", 0);
                        m6d0 m6d0Var = (m6d0) wogVar.B.getValue();
                        cop0 cop0Var4 = wogVar.b;
                        com.yandex.plus.home.graphql.experiments.c cVar = new com.yandex.plus.home.graphql.experiments.c(commonExperimentsControllerApi, dataModule$experimentsRepository$2$1, dataModule$experimentsRepository$2$2, m6d0Var, (Map) wogVar.s.getValue());
                        Environment environment = cop0Var4.b;
                        long j = cop0Var4.x;
                        i3y i3yVar = (i3y) wogVar.f.w;
                        com.yandex.plus.home.graphql.experiments.a aVar3 = new com.yandex.plus.home.graphql.experiments.a(xhfVar, j, environment, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        com.yandex.plus.home.graphql.experiments.b bVar3 = new com.yandex.plus.home.graphql.experiments.b(xhfVar, (ome0) i3yVar.getValue(), dataModule$experimentsRepository$2$getPuid$1);
                        m2d0 m2d0Var = wqoVar.a;
                        return new com.yandex.plus.experiments.impl.providers.a(m2d0Var.b, m2d0Var.c, m2d0Var.d, (fro) wqoVar.c.getValue(), cVar, aVar3, bVar3, m2d0Var.i);
                }
            }
        });
        this.y = kotlin.a.a(new qog(this, i3));
        int i5 = 19;
        this.z = kotlin.a.a(new cue(i5));
        this.A = kotlin.a.a(new qog(this, i5));
        this.B = kotlin.a.a(new qog(this, i2));
        this.C = kotlin.a.a(new qog(this, i4));
    }

    public final com.yandex.plus.experiments.impl.providers.a a() {
        return (com.yandex.plus.experiments.impl.providers.a) this.u.getValue();
    }

    public final c b() {
        return (c) this.w.getValue();
    }
}
