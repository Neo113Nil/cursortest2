package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class vfd {
    public final afw a;
    public final odd b;
    public final z5l c;
    public final wmg d;
    public final g06 e;
    public final jyr f;
    public final rjq g;
    public final um6 h;

    public vfd(afw afwVar, odd oddVar, z5l z5lVar, wmg wmgVar, jyr jyrVar) {
        g06 g06Var = new g06(22);
        this.a = afwVar;
        this.b = oddVar;
        this.c = z5lVar;
        this.d = wmgVar;
        this.e = g06Var;
        this.f = jyrVar;
        rjq rjqVar = new rjq(false);
        this.g = rjqVar;
        this.h = hld.s(rjqVar, dm6.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0191, code lost:
    
        if (r2 == r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009d, code lost:
    
        if (r2 == r6) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(vfd vfdVar, t1q t1qVar, vhd vhdVar, boolean z, boolean z2, boolean z3, Continuation continuation) {
        ufd ufdVar;
        Object obj;
        int i;
        t1q t1qVar2;
        vhd vhdVar2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        pfd pfdVar;
        rr5 t;
        boolean z8 = z3;
        uyk uykVar = uyk.c;
        z5l z5lVar = vfdVar.c;
        if (continuation instanceof ufd) {
            ufdVar = (ufd) continuation;
            int i2 = ufdVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ufdVar.q = i2 - Integer.MIN_VALUE;
                obj = ufdVar.o;
                nm6 nm6Var = nm6.a;
                i = ufdVar.q;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z8) {
                        ssg.a(5, null, "Glagol Transition on disconnection: SKIPPED", null);
                        return Unit.a;
                    }
                    afw afwVar = vfdVar.a;
                    g4d g4dVar = new g4d(14);
                    t1qVar2 = t1qVar;
                    ufdVar.j = t1qVar2;
                    vhdVar2 = vhdVar;
                    ufdVar.k = vhdVar2;
                    z4 = z;
                    ufdVar.l = z4;
                    z5 = z2;
                    ufdVar.m = z5;
                    ufdVar.n = z8;
                    ufdVar.q = 1;
                    String str = afw.l;
                    afwVar.getClass();
                    obj = tyf.L(5000L, new y6v(afwVar, g4dVar, continuation2, 28), ufdVar);
                } else if (i == 1) {
                    z8 = ufdVar.n;
                    boolean z9 = ufdVar.m;
                    boolean z10 = ufdVar.l;
                    vhd vhdVar3 = ufdVar.k;
                    t1qVar2 = ufdVar.j;
                    qgg.h0(obj);
                    z4 = z10;
                    vhdVar2 = vhdVar3;
                    z5 = z9;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            ((e3q) z5lVar.a()).a();
                        }
                        return Unit.a;
                    }
                    z8 = ufdVar.n;
                    z6 = ufdVar.m;
                    z7 = ufdVar.l;
                    vhdVar2 = ufdVar.k;
                    qgg.h0(obj);
                    pfdVar = (pfd) obj;
                    if (pfdVar == null) {
                        if (!z6 && vhdVar2 != null && vhdVar2.c) {
                            uykVar = uyk.a;
                        }
                        if (pfdVar instanceof nfd) {
                            z5lVar.d(((nfd) pfdVar).a, z7, uykVar);
                        } else if (pfdVar instanceof ofd) {
                            ofd ofdVar = (ofd) pfdVar;
                            u1q u1qVar = ofdVar.a;
                            String str2 = ofdVar.b;
                            long j = ofdVar.c;
                            a6l a6lVar = new a6l(new gxc(avf.G("glagol"), weo.t()), null);
                            Long l = new Long(j);
                            l18 l18Var = l18.b;
                            e eVar = new e();
                            bdt I = hag.I(Context.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            Context context = (Context) qdcVar.C(I);
                            bdt I2 = hag.I(vyk.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            vyk vykVar = (vyk) qdcVar2.C(I2);
                            u1qVar.getClass();
                            boolean z11 = z7;
                            ((e3q) vykVar).d(new pbb(u1qVar, eVar, (str2 == null || (t = q6k.t(str2)) == null) ? rsu.a : new qsu(t, l), a6lVar, z11, null), uykVar, z11).k(new g3a(2, new lum(context)));
                        } else {
                            boolean z12 = z7;
                            if (!(pfdVar instanceof mfd)) {
                                b6e.s();
                                return null;
                            }
                            mfd mfdVar = (mfd) pfdVar;
                            String str3 = mfdVar.a.a.a;
                            if (str3 == null) {
                                str3 = "";
                            }
                            dgr dgrVar = new dgr(StationId.f(str3), mfdVar.b.d.c);
                            gxc gxcVar = new gxc(avf.G("glagol"), weo.t());
                            z5lVar.getClass();
                            h hVar = new h(Page.LANDING);
                            c cVar = c.d;
                            nyk d = oyk.d(dgrVar);
                            String str4 = "radio_" + "".replaceAll("-", "_");
                            Assertions.assertNonNull(hVar, "build(): scope is not set");
                            Assertions.assertNonNull(d, "build(): info is not set");
                            Assertions.assertNonNull(str4, "build(): card is not set");
                            z5lVar.d(new u4d(new c(hVar, d, str4), dgrVar, gxcVar), z12, uykVar);
                        }
                        return Unit.a;
                    }
                    wmg wmgVar = vfdVar.d;
                    ufdVar.j = null;
                    ufdVar.k = null;
                    ufdVar.l = z7;
                    ufdVar.m = z6;
                    ufdVar.n = z8;
                    ufdVar.q = 3;
                    obj = wmgVar.a(ufdVar);
                }
                if (((gfw) obj) != gfw.b) {
                    ssg.a(5, null, "Glagol Transition on disconnection: SKIPPED cause of ynison in passive mode", null);
                    return Unit.a;
                }
                if (((z66) vfdVar.f.getValue()).h()) {
                    ((e3q) z5lVar.a()).a();
                } else if (!((z66) vfdVar.f.getValue()).g()) {
                    c h = new h(Page.DEFAULT).h();
                    gxc gxcVar2 = new gxc(avf.G("glagol"), weo.t());
                    z5lVar.getClass();
                    se5 se5Var = new se5(new ubn(), h, new sfm(new hv0(new hv0(z5lVar, continuation2, 23), continuation2, 27)), null, 0, null, null, -1, -1L, new pe5(new v80(h.a(), gxcVar2, null), null), new tb(null), false, null, new r0q(0));
                    e3q e3qVar = (e3q) z5lVar.a();
                    e3qVar.getClass();
                    e3qVar.d(new ad0(se5Var, continuation2, 2), uykVar, false).k(new uvg(24, z5lVar));
                    return Unit.a;
                }
                g06 g06Var = vfdVar.e;
                ufdVar.j = null;
                ufdVar.k = vhdVar2;
                ufdVar.l = z4;
                ufdVar.m = z5;
                ufdVar.n = z8;
                ufdVar.q = 2;
                obj = g06Var.m(t1qVar2, vhdVar2, ufdVar);
                if (obj != nm6Var) {
                    z6 = z5;
                    z7 = z4;
                    pfdVar = (pfd) obj;
                    if (pfdVar == null) {
                    }
                }
                return nm6Var;
            }
        }
        ufdVar = new ufd(vfdVar, continuation);
        obj = ufdVar.o;
        nm6 nm6Var2 = nm6.a;
        i = ufdVar.q;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        if (((gfw) obj) != gfw.b) {
        }
    }
}
