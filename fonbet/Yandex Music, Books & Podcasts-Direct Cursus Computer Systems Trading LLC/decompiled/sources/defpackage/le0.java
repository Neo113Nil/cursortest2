package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.MetricsService;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes.dex */
public final /* synthetic */ class le0 extends ezc implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d70 d70Var;
        boolean b;
        gpc W0;
        int i = 2;
        boolean z = false;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                yi1 yi1Var = (yi1) this.receiver;
                yi1Var.getClass();
                o11 o11Var = yi1Var.q;
                o11Var.getClass();
                if (booleanValue) {
                    d70Var = new d70(o11Var.a.e.b, c70.b, "", 0, 0, str);
                    o11Var.d = d70Var;
                } else {
                    d70Var = o11Var.d;
                }
                if (d70Var != null) {
                    o11Var.a().h(d70Var, booleanValue);
                }
                break;
            case 2:
                mqs mqsVar = (mqs) obj;
                int intValue = ((Number) obj2).intValue();
                mqsVar.getClass();
                ml1 ml1Var = (ml1) this.receiver;
                ml1Var.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((k94) ((byb) qdcVar.C(I)).c(ern.a(k94.class))).h();
                hk1 hk1Var = ml1Var.c;
                if (h) {
                    de deVar = new de(ml1Var, intValue, mqsVar, i);
                    hk1Var.getClass();
                    a0g.G(hk1Var.a, mqsVar, deVar);
                } else {
                    ?? r2 = ml1Var.i;
                    kc kcVar = new kc(20, ml1Var, mqsVar);
                    hk1Var.getClass();
                    r2.getClass();
                    a0g.G(hk1Var.a, mqsVar, new gk1(hk1Var, (List) r2, mqsVar, intValue, kcVar));
                }
                break;
            case 3:
                mqs mqsVar2 = (mqs) obj;
                int intValue2 = ((Number) obj2).intValue();
                mqsVar2.getClass();
                ml1 ml1Var2 = (ml1) this.receiver;
                ml1Var2.getClass();
                hk1 hk1Var2 = ml1Var2.c;
                Object obj3 = ml1Var2.i;
                hk1Var2.getClass();
                obj3.getClass();
                zus zusVar = new zus(intValue2);
                b6v t0 = y5g.t0(hk1Var2.c, k3q.a);
                ve veVar = new ve(muo.ARTIST, zqt.d);
                t tVar = hk1Var2.a;
                y yVar = hk1Var2.b;
                kxi kxiVar = hk1Var2.d;
                PlaybackScope playbackScope = hk1Var2.e.a;
                playbackScope.getClass();
                rre.Z(mqsVar2, zusVar, t0, veVar, tVar, yVar, kxiVar, playbackScope, null, null, null, 1792);
                break;
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                y12 y12Var = (y12) this.receiver;
                y12Var.getClass();
                weo.H(y12Var.b, y12Var.d, booleanValue2, str2, null);
                break;
            case 5:
                break;
            case 6:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                tz5 tz5Var = (tz5) this.receiver;
                tz5Var.getClass();
                rmb rmbVar = tz5Var.p;
                thj thjVar = tz5Var.q;
                if (booleanValue3) {
                    rmbVar.l(null, thjVar, str3);
                } else {
                    rmbVar.f(thjVar, null);
                }
                break;
            case 7:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                ((os6) this.receiver).getClass();
                if (str4 != null) {
                    int hashCode = str4.hashCode();
                    if (hashCode == -1567968963) {
                        if (str4.equals("GET_CANCELED_TAG")) {
                            break;
                        }
                    } else if (hashCode == -154594663) {
                        if (str4.equals("GET_INTERRUPTED")) {
                            break;
                        }
                    } else if (hashCode == 1996705159 && str4.equals("GET_NO_CREDENTIALS")) {
                        break;
                    }
                }
                break;
            case 8:
                ((os6) this.receiver).getClass();
                break;
            case 9:
                ((os6) this.receiver).getClass();
                break;
            case 10:
                break;
            case 11:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str6 = (String) obj2;
                str6.getClass();
                r88 r88Var = (r88) this.receiver;
                r88Var.getClass();
                weo.H(r88Var.e, r88Var.j, booleanValue4, str6, null);
                break;
            case 12:
                ((RecyclerView) this.receiver).B0(((Number) obj).intValue(), ((Number) obj2).intValue(), false);
                break;
            case 13:
                ((RecyclerView) this.receiver).scrollBy(((Number) obj).intValue(), ((Number) obj2).intValue());
                break;
            case 14:
                ((Function1) this.receiver).invoke((syn) obj);
                break;
            case 15:
                bpc bpcVar = (bpc) obj;
                bpc bpcVar2 = (bpc) obj2;
                fpc fpcVar = (fpc) this.receiver;
                if (fpcVar.n && (b = bpcVar2.b()) != bpcVar.b()) {
                    Function1 function1 = fpcVar.r;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(b));
                    }
                    if (b) {
                        x97.y(fpcVar.G0(), null, null, new g68(fpcVar, continuation, 18), 3);
                        xqn xqnVar = new xqn();
                        neg.y(fpcVar, new ssb(xqnVar, fpcVar, i));
                        auf aufVar = (auf) xqnVar.a;
                        if (aufVar != null) {
                            aufVar.a();
                        } else {
                            aufVar = null;
                        }
                        fpcVar.t = aufVar;
                        f8j f8jVar = fpcVar.u;
                        if (f8jVar != null && f8jVar.b1().n && (W0 = fpcVar.W0()) != null) {
                            W0.S0(fpcVar.u);
                        }
                    } else {
                        auf aufVar2 = fpcVar.t;
                        if (aufVar2 != null) {
                            aufVar2.b();
                        }
                        fpcVar.t = null;
                        gpc W02 = fpcVar.W0();
                        if (W02 != null) {
                            W02.S0(null);
                        }
                    }
                    neg.w(fpcVar);
                    uoi uoiVar = fpcVar.q;
                    if (uoiVar != null) {
                        poc pocVar = fpcVar.s;
                        if (b) {
                            if (pocVar != null) {
                                fpcVar.V0(uoiVar, new qoc(pocVar));
                                fpcVar.s = null;
                            }
                            poc pocVar2 = new poc();
                            fpcVar.V0(uoiVar, pocVar2);
                            fpcVar.s = pocVar2;
                        } else if (pocVar != null) {
                            fpcVar.V0(uoiVar, new qoc(pocVar));
                            fpcVar.s = null;
                        }
                    }
                }
                break;
            case 16:
                int intValue3 = ((Number) obj).intValue();
                m0s m0sVar = (m0s) obj2;
                m0sVar.getClass();
                j2e j2eVar = (j2e) this.receiver;
                j2eVar.getClass();
                if (m0sVar instanceof l0s) {
                    l0s l0sVar = (l0s) m0sVar;
                    j2eVar.c.invoke(l0sVar.c, l0sVar.d);
                } else if (m0sVar instanceof k0s) {
                    j2eVar.a(intValue3);
                } else {
                    j2eVar.a(intValue3);
                }
                break;
            case 17:
                u51 u51Var = (u51) obj;
                int intValue4 = ((Number) obj2).intValue();
                u51Var.getClass();
                ((k0f) this.receiver).p(u51Var, intValue4);
                break;
            case 18:
                lt ltVar = (lt) obj;
                int intValue5 = ((Number) obj2).intValue();
                ltVar.getClass();
                ((k0f) this.receiver).j(ltVar, intValue5);
                break;
            case 19:
                lt ltVar2 = (lt) obj;
                int intValue6 = ((Number) obj2).intValue();
                ltVar2.getClass();
                ((k0f) this.receiver).j(ltVar2, intValue6);
                break;
            case 20:
                x1u x1uVar = (x1u) obj;
                int intValue7 = ((Number) obj2).intValue();
                x1uVar.getClass();
                ((k0f) this.receiver).g(intValue7, x1uVar);
                break;
            case 21:
                eul eulVar = (eul) obj;
                int intValue8 = ((Number) obj2).intValue();
                eulVar.getClass();
                ((k0f) this.receiver).h(eulVar, intValue8);
                break;
            case 22:
                mqs mqsVar3 = (mqs) obj;
                int intValue9 = ((Number) obj2).intValue();
                mqsVar3.getClass();
                ((k0f) this.receiver).q(mqsVar3, intValue9);
                break;
            case 23:
                mhp mhpVar = (mhp) obj;
                int intValue10 = ((Number) obj2).intValue();
                mhpVar.getClass();
                y4f y4fVar = (y4f) this.receiver;
                y4fVar.getClass();
                if (!mhpVar.j(intValue10) && mhpVar.h(intValue10).c()) {
                    z = true;
                }
                y4fVar.b = z;
                break;
            case 24:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                String str7 = (String) obj2;
                str7.getClass();
                vff vffVar = (vff) this.receiver;
                vffVar.getClass();
                weo.H(vffVar.b.a, bg3.I((wff) vffVar.c.getValue()), booleanValue5, str7, null);
                break;
            case 25:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                String str8 = (String) obj2;
                str8.getClass();
                j2g j2gVar = (j2g) this.receiver;
                j2gVar.getClass();
                w2g w2gVar = j2gVar.a;
                j6e j6eVar = w2gVar.f;
                cvl cvlVar = w2gVar.j;
                j6eVar.getClass();
                if (cvlVar != null) {
                    ((q43) j6eVar.a).h(ox6.M(bfg.J(cvlVar), 0, str8), booleanValue6);
                }
                break;
            case 26:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                String str9 = (String) obj2;
                str9.getClass();
                j2g j2gVar2 = (j2g) this.receiver;
                j2gVar2.getClass();
                j6e j6eVar2 = j2gVar2.a.f;
                j6eVar2.getClass();
                ((q43) j6eVar2.a).h(new d70("music_history_screen", c70.k, ((skr) ((jyr) j6eVar2.b).getValue()).c(R.string.listening_history_header_title), 1, str9), booleanValue7);
                break;
            case 27:
                float floatValue = ((Number) obj).floatValue();
                rap rapVar = (rap) obj2;
                rapVar.getClass();
                ((c6h) this.receiver).t(floatValue, rapVar);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                float floatValue2 = ((Number) obj).floatValue();
                rap rapVar2 = (rap) obj2;
                rapVar2.getClass();
                ((c6h) this.receiver).t(floatValue2, rapVar2);
                break;
            default:
                lyd lydVar = (lyd) obj;
                wyd wydVar = (wyd) obj2;
                lydVar.getClass();
                wydVar.getClass();
                ((MetricsService) this.receiver).recordDeltaWithLogging(lydVar, wydVar);
                break;
        }
        return Unit.a;
    }
}
