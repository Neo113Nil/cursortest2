package com.squareup.cash.retro.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.lending.payment_plans.PaymentPlanData;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PaymentPlanDataBlockerPresenter implements MoleculePresenter {
    public final AppService appService;
    public final BlockersScreens.PaymentPlanDataBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentPlanData.SubmitButton.Style.values().length];
            try {
                iArr[PaymentPlanData.SubmitButton.Style.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentPlanData.SubmitButton.Style.SUBTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentPlanData.SubmitButton.Style.PROMINENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentPlanDataBlockerPresenter(AppService appService, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, BlockersDataNavigator blockersDataNavigator, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.PaymentPlanDataBlockerScreen paymentPlanDataBlockerScreen) {
        paymentPlanDataBlockerScreen.getClass();
        this.appService = appService;
        this.stringManager = androidStringManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.navigator = screenNavigator;
        this.args = paymentPlanDataBlockerScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submit(PaymentPlanDataBlockerPresenter paymentPlanDataBlockerPresenter, String str, ContinuationImpl continuationImpl) {
        PaymentPlanDataBlockerPresenter$submit$1 paymentPlanDataBlockerPresenter$submit$1;
        int i;
        ApiResult apiResult;
        BlockersScreens.PaymentPlanDataBlockerScreen paymentPlanDataBlockerScreen = paymentPlanDataBlockerPresenter.args;
        if (continuationImpl instanceof PaymentPlanDataBlockerPresenter$submit$1) {
            paymentPlanDataBlockerPresenter$submit$1 = (PaymentPlanDataBlockerPresenter$submit$1) continuationImpl;
            int i2 = paymentPlanDataBlockerPresenter$submit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentPlanDataBlockerPresenter$submit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentPlanDataBlockerPresenter$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentPlanDataBlockerPresenter$submit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = paymentPlanDataBlockerPresenter.appService;
                    BlockersData blockersData = paymentPlanDataBlockerScreen.blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str2 = blockersData.flowToken;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(blockersData.requestContext, str, (List) null, 12);
                    paymentPlanDataBlockerPresenter$submit$1.label = 1;
                    obj = appService.submitForm(clientScenario, str2, submitFormRequest, paymentPlanDataBlockerPresenter$submit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    BlockersData blockersData2 = paymentPlanDataBlockerScreen.blockersData;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    paymentPlanDataBlockerPresenter.navigator.goTo(paymentPlanDataBlockerPresenter.blockersDataNavigator.getNext(paymentPlanDataBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    paymentPlanDataBlockerPresenter.showError((ApiResult.Failure) apiResult);
                }
                return Unit.INSTANCE;
            }
        }
        paymentPlanDataBlockerPresenter$submit$1 = new PaymentPlanDataBlockerPresenter$submit$1(paymentPlanDataBlockerPresenter, continuationImpl);
        Object obj2 = paymentPlanDataBlockerPresenter$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentPlanDataBlockerPresenter$submit$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static PaymentPlanSummaryViewModel.TimelineSection toViewModel(PaymentPlanData.TimelineSection timelineSection) {
        PaymentPlanSummaryViewModel.SubmitButton.Style style;
        LocalizedString localizedString = timelineSection.title;
        PaymentPlanSummaryViewModel.SubmitButton submitButton = null;
        String str = localizedString != null ? localizedString.translated_value : null;
        LocalizedString localizedString2 = timelineSection.subtitle;
        String str2 = localizedString2 != null ? localizedString2.translated_value : null;
        Timeline timeline = timelineSection.timeline;
        timeline.getClass();
        PaymentPlanData.SubmitButton submitButton2 = timelineSection.button;
        if (submitButton2 != null) {
            String str3 = submitButton2.id;
            str3.getClass();
            LocalizedString localizedString3 = submitButton2.text;
            localizedString3.getClass();
            String str4 = localizedString3.translated_value;
            str4.getClass();
            PaymentPlanData.SubmitButton.Style style2 = submitButton2.style;
            int i = style2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
            if (i == -1) {
                style = PaymentPlanSummaryViewModel.SubmitButton.Style.PROMINENT;
            } else if (i == 1) {
                style = PaymentPlanSummaryViewModel.SubmitButton.Style.STANDARD;
            } else if (i == 2) {
                style = PaymentPlanSummaryViewModel.SubmitButton.Style.SUBTLE;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                style = PaymentPlanSummaryViewModel.SubmitButton.Style.PROMINENT;
            }
            submitButton = new PaymentPlanSummaryViewModel.SubmitButton(str3, str4, style);
        }
        return new PaymentPlanSummaryViewModel.TimelineSection(str, str2, timeline, submitButton);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        boolean z;
        PaymentPlanSummaryViewModel.SummarySection summarySection;
        ColorModel colorModel;
        PaymentPlanSummaryViewModel.PurchasesSection purchasesSection;
        PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData;
        PaymentPlanSummaryViewModel.PurchasesSection.ActionButton actionButton;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(755370218);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) null, this, mutableState, 14));
        PaymentPlanData paymentPlanData = this.args.data.payment_plan_data;
        paymentPlanData.getClass();
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        Color color = paymentPlanData.accent_color;
        ColorModel accented = color != null ? new ColorModel.Accented(color) : ColorModel.CashGreen.INSTANCE;
        UiAvatar uiAvatar = paymentPlanData.avatar;
        StackedAvatarViewModel.Single stackedAvatarViewModel = uiAvatar != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar) : null;
        UiAvatar uiAvatar2 = paymentPlanData.avatar;
        AvatarBadgeViewModel extractAvatarBadgeViewModel = uiAvatar2 != null ? AvatarKt.extractAvatarBadgeViewModel(uiAvatar2, MoshiJsonIntegration.toModel$default(ArcadeColors.BackgroundSubtle)) : null;
        LocalizedString localizedString = paymentPlanData.title;
        localizedString.getClass();
        String str = localizedString.translated_value;
        str.getClass();
        LocalizedString localizedString2 = paymentPlanData.subtitle;
        String str2 = localizedString2 != null ? localizedString2.translated_value : null;
        PaymentPlanData.ProgressSection progressSection = paymentPlanData.payment_progress_section;
        progressSection.getClass();
        LocalizedString localizedString3 = progressSection.current_paid;
        localizedString3.getClass();
        String str3 = localizedString3.translated_value;
        str3.getClass();
        LocalizedString localizedString4 = progressSection.current_paid_label;
        localizedString4.getClass();
        String str4 = localizedString4.translated_value;
        str4.getClass();
        LocalizedString localizedString5 = progressSection.left_to_pay;
        localizedString5.getClass();
        String str5 = localizedString5.translated_value;
        str5.getClass();
        LocalizedString localizedString6 = progressSection.left_to_pay_label;
        localizedString6.getClass();
        String str6 = localizedString6.translated_value;
        str6.getClass();
        Float f = progressSection.progress_percent;
        f.getClass();
        PaymentPlanSummaryViewModel.ProgressSection progressSection2 = new PaymentPlanSummaryViewModel.ProgressSection(str3, str4, str5, str6, f.floatValue());
        PaymentPlanData.TimelineSection timelineSection = paymentPlanData.refunds_timeline_section;
        PaymentPlanSummaryViewModel.TimelineSection viewModel = timelineSection != null ? toViewModel(timelineSection) : null;
        PaymentPlanData.TimelineSection timelineSection2 = paymentPlanData.payments_timeline_section;
        timelineSection2.getClass();
        PaymentPlanSummaryViewModel.TimelineSection viewModel2 = toViewModel(timelineSection2);
        PaymentPlanData.SummarySection summarySection2 = paymentPlanData.summary_section;
        if (summarySection2 != null) {
            LocalizedString localizedString7 = summarySection2.title;
            String str7 = localizedString7 != null ? localizedString7.translated_value : null;
            LocalizedString localizedString8 = summarySection2.summary_text;
            String str8 = localizedString8 != null ? localizedString8.translated_value : null;
            List<PaymentPlanData.SummarySection.DetailItem> list = summarySection2.detail_items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (PaymentPlanData.SummarySection.DetailItem detailItem : list) {
                boolean z2 = booleanValue;
                LocalizedString localizedString9 = detailItem.label;
                localizedString9.getClass();
                String str9 = localizedString9.translated_value;
                str9.getClass();
                LocalizedString localizedString10 = detailItem.value;
                localizedString10.getClass();
                String str10 = localizedString10.translated_value;
                str10.getClass();
                arrayList.add(new PaymentPlanSummaryViewModel.SummarySection.DetailItem(str9, str10));
                booleanValue = z2;
            }
            z = booleanValue;
            LocalizedString localizedString11 = summarySection2.source_text;
            String str11 = localizedString11 != null ? localizedString11.translated_value : null;
            Image image = summarySection2.source_icon;
            summarySection = new PaymentPlanSummaryViewModel.SummarySection(str7, str8, arrayList, str11, image != null ? new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(null, null, null, image, null, null, null, null, false, false, new StackedAvatarViewModel.Avatar.Shape.RoundedRectangle(StackedAvatarViewModel.Avatar.Shape.RoundedRectangle.CornerRadiusSize.None), false, null, null, 122871)) : null);
        } else {
            z = booleanValue;
            summarySection = null;
        }
        PaymentPlanData.PurchasesSection purchasesSection2 = paymentPlanData.purchase_section;
        if (purchasesSection2 != null) {
            LocalizedString localizedString12 = purchasesSection2.title;
            localizedString12.getClass();
            String str12 = localizedString12.translated_value;
            str12.getClass();
            List<PaymentPlanData.PurchasesSection.DetailRow> list2 = purchasesSection2.detail_rows;
            colorModel = accented;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                PaymentPlanData.PurchasesSection.DetailRow detailRow = (PaymentPlanData.PurchasesSection.DetailRow) it.next();
                LocalizedString localizedString13 = detailRow.title;
                localizedString13.getClass();
                String str13 = localizedString13.translated_value;
                str13.getClass();
                Iterator it2 = it;
                LocalizedString localizedString14 = detailRow.subtitle;
                String str14 = localizedString14 != null ? localizedString14.translated_value : null;
                LocalizedString localizedString15 = detailRow.detail;
                String str15 = localizedString15 != null ? localizedString15.translated_value : null;
                UiAvatar uiAvatar3 = detailRow.avatar;
                StackedAvatarViewModel.Single stackedAvatarViewModel2 = uiAvatar3 != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar3) : null;
                UiAvatar uiAvatar4 = detailRow.avatar;
                arrayList2.add(new PaymentPlanSummaryViewModel.PurchasesSection.DetailRow(str13, str14, str15, stackedAvatarViewModel2, uiAvatar4 != null ? AvatarKt.extractAvatarBadgeViewModel(uiAvatar4, MoshiJsonIntegration.toModel$default(ArcadeColors.BackgroundSubtle)) : null));
                it = it2;
            }
            PaymentPlanData.PurchasesSection.ActionButton actionButton2 = purchasesSection2.button;
            if (actionButton2 != null) {
                LocalizedString localizedString16 = actionButton2.text;
                localizedString16.getClass();
                String str16 = localizedString16.translated_value;
                str16.getClass();
                String str17 = actionButton2.url;
                str17.getClass();
                actionButton = new PaymentPlanSummaryViewModel.PurchasesSection.ActionButton(actionButton2.image, str16, str17);
            } else {
                actionButton = null;
            }
            purchasesSection = new PaymentPlanSummaryViewModel.PurchasesSection(str12, arrayList2, actionButton);
        } else {
            colorModel = accented;
            purchasesSection = null;
        }
        List<PaymentPlanData.ClientRouteLink> list3 = paymentPlanData.client_route_links;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            PaymentPlanData.ClientRouteLink clientRouteLink = (PaymentPlanData.ClientRouteLink) it3.next();
            Image image2 = clientRouteLink.icon;
            image2.getClass();
            LocalizedString localizedString17 = clientRouteLink.label;
            localizedString17.getClass();
            String str18 = localizedString17.translated_value;
            str18.getClass();
            Iterator it4 = it3;
            String str19 = clientRouteLink.url;
            str19.getClass();
            LocalizedString localizedString18 = clientRouteLink.accessory_text;
            arrayList3.add(new PaymentPlanSummaryViewModel.LabeledLink(image2, str18, str19, localizedString18 != null ? localizedString18.translated_value : null));
            it3 = it4;
        }
        if (z) {
            PaymentPlanData.SummarySection summarySection3 = paymentPlanData.summary_section;
            summarySection3.getClass();
            PaymentPlanData.SummarySection.SourceInfo sourceInfo = summarySection3.source_info;
            sourceInfo.getClass();
            LocalizedString localizedString19 = sourceInfo.title;
            String str20 = localizedString19 != null ? localizedString19.translated_value : null;
            LocalizedString localizedString20 = sourceInfo.description;
            localizedString20.getClass();
            String str21 = localizedString20.translated_value;
            str21.getClass();
            LocalizedString localizedString21 = sourceInfo.close_button_text;
            localizedString21.getClass();
            String str22 = localizedString21.translated_value;
            str22.getClass();
            bottomSheetData = new PaymentPlanSummaryViewModel.BottomSheetData(str20, str21, str22);
        } else {
            bottomSheetData = null;
        }
        PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = new PaymentPlanSummaryViewModel(colorModel, stackedAvatarViewModel, extractAvatarBadgeViewModel, str, str2, progressSection2, viewModel, viewModel2, summarySection, purchasesSection, arrayList3, bottomSheetData);
        gapComposer.end(false);
        return paymentPlanSummaryViewModel;
    }

    public final void showError(ApiResult.Failure failure) {
        AndroidStringManager androidStringManager = this.stringManager;
        ErrorMessaging errorMessaging = failure == null ? new ErrorMessaging(androidStringManager.get(R.string.unexpected_error), androidStringManager.get(R.string.generic_network_error)) : TextUtilsCompat.errorMessaging(androidStringManager, failure, null);
        this.navigator.goTo(new FailureMessageBlockerScreen(this.args.blockersData, errorMessaging.message, errorMessaging.title));
    }
}
