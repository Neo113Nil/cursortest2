package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.fillr.e0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.HelpItem;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FileBlockerPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FileBlockerViewEvent $event;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ FileBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerPresenter$models$2$2(FileBlockerPresenter fileBlockerPresenter, FileBlockerViewEvent fileBlockerViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = fileBlockerPresenter;
        this.$event = fileBlockerViewEvent;
        this.$isLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FileBlockerPresenter$models$2$2(this.this$0, this.$event, this.$isLoading$delegate, continuation, 0);
            default:
                return new FileBlockerPresenter$models$2$2(this.this$0, this.$event, this.$isLoading$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FileBlockerPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isLoading$delegate;
        FileBlockerViewEvent fileBlockerViewEvent = this.$event;
        FileBlockerPresenter fileBlockerPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = fileBlockerPresenter.blockersHelper;
                    HelpItem helpItem = ((FileBlockerViewEvent.HelpItemClick) fileBlockerViewEvent).helpItem;
                    BlockersScreens.FileBlockerScreen fileBlockerScreen = fileBlockerPresenter.args;
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 2);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, fileBlockerScreen, null, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons) {
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
                    e0 e0Var = fileBlockerPresenter.blockerImageUploader;
                    Lazy lazy = ((FileBlockerViewEvent.CaptureCompleted) fileBlockerViewEvent).captures;
                    FileCategory fileCategory = fileBlockerPresenter.category;
                    BlockersScreens.FileBlockerScreen fileBlockerScreen2 = fileBlockerPresenter.args;
                    e0Var.getClass();
                    lazy.getClass();
                    fileCategory.getClass();
                    Flow flowOn = FlowKt.flowOn(new SafeFlow(new EngineInterceptor$intercept$2(e0Var, fileBlockerScreen2, lazy, fileCategory, "image/jpeg", (Continuation) null)), (CoroutineContext) e0Var.h);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(11, mutableState);
                    this.label = 1;
                    if (flowOn.collect(anonymousClass1, this) == coroutineSingletons2) {
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
