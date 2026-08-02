package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.google.gson.Gson;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class mjm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mjm(q5p q5pVar, x3n x3nVar) {
        this.a = 9;
        this.b = q5pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                ojm ojmVar = (ojm) this.b;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                ojmVar.getClass();
                j6e j6eVar = ojmVar.a;
                ((ebm) j6eVar.b).invoke();
                ((m) j6eVar.a).x(u51Var);
                break;
            case 1:
                ytm ytmVar = (ytm) this.b;
                ((Boolean) obj).getClass();
                cum cumVar = ytmVar.k;
                if (cumVar != null) {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((h9m) ((byb) qdcVar.C(I)).b(h9m.class)).h()) {
                        x66 a = cumVar.e.a();
                        if (a.a) {
                            ((g5k) cumVar.m.getValue()).a();
                        } else {
                            hld.H(cumVar.b, a);
                        }
                    }
                }
                break;
            case 2:
                jap japVar = (jap) this.b;
                int i = (int) (((hqe) obj).a >> 32);
                japVar.d.i(i >= 1 ? i : 1);
                break;
            case 3:
                nwm nwmVar = (nwm) this.b;
                ((mm6) obj).getClass();
                bx bxVar = (bx) nwmVar.j.getValue();
                fwm fwmVar = nwmVar.h;
                String str2 = fwmVar.b.a;
                b80 G = men.G(fwmVar.a);
                bxVar.getClass();
                str2.getClass();
                zw zwVar = (zw) bxVar.c.getValue();
                if (!Intrinsics.d(zwVar, vw.a) && !(zwVar instanceof uw)) {
                    if (!(zwVar instanceof yw) && !(zwVar instanceof xw) && !Intrinsics.d(zwVar, ww.a)) {
                        b6e.s();
                        break;
                    }
                } else {
                    bxVar.a(str2, G);
                }
                break;
            case 4:
                m mVar = (m) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                String str3 = mVar.a;
                if (str3.length() > 0) {
                    wfp.k(jfpVar, str3);
                }
                break;
            case 5:
                p7s p7sVar = (p7s) this.b;
                q2n q2nVar = (q2n) obj;
                q2nVar.getClass();
                p7sVar.c(q2nVar);
                break;
            case 6:
                sfm sfmVar = (sfm) this.b;
                ((Context) obj).getClass();
                break;
            case 7:
                oan oanVar = (oan) this.b;
                ((u8l) obj).getClass();
                break;
            case 8:
                gld.L((tf6) ((nnd) this.b).c, null);
                break;
            case 9:
                q5p q5pVar = (q5p) this.b;
                umn umnVar = (umn) obj;
                umnVar.getClass();
                q5pVar.invoke(umnVar instanceof tmn ? new gmn(((tmn) umnVar).a) : umnVar instanceof qmn ? fmn.a : emn.a);
                break;
            case 10:
                j0p j0pVar = (j0p) this.b;
                ((is6) obj).getClass();
                r9t r9tVar = (r9t) j0pVar.a.getValue();
                kni kniVar = new kni();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(Gson.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                Gson gson = (Gson) qdcVar2.C(I2);
                it0 it0Var = it0.a;
                break;
            case 11:
                ((kpm) this.b).K();
                break;
            case 12:
                ja0 ja0Var = (ja0) this.b;
                ((jx7) obj).getClass();
                break;
            case 13:
                e2o e2oVar = (e2o) this.b;
                poa poaVar = (poa) obj;
                poaVar.getClass();
                poaVar.a(d2o.a, 0.0f);
                poaVar.a(d2o.b, 0.0f);
                poaVar.a(d2o.c, e2oVar.e.e());
                break;
            case 14:
                lbo lboVar = (lbo) this.b;
                Long l = (Long) obj;
                l.getClass();
                break;
            case 15:
                v97 v97Var = (v97) this.b;
                rsr rsrVar = (rsr) obj;
                rsrVar.getClass();
                v97Var.i = rsrVar;
                break;
            case 16:
                ueo ueoVar = (ueo) this.b;
                jc7 jc7Var = (jc7) obj;
                jc7Var.getClass();
                break;
            case 17:
                mjm mjmVar = (mjm) this.b;
                cko ckoVar = (cko) obj;
                ckoVar.getClass();
                mjmVar.invoke(new g13(ckoVar, 0));
                break;
            case 18:
                afo afoVar = (afo) this.b;
                cko ckoVar2 = (cko) obj;
                ckoVar2.getClass();
                int i2 = afoVar.g;
                if (1 <= i2) {
                    int i3 = 1;
                    while (true) {
                        int i4 = afoVar.f[i3];
                        if (i4 == 1) {
                            ckoVar2.bindNull(i3);
                        } else if (i4 == 2) {
                            ckoVar2.bindLong(i3, afoVar.b[i3]);
                        } else if (i4 == 3) {
                            ckoVar2.bindDouble(i3, afoVar.c[i3]);
                        } else if (i4 == 4) {
                            String str4 = afoVar.d[i3];
                            if (str4 == null) {
                                xq0.x("Required value was null.");
                                break;
                            } else {
                                ckoVar2.E(i3, str4);
                            }
                        } else if (i4 == 5) {
                            byte[] bArr = afoVar.e[i3];
                            if (bArr == null) {
                                xq0.x("Required value was null.");
                                break;
                            } else {
                                ckoVar2.bindBlob(i3, bArr);
                            }
                        }
                        if (i3 != i2) {
                            i3++;
                        }
                    }
                }
                break;
            case 19:
                plv plvVar = (plv) this.b;
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                if (!(plvVar instanceof nlv)) {
                    if (!Intrinsics.d(plvVar, olv.b)) {
                        b6e.s();
                        break;
                    } else {
                        str = "system";
                    }
                } else {
                    str = "cover_based";
                }
                ngg.H(ifpVar, str);
                break;
            case 20:
                vp5 vp5Var = (vp5) this.b;
                ((oa8) obj).getClass();
                break;
            case 21:
                g6p g6pVar = (g6p) this.b;
                ((Boolean) obj).getClass();
                g6pVar.i();
                break;
            case 22:
                r0w r0wVar = (r0w) this.b;
                IndexedValue indexedValue = (IndexedValue) obj;
                indexedValue.getClass();
                break;
            case 23:
                break;
            case 24:
                eqp eqpVar = (eqp) this.b;
                elk elkVar = (elk) obj;
                elkVar.getClass();
                if (!(elkVar instanceof dlk)) {
                    if (!(elkVar instanceof blk)) {
                        if (!(elkVar instanceof clk)) {
                            b6e.s();
                            break;
                        } else {
                            eqpVar.g.a();
                        }
                    } else {
                        eqpVar.g.a();
                    }
                } else {
                    ((r2q) eqpVar.s.getValue()).a(true);
                }
                break;
            case 25:
                wtp wtpVar = (wtp) this.b;
                ((oa8) obj).getClass();
                break;
            case 26:
                tvp tvpVar = (tvp) this.b;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.i(jfpVar2, new ky4(1, tvpVar.a.size()));
                break;
            case 27:
                ComposeView composeView = (ComposeView) this.b;
                ((Context) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                znm znmVar = (znm) this.b;
                joj jojVar = (joj) obj;
                jojVar.getClass();
                jojVar.k = znmVar.a;
                jojVar.b(znmVar.b);
                break;
            default:
                l13 l13Var = (l13) this.b;
                joj jojVar2 = (joj) obj;
                jojVar2.getClass();
                jojVar2.k = ((fy2) l13Var.a(hag.I(fy2.class))).a;
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mjm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
