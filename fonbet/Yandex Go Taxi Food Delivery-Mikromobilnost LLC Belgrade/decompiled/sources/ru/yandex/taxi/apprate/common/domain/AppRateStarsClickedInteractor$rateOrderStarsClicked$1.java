package ru.yandex.taxi.apprate.common.domain;

import defpackage.awt;
import defpackage.co40;
import defpackage.ejp;
import defpackage.evu0;
import defpackage.ijs;
import defpackage.iw2;
import defpackage.jw2;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.lw2;
import defpackage.mvg;
import defpackage.mw2;
import defpackage.ny61;
import defpackage.qme0;
import defpackage.tse;
import defpackage.wls;
import defpackage.z631;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.apprate.common.domain.AppRateStarsClickedInteractor$rateOrderStarsClicked$1", f = "AppRateStarsClickedInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AppRateStarsClickedInteractor$rateOrderStarsClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ z631 $appReviewRouter;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppRateStarsClickedInteractor$rateOrderStarsClicked$1(a aVar, z631 z631Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$appReviewRouter = z631Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppRateStarsClickedInteractor$rateOrderStarsClicked$1(this.this$0, this.$appReviewRouter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppRateStarsClickedInteractor$rateOrderStarsClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            iw2 iw2Var = this.this$0.a;
            this.$appReviewRouter.getClass();
            co40 co40Var = iw2Var.a;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(DRMInfoProvider.MediaDRMKeys.VENDOR, "GooglePlay");
            co40Var.a.a("OrderFeedback.Rate.InAppReviewRequested", hashMap, 1, new HashMap());
            z631 z631Var = this.$appReviewRouter;
            this.label = 1;
            obj = ((awt) z631Var).b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            lw2 lw2Var = this.this$0.b;
            qme0 qme0Var = lw2Var.d;
            kgx[] kgxVarArr = lw2.f;
            if (!((Boolean) qme0Var.getValue(lw2Var, kgxVarArr[2])).booleanValue() && ((Number) lw2Var.e.getValue(lw2Var, kgxVarArr[3])).intValue() < 3) {
                a aVar = this.this$0;
                z631 z631Var2 = this.$appReviewRouter;
                aVar.getClass();
                ((awt) z631Var2).d.getClass();
                if (!evu0.J("ru.yandex.taxi")) {
                    co40 co40Var2 = aVar.a.a;
                    co40Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(DRMInfoProvider.MediaDRMKeys.VENDOR, "GooglePlay");
                    co40Var2.a.a("OrderFeedback.Rate.RequestReview", hashMap2, 1, new HashMap());
                    mw2 mw2Var = new mw2(0, aVar, z631Var2);
                    AppRateStarsClickedInteractor$requestFallbackReview$2 appRateStarsClickedInteractor$requestFallbackReview$2 = new AppRateStarsClickedInteractor$requestFallbackReview$2(0, aVar, a.class, "rateAppCustomDialogLaterClicked", "rateAppCustomDialogLaterClicked()V", 0);
                    jw2 jw2Var = ((awt) z631Var2).e;
                    int i2 = kyh0.app_rate_accept_google_play;
                    ejp ejpVar = new ejp(20, mw2Var);
                    ijs ijsVar = new ijs(6, appRateStarsClickedInteractor$requestFallbackReview$2);
                    jw2Var.getClass();
                    new AlertDialog(jw2Var.a).setCancelable(false).setTitle(kyh0.smart_rate_title).setMessage(kyh0.smart_rate_message).setPositiveButton(i2, ejpVar).setNegativeButton(kyh0.smart_rate_later, ijsVar).show();
                }
            }
        }
        return zy11.a;
    }
}
