package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import defpackage.a6t0;
import defpackage.atk0;
import defpackage.au2;
import defpackage.avj0;
import defpackage.bgr0;
import defpackage.bms;
import defpackage.bmt0;
import defpackage.btk0;
import defpackage.cvu0;
import defpackage.duk0;
import defpackage.evu0;
import defpackage.eyr;
import defpackage.fuk0;
import defpackage.hk2;
import defpackage.hqz0;
import defpackage.hr90;
import defpackage.hzr;
import defpackage.iq2;
import defpackage.izr;
import defpackage.juk0;
import defpackage.k5z;
import defpackage.kk2;
import defpackage.ksk0;
import defpackage.kuk0;
import defpackage.kyh0;
import defpackage.lgv;
import defpackage.lsk0;
import defpackage.luk0;
import defpackage.lzr;
import defpackage.mta1;
import defpackage.muk0;
import defpackage.mvg;
import defpackage.noz0;
import defpackage.ntk0;
import defpackage.nuk0;
import defpackage.ny61;
import defpackage.ouk0;
import defpackage.qtk0;
import defpackage.qv10;
import defpackage.rly0;
import defpackage.rtk0;
import defpackage.rya1;
import defpackage.scc;
import defpackage.soy0;
import defpackage.stk0;
import defpackage.tcc;
import defpackage.td5;
import defpackage.tuk0;
import defpackage.uoj;
import defpackage.uq90;
import defpackage.utk0;
import defpackage.uuk0;
import defpackage.vnb1;
import defpackage.vtk0;
import defpackage.vza1;
import defpackage.wi70;
import defpackage.wuk0;
import defpackage.xuk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$RoadMode;
import ru.yandex.taxi.preorder.tollroad.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lnoz0;", "tollRoadDescriptionInfo", "", "Lntk0;", "roadOptions", "Lwi70;", "buttonModel", "Lluk0;", "<anonymous>", "(Lnoz0;Ljava/util/List;Lwi70;)Lluk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.compose.interactor.RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2", f = "RoadsPaneUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2 roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2 = new RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2(this.this$0, (Continuation) obj4);
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2.L$0 = (noz0) obj;
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2.L$1 = (List) obj2;
        roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2.L$2 = (wi70) obj3;
        return roadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        kk2 kk2Var;
        vtk0 vtk0Var;
        ArrayList arrayList;
        au2 au2Var;
        d dVar;
        kuk0 kuk0Var;
        Iterator it;
        boolean z2;
        String str;
        String str2;
        uoj uojVar;
        noz0 noz0Var = (noz0) this.L$0;
        List list = (List) this.L$1;
        wi70 wi70Var = (wi70) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<ntk0> x0 = kotlin.collections.a.x0(list, new muk0());
        boolean z3 = false;
        if (!(x0 instanceof Collection) || !x0.isEmpty()) {
            for (ntk0 ntk0Var : x0) {
                if (ntk0Var.k || ntk0Var.i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        d dVar2 = this.this$0;
        dVar2.getClass();
        xuk0 xuk0Var = new xuk0(new wuk0(vza1.c(), ((avj0) dVar2.c).h(kyh0.common_close)));
        d dVar3 = this.this$0;
        if (z) {
            dVar3.getClass();
            vtk0Var = new vtk0(uuk0.a, ouk0.a);
        } else {
            o oVar = dVar3.a;
            String a = oVar.c.a(oVar.a.a.c() ? TollRoadDialogExperimentProvider$RoadMode.SINGLE_ROAD : TollRoadDialogExperimentProvider$RoadMode.MULTIPLE_ROAD, oVar.c(noz0Var));
            String str3 = noz0Var.a;
            String str4 = noz0Var.c;
            if (str3.length() == 0) {
                kk2Var = new kk2(a);
            } else if (str4.length() > 0) {
                hk2 hk2Var = new hk2(0);
                String w = cvu0.w(a, "%@", str3);
                int H = evu0.H(w, "%#", 0, false, 6);
                if (H >= 0) {
                    hk2Var.d(w.substring(0, H));
                    int h = hk2Var.h(new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.d, (bgr0) null, 61439));
                    try {
                        hk2Var.d(str4);
                        hk2Var.g(h);
                        hk2Var.d(w.substring(H + 2));
                    } catch (Throwable th) {
                        hk2Var.g(h);
                        throw th;
                    }
                } else {
                    hk2Var.d(w);
                }
                kk2Var = hk2Var.i();
            } else {
                kk2Var = new kk2(cvu0.w(a, "%@", str3));
            }
            vtk0Var = new vtk0(new tuk0(this.this$0.a.d()), new nuk0(kk2Var));
        }
        vtk0 vtk0Var2 = vtk0Var;
        d dVar4 = this.this$0;
        if (z) {
            dVar4.getClass();
            rtk0 rtk0Var = new rtk0(false, false);
            btk0 btk0Var = btk0.a;
            lsk0 lsk0Var = lsk0.a;
            arrayList = scc.g(new stk0(btk0Var, lsk0Var, null, rtk0Var, null, ""), new stk0(btk0Var, lsk0Var, null, new rtk0(false, false), null, ""));
        } else {
            ArrayList arrayList2 = new ArrayList(tcc.n(x0, 10));
            Iterator it2 = x0.iterator();
            while (it2.hasNext()) {
                ntk0 ntk0Var2 = (ntk0) it2.next();
                dVar4.getClass();
                boolean z4 = ntk0Var2.a == 0 ? true : z3;
                if (z4) {
                    au2Var = mta1.f();
                } else {
                    au2Var = vnb1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Coins", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        dVar = dVar4;
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        kuk0Var = null;
                        uq90Var.j(16.0f, 15.5f);
                        it = it2;
                        uq90Var.m(0.0f, -0.77f, -0.13f, -1.5f);
                        uq90Var.e(1.76f, -0.02f, 3.4f, -0.2f, 4.68f, -0.5f);
                        uq90Var.m(0.76f, -0.15f, 1.45f, -0.45f);
                        uq90Var.p(2.45f);
                        uq90Var.e(0.0f, 0.8f, -2.71f, 1.45f, -6.13f, 1.5f);
                        uq90Var.m(0.13f, -0.73f, 0.13f, -1.5f);
                        uq90Var.k(6.0f, -5.0f);
                        uq90Var.o(8.05f);
                        uq90Var.m(-0.7f, 0.29f, -1.45f, 0.46f);
                        uq90Var.a(24.0f, 24.0f, false, true, 15.5f, 9.0f);
                        uq90Var.m(-1.4f, 0.0f, -2.67f, -0.12f);
                        uq90Var.a(8.5f, 8.5f, false, true, 15.25f, 12.0f);
                        uq90Var.g(0.25f);
                        uq90Var.e(3.59f, 0.0f, 6.5f, -0.67f, 6.5f, -1.5f);
                        uq90Var.k(-13.0f, -5.0f);
                        uq90Var.d(9.0f, 6.33f, 11.91f, 7.0f, 15.5f, 7.0f);
                        hr90 hr90Var = new hr90(22.0f, 6.33f, 22.0f, 5.5f);
                        ArrayList arrayList3 = uq90Var.a;
                        arrayList3.add(hr90Var);
                        uq90Var.p(-1.0f);
                        uq90Var.e(0.0f, -0.83f, -2.91f, -1.5f, -6.5f, -1.5f);
                        z2 = z;
                        arrayList3.add(new hr90(9.0f, 3.67f, 9.0f, 4.5f));
                        uq90Var.c();
                        uq90Var.j(7.5f, 22.0f);
                        uq90Var.b(6.5f, 6.5f, true, false, 0.0f, -13.0f);
                        uq90Var.b(6.5f, 6.5f, false, false, 0.0f, 13.0f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", arrayList3);
                        au2 a2 = rya1.a(lgvVar.d(), true);
                        vnb1.a = a2;
                        au2Var = a2;
                        atk0 atk0Var = new atk0(au2Var);
                        String str5 = ntk0Var2.d;
                        str = ntk0Var2.e;
                        ksk0 ksk0Var = new ksk0(str5, str);
                        str2 = ntk0Var2.f;
                        qtk0 qtk0Var = new qtk0(str2);
                        boolean z5 = ntk0Var2.b;
                        boolean z6 = ntk0Var2.j;
                        rtk0 rtk0Var2 = new rtk0(z6, z5);
                        kuk0 kuk0Var2 = (z5 && z6) ? z4 ? fuk0.a : juk0.a : kuk0Var;
                        StringBuilder t = qv10.t(str5);
                        if (!evu0.J(str)) {
                            t.append(Extension.FIX_SPACE + ((Object) str));
                        }
                        if (evu0.J(str2)) {
                            t.append(Extension.FIX_SPACE + ((Object) str2));
                        }
                        arrayList2.add(new stk0(atk0Var, ksk0Var, qtk0Var, rtk0Var2, kuk0Var2, t.toString()));
                        dVar4 = dVar;
                        it2 = it;
                        z = z2;
                        z3 = false;
                    }
                }
                it = it2;
                z2 = z;
                dVar = dVar4;
                kuk0Var = null;
                atk0 atk0Var2 = new atk0(au2Var);
                String str52 = ntk0Var2.d;
                str = ntk0Var2.e;
                ksk0 ksk0Var2 = new ksk0(str52, str);
                str2 = ntk0Var2.f;
                qtk0 qtk0Var2 = new qtk0(str2);
                boolean z52 = ntk0Var2.b;
                boolean z62 = ntk0Var2.j;
                rtk0 rtk0Var22 = new rtk0(z62, z52);
                if (z52) {
                }
                StringBuilder t2 = qv10.t(str52);
                if (!evu0.J(str)) {
                }
                if (evu0.J(str2)) {
                }
                arrayList2.add(new stk0(atk0Var2, ksk0Var2, qtk0Var2, rtk0Var22, kuk0Var2, t2.toString()));
                dVar4 = dVar;
                it2 = it;
                z = z2;
                z3 = false;
            }
            arrayList = arrayList2;
        }
        boolean z7 = z;
        this.this$0.getClass();
        utk0 utk0Var = new utk0(wi70Var.a, wi70Var.b, wi70Var.e, wi70Var.f);
        d dVar5 = this.this$0;
        hqz0 hqz0Var = noz0Var.d;
        dVar5.getClass();
        if (hqz0Var != null) {
            String str6 = hqz0Var.c;
            if (!z7) {
                duk0 duk0Var = !evu0.J(str6) ? new duk0(str6) : null;
                String str7 = hqz0Var.a;
                if (evu0.J(str7)) {
                    str7 = null;
                }
                String str8 = hqz0Var.b;
                uojVar = new uoj(str7, !evu0.J(str8) ? str8 : null, duk0Var);
                return new luk0(xuk0Var, vtk0Var2, arrayList, uojVar, utk0Var);
            }
        }
        uojVar = null;
        return new luk0(xuk0Var, vtk0Var2, arrayList, uojVar, utk0Var);
    }
}
