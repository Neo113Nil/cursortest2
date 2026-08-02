package com.squareup.cash.appintro.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import coil3.ImageLoader$Builder;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.appintro.screens.SponsorshipRequestContent;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.registeralias.presenters.real.RealRegisterAliasResultHandler$Factory$Impl;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.api.FormBlocker;
import com.stripe.attestation.TaskExtensionsKt;
import com.withpersona.sdk2.camera.BitmapUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class SponsorshipRequestReferralIntroPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final SponsorshipRequestReferralIntroScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ImageLoader$Builder registerAliasResultHandler;
    public final JanusService service;

    public SponsorshipRequestReferralIntroPresenter(JanusService janusService, RealRegisterAliasResultHandler$Factory$Impl realRegisterAliasResultHandler$Factory$Impl, Analytics analytics, SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        sponsorshipRequestReferralIntroScreen.getClass();
        this.service = janusService;
        this.analytics = analytics;
        this.args = sponsorshipRequestReferralIntroScreen;
        this.navigator = screenNavigator;
        this.registerAliasResultHandler = realRegisterAliasResultHandler$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        FormViewModel formViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(680280502);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new MLKitTitleGenerator$1(this, objArr == true ? 1 : 0, 10);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(FormViewModel.SubmissionState.None.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new BenefitsHubPresenter$models$1$1(8, mutableState, (Object) flow, (Object) this, (Continuation) (objArr2 == true ? 1 : 0)));
        FormViewModel.SubmissionState submissionState = (FormViewModel.SubmissionState) mutableState.getValue();
        SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen = this.args;
        SponsorshipRequestContent sponsorshipRequestContent = sponsorshipRequestReferralIntroScreen.content;
        if (sponsorshipRequestContent instanceof SponsorshipRequestContent.Sponsor) {
            GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = ((SponsorshipRequestContent.Sponsor) sponsorshipRequestContent).content;
            formViewModel = new FormViewModel(sponsorSponsorshipRequestContent.elements, true, sponsorSponsorshipRequestContent.primary_button_text, null, null, null, false, null, null, true, null, null, null, null, null, submissionState, BitmapUtils.toClientScenarioAndFlowToken(sponsorshipRequestReferralIntroScreen), TaskExtensionsKt.toBlockerIdentifiers(sponsorshipRequestReferralIntroScreen), false, null, 817192);
        } else {
            if (!(sponsorshipRequestContent instanceof SponsorshipRequestContent.Teen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent = ((SponsorshipRequestContent.Teen) sponsorshipRequestContent).content;
            FormBlocker.Element.RemoteImageElement remoteImageElement = teenSponsorshipRequestContent.splash_image;
            FormBlocker.Element element = new FormBlocker.Element(null, remoteImageElement != null ? new FormBlocker.Element.AbstractC0072Element.RemoteImageElement(remoteImageElement) : null, null, 5, null);
            FormBlocker.Element.TextElement textElement = teenSponsorshipRequestContent.title;
            FormBlocker.Element element2 = new FormBlocker.Element(null, textElement != null ? new FormBlocker.Element.AbstractC0072Element.TextElement(textElement) : null, null, 5, null);
            FormBlocker.Element.TextElement textElement2 = teenSponsorshipRequestContent.subtitle;
            FormBlocker.Element element3 = new FormBlocker.Element(null, textElement2 != null ? new FormBlocker.Element.AbstractC0072Element.TextElement(textElement2) : null, null, 5, null);
            FormBlocker.Element.SpacerElement spacerElement = teenSponsorshipRequestContent.spacer_under_subtitle;
            FormBlocker.Element element4 = new FormBlocker.Element(null, spacerElement != null ? new FormBlocker.Element.AbstractC0072Element.SpacerElement(spacerElement) : null, null, 5, null);
            FormBlocker.Element.TextElement textElement3 = teenSponsorshipRequestContent.legal_text_above_primary_button;
            formViewModel = new FormViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{element, element2, element3, element4, new FormBlocker.Element(null, textElement3 != null ? new FormBlocker.Element.AbstractC0072Element.TextElement(textElement3) : null, null, 5, null)}), true, teenSponsorshipRequestContent.primary_button_text, null, null, null, false, null, null, true, null, null, null, null, null, submissionState, BitmapUtils.toClientScenarioAndFlowToken(sponsorshipRequestReferralIntroScreen), TaskExtensionsKt.toBlockerIdentifiers(sponsorshipRequestReferralIntroScreen), false, null, 817192);
        }
        gapComposer.end(false);
        return formViewModel;
    }
}
