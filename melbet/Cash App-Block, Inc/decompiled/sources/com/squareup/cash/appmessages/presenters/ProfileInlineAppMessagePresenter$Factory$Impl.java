package com.squareup.cash.appmessages.presenters;

import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class ProfileInlineAppMessagePresenter$Factory$Impl {
    public final /* synthetic */ int $r8$classId;
    public final Object delegateFactory;

    public /* synthetic */ ProfileInlineAppMessagePresenter$Factory$Impl(Object obj, int i) {
        this.$r8$classId = i;
        this.delegateFactory = obj;
    }

    public final MoleculePresenter create(BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.delegateFactory;
        switch (i) {
            case 0:
                CheckDepositAmountPresenter.MetroFactory metroFactory = (CheckDepositAmountPresenter.MetroFactory) obj;
                Flow flow = (Flow) metroFactory.analytics.getValue();
                InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl = (InlineAppMessagePresenterHelper$Factory$Impl) metroFactory.blockerFlowAnalytics.invoke();
                flow.getClass();
                inlineAppMessagePresenterHelper$Factory$Impl.getClass();
                return new ProfileInlineAppMessagePresenter(flow, inlineAppMessagePresenterHelper$Factory$Impl, screenNavigator, 0);
            default:
                CheckDepositAmountPresenter.MetroFactory metroFactory2 = (CheckDepositAmountPresenter.MetroFactory) obj;
                Flow flow2 = (Flow) metroFactory2.analytics.getValue();
                InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl2 = (InlineAppMessagePresenterHelper$Factory$Impl) metroFactory2.blockerFlowAnalytics.invoke();
                flow2.getClass();
                inlineAppMessagePresenterHelper$Factory$Impl2.getClass();
                return new ProfileInlineAppMessagePresenter(flow2, inlineAppMessagePresenterHelper$Factory$Impl2, screenNavigator, 1);
        }
    }
}
