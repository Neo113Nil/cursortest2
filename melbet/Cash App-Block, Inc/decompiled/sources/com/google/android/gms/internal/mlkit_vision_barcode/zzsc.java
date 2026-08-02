package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.molecule.AndroidUiDispatcher;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class zzsc {
    public static MoleculePresenterKt$asPresenter$1 asPresenter$default(EducationStoryPresenter educationStoryPresenter) {
        CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
        coroutineContext.getClass();
        KybBannerPresenter kybBannerPresenter = new KybBannerPresenter(educationStoryPresenter, 1);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = MoleculePresenterKt.LocalPlacement;
        return new MoleculePresenterKt$asPresenter$1(kybBannerPresenter, coroutineContext);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowBulletin.deepLinkSpecs;
    }

    public static final StableCoroutineScope rememberStableCoroutineScope(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new StableCoroutineScope(coroutineScope);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return (StableCoroutineScope) rememberedValue2;
    }

    public abstract String getLastFour();
}
