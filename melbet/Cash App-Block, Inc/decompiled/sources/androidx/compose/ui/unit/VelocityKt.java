package androidx.compose.ui.unit;

import app.cash.local.presenters.internal.CashBalanceKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.lending.PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute;
import com.squareup.lending.PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.Toggle;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class VelocityKt {
    public static final long Velocity(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PrepurchaseCashCardPlanningViewModel.LoadableButton createLoadableButton(String str, boolean z, PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent, PrepurchaseCashCardAppletData.UnknownContent unknownContent) {
        Toggle toggle;
        String str2;
        PrepurchaseCashCardPlanningViewModel.ButtonAction buttonAction;
        if (footerButtonContent == null) {
            if (unknownContent != null) {
                return PrepurchaseCashCardPlanningViewModel.LoadableButton.Loading.INSTANCE;
            }
            return null;
        }
        Boolean bool = footerButtonContent.should_action_dismiss_half_sheet;
        if (z) {
            return PrepurchaseCashCardPlanningViewModel.LoadableButton.Waiting.INSTANCE;
        }
        LocalizedString localizedString = footerButtonContent.text;
        localizedString.getClass();
        String str3 = localizedString.translated_value;
        str3.getClass();
        CashBalanceKt cashBalanceKt = footerButtonContent.action;
        if (cashBalanceKt != null) {
            PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle = cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle ? (PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) cashBalanceKt : null;
            if (prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle != null) {
                toggle = prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle.value;
                if (toggle == null) {
                    cashBalanceKt.getClass();
                    PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle2 = cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle ? (PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) cashBalanceKt : null;
                    Toggle toggle2 = prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle2 != null ? prepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle2.value : null;
                    toggle2.getClass();
                    buttonAction = new PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle(str, toggle2.opaque_request_data, Intrinsics.areEqual(bool, Boolean.TRUE));
                } else {
                    if (cashBalanceKt != null) {
                        PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute = cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute ? (PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) cashBalanceKt : null;
                        if (prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute != null) {
                            str2 = prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute.value;
                            if (str2 == null) {
                                cashBalanceKt.getClass();
                                PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute2 = cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute ? (PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) cashBalanceKt : null;
                                String str4 = prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute2 != null ? prepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute2.value : null;
                                str4.getClass();
                                buttonAction = new PrepurchaseCashCardPlanningViewModel.ButtonAction.ClientRoute(str4, Intrinsics.areEqual(bool, Boolean.TRUE));
                            } else {
                                buttonAction = PrepurchaseCashCardPlanningViewModel.ButtonAction.Dismiss.INSTANCE;
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
                return new PrepurchaseCashCardPlanningViewModel.LoadableButton.Loaded(str3, buttonAction);
            }
        }
        toggle = null;
        if (toggle == null) {
        }
        return new PrepurchaseCashCardPlanningViewModel.LoadableButton.Loaded(str3, buttonAction);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewBankingDetails.deepLinkSpecs;
    }
}
