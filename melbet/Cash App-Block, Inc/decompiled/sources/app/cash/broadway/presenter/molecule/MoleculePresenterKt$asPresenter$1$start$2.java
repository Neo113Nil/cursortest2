package app.cash.broadway.presenter.molecule;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.screen.Answer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class MoleculePresenterKt$asPresenter$1$start$2 implements Presenter.Binding, Presenter.LifecycleBinding, Presenter.PlaceableBinding, Presenter.RenavigationBinding, Presenter.SwipeBinding {
    public final /* synthetic */ AnswerDispatcher $answerDispatcher;
    public final /* synthetic */ BufferedChannel $eventsChannel;
    public final /* synthetic */ Ref$ObjectRef $models;
    public final /* synthetic */ StateFlowImpl $placementFlow;
    public final /* synthetic */ PresenterLifecycleOwner $presenterLifecycleOwner;
    public final /* synthetic */ RenavigationDispatcher $renavigationDispatcher;
    public final /* synthetic */ SwipeCallbackDispatcher $swipeCallbackDispatcher;

    public MoleculePresenterKt$asPresenter$1$start$2(Ref$ObjectRef ref$ObjectRef, StateFlowImpl stateFlowImpl, BufferedChannel bufferedChannel, PresenterLifecycleOwner presenterLifecycleOwner, AnswerDispatcher answerDispatcher, RenavigationDispatcher renavigationDispatcher, SwipeCallbackDispatcher swipeCallbackDispatcher) {
        this.$models = ref$ObjectRef;
        this.$placementFlow = stateFlowImpl;
        this.$eventsChannel = bufferedChannel;
        this.$presenterLifecycleOwner = presenterLifecycleOwner;
        this.$answerDispatcher = answerDispatcher;
        this.$renavigationDispatcher = renavigationDispatcher;
        this.$swipeCallbackDispatcher = swipeCallbackDispatcher;
    }

    @Override // app.cash.broadway.presenter.Presenter.Binding
    public final StateFlow getModels() {
        Object obj = this.$models.element;
        if (obj != null) {
            return (StateFlow) obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("models");
        throw null;
    }

    @Override // app.cash.broadway.presenter.Presenter.Binding
    public final void sendAnswer(Answer answer) {
        AnswerDispatcher answerDispatcher = this.$answerDispatcher;
        String str = answerDispatcher.name;
        Object mo1159trySendJP2dKIU = answerDispatcher.answers.mo1159trySendJP2dKIU(answer);
        if (mo1159trySendJP2dKIU instanceof ChannelResult.Closed) {
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Answer channel is closed for ", str, "."));
        } else if (mo1159trySendJP2dKIU instanceof ChannelResult.Failed) {
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Answer channel overflow for ", str, "."));
        }
    }

    @Override // app.cash.broadway.presenter.Presenter.Binding
    public final void sendEvent(Object obj) {
        Object mo1159trySendJP2dKIU = this.$eventsChannel.mo1159trySendJP2dKIU(obj);
        if (!(mo1159trySendJP2dKIU instanceof ChannelResult.Failed) || (mo1159trySendJP2dKIU instanceof ChannelResult.Closed)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Event buffer overflow");
    }
}
