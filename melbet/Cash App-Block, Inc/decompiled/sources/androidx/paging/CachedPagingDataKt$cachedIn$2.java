package androidx.paging;

import android.os.Bundle;
import androidx.compose.material.AnchoredDraggableState$draggableState$1;
import androidx.compose.material3.SliderState$dragScope$1;
import androidx.glance.appwidget.AppWidgetSession;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 1;
        this.L$0 = anchoredDraggableState$draggableState$1;
        this.L$1 = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.$r8$classId) {
            case 0:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(i, (Continuation) obj3, 0);
                cachedPagingDataKt$cachedIn$2.L$0 = (MulticastedPagingData) obj;
                cachedPagingDataKt$cachedIn$2.L$1 = (MulticastedPagingData) obj2;
                return cachedPagingDataKt$cachedIn$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                return new CachedPagingDataKt$cachedIn$2((AnchoredDraggableState$draggableState$1) this.L$0, (Function2) this.L$1, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case 2:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$22 = new CachedPagingDataKt$cachedIn$2((Bundle) this.L$1, (Continuation) obj3, 2);
                cachedPagingDataKt$cachedIn$22.L$0 = (AppWidgetSession) obj2;
                return cachedPagingDataKt$cachedIn$22.invokeSuspend(Unit.INSTANCE);
            case 3:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$23 = new CachedPagingDataKt$cachedIn$2((String) this.L$1, (Continuation) obj3, i);
                cachedPagingDataKt$cachedIn$23.L$0 = (AppWidgetSession) obj2;
                return cachedPagingDataKt$cachedIn$23.invokeSuspend(Unit.INSTANCE);
            case 4:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$24 = new CachedPagingDataKt$cachedIn$2((StateFlow) this.L$1, (Continuation) obj3, 4);
                cachedPagingDataKt$cachedIn$24.L$0 = (VariantSandboxedComponent) obj2;
                return cachedPagingDataKt$cachedIn$24.invokeSuspend(Unit.INSTANCE);
            case 5:
                int intValue = ((Number) obj2).intValue();
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$25 = new CachedPagingDataKt$cachedIn$2((RealKeyStoreProvider) this.L$1, (Continuation) obj3, 5);
                cachedPagingDataKt$cachedIn$25.L$0 = (Throwable) obj;
                cachedPagingDataKt$cachedIn$25.label = intValue;
                return cachedPagingDataKt$cachedIn$25.invokeSuspend(Unit.INSTANCE);
            case 6:
                int intValue2 = ((Number) obj2).intValue();
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$26 = new CachedPagingDataKt$cachedIn$2((RealMRIFactory) this.L$1, (Continuation) obj3, 6);
                cachedPagingDataKt$cachedIn$26.L$0 = (Throwable) obj;
                cachedPagingDataKt$cachedIn$26.label = intValue2;
                return cachedPagingDataKt$cachedIn$26.invokeSuspend(Unit.INSTANCE);
            case 7:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$27 = new CachedPagingDataKt$cachedIn$2(i, (Continuation) obj3, 7);
                cachedPagingDataKt$cachedIn$27.L$0 = (FlowCollector) obj;
                cachedPagingDataKt$cachedIn$27.L$1 = (CameraState) obj2;
                return cachedPagingDataKt$cachedIn$27.invokeSuspend(Unit.INSTANCE);
            default:
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$28 = new CachedPagingDataKt$cachedIn$2(i, (Continuation) obj3, 8);
                cachedPagingDataKt$cachedIn$28.L$0 = (FlowCollector) obj;
                cachedPagingDataKt$cachedIn$28.L$1 = (Camera2Manager.State) obj2;
                return cachedPagingDataKt$cachedIn$28.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CameraState cameraState;
        Camera2Manager.State state;
        int i = this.$r8$classId;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    return multicastedPagingData;
                }
                SafeTrace.throwOnFailure(obj);
                MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
                MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.L$1;
                this.L$0 = multicastedPagingData3;
                this.label = 1;
                ((StandaloneCoroutine) multicastedPagingData2.accumulated.cipherText).cancel(null);
                return Unit.INSTANCE == coroutineSingletons ? coroutineSingletons : multicastedPagingData3;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SliderState$dragScope$1 sliderState$dragScope$1 = ((AnchoredDraggableState$draggableState$1) this.L$0).dragScope;
                    Function2 function2 = (Function2) this.L$1;
                    this.label = 1;
                    if (function2.invoke(sliderState$dragScope$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppWidgetSession appWidgetSession = (AppWidgetSession) this.L$0;
                    Bundle bundle = (Bundle) this.L$1;
                    this.label = 1;
                    appWidgetSession.getClass();
                    Object sendEvent = appWidgetSession.sendEvent(new AppWidgetSession.UpdateAppWidgetOptions(bundle), this);
                    if (sendEvent != coroutineSingletons3) {
                        sendEvent = Unit.INSTANCE;
                    }
                    if (sendEvent == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppWidgetSession appWidgetSession2 = (AppWidgetSession) this.L$0;
                    String str = (String) this.L$1;
                    this.label = 1;
                    appWidgetSession2.getClass();
                    Object sendEvent2 = appWidgetSession2.sendEvent(new AppWidgetSession.RunLambda(str), this);
                    if (sendEvent2 != coroutineSingletons4) {
                        sendEvent2 = Unit.INSTANCE;
                    }
                    if (sendEvent2 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.L$1;
                    SearchBarBinding$Content$1$1 searchBarBinding$Content$1$1 = new SearchBarBinding$Content$1$1(variantSandboxedComponent, continuation, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.first(stateFlow, searchBarBinding$Content$1$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                Throwable th = (Throwable) this.L$0;
                int i7 = this.label;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealKeyStoreProvider) this.L$1).errorReporter.report(new RealKeyStoreProvider.KeyStoreProviderError(th, i7), defaultSamplingStrategy);
                return Unit.INSTANCE;
            case 6:
                Throwable th2 = (Throwable) this.L$0;
                int i8 = this.label;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealMRIFactory) this.L$1).errorReporter.report(new RealMRIFactory.MRIFactoryError(th2, "sign", i8, false, null), defaultSamplingStrategy);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    CameraState cameraState2 = (CameraState) this.L$1;
                    this.L$0 = cameraState2;
                    this.label = 1;
                    if (flowCollector.emit(cameraState2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    cameraState = cameraState2;
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cameraState = (CameraState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!(cameraState instanceof CameraState.Closed));
            default:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    Camera2Manager.State state2 = (Camera2Manager.State) this.L$1;
                    this.L$0 = state2;
                    this.label = 1;
                    if (flowCollector2.emit(state2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                    state = state2;
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state = (Camera2Manager.State) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!Intrinsics.areEqual(state, Camera2Manager.State.Destroyed.INSTANCE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedPagingDataKt$cachedIn$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedPagingDataKt$cachedIn$2(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
    }
}
