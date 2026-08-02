package com.squareup.cash.idv;

import android.os.Parcelable;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.cashcommercebrowser.api.v1.BlockedItem;
import com.squareup.cash.cryptonauts.api.GetCryptoControlsRequest;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLinkOwnerDetails;
import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsRequest;
import com.squareup.cash.mosaic.personalization.api.v2.GetEntityActivityItemResponse;
import com.squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlRequest;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleForTransactionRequest;
import com.squareup.cash.supportarticles.app.v1.RecommendSupportArticlesRequest;
import com.squareup.cash.supportarticles.app.v1.SearchSupportArticlesRequest;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentRequest;
import com.squareup.protos.cash.aegis.api.GetCustomLimitsRequest;
import com.squareup.protos.cash.aegis.client_routes.SendMoneyParams;
import com.squareup.protos.cash.agentcore.api.v1.AgentWalletInitiatePaymentResponse;
import com.squareup.protos.cash.agentcore.api.v1.GetAgentsRequest;
import com.squareup.protos.cash.api.PaginationResponseMetadata;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.sync_values.P2PAllowListCustomer;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyBatchResponse;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyResponse;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayOrderDocumentUrlRequest;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayOrderDocumentUrlResponse;
import com.squareup.protos.cash.cashapproxy.api.GetApOrderDetailsRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AttachmentIdentifier;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.MoneybotContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class DisplayName extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayName> CREATOR;
    public final String display_name;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String display_name;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DisplayName(this.display_name, buildUnknownFields());
                case 1:
                    return new ActionableButtonDefault.ClientRouteAction(this.display_name, buildUnknownFields());
                case 2:
                    return new BlockedItem(this.display_name, buildUnknownFields());
                case 3:
                    return new GetCryptoControlsRequest(this.display_name, buildUnknownFields());
                case 4:
                    return new InstrumentLinkOwnerDetails(this.display_name, buildUnknownFields());
                case 5:
                    return new EnqueueCashInRequirementsRequest(this.display_name, buildUnknownFields());
                case 6:
                    return new GetEntityActivityItemResponse(this.display_name, buildUnknownFields());
                case 7:
                    return new GetMusicStreamingUrlRequest(this.display_name, buildUnknownFields());
                case 8:
                    return new GetSupportArticleForTransactionRequest(this.display_name, buildUnknownFields());
                case 9:
                    return new RecommendSupportArticlesRequest(this.display_name, buildUnknownFields());
                case 10:
                    return new SearchSupportArticlesRequest(this.display_name, buildUnknownFields());
                case 11:
                    return new CashCreditScoreEntryPointData.Action(this.display_name, buildUnknownFields());
                case 12:
                    return new PrepurchaseCashCardAppletData.Locale(this.display_name, buildUnknownFields());
                case 13:
                    return new GetAllowlistLimitForDependentRequest(this.display_name, buildUnknownFields());
                case 14:
                    return new GetCustomLimitsRequest(this.display_name, buildUnknownFields());
                case 15:
                    return new SendMoneyParams(this.display_name, buildUnknownFields());
                case 16:
                    return new AgentWalletInitiatePaymentResponse(this.display_name, buildUnknownFields());
                case 17:
                    return new GetAgentsRequest(this.display_name, buildUnknownFields());
                case 18:
                    return new PaginationResponseMetadata(this.display_name, buildUnknownFields());
                case 19:
                    return new SavingsTransferContext.GoalFolder(this.display_name, buildUnknownFields());
                case 20:
                    return new BlocklistDetails(this.display_name, buildUnknownFields());
                case 21:
                    return new GetAllowlistForCustomerRequest(this.display_name, buildUnknownFields());
                case 22:
                    return new P2PAllowListCustomer(this.display_name, buildUnknownFields());
                case 23:
                    return new RecordCompletedJourneyBatchResponse(this.display_name, buildUnknownFields());
                case 24:
                    return new RecordCompletedJourneyResponse(this.display_name, buildUnknownFields());
                case 25:
                    return new GetAfterpayOrderDocumentUrlRequest(this.display_name, buildUnknownFields());
                case 26:
                    return new GetAfterpayOrderDocumentUrlResponse(this.display_name, buildUnknownFields());
                case 27:
                    return new GetApOrderDetailsRequest(this.display_name, buildUnknownFields());
                case 28:
                    return new AttachmentIdentifier(this.display_name, buildUnknownFields());
                default:
                    return new MoneybotContext(this.display_name, buildUnknownFields());
            }
        }
    }

    static {
        DisplayName$Companion$ADAPTER$1 displayName$Companion$ADAPTER$1 = new DisplayName$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayName.class), "type.googleapis.com/squareup.cash.idv.DisplayName", Syntax.PROTO_2, null, "squareup/cash/idv/DisplayName.proto");
        ADAPTER = displayName$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(displayName$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayName(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayName)) {
            return false;
        }
        DisplayName displayName = (DisplayName) obj;
        return Intrinsics.areEqual(unknownFields(), displayName.unknownFields()) && Intrinsics.areEqual(this.display_name, displayName.display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_name;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.display_name = this.display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.display_name != null) {
            arrayList.add("display_name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayName{", "}", 0, null, null, 56);
    }
}
