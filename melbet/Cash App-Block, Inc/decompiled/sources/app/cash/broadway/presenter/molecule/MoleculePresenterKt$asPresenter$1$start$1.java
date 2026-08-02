package app.cash.broadway.presenter.molecule;

import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import app.cash.molecule.RecompositionMode;
import com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MoleculePresenterKt$asPresenter$1$start$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AnswerDispatcher $answerDispatcher;
    public final /* synthetic */ MinimumLifecycleOwner $combinedLifecycle;
    public final /* synthetic */ ReadonlySharedFlow $events;
    public final /* synthetic */ LifecycleOwner $lifecycleOwner;
    public final /* synthetic */ Ref$ObjectRef $models;
    public final /* synthetic */ StateFlowImpl $placementFlow;
    public final /* synthetic */ PresenterLifecycleOwner $presenterLifecycleOwner;
    public final /* synthetic */ RenavigationDispatcher $renavigationDispatcher;
    public final /* synthetic */ SwipeCallbackDispatcher $swipeCallbackDispatcher;
    public final /* synthetic */ MoleculePresenter $this_asPresenter;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ MoleculePresenterKt$asPresenter$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoleculePresenterKt$asPresenter$1$start$1(Ref$ObjectRef ref$ObjectRef, AnswerDispatcher answerDispatcher, RenavigationDispatcher renavigationDispatcher, MoleculePresenterKt$asPresenter$1 moleculePresenterKt$asPresenter$1, StateFlowImpl stateFlowImpl, MinimumLifecycleOwner minimumLifecycleOwner, LifecycleOwner lifecycleOwner, PresenterLifecycleOwner presenterLifecycleOwner, SwipeCallbackDispatcher swipeCallbackDispatcher, MoleculePresenter moleculePresenter, ReadonlySharedFlow readonlySharedFlow, Continuation continuation) {
        super(2, continuation);
        this.$models = ref$ObjectRef;
        this.$answerDispatcher = answerDispatcher;
        this.$renavigationDispatcher = renavigationDispatcher;
        this.this$0 = moleculePresenterKt$asPresenter$1;
        this.$placementFlow = stateFlowImpl;
        this.$combinedLifecycle = minimumLifecycleOwner;
        this.$lifecycleOwner = lifecycleOwner;
        this.$presenterLifecycleOwner = presenterLifecycleOwner;
        this.$swipeCallbackDispatcher = swipeCallbackDispatcher;
        this.$this_asPresenter = moleculePresenter;
        this.$events = readonlySharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MoleculePresenterKt$asPresenter$1$start$1 moleculePresenterKt$asPresenter$1$start$1 = new MoleculePresenterKt$asPresenter$1$start$1(this.$models, this.$answerDispatcher, this.$renavigationDispatcher, this.this$0, this.$placementFlow, this.$combinedLifecycle, this.$lifecycleOwner, this.$presenterLifecycleOwner, this.$swipeCallbackDispatcher, this.$this_asPresenter, this.$events, continuation);
        moleculePresenterKt$asPresenter$1$start$1.L$0 = obj;
        return moleculePresenterKt$asPresenter$1$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoleculePresenterKt$asPresenter$1$start$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.$models.element = BundleKt.launchMolecule$default(coroutineScope, RecompositionMode.Immediate, null, new RegisterAliasViewKt$$ExternalSyntheticLambda2(this.$answerDispatcher, this.$renavigationDispatcher, this.this$0, this.$placementFlow, this.$combinedLifecycle, this.$lifecycleOwner, this.$presenterLifecycleOwner, this.$swipeCallbackDispatcher, this.$this_asPresenter, this.$events), 6);
        return Unit.INSTANCE;
    }
}
