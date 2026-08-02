package com.squareup.cash.blockers.presenters;

import androidx.lifecycle.LifecycleOwner;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Answer;
import com.squareup.cash.blockers.actions.viewevents.Dismiss;
import com.squareup.cash.blockers.actions.viewevents.GoBack;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class BlockerContainerPresenter implements Presenter {
    public final BlockersScreens.BlockerContainerScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final Presenter childPresenter;

    public BlockerContainerPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockerFlowListener blockerFlowListener, Presenter presenter, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.BlockerContainerScreen blockerContainerScreen) {
        this.blockerFlowAnalytics = blockerFlowListener;
        this.childPresenter = presenter;
        this.args = blockerContainerScreen;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.Presenter
    public final Presenter.Binding start(final CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, Answer answer, SavedState savedState) {
        coroutineScope.getClass();
        lifecycleOwner.getClass();
        final Presenter.Binding start = this.childPresenter.start(coroutineScope, lifecycleOwner, answer, savedState);
        return new Presenter.Binding() { // from class: com.squareup.cash.blockers.presenters.BlockerContainerPresenter$start$1
            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final StateFlow getModels() {
                return Presenter.Binding.this.getModels();
            }

            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final void sendAnswer(Answer answer2) {
                Presenter.Binding.this.sendAnswer(answer2);
            }

            @Override // app.cash.broadway.presenter.Presenter.Binding
            public final void sendEvent(Object obj) {
                BlockerContainerPresenter blockerContainerPresenter = this;
                BlockersScreens.BlockerContainerScreen blockerContainerScreen = blockerContainerPresenter.args;
                obj.getClass();
                boolean z = obj instanceof GoBack;
                int i = 9;
                Continuation continuation = null;
                CoroutineScope coroutineScope2 = coroutineScope;
                if (z) {
                    if (blockerContainerScreen instanceof BlockersScreens.BlockerContainerScreen.BlockerContainerBottomSheet) {
                        BlockerAction blockerAction = ((BlockersScreens.BlockerContainerScreen.BlockerContainerBottomSheet) blockerContainerScreen).dismissAction;
                        blockerContainerPresenter.blockerFlowAnalytics.onFlowCancelled(blockerContainerPresenter.args.getBlockersData());
                        JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(blockerContainerPresenter, blockerAction, continuation, i), 3);
                        return;
                    }
                    return;
                }
                if (!(obj instanceof Dismiss)) {
                    Presenter.Binding.this.sendEvent(obj);
                    return;
                }
                BlockerAction dismissAction = blockerContainerScreen.getDismissAction();
                blockerContainerPresenter.blockerFlowAnalytics.onFlowCancelled(blockerContainerPresenter.args.getBlockersData());
                JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(blockerContainerPresenter, dismissAction, continuation, i), 3);
            }
        };
    }
}
