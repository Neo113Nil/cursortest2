package com.squareup.cash.activity.presenters;

import androidx.biometric.CryptoObjectUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.offline.OfflinePaymentActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.personalization.api.v2.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationPreview;
import com.squareup.cash.mosaic.resources.api.v2.Background;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiCustomer;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class PaymentHistoryActivityItemPresenter implements ActivityItemPresenter {
    public final FormattedPaymentHistoryActivityItem activityItem;
    public final ActivityItemEventHandler eventHandler;
    public final SharedFlowImpl eventHandlerCallbacks;
    public final PaymentHistoryAvatarFactory paymentHistoryAvatarFactory;
    public final ActivityItemPresentationContext presentationContext;
    public final RealSharedReactionState sharedReactionState;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryData.Icon.values().length];
            try {
                iArr[PaymentHistoryData.Icon.BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.Icon.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentHistoryActivityItemPresenter(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, ActivityItemEventHandler.Factory factory, Function1 function1, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, AndroidStringManager androidStringManager, RealSharedReactionState realSharedReactionState, PaymentHistoryAvatarFactory paymentHistoryAvatarFactory) {
        ActivityItemEventHandler create;
        navigator.getClass();
        activityItem.getClass();
        this.presentationContext = activityItemPresentationContext;
        this.stringManager = androidStringManager;
        this.sharedReactionState = realSharedReactionState;
        this.paymentHistoryAvatarFactory = paymentHistoryAvatarFactory;
        this.activityItem = (FormattedPaymentHistoryActivityItem) activityItem;
        this.eventHandler = (factory == null || (create = factory.create(navigator, function1)) == null) ? defaultActivityItemEventHandler$Factory$Impl.create(navigator, function1) : create;
        this.eventHandlerCallbacks = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiCallbackModel models(Composer composer) {
        ItemAccessory itemAccessory;
        Icons icons;
        String str;
        Background background;
        TextFormat textFormat;
        Color color;
        Icons icons2;
        Icons icons3;
        String rowId;
        boolean changed;
        String str2;
        Object rememberedValue;
        boolean changedInstance;
        PersonalizationPreview personalizationPreview;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1014103404);
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = this.activityItem;
        Object[] objArr = {formattedPaymentHistoryActivityItem};
        boolean changed2 = gapComposer.changed(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue2;
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            yf$$ExternalSyntheticLambda2 yf__externalsyntheticlambda2 = new yf$$ExternalSyntheticLambda2(this, 26);
            gapComposer.updateRememberedValue(yf__externalsyntheticlambda2);
            obj = yf__externalsyntheticlambda2;
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj, gapComposer, 0);
        boolean changed3 = gapComposer.changed(formattedPaymentHistoryActivityItem);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj2 = rememberedValue3;
        if (changed3 || rememberedValue3 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState2 = (MutableState) obj2;
        boolean changed4 = gapComposer.changed(formattedPaymentHistoryActivityItem);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue4;
        if (changed4 || rememberedValue4 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(ReactionsState.Hidden.INSTANCE);
            gapComposer.updateRememberedValue(mutableStateOf$default2);
            obj3 = mutableStateOf$default2;
        }
        MutableState mutableState3 = (MutableState) obj3;
        String str3 = null;
        SharedFlowImpl sharedFlowImpl = this.eventHandlerCallbacks;
        Updater.LaunchedEffect(gapComposer, sharedFlowImpl, new NetworkFetcher$doFetch$fetchResult$1((Object) sharedFlowImpl, (Continuation) (false ? 1 : 0), (Object) this, (Object) mutableState3, (State) mutableState2, (State) mutableState, 18));
        PaymentHistoryButton paymentHistoryButton = formattedPaymentHistoryActivityItem.getPaymentHistoryData().inline_button;
        Personalization personalization = formattedPaymentHistoryActivityItem.getPaymentHistoryData().personalization_payload;
        String str4 = (personalization == null || (personalizationPreview = personalization.preview) == null) ? null : personalizationPreview.portrait_preview_url;
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(404248362);
            gapComposer.end(false);
            itemAccessory = ItemAccessory.Progress.INSTANCE;
        } else {
            if (str4 != null) {
                if ((paymentHistoryButton != null ? paymentHistoryButton.action : null) != null) {
                    gapComposer.startReplaceGroup(404252633);
                    gapComposer.end(false);
                    String str5 = paymentHistoryButton.text;
                    Icons icons4 = Icons.PersonalizedPayments16;
                    String str6 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_formatted_activity_list;
                    String str7 = str6 == null ? "" : str6;
                    Personalization personalization2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().personalization_payload;
                    itemAccessory = new ItemAccessory.PortraitImage(str4, str5, icons4, str7, (personalization2 == null || (background = personalization2.hydrated_selected_background) == null || (textFormat = background.default_text_format) == null || (color = textFormat.text_color) == null) ? null : new ColorModel.Accented(color));
                }
            }
            if (paymentHistoryButton != null) {
                gapComposer.startReplaceGroup(404270745);
                boolean changed5 = gapComposer.changed(formattedPaymentHistoryActivityItem);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed5 || rememberedValue5 == neverEqualPolicy) {
                    PaymentHistoryButton.ButtonAction buttonAction = paymentHistoryButton.action;
                    Icon icon = paymentHistoryButton.arcade_icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    if (icons == null) {
                        icons = buttonAction == PaymentHistoryButton.ButtonAction.ADD_REACTION ? Icons.Like16 : formattedPaymentHistoryActivityItem.getPaymentHistoryData().personalization != null ? Icons.PersonalizedPayments16 : null;
                    }
                    String str8 = paymentHistoryButton.text;
                    if (str8 == null) {
                        str8 = "";
                    }
                    PaymentHistoryData.InlineButtonProminence inlineButtonProminence = formattedPaymentHistoryActivityItem.getPaymentHistoryData().inline_button_prominence;
                    if (inlineButtonProminence == null) {
                        inlineButtonProminence = PaymentHistoryData.InlineButtonProminence.DEFAULT_STANDARD;
                    }
                    ItemAccessory.Button button = new ItemAccessory.Button(str8, icons, inlineButtonProminence, paymentHistoryButton.accessibility_text);
                    gapComposer.updateRememberedValue(button);
                    rememberedValue5 = button;
                }
                itemAccessory = (ItemAccessory.Button) rememberedValue5;
                gapComposer.end(false);
            } else if (formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_formatted_activity_list != null) {
                gapComposer.startReplaceGroup(404276419);
                gapComposer.end(false);
                String str9 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_formatted_activity_list;
                if (str9 == null) {
                    str9 = "";
                }
                PaymentHistoryData.AmountTreatment amountTreatment = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list;
                if (amountTreatment == null) {
                    amountTreatment = PaymentHistoryData.AmountTreatment.STANDARD;
                }
                ItemAccessory.Amount amount = new ItemAccessory.Amount(str9, amountTreatment);
                String str10 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_formatted_activity_list;
                if (str10 == null) {
                    str10 = "";
                }
                PaymentHistoryData.AmountTreatment amountTreatment2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_treatment_activity_list;
                if (amountTreatment2 == null) {
                    amountTreatment2 = PaymentHistoryData.AmountTreatment.STANDARD;
                }
                itemAccessory = new ItemAccessory.DualAmounts(amount, new ItemAccessory.Amount(str10, amountTreatment2));
            } else if (formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list != null) {
                gapComposer.startReplaceGroup(404304393);
                gapComposer.end(false);
                String str11 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_formatted_activity_list;
                if (str11 == null) {
                    str11 = "";
                }
                PaymentHistoryData.AmountTreatment amountTreatment3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list;
                if (amountTreatment3 == null) {
                    amountTreatment3 = PaymentHistoryData.AmountTreatment.STANDARD;
                }
                itemAccessory = new ItemAccessory.Amount(str11, amountTreatment3);
            } else {
                gapComposer.startReplaceGroup(-351181527);
                gapComposer.end(false);
                itemAccessory = null;
            }
        }
        PaymentHistoryData.Icon icon2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().title_icon;
        int i = icon2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()];
        if (i == 1) {
            icons2 = Icons.Business16;
        } else {
            if (i != 2) {
                icons3 = null;
                if (formattedPaymentHistoryActivityItem instanceof OfflinePaymentActivityItem) {
                    rowId = formattedPaymentHistoryActivityItem.getRowId();
                } else {
                    OfflinePaymentActivityItem offlinePaymentActivityItem = (OfflinePaymentActivityItem) formattedPaymentHistoryActivityItem;
                    String str12 = offlinePaymentActivityItem.rowId;
                    UiCustomer uiCustomer = offlinePaymentActivityItem.getter;
                    String str13 = uiCustomer.id;
                    if (str13 == null) {
                        str13 = uiCustomer.full_name;
                    }
                    rowId = Recorder$$ExternalSyntheticOutline2.m(str12, Marker.ANY_NON_NULL_MARKER, str13);
                }
                String str14 = rowId;
                String str15 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
                String str16 = str15 != null ? "" : str15;
                String str17 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
                String str18 = str17 != null ? "" : str17;
                String str19 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
                String str20 = str19 != null ? "" : str19;
                changed = gapComposer.changed(formattedPaymentHistoryActivityItem);
                Object rememberedValue6 = gapComposer.rememberedValue();
                Object obj4 = rememberedValue6;
                if (!changed || rememberedValue6 == neverEqualPolicy) {
                    StackedAvatarViewModel avatarViewModel = this.paymentHistoryAvatarFactory.getAvatarViewModel(formattedPaymentHistoryActivityItem);
                    gapComposer.updateRememberedValue(avatarViewModel);
                    obj4 = avatarViewModel;
                }
                StackedAvatarViewModel stackedAvatarViewModel = (StackedAvatarViewModel) obj4;
                AvatarBadgeViewModel avatarBadge = PaymentHistoryAvatarFactory.getAvatarBadge(formattedPaymentHistoryActivityItem);
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                ReactionsState reactionsState = (ReactionsState) mutableState3.getValue();
                gapComposer.startReplaceGroup(2018202594);
                str2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().accessibility_text;
                if (str2 == null) {
                    boolean changed6 = gapComposer.changed(itemAccessory) | gapComposer.changed(formattedPaymentHistoryActivityItem);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    Object obj5 = rememberedValue7;
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        String str21 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
                        String str22 = str21 == null ? "" : str21;
                        String str23 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
                        String str24 = str23 == null ? "" : str23;
                        String str25 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
                        String str26 = str25 == null ? "" : str25;
                        Boolean bool = CryptoObjectUtils.getUiCounterparty(formattedPaymentHistoryActivityItem).is_business;
                        Boolean bool2 = Boolean.TRUE;
                        boolean areEqual = Intrinsics.areEqual(bool, bool2);
                        AndroidStringManager androidStringManager = this.stringManager;
                        String str27 = areEqual ? androidStringManager.get(R.string.activity_item_business_account) : null;
                        String str28 = Intrinsics.areEqual(CryptoObjectUtils.getUiCounterparty(formattedPaymentHistoryActivityItem).is_verified_account, bool2) ? androidStringManager.get(R.string.activity_item_verified_account) : null;
                        if (itemAccessory instanceof ItemAccessory.Amount) {
                            str3 = ((ItemAccessory.Amount) itemAccessory).text;
                        } else if (itemAccessory instanceof ItemAccessory.Button) {
                            str3 = ((ItemAccessory.Button) itemAccessory).text;
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str22, str24, str26, str27, str28, str3}), null, null, null, 0, null, null, 63);
                        gapComposer.updateRememberedValue(joinToString$default);
                        obj5 = joinToString$default;
                    }
                    str2 = (String) obj5;
                }
                gapComposer.end(false);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(new ActivityItemViewModel(str14, str16, str18, str20, itemAccessory, stackedAvatarViewModel, avatarBadge, booleanValue, this.presentationContext, icons3, reactionsState, str2, 4096), gapComposer);
                rememberedValue = gapComposer.rememberedValue();
                Object obj6 = rememberedValue;
                if (rememberedValue == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(createCompositionCoroutineScope);
                    obj6 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) rememberUpdatedState.getValue();
                changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(this) | gapComposer.changed(rememberUpdatedState);
                Object rememberedValue8 = gapComposer.rememberedValue();
                Object obj7 = rememberedValue8;
                if (!changedInstance || rememberedValue8 == neverEqualPolicy) {
                    UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0 = new UtilsKt$$ExternalSyntheticLambda0(15, coroutineScope, this, rememberUpdatedState);
                    gapComposer.updateRememberedValue(utilsKt$$ExternalSyntheticLambda0);
                    obj7 = utilsKt$$ExternalSyntheticLambda0;
                }
                UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) obj7, activityItemViewModel);
                gapComposer.end(false);
                return uiCallbackModel;
            }
            icons2 = Icons.AccountVerified16;
        }
        icons3 = icons2;
        if (formattedPaymentHistoryActivityItem instanceof OfflinePaymentActivityItem) {
        }
        String str142 = rowId;
        String str152 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
        if (str152 != null) {
        }
        String str172 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
        if (str172 != null) {
        }
        String str192 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
        if (str192 != null) {
        }
        changed = gapComposer.changed(formattedPaymentHistoryActivityItem);
        Object rememberedValue62 = gapComposer.rememberedValue();
        Object obj42 = rememberedValue62;
        if (!changed) {
        }
        StackedAvatarViewModel avatarViewModel2 = this.paymentHistoryAvatarFactory.getAvatarViewModel(formattedPaymentHistoryActivityItem);
        gapComposer.updateRememberedValue(avatarViewModel2);
        obj42 = avatarViewModel2;
        StackedAvatarViewModel stackedAvatarViewModel2 = (StackedAvatarViewModel) obj42;
        AvatarBadgeViewModel avatarBadge2 = PaymentHistoryAvatarFactory.getAvatarBadge(formattedPaymentHistoryActivityItem);
        boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
        ReactionsState reactionsState2 = (ReactionsState) mutableState3.getValue();
        gapComposer.startReplaceGroup(2018202594);
        str2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().accessibility_text;
        if (str2 == null) {
        }
        gapComposer.end(false);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(new ActivityItemViewModel(str142, str16, str18, str20, itemAccessory, stackedAvatarViewModel2, avatarBadge2, booleanValue2, this.presentationContext, icons3, reactionsState2, str2, 4096), gapComposer);
        rememberedValue = gapComposer.rememberedValue();
        Object obj62 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) obj62;
        ActivityItemViewModel activityItemViewModel2 = (ActivityItemViewModel) rememberUpdatedState2.getValue();
        changedInstance = gapComposer.changedInstance(coroutineScope2) | gapComposer.changed(this) | gapComposer.changed(rememberUpdatedState2);
        Object rememberedValue82 = gapComposer.rememberedValue();
        Object obj72 = rememberedValue82;
        if (!changedInstance) {
        }
        UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda02 = new UtilsKt$$ExternalSyntheticLambda0(15, coroutineScope2, this, rememberUpdatedState2);
        gapComposer.updateRememberedValue(utilsKt$$ExternalSyntheticLambda02);
        obj72 = utilsKt$$ExternalSyntheticLambda02;
        UiCallbackModel uiCallbackModel2 = new UiCallbackModel((Function1) obj72, activityItemViewModel2);
        gapComposer.end(false);
        return uiCallbackModel2;
    }
}
