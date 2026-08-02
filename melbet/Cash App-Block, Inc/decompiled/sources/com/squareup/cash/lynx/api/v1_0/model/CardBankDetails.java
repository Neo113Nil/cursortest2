package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class CardBankDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardBankDetails> CREATOR;
    public final String name;
    public final String short_name;
    public final String tab_card_icon_url;
    public final String tab_detail_icon_url;
    public final String tab_selection_icon_url;

    static {
        CardBankDetails$Companion$ADAPTER$1 cardBankDetails$Companion$ADAPTER$1 = new CardBankDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardBankDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.CardBankDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/CardBankDetails.proto");
        ADAPTER = cardBankDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardBankDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBankDetails(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.short_name = str2;
        this.tab_card_icon_url = str3;
        this.tab_detail_icon_url = str4;
        this.tab_selection_icon_url = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardBankDetails)) {
            return false;
        }
        CardBankDetails cardBankDetails = (CardBankDetails) obj;
        return Intrinsics.areEqual(unknownFields(), cardBankDetails.unknownFields()) && Intrinsics.areEqual(this.name, cardBankDetails.name) && Intrinsics.areEqual(this.short_name, cardBankDetails.short_name) && Intrinsics.areEqual(this.tab_card_icon_url, cardBankDetails.tab_card_icon_url) && Intrinsics.areEqual(this.tab_detail_icon_url, cardBankDetails.tab_detail_icon_url) && Intrinsics.areEqual(this.tab_selection_icon_url, cardBankDetails.tab_selection_icon_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.short_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tab_card_icon_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.tab_detail_icon_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.tab_selection_icon_url;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(1);
        builder.client_route = this.name;
        builder.icon_id = this.short_name;
        builder.title = this.tab_card_icon_url;
        builder.subtitle = this.tab_detail_icon_url;
        builder.call_to_action = this.tab_selection_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.short_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "short_name=", arrayList);
        }
        String str3 = this.tab_card_icon_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tab_card_icon_url=", arrayList);
        }
        String str4 = this.tab_detail_icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "tab_detail_icon_url=", arrayList);
        }
        String str5 = this.tab_selection_icon_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "tab_selection_icon_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardBankDetails{", "}", 0, null, null, 56);
    }
}
