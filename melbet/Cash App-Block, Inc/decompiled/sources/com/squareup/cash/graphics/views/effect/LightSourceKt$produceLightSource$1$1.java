package com.squareup.cash.graphics.views.effect;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LightSourceKt$produceLightSource$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LightSourceKt$produceLightSource$1$1(Flow flow, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                LightSourceKt$produceLightSource$1$1 lightSourceKt$produceLightSource$1$1 = new LightSourceKt$produceLightSource$1$1(this.$events, continuation, 0);
                lightSourceKt$produceLightSource$1$1.L$0 = obj;
                return lightSourceKt$produceLightSource$1$1;
            default:
                LightSourceKt$produceLightSource$1$1 lightSourceKt$produceLightSource$1$12 = new LightSourceKt$produceLightSource$1$1(this.$events, continuation, 1);
                lightSourceKt$produceLightSource$1$12.L$0 = obj;
                return lightSourceKt$produceLightSource$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((LightSourceKt$produceLightSource$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((LightSourceKt$produceLightSource$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Flow flow = this.$events;
        switch (i) {
            case 0:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2 profilePrivacyPresenter$models$lambda$8$$inlined$map$1$2 = new ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2(3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(profilePrivacyPresenter$models$lambda$8$$inlined$map$1$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
