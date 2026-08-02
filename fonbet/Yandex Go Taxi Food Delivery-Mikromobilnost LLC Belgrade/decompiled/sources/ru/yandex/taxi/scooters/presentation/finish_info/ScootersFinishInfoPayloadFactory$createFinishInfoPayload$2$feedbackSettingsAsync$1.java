package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.eln0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sln0;
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
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsln0;", "<anonymous>", "(Ltse;)Lsln0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1", f = "ScootersFinishInfoPayloadFactory.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $disappearedSessionState;
    final /* synthetic */ FeedbackSettingsParams$Screen $feedbackScreen;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1(zuo0 zuo0Var, Continuation continuation, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, b bVar) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$feedbackScreen = feedbackSettingsParams$Screen;
        this.$disappearedSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = this.this$0;
        return new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1(this.$disappearedSessionState, continuation, this.$feedbackScreen, bVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = this.$feedbackScreen;
                zuo0 zuo0Var = this.$disappearedSessionState;
                eln0 eln0Var = bVar.b;
                String j = zuo0Var.j();
                this.label = 1;
                obj = eln0Var.b.a(feedbackSettingsParams$Screen, j, this);
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
            return (sln0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return null;
        }
    }
}
