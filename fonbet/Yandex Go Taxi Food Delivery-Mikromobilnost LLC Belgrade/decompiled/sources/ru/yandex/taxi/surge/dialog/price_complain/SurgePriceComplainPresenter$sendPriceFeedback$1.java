package ru.yandex.taxi.surge.dialog.price_complain;

import android.content.Context;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.aze0;
import defpackage.dzg0;
import defpackage.eqc;
import defpackage.fpq0;
import defpackage.gpq0;
import defpackage.hpq0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.l7s0;
import defpackage.lzu0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.nuq;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qn5;
import defpackage.quw0;
import defpackage.tj60;
import defpackage.tse;
import defpackage.tse0;
import defpackage.tva;
import defpackage.w511;
import defpackage.wls;
import defpackage.wpc;
import defpackage.wt60;
import defpackage.wuw0;
import defpackage.xcv0;
import defpackage.yuw0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.surge.models.dto.PriceComplainParam$Source;
import ru.yandex.taxi.surge.models.dto.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainPresenter$sendPriceFeedback$1", f = "SurgePriceComplainPresenter.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainPresenter$sendPriceFeedback$1 extends SuspendLambda implements wls {
    final /* synthetic */ hpq0 $action;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ wuw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainPresenter$sendPriceFeedback$1(wuw0 wuw0Var, hpq0 hpq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wuw0Var;
        this.$action = hpq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgePriceComplainPresenter$sendPriceFeedback$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainPresenter$sendPriceFeedback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PriceComplainParam$Source priceComplainParam$Source;
        Object obj2;
        hpq0 hpq0Var;
        wt60 wt60Var;
        wuw0 wuw0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        gpq0 gpq0Var = gpq0.b;
        if (i == 0) {
            kotlin.b.b(obj);
            wt60 Kg = wuw0.Kg(this.this$0);
            if (Kg != null) {
                hpq0 hpq0Var2 = this.$action;
                wuw0 wuw0Var2 = this.this$0;
                if (hpq0Var2 instanceof fpq0) {
                    priceComplainParam$Source = PriceComplainParam$Source.SUPPORT;
                } else {
                    if (!jl40.l(hpq0Var2, gpq0Var)) {
                        w511.b();
                        return null;
                    }
                    priceComplainParam$Source = PriceComplainParam$Source.FEEDBACK;
                }
                ru.yandex.taxi.surge.repository.a aVar = wuw0Var2.B;
                pex0 m = ((k) wuw0Var2.C).m();
                this.L$0 = hpq0Var2;
                this.L$1 = wuw0Var2;
                this.L$2 = Kg;
                this.L$3 = null;
                this.label = 1;
                Object b = aVar.b(Kg, m, priceComplainParam$Source, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = b;
                hpq0Var = hpq0Var2;
                wt60Var = Kg;
                wuw0Var = wuw0Var2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wt60Var = (wt60) this.L$2;
        wuw0Var = (wuw0) this.L$1;
        hpq0Var = (hpq0) this.L$0;
        kotlin.b.b(obj);
        obj2 = ((Result) obj).getValue();
        if (!(obj2 instanceof Result.Failure)) {
            w wVar = (w) obj2;
            xcv0 xcv0Var = wuw0Var.F;
            l7s0 l7s0Var = wuw0Var.z;
            xcv0Var.a.a("Summary.SurgeComplaint.Sent", tse0.q(xcv0Var), 1, new HashMap());
            aze0 a = wuw0Var.B.a(wt60Var);
            xcv0 xcv0Var2 = wuw0Var.F;
            List J0 = kotlin.collections.a.J0(a.a);
            String str = a.b;
            String str2 = hpq0Var.a;
            xcv0Var2.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button", str2);
            hashMap.put("selected_reasons", J0);
            xcv0Var2.a.a("Summary.SurgeComplaintModalCard.Tapped", hashMap, 1, tse0.r("comment", hashMap, str));
            if (hpq0Var instanceof fpq0) {
                String str3 = ((fpq0) hpq0Var).b;
                l7s0Var.getClass();
                wpc wpcVar = new wpc(eqc.b, 2);
                yuw0 yuw0Var = (yuw0) l7s0Var.a;
                yuw0Var.A((m950) ((yvf0) yuw0Var.N).get(), wpcVar, new tva(yuw0Var, str3, 3));
                ((xcv0) yuw0Var.L).l("open_support");
            } else {
                if (!hpq0Var.equals(gpq0Var)) {
                    w511.b();
                    return null;
                }
                wuw0Var.D.getClass();
                nuq nuqVar = new nuq(wVar.a, wVar.b, wVar.c, quw0.a(wVar.d));
                yuw0 yuw0Var2 = (yuw0) l7s0Var.a;
                yuw0Var2.r(new lzu0(14, nuqVar, yuw0Var2));
            }
        }
        if (Result.a(obj2) != null) {
            xcv0 xcv0Var3 = wuw0Var.F;
            xcv0Var3.a.a("Summary.SurgeComplaint.SendingFailed", tse0.q(xcv0Var3), 1, new HashMap());
            tj60 tj60Var = wuw0Var.E;
            Context context = wuw0Var.x;
            ErrorNotification errorNotification = new ErrorNotification("price_complain_error_notification", context.getString(kyh0.surge_widget_price_complaint_feedback_sending_error), "", context, Integer.valueOf(dzg0.ic_failed), null, 0, 96, null);
            errorNotification.startExpiresTimer(6000L);
            errorNotification.setExpiresListener(new qn5(14, wuw0Var, errorNotification));
            tj60Var.e(errorNotification);
            tj60Var.f();
        }
        return zy11.a;
    }
}
