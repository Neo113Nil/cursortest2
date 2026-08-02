package com.squareup.cash.appmessages.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class ProfileInlineAppMessagePresenter implements MoleculePresenter {
    public final /* synthetic */ DisclosurePresenter $$delegate_0;
    public final /* synthetic */ int $r8$classId;

    public ProfileInlineAppMessagePresenter(Flow flow, InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.$$delegate_0 = inlineAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
            default:
                this.$$delegate_0 = inlineAppMessagePresenterHelper$Factory$Impl.create(flow, screenNavigator);
                break;
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.$$delegate_0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-985868089);
                InlineAppMessageViewModel m3434models = disclosurePresenter.m3434models(flow, (Composer) gapComposer);
                gapComposer.end(false);
                return m3434models;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-436291251);
                InlineAppMessageViewModel m3434models2 = disclosurePresenter.m3434models(flow, (Composer) gapComposer2);
                gapComposer2.end(false);
                return m3434models2;
        }
    }
}
