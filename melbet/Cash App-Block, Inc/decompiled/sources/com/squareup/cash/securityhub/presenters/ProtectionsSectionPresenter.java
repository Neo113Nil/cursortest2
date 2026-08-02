package com.squareup.cash.securityhub.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.securityhub.viewmodels.EducationCardId;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionUiModel;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowId;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class ProtectionsSectionPresenter implements MoleculePresenter {
    public final BetterNavigator.ScreenNavigator navigator;
    public final SecurityHubScreen screen;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;

    public ProtectionsSectionPresenter(SecurityHubScreen securityHubScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, RealSupportNavigator realSupportNavigator) {
        securityHubScreen.getClass();
        this.screen = securityHubScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.supportNavigator = realSupportNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final ProtectionsSectionUiModel models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-600052246);
        Object rememberedValue = gapComposer.rememberedValue();
        AndroidStringManager androidStringManager = this.stringManager;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)});
            gapComposer.updateRememberedValue(rememberedValue);
        }
        List list = (List) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = CollectionsKt__CollectionsKt.listOf((Object[]) new EducationCardUiModel[]{new EducationCardUiModel(EducationCardId.BUILT_IN_PROTECTIONS, androidStringManager.get(R.string.education_card_built_in_protections), TrustHubImageUrls.ARTICLE_PROTECTIONS), new EducationCardUiModel(EducationCardId.COMMON_SCAMS, androidStringManager.get(R.string.education_card_common_scams), TrustHubImageUrls.ARTICLE_COMMON_SCAMS), new EducationCardUiModel(EducationCardId.SPOT_SCAMS, androidStringManager.get(R.string.education_card_spot_scams), TrustHubImageUrls.ARTICLE_SPOT_SCAMS), new EducationCardUiModel(EducationCardId.PREVENT_FRAUD, androidStringManager.get(R.string.education_card_prevent_fraud), TrustHubImageUrls.ARTICLE_PREVENT_FRAUD), new EducationCardUiModel(EducationCardId.SECURITY_FEATURES, androidStringManager.get(R.string.education_card_security_features), TrustHubImageUrls.ARTICLE_SECURITY_FEATURES)});
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, null, this, 7));
        ProtectionsSectionUiModel protectionsSectionUiModel = new ProtectionsSectionUiModel(androidStringManager.get(R.string.security_education_support_section_title), (List) rememberedValue2, list);
        gapComposer.end(false);
        return protectionsSectionUiModel;
    }
}
