package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class x8l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x8l(int i, z53 z53Var, eqp eqpVar) {
        this.a = 20;
        this.c = i;
        this.d = z53Var;
        this.b = eqpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0491, code lost:
    
        if (r3.i() == null) goto L99;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a9l a9lVar = (a9l) this.d;
                mwk mwkVar = (mwk) this.b;
                mqs mqsVar = (mqs) obj;
                izs izsVar = (izs) obj2;
                mqsVar.getClass();
                izsVar.getClass();
                gj gjVar = mwkVar.c().c;
                a9lVar.getClass();
                boolean z = true;
                int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else if (mqsVar.i() != null) {
                        z = false;
                        break;
                    }
                }
                zus zusVar = new zus(this.c);
                e6v e6vVar = izsVar instanceof e6v ? (e6v) izsVar : null;
                if (e6vVar == null) {
                    e6vVar = y5g.B0(mqsVar, ryt.a);
                }
                ve veVar = new ve(muo.BIG_PLAYER, zqt.a);
                t tVar = a9lVar.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                kxi kxiVar = a9lVar.b;
                a aVar = PlaybackScope.a;
                aVar.getClass();
                rre.Z(mqsVar, zusVar, e6vVar, veVar, tVar, supportFragmentManager, kxiVar, aVar, gjVar, null, null, 1536);
            case 1:
                til tilVar = (til) this.d;
                mwk mwkVar2 = (mwk) this.b;
                mqs mqsVar2 = (mqs) obj;
                izs izsVar2 = (izs) obj2;
                mqsVar2.getClass();
                izsVar2.getClass();
                nsh nshVar = tilVar.d;
                gj gjVar2 = mwkVar2.c().c;
                nshVar.getClass();
                int ordinal2 = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        break;
                    } else {
                        break;
                    }
                }
                zus zusVar2 = new zus(this.c);
                e6v e6vVar2 = izsVar2 instanceof e6v ? (e6v) izsVar2 : null;
                if (e6vVar2 == null) {
                    e6vVar2 = y5g.B0(mqsVar2, ryt.a);
                }
                ve veVar2 = new ve(muo.BIG_PLAYER, zqt.a);
                Context context = (Context) nshVar.b;
                y yVar = (y) nshVar.c;
                kxi kxiVar2 = (kxi) nshVar.d;
                a aVar2 = PlaybackScope.a;
                aVar2.getClass();
                rre.Z(mqsVar2, zusVar2, e6vVar2, veVar2, context, yVar, kxiVar2, aVar2, gjVar2, null, null, 1536);
                break;
            case 2:
                ((Integer) obj2).intValue();
                wyf.a((us5) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                y1g.k((uft) this.d, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zdg.h((lin) this.d, (grv) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                neg.c((min) this.d, (grv) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                edo.a((dh3) this.d, (String) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                qxo.c((mxo) this.d, (String) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 8:
                d5p d5pVar = (d5p) this.d;
                g7p g7pVar = (g7p) this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    aqi P = szf.P(d5pVar.E(g7pVar.b.b), Boolean.valueOf(g7pVar.a.b), null, oq5Var, 0, 2);
                    itk itkVar = new itk();
                    boolean booleanValue = ((Boolean) P.getValue()).booleanValue();
                    boolean h = oq5Var.h(d5pVar) | oq5Var.h(g7pVar);
                    int i = this.c;
                    boolean d = h | oq5Var.d(i);
                    Object K = oq5Var.K();
                    if (d || K == gq5.a) {
                        K = new hsl(d5pVar, g7pVar, i, 2);
                        oq5Var.k0(K);
                    }
                    lg3.h(itkVar, booleanValue, (Function0) K, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                v3g.k((h2p) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                v3g.l((i2p) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                o5g.g((c0p) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                p6g.i((m7n) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 13:
                y7p y7pVar = (y7p) this.d;
                g6p g6pVar = (g6p) this.b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                if (y7pVar.b() == e4p.a) {
                    int i2 = this.c;
                    if (booleanValue2) {
                        g6pVar.z(y7pVar, i2, str);
                    } else {
                        g6pVar.C(y7pVar, i2, str);
                    }
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                g0g.w((ctp) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                g0g.j((tsp) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                g0g.u((qsp) this.d, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                g0g.l((wsp) this.d, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                g0g.c((nsp) this.d, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                g0g.r((zsp) this.d, (Function1) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 20:
                z53 z53Var = (z53) this.d;
                eqp eqpVar = (eqp) this.b;
                ((Integer) obj2).getClass();
                oq5 oq5Var2 = (oq5) ((hq5) obj);
                oq5Var2.Z(-454927339);
                int i3 = this.c;
                vci vciVar = vci.a;
                yci q = i3 != 0 ? androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 24, 0.0f, 0.0f, 13) : vciVar;
                ksp a = z53Var.a();
                if (a != null) {
                    fk0 N = u1g.N(eqpVar, a, oq5Var2, 0);
                    boolean h2 = oq5Var2.h(N);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == gq5.a) {
                        K2 = new kw4(N, 6);
                        oq5Var2.k0(K2);
                    }
                    q = q.f(wyf.t(vciVar, (Function0) K2));
                }
                oq5Var2.p(false);
                break;
            case 21:
                ((Integer) obj2).getClass();
                rzf.j((pjc) this.d, (yci) this.b, (hq5) obj, rvf.R(1), this.c);
                break;
            case 22:
                ((Integer) obj2).getClass();
                rzf.b((qor) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 23:
                xsq xsqVar = (xsq) this.d;
                hvq hvqVar = (hvq) this.b;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                hvqVar.r(booleanValue3, new zsq(xsqVar, this.c, 0), str2);
                break;
            case 24:
                ((Integer) obj2).getClass();
                jft.a((lmn) this.d, (wn5) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                rvf.o((jki) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                o5g.o((z9u) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                g0g.y((eku) this.d, (jz3) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                o5g.q((rmu) this.d, (yci) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y7g.g((rpu) this.d, (Function0) this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x8l(int i, xsq xsqVar, hvq hvqVar) {
        this.a = 23;
        this.d = xsqVar;
        this.c = i;
        this.b = hvqVar;
    }

    public /* synthetic */ x8l(pjc pjcVar, yci yciVar, int i, int i2) {
        this.a = 21;
        this.d = pjcVar;
        this.b = yciVar;
        this.c = i2;
    }

    public /* synthetic */ x8l(rpu rpuVar, Function0 function0, int i) {
        this.a = 29;
        this.d = rpuVar;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ x8l(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
