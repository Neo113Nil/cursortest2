package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.imn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.o;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Limn0;", "<anonymous>", "(Ltse;)Limn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1", f = "ScootersFinishInfoPayloadFactory.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $disappearedSessionState;
    final /* synthetic */ FeedbackSettingsParams$Screen $feedbackScreen;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1(zuo0 zuo0Var, Continuation continuation, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, b bVar) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$disappearedSessionState = zuo0Var;
        this.$feedbackScreen = feedbackSettingsParams$Screen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1(this.$disappearedSessionState, continuation, this.$feedbackScreen, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                zuo0 zuo0Var = this.$disappearedSessionState;
                FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = this.$feedbackScreen;
                o oVar = bVar.a;
                this.label = 1;
                obj = oVar.a(zuo0Var, feedbackSettingsParams$Screen, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return (imn0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return null;
        }
    }
}
