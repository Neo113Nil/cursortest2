package com.squareup.cash.data.blockers;

import android.util.JsonWriter;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability;
import com.squareup.cash.crypto.db.CryptoStatementQueries$forCategory$2;
import com.squareup.cash.crypto.db.CryptoStatementQueries$forToken$2;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.cash.db.profile.NotificationPreference;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.cryptocurrency.Wallet;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.protos.franklin.ui.UiAddress;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.protos.franklin.ui.UiNotificationPreference;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import squareup.cash.cryptocurrency.CryptocurrencyProfile;

/* loaded from: classes6.dex */
public final /* synthetic */ class FlowStarter$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FlowStarter$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        Object obj2;
        Object other;
        Automation.AutomationTarget automationTarget;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return blockersData;
            case 1:
                RecyclerView.Adapter adapter = (RecyclerView.Adapter) obj;
                adapter.getClass();
                return adapter.getClass().getCanonicalName() + ": " + adapter.getItemCount() + " items";
            case 2:
                RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) obj;
                adapter2.getClass();
                return adapter2.getClass().getCanonicalName() + ": " + adapter2.getItemCount() + " items";
            case 3:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 4:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 5:
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj;
                fullScreenLocation.getClass();
                return fullScreenLocation.stateKey;
            case 6:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
            case 7:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 9:
                return Integer.valueOf((int) (((Integer) obj).intValue() * 0.1f));
            case 10:
                return Integer.valueOf((int) (((Integer) obj).intValue() * 0.05f));
            case 11:
                SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
                sponsorshipCryptoAuthorization.getClass();
                Iterator it = sponsorshipCryptoAuthorization.feature_authorizations.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((SponsorshipCryptoAuthorization.FeatureAuthorization) next).feature == SponsorshipCryptoAuthorization.Feature.BTC_EXCHANGE) {
                            r11 = next;
                        }
                    }
                }
                SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) r11;
                if (featureAuthorization != null && (bool = featureAuthorization.is_authorized) != null) {
                    z = bool.booleanValue();
                }
                return Boolean.valueOf(z);
            case 12:
                CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
                cryptocurrencyProfile.getClass();
                return cryptocurrencyProfile.eligibilities;
            case 13:
                List list = (List) obj;
                list.getClass();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        Automation automation = ((UiInvestingAutomation) obj2).automation;
                        if ((automation != null ? automation.trigger : null) == Automation.AutomationTrigger.CASH_CARD_PURCHASE) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj2;
                if (uiInvestingAutomation == null) {
                    return BitcoinRoundUpsAvailability.Unavailable.INSTANCE;
                }
                Automation automation2 = uiInvestingAutomation.automation;
                if (((automation2 == null || (automationTarget = automation2.target) == null) ? null : automationTarget.f1279type) == Automation.AutomationTarget.Type.CRYPTOCURRENCY) {
                    other = new BitcoinRoundUpsAvailability.Available.Bitcoin((automation2 != null ? automation2.status : null) == Automation.AutomationStatus.ACTIVE);
                } else {
                    other = new BitcoinRoundUpsAvailability.Available.Other((automation2 != null ? automation2.status : null) == Automation.AutomationStatus.ACTIVE);
                }
                return other;
            case 14:
                Wallet wallet = (Wallet) obj;
                wallet.getClass();
                String str = wallet.address;
                if (str != null) {
                    return new CryptoAddress$BitcoinAddress(str);
                }
                return null;
            case 15:
                CryptoStatementQueries$forCategory$2 cryptoStatementQueries$forCategory$2 = CryptoStatementQueries$forCategory$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                Long l = androidCursor.getLong(3);
                l.getClass();
                String string3 = androidCursor.getString(4);
                string3.getClass();
                String string4 = androidCursor.getString(5);
                string4.getClass();
                return cryptoStatementQueries$forCategory$2.invoke(m1431m, string2, m, l, string3, string4);
            case 16:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("crypto_statement");
                return Unit.INSTANCE;
            case 17:
                CryptoStatementQueries$forToken$2 cryptoStatementQueries$forToken$2 = CryptoStatementQueries$forToken$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string5 = androidCursor2.getString(1);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string5, androidCursor2, 2);
                Long l2 = androidCursor2.getLong(3);
                l2.getClass();
                String string6 = androidCursor2.getString(4);
                string6.getClass();
                String string7 = androidCursor2.getString(5);
                string7.getClass();
                return cryptoStatementQueries$forToken$2.invoke(m1431m2, string5, m2, l2, string6, string7);
            case 18:
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                return BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.Bitcoin.INSTANCE, null, null, null, null, false, null, null, null, -1, 65407);
            case 19:
                BlockersData blockersData3 = (BlockersData) obj;
                blockersData3.getClass();
                return BlockersData.copy$default(blockersData3, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.Bitcoin.INSTANCE, null, null, null, null, false, null, null, null, -1, 65407);
            case 20:
                BlockersData blockersData4 = (BlockersData) obj;
                blockersData4.getClass();
                return BlockersData.copy$default(blockersData4, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.Bitcoin.INSTANCE, null, null, null, null, false, null, null, null, -1, 65407);
            case 21:
                BlockersData blockersData5 = (BlockersData) obj;
                blockersData5.getClass();
                return BlockersData.copy$default(blockersData5, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.CashGreen.INSTANCE, null, null, null, null, false, null, null, null, -1, 65407);
            case 22:
                BlockersData blockersData6 = (BlockersData) obj;
                blockersData6.getClass();
                return BlockersData.copy$default(blockersData6, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, new ColorModel.Accented(new Color(new Color.ModeVariant("#2775CA", null, null, null, null, 30, null), new Color.ModeVariant("#2775CA", null, null, null, null, 30, null), 4)), null, null, null, null, false, null, null, null, -1, 65407);
            case 23:
                Pair pair = (Pair) obj;
                pair.getClass();
                String str2 = (String) pair.first;
                C4bEligibilityState c4bEligibilityState = (C4bEligibilityState) pair.second;
                return str2 + ": " + (c4bEligibilityState != null ? c4bEligibilityState.is_eligible : null);
            case 24:
                View view = (View) obj;
                view.getClass();
                CharSequence contentDescription = view.getContentDescription();
                r11 = contentDescription != null ? contentDescription.toString() : null;
                return r11 == null ? "" : r11;
            case 25:
                SelectOptionResponse.Status status = ((SelectOptionResponse) ((ApiResult.Success) obj).response).status;
                if (status == null) {
                    status = ProtoDefaults.SELECT_OPTION_STATUS;
                }
                int ordinal = status.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return null;
                    }
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return new BlockerResponse.Error(status.name(), (String) null, 6);
            case 26:
                BlockersData blockersData7 = (BlockersData) obj;
                blockersData7.getClass();
                return BlockersData.copy$default(blockersData7, null, null, null, Flow$Type.INVEST_EQUITY_CUSTOMER_ONBOARDING, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535);
            case 27:
                JsonWriter jsonWriter = (JsonWriter) obj;
                jsonWriter.getClass();
                jsonWriter.nullValue();
                return Unit.INSTANCE;
            case 28:
                UiAddress uiAddress = (UiAddress) obj;
                uiAddress.getClass();
                return uiAddress.postal_address;
            default:
                UiNotificationPreference uiNotificationPreference = (UiNotificationPreference) obj;
                uiNotificationPreference.getClass();
                UiAlias uiAlias = uiNotificationPreference.alias;
                uiAlias.getClass();
                String str3 = uiAlias.canonical_text;
                str3.getClass();
                Boolean bool2 = uiNotificationPreference.enabled;
                bool2.getClass();
                boolean booleanValue = bool2.booleanValue();
                UiAlias.Type type2 = uiAlias.f1363type;
                type2.getClass();
                return new NotificationPreference(type2, str3, booleanValue);
        }
    }
}
