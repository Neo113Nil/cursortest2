package com.squareup.cash.advertising.presenters;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class FullscreenAdPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ FullscreenAdPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullscreenAdPresenter$models$2$1(int i, FullscreenAdPresenter fullscreenAdPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = fullscreenAdPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FullscreenAdPresenter fullscreenAdPresenter = this.this$0;
        switch (i) {
            case 0:
                return new FullscreenAdPresenter$models$2$1(0, fullscreenAdPresenter, continuation);
            case 1:
                return new FullscreenAdPresenter$models$2$1(1, fullscreenAdPresenter, continuation);
            default:
                return new FullscreenAdPresenter$models$2$1(2, fullscreenAdPresenter, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FullscreenAdPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FullscreenAdPresenter fullscreenAdPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = fullscreenAdPresenter.args.token;
                    this.label = 1;
                    if (FullscreenAdPresenter.access$handleAppMessageAction(fullscreenAdPresenter, str, null, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(fullscreenAdPresenter, (Continuation) null, 9);
                        this.label = 1;
                        if (PlatformKt.retryWhenRetryable$default(null, anonymousClass1, this, 3) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    Timber.Forest.w("Failed to report app message view", new Object[0], e);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = fullscreenAdPresenter.hasAudioTrack;
                    Boolean bool = Boolean.TRUE;
                    this.label = 1;
                    if (sharedFlowImpl.emit(bool, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
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
