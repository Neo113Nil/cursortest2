package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import android.content.Context;
import android.util.Log;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a60;
import defpackage.ahg;
import defpackage.aoi;
import defpackage.bhg;
import defpackage.c21;
import defpackage.chg;
import defpackage.cxm;
import defpackage.czh;
import defpackage.dci;
import defpackage.dhg;
import defpackage.dke;
import defpackage.e100;
import defpackage.ehg;
import defpackage.fhg;
import defpackage.fl10;
import defpackage.ghg;
import defpackage.gpa;
import defpackage.gzh;
import defpackage.h4i;
import defpackage.hhg;
import defpackage.hwo0;
import defpackage.hwy0;
import defpackage.hxx;
import defpackage.i030;
import defpackage.izh;
import defpackage.jj3;
import defpackage.jst;
import defpackage.jwh;
import defpackage.l7x0;
import defpackage.lhg;
import defpackage.lr20;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oh4;
import defpackage.pep0;
import defpackage.pkg;
import defpackage.q5i;
import defpackage.q5z;
import defpackage.q8s;
import defpackage.qcp0;
import defpackage.qdc;
import defpackage.qje;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.r5i;
import defpackage.rui;
import defpackage.rvi;
import defpackage.sy60;
import defpackage.tse;
import defpackage.ugg;
import defpackage.um3;
import defpackage.v770;
import defpackage.vgg;
import defpackage.w511;
import defpackage.wls;
import defpackage.wrr;
import defpackage.wvi;
import defpackage.xgg;
import defpackage.yfa;
import defpackage.ygg;
import defpackage.zgg;
import defpackage.zy11;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.DeliveryDashboardActionListener$handle$1", f = "DeliveryDashboardActionListener.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryDashboardActionListener$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ hhg $action;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDashboardActionListener$handle$1(hhg hhgVar, Continuation continuation, b bVar) {
        super(2, continuation);
        this.$action = hhgVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryDashboardActionListener$handle$1(this.$action, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryDashboardActionListener$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0206 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hhg hhgVar = this.$action;
        boolean z = hhgVar instanceof ehg;
        b bVar = this.this$0;
        if (z) {
            this.label = 1;
            return b.b(bVar, (ehg) hhgVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        boolean z2 = hhgVar instanceof bhg;
        if (z2) {
            this.label = 2;
            bVar.getClass();
            lr20 lr20Var = ((bhg) hhgVar).a;
            if (lr20Var instanceof pkg) {
                qje.e(Log.i("DeliveryDashboardActionsHandler", "Unsupported modal view action"));
            } else {
                e100 e100Var = bVar.c;
                DeliveryDashboardActionListener$handle$5 deliveryDashboardActionListener$handle$5 = new DeliveryDashboardActionListener$handle$5(bVar, null);
                czh create = ((gzh) e100Var.b).create();
                fl10 fl10Var = (fl10) e100Var.c;
                i030 i030Var = new i030(lr20Var);
                qdc qdcVar = (qdc) e100Var.w;
                ru.yandex.taxi.logistics.sdk.show_modalview_action.a aVar = new ru.yandex.taxi.logistics.sdk.show_modalview_action.a(deliveryDashboardActionListener$handle$5, create);
                wrr wrrVar = (wrr) fl10Var.a;
                wrrVar.getClass();
                q5z.h((qcp0) wrrVar.z);
                Context context = (Context) wrrVar.b;
                q5z.h(context);
                dci dciVar = (dci) wrrVar.c;
                q5z.h(dciVar);
                hwy0 hwy0Var = (hwy0) wrrVar.x;
                q5z.h(hwy0Var);
                q8s q8sVar = (q8s) wrrVar.A;
                q5z.h(q8sVar);
                q5z.h(qdcVar);
                yfa yfaVar = new yfa(qdcVar);
                l7x0 l7x0Var = (l7x0) wrrVar.y;
                q5z.h(l7x0Var);
                ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state.a aVar2 = new ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state.a(q8sVar, yfaVar, new oh4(l7x0Var, new yfa(qdcVar)));
                jwh jwhVar = (jwh) wrrVar.w;
                q5z.h(jwhVar);
                czh.a(create, new izh(new cxm(new aoi(new hwo0(context, dciVar, hwy0Var, new ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c(i030Var, aVar, aVar2, new lhg(jwhVar), hwy0Var), 12), i030Var, aVar)), null, null, null, null, null, 8190));
            }
            if (zy11Var == coroutineSingletons) {
            }
        } else {
            h4i h4iVar = bVar.a;
            this.label = 3;
            q5i q5iVar = h4iVar.a.y;
            if (hhgVar instanceof fhg) {
                jst.e.n("Unsupported action: " + hhgVar);
            } else if (!(hhgVar instanceof xgg) && !z2 && !z) {
                if (hhgVar instanceof ugg) {
                    q5iVar.a.r(new qu(9));
                } else if (hhgVar instanceof ygg) {
                    ((jj3) q5iVar.a.F.get()).c(new um3(Events$Zalogin$LoginContext.DELIVERY, new qzj0(null, new dke(24, (ygg) hhgVar, q5iVar)), false, false, 28));
                } else if (hhgVar instanceof ahg) {
                    ahg ahgVar = (ahg) hhgVar;
                    q5iVar.getClass();
                    rui ruiVar = new rui(ahgVar.a, (Map) null, ahgVar.b, (UUID) null, 26);
                    r5i r5iVar = q5iVar.a;
                    ((pep0) r5iVar.c0).f((m950) r5iVar.K.get(), ruiVar, hxx.a);
                } else if (hhgVar instanceof vgg) {
                    ((a60) q5iVar.a.Q).c(((vgg) hhgVar).a, v770.c);
                } else {
                    boolean z3 = hhgVar instanceof chg;
                    c21 c21Var = sy60.Q2;
                    if (z3) {
                        q5iVar.a(((chg) hhgVar).a, c21Var);
                    } else if (hhgVar instanceof dhg) {
                        dhg dhgVar = (dhg) hhgVar;
                        q5iVar.getClass();
                        q5iVar.b(dhgVar.g, new gpa(i2, dhgVar, q5iVar, q5iVar.a), null);
                    } else if (hhgVar instanceof ghg) {
                        r5i r5iVar2 = q5iVar.a;
                        r5iVar2.A((m950) r5iVar2.L.get(), new wvi(((ghg) hhgVar).a), rvi.L1);
                    } else {
                        if (!(hhgVar instanceof zgg)) {
                            w511.b();
                            return null;
                        }
                        r5i r5iVar3 = q5iVar.a;
                        r5iVar3.A((m950) r5iVar3.d0.get(), zy11Var, c21Var);
                    }
                }
            }
            if (zy11Var == coroutineSingletons) {
            }
        }
    }
}
