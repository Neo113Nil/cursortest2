package com.squareup.cash.moneybot.genie.protos;

import androidx.compose.ui.text.input.TextFieldValueKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.Prominence;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.cash.aegis.core.PendingRequest;
import com.squareup.protos.cash.aegis.core.ViewRequestLink;
import com.squareup.protos.cash.aegis.sync_values.GraduationCta;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.blockly.api.BlocklyCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.common.BlockType;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigRequest;
import com.squareup.protos.cash.blockstable.api.v1.Asset;
import com.squareup.protos.cash.blockstable.api.v1.Chain;
import com.squareup.protos.cash.blockstable.api.v1.WalletAddress;
import com.squareup.protos.cash.btcmoongate.api.AutoWithdrawSettings;
import com.squareup.protos.cash.btcmoongate.api.WithdrawalSpeed;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightRow;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPayment;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentDetails;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import com.squareup.protos.cash.cashapproxy.api.Summary;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashapproxy.api.TextWithInfo;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.BusinessAccountSegment;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.EntryPointType;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.UpdateBusinessAccountTaxInfoFlowParameters;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateMobileListingPaymentResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentRequest;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.TransitionEffect$Fade;
import xyz.block.protos.genie.TransitionEffect$Instant;
import xyz.block.protos.genie.TransitionEffect$Scale;

