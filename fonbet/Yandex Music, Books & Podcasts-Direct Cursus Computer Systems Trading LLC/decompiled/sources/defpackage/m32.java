package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class m32 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m32(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qo6 qo6Var;
        int i = 9;
        int i2 = 7;
        int i3 = 4;
        int i4 = 5;
        int i5 = 6;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.w((v32) this.b, (q32) this.c, (hq5) obj, rvf.R(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ksw.h((fvf) this.b, (fvf) this.c, (hq5) obj, rvf.R(1));
                break;
            case 2:
                qm2 qm2Var = (qm2) this.b;
                qxp qxpVar = (qxp) this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var);
                        oq5Var.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    hht hhtVar = (hht) gld.M(qm2Var.g, oq5Var).getValue();
                    boolean f = oq5Var.f(qm2Var) | oq5Var.h(qxpVar);
                    Object K2 = oq5Var.K();
                    if (f || K2 == kjnVar) {
                        K2 = new ap1(i4, qm2Var, qxpVar);
                        oq5Var.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    boolean f2 = oq5Var.f(qm2Var) | oq5Var.h(mm6Var);
                    Object K3 = oq5Var.K();
                    if (f2 || K3 == kjnVar) {
                        K3 = new ap1(i5, qm2Var, mm6Var);
                        oq5Var.k0(K3);
                    }
                    Function0 function02 = (Function0) K3;
                    boolean f3 = oq5Var.f(qm2Var);
                    Object K4 = oq5Var.K();
                    if (f3 || K4 == kjnVar) {
                        K4 = new u2(16, qm2Var);
                        oq5Var.k0(K4);
                    }
                    nt0.e(hhtVar, function0, function02, (pyc) K4, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 3:
                pyc pycVar = (pyc) this.b;
                ugt ugtVar = (ugt) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                String str = (String) obj2;
                str.getClass();
                pycVar.invoke(bool, str, ugtVar);
                break;
            case 4:
                qn2 qn2Var = (qn2) this.b;
                uo2 uo2Var = (uo2) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((String) obj2).getClass();
                mo2 mo2Var = ((so2) uo2Var).a;
                qn2Var.getClass();
                mo2Var.getClass();
                qn2Var.a.J(mo2Var, booleanValue);
                break;
            case 5:
                an2 an2Var = (an2) this.b;
                ybf ybfVar = an2Var.c;
                Context context = (Context) this.c;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                vo2 vo2Var = (vo2) ybfVar.getValue();
                gn2 gn2Var = an2Var.a;
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f4 = oq5Var3.f(vo2Var) | oq5Var3.f(gn2Var);
                Object K5 = oq5Var3.K();
                if (f4 || K5 == gq5.a) {
                    K5 = new qn2((vo2) ybfVar.getValue(), (xiu) gn2Var.invoke(context));
                    oq5Var3.k0(K5);
                }
                ot0.b((qn2) K5, oq5Var3, 0);
                break;
            case 6:
                skd skdVar = skd.a;
                wnv wnvVar = (wnv) this.b;
                plv plvVar = (plv) this.c;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (!oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var4.S();
                } else if (wnvVar.a == null) {
                    oq5Var4.Z(1926532537);
                    rnv rnvVar = wnvVar.b;
                    if (!rnvVar.equals(mnv.a)) {
                        if (!(rnvVar instanceof nnv)) {
                            if (!(rnvVar instanceof pnv)) {
                                if (!(rnvVar instanceof qnv)) {
                                    b6e.s();
                                    break;
                                } else {
                                    qo6Var = qo6.l;
                                }
                            } else {
                                qo6Var = qo6.g;
                            }
                        } else {
                            aab aabVar = ((nnv) rnvVar).a;
                            if (!(aabVar instanceof lt)) {
                                if (!(aabVar instanceof u51)) {
                                    if (!(aabVar instanceof eul)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        qo6Var = qo6.e;
                                    }
                                } else {
                                    qo6Var = qo6.d;
                                }
                            } else {
                                qo6Var = qo6.b;
                            }
                        }
                    } else {
                        qo6Var = qo6.e;
                    }
                    rvf.c(qo6Var, o5g.z(skdVar), plvVar, oq5Var4, 0);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.Z(1926783079);
                    saf.o(new n33(wnvVar.a), o5g.z(skdVar), 0, null, oq5Var4, 48, 24);
                    oq5Var4.p(false);
                }
                break;
            case 7:
                va3 va3Var = (va3) this.b;
                Function0 function03 = (Function0) this.c;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                kjn kjnVar2 = gq5.a;
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ce5 ce5Var = va3Var.a;
                    laa laaVar = (laa) szf.Q((vdr) ce5Var.l, oq5Var5).getValue();
                    boolean h = oq5Var5.h(va3Var);
                    Object K6 = oq5Var5.K();
                    if (h || K6 == kjnVar2) {
                        oi1 oi1Var = new oi1(0, va3Var, va3.class, "onDownloadClick", "onDownloadClick()V", 0, 21);
                        oq5Var5.k0(oi1Var);
                        K6 = oi1Var;
                    }
                    etn.r(laaVar, (Function0) ((h9f) K6), function03, false, null, 0, oq5Var5, 0, 56);
                    boolean booleanValue2 = ((Boolean) szf.Q((vdr) ce5Var.j, oq5Var5).getValue()).booleanValue();
                    int intValue4 = ((Number) szf.Q((vdr) ce5Var.k, oq5Var5).getValue()).intValue();
                    boolean h2 = oq5Var5.h(va3Var);
                    Object K7 = oq5Var5.K();
                    if (h2 || K7 == kjnVar2) {
                        oi1 oi1Var2 = new oi1(0, va3Var, va3.class, "onLikeClick", "onLikeClick()V", 0, 22);
                        oq5Var5.k0(oi1Var2);
                        K7 = oi1Var2;
                    }
                    cb0.a(booleanValue2, intValue4, function03, (Function0) ((h9f) K7), false, false, false, null, null, 0, oq5Var5, 0, 1008);
                    boolean booleanValue3 = ((Boolean) szf.Q((vdr) ce5Var.i, oq5Var5).getValue()).booleanValue();
                    sb3 sb3Var = (sb3) szf.Q(va3Var.i, oq5Var5).getValue();
                    boolean h3 = oq5Var5.h(va3Var);
                    Object K8 = oq5Var5.K();
                    if (h3 || K8 == kjnVar2) {
                        oi1 oi1Var3 = new oi1(0, va3Var, va3.class, "onPlayClick", "onPlayClick()V", 0, 23);
                        oq5Var5.k0(oi1Var3);
                        K8 = oi1Var3;
                    }
                    i4w.d(booleanValue3, sb3Var, function03, (Function0) ((h9f) K8), oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                break;
            case 8:
                cb3 cb3Var = (cb3) this.b;
                y93 y93Var = (y93) this.c;
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                kjn kjnVar3 = gq5.a;
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    vci vciVar = vci.a;
                    yci c = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var6), 7), 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i6 = oq5Var6.P;
                    androidx.compose.runtime.internal.a l = oq5Var6.l();
                    yci H = vnj.H(oq5Var6, c);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var6.d0();
                    if (oq5Var6.O) {
                        oq5Var6.k(grbVar);
                    } else {
                        oq5Var6.n0();
                    }
                    g0g.U(oq5Var6, d, wp5.f);
                    g0g.U(oq5Var6, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var6, i6, kb5Var);
                    }
                    g0g.U(oq5Var6, H, wp5.d);
                    ivf.q(((bb3) cb3Var).a, null, R.drawable.ic_podcast_and_book_24, b.a.a(vciVar, b2c.f), c3x.b, oq5Var6, 24624, 0);
                    boolean h4 = oq5Var6.h(y93Var);
                    Object K9 = oq5Var6.K();
                    if (h4 || K9 == kjnVar3) {
                        t93 t93Var = new t93(0, y93Var, y93.class, "onBackClick", "onBackClick()V", 0, 7);
                        oq5Var6.k0(t93Var);
                        K9 = t93Var;
                    }
                    h9f h9fVar = (h9f) K9;
                    boolean h5 = oq5Var6.h(y93Var);
                    Object K10 = oq5Var6.K();
                    if (h5 || K10 == kjnVar3) {
                        t93 t93Var2 = new t93(0, y93Var, y93.class, "onSearchClick", "onSearchClick()V", 0, 8);
                        oq5Var6.k0(t93Var2);
                        K10 = t93Var2;
                    }
                    h9f h9fVar2 = (h9f) K10;
                    boolean h6 = oq5Var6.h(y93Var);
                    Object K11 = oq5Var6.K();
                    if (h6 || K11 == kjnVar3) {
                        t93 t93Var3 = new t93(0, y93Var, y93.class, "onOverflowClick", "onOverflowClick()V", 0, 9);
                        oq5Var6.k0(t93Var3);
                        K11 = t93Var3;
                    }
                    t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K11), oq5Var6, 0, 0);
                    oq5Var6.p(true);
                } else {
                    oq5Var6.S();
                }
                break;
            case 9:
                pyc pycVar2 = (pyc) this.b;
                oho ohoVar = (oho) this.c;
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    pycVar2.invoke(ohoVar, oq5Var7, 0);
                } else {
                    oq5Var7.S();
                }
                break;
            case 10:
                wn5 wn5Var = (wn5) this.b;
                b bVar = b.a;
                uoi uoiVar = (uoi) this.c;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                wn5Var.invoke(bVar, uoiVar, hq5Var7, 0);
            case 11:
                ((Integer) obj2).getClass();
                xv7.e((dk3) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                tt0.b((ny3) this.b, (wy3) this.c, (hq5) obj, rvf.R(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                vq2.p((b04) this.b, (ArrayList) this.c, (hq5) obj, rvf.R(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                vq2.d((b04) this.b, (p21) this.c, (hq5) obj, rvf.R(1));
                break;
            case 15:
                f14 f14Var = (f14) this.b;
                zpd zpdVar = (zpd) this.c;
                hq5 hq5Var8 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    bg3.c(f14Var, zpdVar, null, null, 0.0f, oq5Var9, 0, 28);
                } else {
                    oq5Var9.S();
                }
                break;
            case 16:
                d54 d54Var = (d54) this.b;
                nnk nnkVar = (nnk) this.c;
                hq5 hq5Var9 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (oq5Var10.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean f5 = oq5Var10.f(d54Var) | oq5Var10.f(nnkVar);
                    Object K12 = oq5Var10.K();
                    if (f5 || K12 == gq5.a) {
                        K12 = new u44(nnkVar, d54Var.b, d54Var);
                        oq5Var10.k0(K12);
                    }
                    j66.i((u44) K12, oq5Var10, 0);
                } else {
                    oq5Var10.S();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                gld.b((b18) this.b, (Function1) this.c, (hq5) obj, rvf.R(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                leu.e((kf4) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                bow.e((eg4) this.b, (yci) this.c, (hq5) obj, rvf.R(49));
                break;
            case 20:
                ((Integer) obj2).getClass();
                sk3.d((ip4) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            case 21:
                CharSequence charSequence = (CharSequence) this.b;
                cjc cjcVar = (cjc) this.c;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var10;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                String obj3 = charSequence.toString();
                oq5 oq5Var12 = (oq5) hq5Var10;
                long j = ((dq0) oq5Var12.j(eq0.a)).b.b;
                vci vciVar2 = vci.a;
                boolean f6 = oq5Var12.f(cjcVar);
                Object K13 = oq5Var12.K();
                if (f6 || K13 == gq5.a) {
                    K13 = new wf3(cjcVar, 9);
                    oq5Var12.k0(K13);
                }
                xv7.j(obj3, wyf.s(vciVar2, (Function0) K13), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var12, 0, 3120, 120824);
                break;
            case 22:
                bz4 bz4Var = (bz4) this.b;
                zh zhVar = (zh) this.c;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                pvfVar.a(new String[]{"COLLECTION_FAVOURITE_ARTISTS"}, new az4(bz4Var, i3));
                y35 y35Var = y35.WIZARD;
                pvfVar.a(new String[]{"COLLECTION_FAVOURITE_PLAYLIST"}, new az4(bz4Var, i4));
                pvfVar.a(new String[]{"COLLECTION_DISLIKES"}, new az4(bz4Var, i5));
                pvfVar.a(new String[]{"COLLECTION_SECTIONS"}, new az4(bz4Var, i2));
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h()) {
                    pvfVar.a(new String[]{"COLLECTION_WAVE_AGENT"}, new az4(bz4Var, 8));
                } else {
                    pvfVar.a(new String[]{"COLLECTION_WAVE"}, new az4(bz4Var, i));
                }
                pvfVar.a(new String[]{y35.CONNECTIVITY_INFO.b}, new az4(bz4Var, 10));
                pvfVar.a(new String[]{y35.WIZARD.b}, new ap1(19, zhVar, bz4Var));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((p65) this.b).A((wn5) this.c, (hq5) obj, rvf.R(7));
                break;
            case 24:
                a75 a75Var = (a75) this.b;
                qnq qnqVar = (qnq) this.c;
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    y65.a(a75Var, qnqVar.d, null, oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                break;
            case 25:
                CoroutineContext[] coroutineContextArr = (CoroutineContext[]) this.b;
                vqn vqnVar = (vqn) this.c;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                ((Unit) obj).getClass();
                element.getClass();
                int i7 = vqnVar.a;
                vqnVar.a = i7 + 1;
                coroutineContextArr[i7] = element;
                break;
            case 26:
                c cVar = (c) this.b;
                fvb fvbVar = (fvb) this.c;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var12;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                vwb.C(cVar, new krp(new vrp(u75.h(vqp.d, sqp.c, wqp.b, yqp.a, uqp.b, rqp.a), null)), d85.c, fvbVar.e, null, hq5Var12, 384);
            case 27:
                eoi eoiVar = (eoi) this.b;
                aqi aqiVar = (aqi) this.c;
                hq5 hq5Var13 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Object K14 = oq5Var15.K();
                    if (K14 == gq5.a) {
                        K14 = new ap1(27, eoiVar, aqiVar);
                        oq5Var15.k0(K14);
                    }
                    doi.b((Function0) K14, null, eoiVar, oq5Var15, 390);
                } else {
                    oq5Var15.S();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                fgq.i((dt5) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ksw.l((i31) this.b, (yci) this.c, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ m32(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
