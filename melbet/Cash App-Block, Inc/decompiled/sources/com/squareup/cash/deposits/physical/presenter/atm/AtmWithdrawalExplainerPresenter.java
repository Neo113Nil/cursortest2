package com.squareup.cash.deposits.physical.presenter.atm;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Benefit;
import com.squareup.cash.deposits.physical.viewmodels.map.HeaderIcon;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes8.dex */
public final class AtmWithdrawalExplainerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RetailerMapBlocker.ExplainerScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    /* loaded from: classes.dex */
    public interface Factory {

        public final class Impl implements Factory {
            public final MetroFactory delegateFactory;

            public Impl(MetroFactory metroFactory) {
                this.delegateFactory = metroFactory;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider routerFactory;

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
            this.analytics = doubleCheck;
            this.routerFactory = instanceFactory;
        }
    }

    public AtmWithdrawalExplainerPresenter(RetailerMapBlocker.ExplainerScreen explainerScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        explainerScreen.getClass();
        this.args = explainerScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1019038984);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, continuation, this, 22));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        RetailerMapBlocker.ExplainerScreen explainerScreen = this.args;
        String str = explainerScreen.header_title;
        str.getClass();
        String str2 = explainerScreen.help_button_text;
        str2.getClass();
        String str3 = explainerScreen.help_button_action;
        str3.getClass();
        List<RetailerMapBlocker.ExplainerScreen.Benefit> list = explainerScreen.benefits;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RetailerMapBlocker.ExplainerScreen.Benefit benefit : list) {
            boolean areEqual = Intrinsics.areEqual(benefit.enabled, Boolean.TRUE);
            String str4 = benefit.name;
            str4.getClass();
            String str5 = benefit.description;
            str5.getClass();
            arrayList.add(new Benefit(areEqual, str4, str5, benefit.description_items, benefit.button_name, benefit.button_client_route, benefit.highlighted_info_text));
        }
        List<RetailerMapBlocker.ExplainerScreen.Limit> list2 = explainerScreen.limits;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (RetailerMapBlocker.ExplainerScreen.Limit limit : list2) {
            String str6 = limit.key;
            str6.getClass();
            String str7 = limit.value;
            str7.getClass();
            arrayList2.add(new Limit(str6, str7));
        }
        AtmExplainerViewModel atmExplainerViewModel = new AtmExplainerViewModel(str, str2, str3, arrayList, arrayList2, explainerScreen.header_image == RetailerMapBlocker.ExplainerScreen.HeaderImage.PRIMARY_BANKING_ACTIVE ? HeaderIcon.PBA : HeaderIcon.DEFAULT);
        gapComposer.end(false);
        return atmExplainerViewModel;
    }
}
