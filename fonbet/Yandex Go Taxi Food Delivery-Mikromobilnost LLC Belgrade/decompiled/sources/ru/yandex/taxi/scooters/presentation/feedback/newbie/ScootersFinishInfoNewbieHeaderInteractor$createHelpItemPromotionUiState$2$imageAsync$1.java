package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ n1o0.c.a $helpItem;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1(n1o0.c.a aVar, Continuation continuation, a aVar2) {
        super(2, continuation);
        this.$helpItem = aVar;
        this.this$0 = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1(this.$helpItem, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$helpItem.a;
            if (str.length() <= 0) {
                return null;
            }
            g16 b = this.this$0.b.b().b(((m7x0) this.this$0.e).a(str));
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        return (Bitmap) obj;
    }
}
