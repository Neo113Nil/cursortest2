package com.squareup.cash.money.banners.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.blockers.views.FormBlockerView;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.banners.presenters.KybBannerItemModel;
import com.squareup.cash.money.core.ids.SectionProviderId;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class BannerSectionProvider implements SectionProvider {
    public final StateFlowKt$stateFlowOf$1 availabilityState;
    public final SectionProviderId id;
    public final KybBannerPresenter presenter;

    public BannerSectionProvider(KybBannerPresenter$Factory$Impl kybBannerPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        FormBlockerView.MetroFactory metroFactory = kybBannerPresenter$Factory$Impl.delegateFactory;
        KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl = (KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) metroFactory.activity.value;
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.formElementViewBuilderFactory.value;
        kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.getClass();
        coroutineScope.getClass();
        this.presenter = new KybBannerPresenter(kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, coroutineScope, screenNavigator);
        this.id = SectionProviderId.BANNER;
        this.availabilityState = new StateFlowKt$stateFlowOf$1(SectionAvailabilityState.AVAILABLE);
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final StateFlow getAvailabilityState() {
        return this.availabilityState;
    }

    @Override // com.squareup.cash.money.viewmodels.api.SectionProvider
    public final SectionProviderId getId() {
        return this.id;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        List listOf;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(548854909);
        KybBannerItemModel models = this.presenter.models(flow, gapComposer);
        boolean changed = gapComposer.changed(models);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            if (models instanceof KybBannerItemModel.Unavailable) {
                listOf = EmptyList.INSTANCE;
            } else {
                if (!(models instanceof KybBannerItemModel.Available)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new BannerSection(new KybBannerItem((KybBannerItemModel.Available) models)));
            }
            rememberedValue = new SectionProvider.Content(listOf, false);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SectionProvider.Content content = (SectionProvider.Content) rememberedValue;
        gapComposer.end(false);
        return content;
    }
}
