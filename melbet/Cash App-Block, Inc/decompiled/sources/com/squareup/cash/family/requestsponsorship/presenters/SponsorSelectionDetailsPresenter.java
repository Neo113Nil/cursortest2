package com.squareup.cash.family.requestsponsorship.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcj;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.coroutines.Signal;
import com.stripe.attestation.TaskExtensionsKt;
import com.withpersona.sdk2.camera.BitmapUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class SponsorSelectionDetailsPresenter implements MoleculePresenter, HasObservability {
    public final AppService appService;
    public final SponsorSelectionDetailsScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final ErrorReporter errorReporter;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;

    public final class SmsParams {
        public final String inviteCode;
        public final String message;
        public final String recipient;
        public final UiCustomer sponsor;

        public SmsParams(String str, String str2, UiCustomer uiCustomer, String str3) {
            this.message = str;
            this.recipient = str2;
            this.sponsor = uiCustomer;
            this.inviteCode = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmsParams)) {
                return false;
            }
            SmsParams smsParams = (SmsParams) obj;
            return this.message.equals(smsParams.message) && this.recipient.equals(smsParams.recipient) && this.sponsor.equals(smsParams.sponsor) && Intrinsics.areEqual(this.inviteCode, smsParams.inviteCode);
        }

        public final int hashCode() {
            int hashCode = (this.sponsor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.message.hashCode() * 31, 31, this.recipient)) * 31;
            String str = this.inviteCode;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SmsParams(message=", this.message, ", recipient=", this.recipient, ", sponsor=");
            m.append(this.sponsor);
            m.append(", inviteCode=");
            m.append(this.inviteCode);
            m.append(")");
            return m.toString();
        }
    }

    public SponsorSelectionDetailsPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, IntentLauncher intentLauncher, Signal signal, ErrorReporter errorReporter, SampleStrategy sampleStrategy, BetterNavigator.ScreenNavigator screenNavigator, SponsorSelectionDetailsScreen sponsorSelectionDetailsScreen) {
        sponsorSelectionDetailsScreen.getClass();
        this.appService = appService;
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.launcher = intentLauncher;
        this.signOutSignal = signal;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.navigator = screenNavigator;
        this.args = sponsorSelectionDetailsScreen;
    }

    public final Object confirmSelectedSponsor(UiCustomer uiCustomer, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, MutableState mutableState, SuspendLambda suspendLambda) {
        mutableState.setValue(new FormViewModel.SubmissionState.SubmissionInFlight((BlockerAction.SubmitAction.AnimationDirection) null, 3));
        Object selectSponsor$default = zzcj.selectSponsor$default(this.appService, SelectSponsorsRequest.Action.CONFIRM, uiCustomer, null, bool2, bool, bool3, str2, str, this.navigator, this.args, this.blockersDataNavigator, this.stringManager, this.signOutSignal, null, new DrawerViewKt$$ExternalSyntheticLambda2(26, mutableState), suspendLambda, 8196);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (selectSponsor$default != coroutineSingletons) {
            selectSponsor$default = Unit.INSTANCE;
        }
        return selectSponsor$default == coroutineSingletons ? selectSponsor$default : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-717867878);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(FormViewModel.SubmissionState.None.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, (Continuation) null, this, mutableState, 18));
        SponsorSelectionDetailsScreen sponsorSelectionDetailsScreen = this.args;
        SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker = sponsorSelectionDetailsScreen.blocker;
        RequestSponsorshipParsingErrorFactory requestSponsorshipParsingErrorFactory = RequestSponsorshipParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(sponsorSelectionDetailsBlocker, requestSponsorshipParsingErrorFactory, this);
            FormBlocker.Element.AvatarElement avatarElement = (FormBlocker.Element.AvatarElement) protoValidationScope.reportIfNullAndContinue("sponsor_avatar", (String) null, sponsorSelectionDetailsBlocker.sponsor_avatar);
            FormBlocker.Element.TextElement textElement = (FormBlocker.Element.TextElement) protoValidationScope.reportIfNullAndContinue("title", (String) null, sponsorSelectionDetailsBlocker.title);
            FormBlocker.Element.TextElement textElement2 = (FormBlocker.Element.TextElement) protoValidationScope.reportIfNullAndContinue("subtitle", (String) null, sponsorSelectionDetailsBlocker.subtitle);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (avatarElement != null) {
                createListBuilder.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.AvatarElement(avatarElement), null, 5, null));
            }
            if (textElement != null) {
                createListBuilder.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.TextElement(textElement), null, 5, null));
            }
            if (textElement2 != null) {
                createListBuilder.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.TextElement(textElement2), null, 5, null));
            }
            List<FormBlocker.Element.SelectableRowElement> list = sponsorSelectionDetailsBlocker.sponsor_details;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.SelectableRowElement((FormBlocker.Element.SelectableRowElement) it.next()), null, 5, null));
            }
            createListBuilder.addAll(arrayList);
            FormBlocker.Element.TextElement textElement3 = sponsorSelectionDetailsBlocker.legal_footer_text;
            if (textElement3 != null) {
                createListBuilder.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.SpacerElement(new FormBlocker.Element.SpacerElement(1, null == true ? 1 : 0, 2, null == true ? 1 : 0)), null, 5, null));
                createListBuilder.add(new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.TextElement(textElement3), null, 5, null));
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            String str = sponsorSelectionDetailsBlocker.primary_button_text;
            String str2 = sponsorSelectionDetailsBlocker.cancel_button_text;
            BlockersData blockersData = sponsorSelectionDetailsScreen.blockersData;
            Color color = blockersData.serverAccentColor;
            FormViewModel formViewModel = new FormViewModel(build, false, str, null, str2, null, false, null, color != null ? new ColorModel.Accented(color) : blockersData.accentColor, false, null, null, null, null, null, (FormViewModel.SubmissionState) mutableState.getValue(), BitmapUtils.toClientScenarioAndFlowToken(sponsorSelectionDetailsScreen), TaskExtensionsKt.toBlockerIdentifiers(sponsorSelectionDetailsScreen), false, null, 817192);
            gapComposer.end(false);
            return formViewModel;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(sponsorSelectionDetailsBlocker.getClass()), requestSponsorshipParsingErrorFactory, null);
        }
    }
}
