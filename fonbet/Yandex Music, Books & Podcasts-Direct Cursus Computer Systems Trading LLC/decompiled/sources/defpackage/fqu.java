package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class fqu extends bfu {
    public final String k;
    public final squ l;
    public final frt m;
    public final g0l n;
    public final fnb o;
    public final atn p;
    public final xdr q;
    public final xdr r;
    public final x0q s;
    public final dkn t;
    public rar u;
    public rar v;
    public rar w;
    public final equ x;

    public fqu(String str, squ squVar, frt frtVar, g0l g0lVar, fnb fnbVar, atn atnVar) {
        str.getClass();
        frtVar.getClass();
        g0lVar.getClass();
        this.k = str;
        this.l = squVar;
        this.m = frtVar;
        this.n = g0lVar;
        this.o = fnbVar;
        this.p = atnVar;
        xdr a = ydr.a(upu.a);
        this.q = a;
        this.r = a;
        x0q b = y0q.b(0, 1, null, 4);
        this.s = b;
        this.t = new dkn(b);
        this.x = new equ(this);
        H();
        x97.y(ot0.F(this), null, null, new zts(this, null, 21), 3);
    }

    public static final xpu a(fqu fquVar, fhi fhiVar, Long l) {
        String str;
        u9b u9bVar;
        ghi P = y1g.P(fhiVar, l);
        if (P == null || (u9bVar = P.c) == null) {
            str = null;
        } else {
            int s = wct.s();
            if (s > 200) {
                s = 200;
            }
            str = u9bVar.e(s, WebPath$Storage.AVATARS);
        }
        return new xpu(str, P != null ? P.b : "", false);
    }

    public final void G(dou douVar, wjb wjbVar) {
        douVar.getClass();
        String str = douVar.a;
        atn atnVar = this.p;
        atnVar.getClass();
        str.getClass();
        u5l b = atnVar.S(wjbVar).a(new jab(qkb.InformationBlock, 1, 1, 0), null).b(new thj(pkb.Wave, str, 1, 1, ""));
        g0l.s(this.n, douVar.b, new kxi(this.o, null), b, new qfn("radio-mobile-wave_for_two-multiwave-deeplink"), null, null, null, null, 496);
        this.s.a(Unit.a);
    }

    public final void H() {
        rar rarVar = this.u;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar rarVar2 = this.v;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        rar rarVar3 = this.w;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
        xdr xdrVar = this.q;
        xdrVar.getClass();
        xdrVar.m(null, upu.a);
        this.u = x97.y(ot0.F(this), this.x, null, new npt(this, continuation, 14), 2);
    }

    public final void J(String str) {
        str.getClass();
        rar rarVar = this.v;
        if (rarVar == null || !rarVar.b()) {
            K(true);
            this.v = x97.y(ot0.F(this), this.x, null, new npt(this, str, (Continuation) null, 16), 2);
        }
    }

    public final void K(boolean z) {
        xdr xdrVar;
        Object value;
        cqu cquVar;
        do {
            xdrVar = this.q;
            value = xdrVar.getValue();
            cquVar = (cqu) value;
            if (cquVar instanceof xpu) {
                xpu xpuVar = (xpu) cquVar;
                cquVar = new xpu(xpuVar.a, xpuVar.b, z);
            } else if (!(cquVar instanceof wpu) && !(cquVar instanceof zpu) && !(cquVar instanceof ypu) && !(cquVar instanceof aqu) && !(cquVar instanceof vpu) && !(cquVar instanceof tpu) && !(cquVar instanceof upu)) {
                b6e.s();
                return;
            }
        } while (!xdrVar.k(value, cquVar));
    }

    public final void L(boolean z) {
        xdr xdrVar;
        Object value;
        Object obj;
        do {
            xdrVar = this.q;
            value = xdrVar.getValue();
            obj = (cqu) value;
            if (obj instanceof wpu) {
                obj = new wpu(z);
            } else if (!(obj instanceof xpu) && !(obj instanceof zpu) && !(obj instanceof ypu) && !(obj instanceof aqu) && !(obj instanceof vpu) && !(obj instanceof tpu) && !(obj instanceof upu)) {
                b6e.s();
                return;
            }
        } while (!xdrVar.k(value, obj));
    }
}
