package app.cash.broadway.presenter.molecule;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import app.cash.broadway.presenter.Placement;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.presenter.molecule.common.MoleculePresenterStateRegistry;
import app.cash.broadway.screen.Answer;
import com.squareup.cash.util.lifecycle.MinimumLifecycleOwner;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class MoleculePresenterKt$asPresenter$1 implements Presenter {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ MoleculePresenter $this_asPresenter;
    public MoleculePresenterStateRegistry stateRegistry;

    public MoleculePresenterKt$asPresenter$1(MoleculePresenter moleculePresenter, CoroutineContext coroutineContext) {
        this.$this_asPresenter = moleculePresenter;
        this.$context = coroutineContext;
    }

    @Override // app.cash.broadway.presenter.Presenter
    public final SavedState saveState() {
        MoleculePresenterStateRegistry moleculePresenterStateRegistry = this.stateRegistry;
        if (moleculePresenterStateRegistry != null) {
            return new SavedState(moleculePresenterStateRegistry.registry.performSave());
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateRegistry");
        throw null;
    }

    @Override // app.cash.broadway.presenter.Presenter
    public final Presenter.Binding start(CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, Answer answer, SavedState savedState) {
        coroutineScope.getClass();
        lifecycleOwner.getClass();
        BufferedChannel Channel$default = PapaEvent.Channel$default(50, null, null, 6);
        ReadonlySharedFlow shareIn = FlowKt.shareIn(FlowKt.consumeAsFlow(Channel$default), coroutineScope, SharingStarted.Companion.Lazily, 0);
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        PresenterLifecycleOwner presenterLifecycleOwner = new PresenterLifecycleOwner();
        MinimumLifecycleOwner minimumLifecycleOwner = new MinimumLifecycleOwner(CollectionsKt__CollectionsKt.listOf((Object[]) new LifecycleOwner[]{lifecycleOwner, presenterLifecycleOwner}));
        MoleculePresenter moleculePresenter = this.$this_asPresenter;
        AnswerDispatcher answerDispatcher = new AnswerDispatcher(moleculePresenter.getClass().getName(), answer);
        RenavigationDispatcher renavigationDispatcher = new RenavigationDispatcher(moleculePresenter.getClass().getName());
        SwipeCallbackDispatcher swipeCallbackDispatcher = new SwipeCallbackDispatcher(moleculePresenter.getClass().getName());
        this.stateRegistry = new MoleculePresenterStateRegistry(savedState);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Placement.Foreground.INSTANCE);
        StateFlowKt.launchUndispatchedWithRethrow(coroutineScope, this.$context, new MoleculePresenterKt$asPresenter$1$start$1(ref$ObjectRef, answerDispatcher, renavigationDispatcher, this, MutableStateFlow, minimumLifecycleOwner, lifecycleOwner, presenterLifecycleOwner, swipeCallbackDispatcher, this.$this_asPresenter, shareIn, null));
        return new MoleculePresenterKt$asPresenter$1$start$2(ref$ObjectRef, MutableStateFlow, Channel$default, presenterLifecycleOwner, answerDispatcher, renavigationDispatcher, swipeCallbackDispatcher);
    }
}
