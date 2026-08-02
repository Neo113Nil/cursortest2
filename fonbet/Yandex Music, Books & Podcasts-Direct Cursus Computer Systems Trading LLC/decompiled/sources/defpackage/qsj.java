package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class qsj implements osj {
    public final wsj a;
    public final ysj b;
    public final g0l c;
    public final kxi d;
    public final rmb e;
    public final w4i f;
    public final s8i g;
    public final s9j h;
    public final xdr i;
    public final vvd j;

    public qsj(wsj wsjVar, ysj ysjVar, g0l g0lVar, kxi kxiVar, rmb rmbVar, w4i w4iVar, s8i s8iVar, s9j s9jVar) {
        kxiVar.getClass();
        this.a = wsjVar;
        this.b = ysjVar;
        this.c = g0lVar;
        this.d = kxiVar;
        this.e = rmbVar;
        this.f = w4iVar;
        this.g = s8iVar;
        this.h = s9jVar;
        this.i = wsjVar.k;
        this.j = wsjVar.l;
    }

    @Override // defpackage.osj
    public final xdr a() {
        return this.i;
    }

    @Override // defpackage.osj
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        eht ehtVar = (eht) this.i.getValue();
        if (ehtVar instanceof rgt) {
            eul eulVar = ((rgt) ehtVar).a;
            ysj ysjVar = this.b;
            ysjVar.b.b(mqsVar, eulVar, d.p(ysjVar.e));
        }
    }

    @Override // defpackage.osj
    public final void c(mqs mqsVar, int i) {
        mqsVar.getClass();
        eht ehtVar = (eht) this.i.getValue();
        if (ehtVar instanceof rgt) {
            if (((Boolean) this.h.invoke()).booleanValue()) {
                this.f.invoke(mqsVar, new h00(this, (rgt) ehtVar, mqsVar, i, 10));
                return;
            }
            rgt rgtVar = (rgt) ehtVar;
            eul eulVar = rgtVar.a;
            ArrayList arrayList = rgtVar.b;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jo6) it.next()).b);
            }
            v50 v50Var = new v50(this, mqsVar, i, 14);
            ysj ysjVar = this.b;
            ysjVar.b.c(mqsVar, eulVar, d.p(ysjVar.e), new w4i(2, ysjVar, ysj.class, "getTracks", "getTracks(Lru/yandex/music/data/domainitem/PlaylistDomainItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), v50Var);
        }
    }

    @Override // defpackage.psj
    public final void d() {
        Object value = this.i.getValue();
        rgt rgtVar = value instanceof rgt ? (rgt) value : null;
        if (rgtVar != null) {
            eul eulVar = rgtVar.a;
            dud k0 = hdg.k0(eulVar.d);
            int i = PlaylistScreenActivity.B0;
            ysj ysjVar = this.b;
            ysjVar.a.startActivity(dxl.j(ysjVar.a, new jxl(eulVar.a, eulVar.b), k0, d.p(ysjVar.e), null, 112));
            this.a.f.e(ox6.M(eulVar, -1, ""), null);
        }
    }

    @Override // defpackage.psj
    public final void e() {
        Object value = this.i.getValue();
        rgt rgtVar = value instanceof rgt ? (rgt) value : null;
        if (rgtVar != null) {
            lwg H = g0g.H(rgtVar.a, false);
            ysj ysjVar = this.b;
            szf.R(ysjVar.c, new qvg(H), d.p(ysjVar.e));
        }
    }

    @Override // defpackage.osj
    public final vvd f() {
        return this.j;
    }

    @Override // defpackage.osj
    public final void g(boolean z, int i, int i2, int i3, String str) {
        jo6 jo6Var;
        str.getClass();
        Object value = this.i.getValue();
        rgt rgtVar = value instanceof rgt ? (rgt) value : null;
        if (rgtVar == null || (jo6Var = (jo6) CollectionsKt.S(rgtVar.b, i)) == null) {
            return;
        }
        q43 q43Var = this.a.f;
        mqs mqsVar = jo6Var.b;
        q43Var.h(new d70(mqsVar.d().e(), c70.g, mqsVar.c, i2, i3, str), z);
    }
}
