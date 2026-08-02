package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.ea90;
import defpackage.imn0;
import defpackage.lrj0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.se90;
import defpackage.sln0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ymn0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lymn0;", "<anonymous>", "(Ltse;)Lymn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2", f = "ScootersFinishInfoPayloadFactory.kt", l = {44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $disappearedSessionState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2(zuo0 zuo0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$disappearedSessionState = zuo0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2 scootersFinishInfoPayloadFactory$createFinishInfoPayload$2 = new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2(this.$disappearedSessionState, this.this$0, continuation);
        scootersFinishInfoPayloadFactory$createFinishInfoPayload$2.L$0 = obj;
        return scootersFinishInfoPayloadFactory$createFinishInfoPayload$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen;
        noh h;
        imn0 imn0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zuo0 zuo0Var = this.$disappearedSessionState;
            if ((zuo0Var instanceof nrk0) || (zuo0Var instanceof se90)) {
                feedbackSettingsParams$Screen = FeedbackSettingsParams$Screen.FINISH_CARD;
            } else {
                if (!(zuo0Var instanceof lrj0) && !(zuo0Var instanceof ea90)) {
                    w511.b();
                    return null;
                }
                feedbackSettingsParams$Screen = FeedbackSettingsParams$Screen.CANCEL_CARD;
            }
            qoh h2 = tje.h(tseVar, null, null, new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$finishInfoAsync$1(zuo0Var, null, feedbackSettingsParams$Screen, this.this$0), 3);
            h = tje.h(tseVar, null, null, new ScootersFinishInfoPayloadFactory$createFinishInfoPayload$2$feedbackSettingsAsync$1(this.$disappearedSessionState, null, feedbackSettingsParams$Screen, this.this$0), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                imn0Var = (imn0) this.L$4;
                kotlin.b.b(obj);
                sln0 sln0Var = (sln0) obj;
                if (imn0Var != null || sln0Var == null) {
                    return null;
                }
                return new ymn0(imn0Var, this.$disappearedSessionState, sln0Var);
            }
            h = (noh) this.L$3;
            kotlin.b.b(obj);
        }
        imn0 imn0Var2 = (imn0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = imn0Var2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            imn0Var = imn0Var2;
            obj = k;
            sln0 sln0Var2 = (sln0) obj;
            if (imn0Var != null) {
            }
            return null;
        }
        return coroutineSingletons;
    }
}
