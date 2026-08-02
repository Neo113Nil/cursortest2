package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewModel;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class GpsExplainerSheetPresenter implements MoleculePresenter {
    public final BlockersScreens.GpsExplainerSheetScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public GpsExplainerSheetPresenter(BlockersScreens.GpsExplainerSheetScreen gpsExplainerSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.args = gpsExplainerSheetScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1656198348);
        Updater.LaunchedEffect(gapComposer, flow, new CashtagPresenter$models$2$1(flow, (Continuation) null, this, 27));
        GpsLocationConsentBlocker.InfoHalfSheet infoHalfSheet = this.args.blocker;
        Icon icon = infoHalfSheet.image;
        icon.getClass();
        String str = infoHalfSheet.title;
        str.getClass();
        String str2 = infoHalfSheet.subtitle;
        str2.getClass();
        List<GpsLocationConsentBlocker.RowElement> list = infoHalfSheet.row_elements;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GpsLocationConsentBlocker.RowElement rowElement : list) {
            Icon icon2 = rowElement.image;
            icon2.getClass();
            String str3 = rowElement.text;
            str3.getClass();
            arrayList.add(new GpsExplainerViewModel.DetailModel(icon2, str3));
        }
        String str4 = infoHalfSheet.privacy_text;
        str4.getClass();
        String str5 = infoHalfSheet.prominent_button_text;
        str5.getClass();
        GpsExplainerViewModel gpsExplainerViewModel = new GpsExplainerViewModel(icon, str, str2, arrayList, str4, str5);
        gapComposer.end(false);
        return gpsExplainerViewModel;
    }
}
