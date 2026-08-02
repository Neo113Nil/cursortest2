package ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1", f = "ScootersPersonalGoalsPromoPlateView.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $iconTag;
    int label;
    final /* synthetic */ ScootersPersonalGoalsPromoPlateView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1(ScootersPersonalGoalsPromoPlateView scootersPersonalGoalsPromoPlateView, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersPersonalGoalsPromoPlateView;
        this.$iconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1(this.this$0, this.$iconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pavVar = this.this$0.imageLoader;
            g16 i2 = pavVar.b().i(new obv(this.$iconTag, null, 6, 0));
            this.label = 1;
            obj = a.b(i2, this);
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
        Bitmap bitmap = (Bitmap) obj;
        ScootersPersonalGoalsPromoPlateView scootersPersonalGoalsPromoPlateView = this.this$0;
        if (bitmap != null) {
            scootersPersonalGoalsPromoPlateView.setLeadImage(bitmap);
        } else {
            scootersPersonalGoalsPromoPlateView.setLeadImage((Drawable) null);
        }
        return zy11.a;
    }
}