/* loaded from: classes6.dex */
public final class Node extends Message {
    public static final ProtoAdapter ADAPTER = new Node$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Node.class), "type.googleapis.com/xyz.block.genie.v1.Node", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
    public final ComposePlatform compose_platform;
    public final ForEach for_each;
    public final Expression is_included;
    public final MoneybotScaffold moneybot_scaffold;
    public final Motion motion;

    public final class Motion extends Message {
        public static final ProtoAdapter ADAPTER = new Node$Motion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Motion.class), "type.googleapis.com/xyz.block.genie.v1.Node.Motion", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Transition enter;
        public final Transition exit;
        public final Expression motion_id;

        public final class Transition extends Message {
            public static final ProtoAdapter ADAPTER = new Node$Motion$Transition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Transition.class), "type.googleapis.com/xyz.block.genie.v1.Node.Motion.Transition", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Integer duration_ms;
            public final EasingCurve easing_curve;
            public final TransitionEffect$Fade fade;
            public final TransitionEffect$Instant instant;
            public final TransitionEffect$Scale scale;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Transition(TransitionEffect$Instant transitionEffect$Instant, TransitionEffect$Fade transitionEffect$Fade, TransitionEffect$Scale transitionEffect$Scale, Integer num, EasingCurve easingCurve, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.instant = transitionEffect$Instant;
                this.fade = transitionEffect$Fade;
                this.scale = transitionEffect$Scale;
                this.duration_ms = num;
                this.easing_curve = easingCurve;
                if ((transitionEffect$Instant != null ? 1 : 0) + (transitionEffect$Fade != null ? 1 : 0) + (transitionEffect$Scale != null ? 1 : 0) <= 1) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("At most one of instant, fade, scale may be non-null");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Transition)) {
                    return false;
                }
                Transition transition = (Transition) obj;
                return Intrinsics.areEqual(unknownFields(), transition.unknownFields()) && Intrinsics.areEqual(this.instant, transition.instant) && Intrinsics.areEqual(this.fade, transition.fade) && Intrinsics.areEqual(this.scale, transition.scale) && Intrinsics.areEqual(this.duration_ms, transition.duration_ms) && Intrinsics.areEqual(this.easing_curve, transition.easing_curve);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                int hashCode2 = (hashCode + (transitionEffect$Instant != null ? transitionEffect$Instant.hashCode() : 0)) * 37;
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                int hashCode3 = (hashCode2 + (transitionEffect$Fade != null ? transitionEffect$Fade.hashCode() : 0)) * 37;
                TransitionEffect$Scale transitionEffect$Scale = this.scale;
                int hashCode4 = (hashCode3 + (transitionEffect$Scale != null ? transitionEffect$Scale.hashCode() : 0)) * 37;
                Integer num = this.duration_ms;
                int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                EasingCurve easingCurve = this.easing_curve;
                int hashCode6 = hashCode5 + (easingCurve != null ? easingCurve.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(7);
                builder.for_each = this.instant;
                builder.moneybot_scaffold = this.fade;
                builder.compose_platform = this.scale;
                builder.is_included = this.duration_ms;
                builder.motion = this.easing_curve;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TransitionEffect$Instant transitionEffect$Instant = this.instant;
                if (transitionEffect$Instant != null) {
                    arrayList.add("instant=" + transitionEffect$Instant);
                }
                TransitionEffect$Fade transitionEffect$Fade = this.fade;
                if (transitionEffect$Fade != null) {
                    arrayList.add("fade=" + transitionEffect$Fade);
                }
                TransitionEffect$Scale transitionEffect$Scale = this.scale;
                if (transitionEffect$Scale != null) {
                    arrayList.add("scale=" + transitionEffect$Scale);
                }
                Integer num = this.duration_ms;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("duration_ms=", num, arrayList);
                }
                EasingCurve easingCurve = this.easing_curve;
                if (easingCurve != null) {
                    arrayList.add("easing_curve=" + easingCurve);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Transition{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Motion(Expression expression, Transition transition, Transition transition2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.motion_id = expression;
            this.enter = transition;
            this.exit = transition2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Motion)) {
                return false;
            }
            Motion motion = (Motion) obj;
            return Intrinsics.areEqual(unknownFields(), motion.unknownFields()) && Intrinsics.areEqual(this.motion_id, motion.motion_id) && Intrinsics.areEqual(this.enter, motion.enter) && Intrinsics.areEqual(this.exit, motion.exit);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Expression expression = this.motion_id;
            int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
            Transition transition = this.enter;
            int hashCode3 = (hashCode2 + (transition != null ? transition.hashCode() : 0)) * 37;
            Transition transition2 = this.exit;
            int hashCode4 = hashCode3 + (transition2 != null ? transition2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(21);
            builder.withdrawalType = this.motion_id;
            builder.customer_supplied_amount = this.enter;
            builder.customer_token = this.exit;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Expression expression = this.motion_id;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("motion_id=", expression, arrayList);
            }
            Transition transition = this.enter;
            if (transition != null) {
                arrayList.add("enter=" + transition);
            }
            Transition transition2 = this.exit;
            if (transition2 != null) {
                arrayList.add("exit=" + transition2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Motion{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Node(ForEach forEach, MoneybotScaffold moneybotScaffold, ComposePlatform composePlatform, Expression expression, Motion motion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.for_each = forEach;
        this.moneybot_scaffold = moneybotScaffold;
        this.compose_platform = composePlatform;
        this.is_included = expression;
        this.motion = motion;
        if ((forEach != null ? 1 : 0) + (moneybotScaffold != null ? 1 : 0) + (composePlatform != null ? 1 : 0) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of for_each, moneybot_scaffold, compose_platform may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        Node node = (Node) obj;
        return Intrinsics.areEqual(unknownFields(), node.unknownFields()) && Intrinsics.areEqual(this.for_each, node.for_each) && Intrinsics.areEqual(this.moneybot_scaffold, node.moneybot_scaffold) && Intrinsics.areEqual(this.compose_platform, node.compose_platform) && Intrinsics.areEqual(this.is_included, node.is_included) && Intrinsics.areEqual(this.motion, node.motion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ForEach forEach = this.for_each;
        int hashCode2 = (hashCode + (forEach != null ? forEach.hashCode() : 0)) * 37;
        MoneybotScaffold moneybotScaffold = this.moneybot_scaffold;
        int hashCode3 = (hashCode2 + (moneybotScaffold != null ? moneybotScaffold.hashCode() : 0)) * 37;
        ComposePlatform composePlatform = this.compose_platform;
        int hashCode4 = (hashCode3 + (composePlatform != null ? composePlatform.hashCode() : 0)) * 37;
        Expression expression = this.is_included;
        int hashCode5 = (hashCode4 + (expression != null ? expression.hashCode() : 0)) * 37;
        Motion motion = this.motion;
        int hashCode6 = hashCode5 + (motion != null ? motion.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.for_each = this.for_each;
        builder.moneybot_scaffold = this.moneybot_scaffold;
        builder.compose_platform = this.compose_platform;
        builder.is_included = this.is_included;
        builder.motion = this.motion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ForEach forEach = this.for_each;
        if (forEach != null) {
            arrayList.add("for_each=" + forEach);
        }
        MoneybotScaffold moneybotScaffold = this.moneybot_scaffold;
        if (moneybotScaffold != null) {
            arrayList.add("moneybot_scaffold=" + moneybotScaffold);
        }
        ComposePlatform composePlatform = this.compose_platform;
        if (composePlatform != null) {
            arrayList.add("compose_platform=" + composePlatform);
        }
        Expression expression = this.is_included;
        if (expression != null) {
            Matcher$$ExternalSyntheticOutline0.m("is_included=", expression, arrayList);
        }
        Motion motion = this.motion;
        if (motion != null) {
            arrayList.add("motion=" + motion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Node{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object compose_platform;
        public Object for_each;
        public Object is_included;
        public Object moneybot_scaffold;
        public Object motion;

        public Builder() {
            this.$r8$classId = 13;
            this.moneybot_scaffold = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Node((ForEach) this.for_each, (MoneybotScaffold) this.moneybot_scaffold, (ComposePlatform) this.compose_platform, (Expression) this.is_included, (Motion) this.motion, buildUnknownFields());
                case 1:
                    return new BenefitsHub.Insights.Insight((String) this.for_each, (String) this.moneybot_scaffold, (Color) this.compose_platform, (Prominence) this.is_included, (BenefitsHub.Insights.Insight.Tooltip) this.motion, buildUnknownFields());
                case 2:
                    return new MobilePlanHome.ActiveHeader((String) this.for_each, (String) this.moneybot_scaffold, (MobilePlanHome.CtaStyle) this.compose_platform, (String) this.is_included, (MobilePlanHome.Action) this.motion, buildUnknownFields());
                case 3:
                    return new MobilePlanHome.InactiveHeader((UiAvatar) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (String) this.is_included, (String) this.motion, buildUnknownFields());
                case 4:
                    return new MobilePlanHome.InfoCard((String) this.for_each, (String) this.moneybot_scaffold, (TextFieldValueKt) this.compose_platform, (MobilePlanHome.InfoCard.ProgressBarColor) this.is_included, (String) this.motion, buildUnknownFields());
                case 5:
                    return new ComposePlatform.Modifier.Padding((Expression) this.is_included, (Expression) this.for_each, (Expression) this.moneybot_scaffold, (Expression) this.compose_platform, (Expression) this.motion, buildUnknownFields());
                case 6:
                    return new MoneybotScaffold.Answer((MoneybotScaffold.Answer.DirectAnswer) this.for_each, (MoneybotScaffold.Answer.FallbackTitle) this.moneybot_scaffold, (MoneybotScaffold.Answer.StatusExplanation) this.compose_platform, (MoneybotScaffold.Answer.Decision) this.is_included, (MoneybotScaffold.Answer.Scenario) this.motion, buildUnknownFields());
                case 7:
                    return new Motion.Transition((TransitionEffect$Instant) this.for_each, (TransitionEffect$Fade) this.moneybot_scaffold, (TransitionEffect$Scale) this.compose_platform, (Integer) this.is_included, (EasingCurve) this.motion, buildUnknownFields());
                case 8:
                    return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry((InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) this.for_each, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) this.moneybot_scaffold, (String) this.compose_platform, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) this.is_included, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction) this.motion, buildUnknownFields());
                case 9:
                    return new CashCreditScoreEntryPointData.InstalledState((LocalizedString) this.for_each, (CashCreditScoreEntryPointData.InstalledState.Subtitle) this.moneybot_scaffold, (Integer) this.compose_platform, (Integer) this.is_included, (CashCreditScoreEntryPointData.InstalledState.Graph) this.motion, buildUnknownFields());
                case 10:
                    return new CashCreditScoreHomeData((List) this.for_each, (CashCreditScoreHomeData.TitleBar) this.moneybot_scaffold, (CashCreditScoreHomeData.ScoreSummary) this.compose_platform, (List) this.is_included, (CashCreditScoreHomeData.DisclaimerSection) this.motion, buildUnknownFields());
                case 11:
                    return new CashCreditScoreHomeData.RecommendationOverlayData((CashCreditScoreHomeData.Graphic) this.for_each, (LocalizedString) this.moneybot_scaffold, (LocalizedString) this.compose_platform, (LocalizedString) this.is_included, (CashCreditScoreHomeData.Action) this.motion, buildUnknownFields());
                case 12:
                    return new CashCreditScoreHomeData.Visualization.ScoreLock((Float) this.for_each, (LocalizedString) this.moneybot_scaffold, (Boolean) this.compose_platform, (Image) this.is_included, (LocalizedString) this.motion, buildUnknownFields());
                case 13:
                    return new SelectDependentsRequest((RequestContext) this.for_each, (List) this.moneybot_scaffold, (SelectDependentsRequest.Action) this.compose_platform, (String) this.is_included, (Boolean) this.motion, buildUnknownFields());
                case 14:
                    return new SelectDependentsRequest.SelectedDependent((UiCustomer) this.for_each, (Boolean) this.moneybot_scaffold, (Boolean) this.compose_platform, (String) this.is_included, (Boolean) this.motion, buildUnknownFields());
                case 15:
                    return new PendingRequest((String) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (ViewRequestLink) this.is_included, (String) this.motion, buildUnknownFields());
                case 16:
                    return new Sponsor((String) this.for_each, (SponsorshipState) this.moneybot_scaffold, (LinkText) this.compose_platform, (Long) this.is_included, (GraduationCta) this.motion, buildUnknownFields());
                case 17:
                    return new BlocklyCustomer((Boolean) this.for_each, (BlocklyCustomerMetadata) this.moneybot_scaffold, (String) this.compose_platform, (String) this.is_included, (BlockType) this.motion, buildUnknownFields());
                case 18:
                    return new GetCardBlockedBusinessesUIConfigRequest((String) this.for_each, (String) this.moneybot_scaffold, (RequestContext) this.compose_platform, (String) this.is_included, (GetCardBlockedBusinessesUIConfigRequest.RequestSource) this.motion, buildUnknownFields());
                case 19:
                    return new WalletAddress((String) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (Chain) this.is_included, (Asset) this.motion, buildUnknownFields());
                case 20:
                    return new AutoWithdrawSettings((Long) this.for_each, (Long) this.moneybot_scaffold, (String) this.compose_platform, (Boolean) this.is_included, (WithdrawalSpeed) this.motion, buildUnknownFields());
                case 21:
                    return new CardSpendingInsightRow((CardSpendingInsightRow.RowImage) this.for_each, (LocalizedString) this.moneybot_scaffold, (String) this.compose_platform, (CdfEvent) this.is_included, (LocalizedString) this.motion, buildUnknownFields());
                case 22:
                    return new ScheduledPayment((Text) this.for_each, (Text) this.moneybot_scaffold, (Money) this.compose_platform, (ScheduledPaymentStatus) this.is_included, (ScheduledPaymentDetails) this.motion, buildUnknownFields());
                case 23:
                    return new Summary((Text) this.for_each, (TextWithInfo) this.moneybot_scaffold, (Text) this.compose_platform, (TextWithInfo) this.is_included, (InfoTile) this.motion, buildUnknownFields());
                case 24:
                    return new EarningsTrackerSummary.Earnings((Money) this.for_each, (String) this.moneybot_scaffold, (Integer) this.compose_platform, (Integer) this.is_included, (List) this.motion, buildUnknownFields());
                case 25:
                    return new KybEligibilityWarning.BannerDetail((KybEligibilityWarning.RestrictedFeature) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (KybEligibilityWarning.Action) this.is_included, (String) this.motion, buildUnknownFields());
                case 26:
                    return new KybEligibilityWarning((List) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (KybEligibilityWarning.Action) this.is_included, (List) this.motion, buildUnknownFields());
                case 27:
                    return new UpdateBusinessAccountTaxInfoFlowParameters((EntryPointType) this.for_each, (BusinessAccountSegment) this.moneybot_scaffold, (String) this.compose_platform, (UpdateBusinessAccountTaxInfoFlowParameters.EntryPoint) this.is_included, (Boolean) this.motion, buildUnknownFields());
                case 28:
                    return new CreateMobileListingPaymentResponse((CreateMobileListingPaymentResponse.Result) this.for_each, (String) this.moneybot_scaffold, (String) this.compose_platform, (LocalizedString) this.is_included, (LocalizedString) this.motion, buildUnknownFields());
                default:
                    return new CreatePaymentRequest((zztw) this.for_each, (String) this.moneybot_scaffold, (Money) this.compose_platform, (String) this.is_included, (SignedSerializedMRIContext) this.motion, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
