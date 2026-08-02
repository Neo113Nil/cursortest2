package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHubResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetBankingBenefitsHubResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBankingBenefitsHubResponse> CREATOR;
    public final BenefitsHub benefits_hub;

    static {
        GetBankingBenefitsHubResponse$Companion$ADAPTER$1 getBankingBenefitsHubResponse$Companion$ADAPTER$1 = new GetBankingBenefitsHubResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBankingBenefitsHubResponse.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubResponse", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
        ADAPTER = getBankingBenefitsHubResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsHubResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBankingBenefitsHubResponse(BenefitsHub benefitsHub, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.benefits_hub = benefitsHub;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBankingBenefitsHubResponse)) {
            return false;
        }
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse = (GetBankingBenefitsHubResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBankingBenefitsHubResponse.unknownFields()) && Intrinsics.areEqual(this.benefits_hub, getBankingBenefitsHubResponse.benefits_hub);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BenefitsHub benefitsHub = this.benefits_hub;
        int hashCode2 = hashCode + (benefitsHub != null ? benefitsHub.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(2);
        builder.f1245type = this.benefits_hub;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BenefitsHub benefitsHub = this.benefits_hub;
        if (benefitsHub != null) {
            arrayList.add("benefits_hub=" + benefitsHub);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBankingBenefitsHubResponse{", "}", 0, null, null, 56);
    }
}
