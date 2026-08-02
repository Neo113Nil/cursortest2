package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.binfo.api.PrepaidStatus;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.common.countries.Country;
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
public final class BinfoDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BinfoDetails> CREATOR;
    public final CardProduct card_product;
    public final String card_subcategory;
    public final Country country;
    public final String issuer_name;
    public final String normalized_issuer_name;
    public final PrepaidStatus prepaid_status;

    static {
        BinfoDetails$Companion$ADAPTER$1 binfoDetails$Companion$ADAPTER$1 = new BinfoDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BinfoDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BinfoDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = binfoDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(binfoDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinfoDetails(String str, Country country, String str2, PrepaidStatus prepaidStatus, String str3, CardProduct cardProduct, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.issuer_name = str;
        this.country = country;
        this.card_subcategory = str2;
        this.prepaid_status = prepaidStatus;
        this.normalized_issuer_name = str3;
        this.card_product = cardProduct;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BinfoDetails)) {
            return false;
        }
        BinfoDetails binfoDetails = (BinfoDetails) obj;
        return Intrinsics.areEqual(unknownFields(), binfoDetails.unknownFields()) && Intrinsics.areEqual(this.issuer_name, binfoDetails.issuer_name) && this.country == binfoDetails.country && Intrinsics.areEqual(this.card_subcategory, binfoDetails.card_subcategory) && this.prepaid_status == binfoDetails.prepaid_status && Intrinsics.areEqual(this.normalized_issuer_name, binfoDetails.normalized_issuer_name) && this.card_product == binfoDetails.card_product;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.issuer_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Country country = this.country;
        int hashCode3 = (hashCode2 + (country != null ? country.hashCode() : 0)) * 37;
        String str2 = this.card_subcategory;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        PrepaidStatus prepaidStatus = this.prepaid_status;
        int hashCode5 = (hashCode4 + (prepaidStatus != null ? prepaidStatus.hashCode() : 0)) * 37;
        String str3 = this.normalized_issuer_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        CardProduct cardProduct = this.card_product;
        int hashCode7 = hashCode6 + (cardProduct != null ? cardProduct.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(3, false);
        builder.description = this.issuer_name;
        builder.category = this.country;
        builder.field = this.card_subcategory;
        builder.code = this.prepaid_status;
        builder.retryable = this.normalized_issuer_name;
        builder.metadata = this.card_product;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.issuer_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "issuer_name=", arrayList);
        }
        Country country = this.country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
        }
        String str2 = this.card_subcategory;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "card_subcategory=", arrayList);
        }
        PrepaidStatus prepaidStatus = this.prepaid_status;
        if (prepaidStatus != null) {
            arrayList.add("prepaid_status=" + prepaidStatus);
        }
        String str3 = this.normalized_issuer_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "normalized_issuer_name=", arrayList);
        }
        CardProduct cardProduct = this.card_product;
        if (cardProduct != null) {
            arrayList.add("card_product=" + cardProduct);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BinfoDetails{", "}", 0, null, null, 56);
    }
}
