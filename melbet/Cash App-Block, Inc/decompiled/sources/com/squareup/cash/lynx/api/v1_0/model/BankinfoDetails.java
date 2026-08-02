package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto$DisplaySettings;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.common.countries.Country;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BankinfoDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankinfoDetails> CREATOR;
    public final String bank_token;
    public final CardDetailsProto$DisplaySettings card_display_settings;
    public final Country country;
    public final Bank$DisplaySettings display_settings;
    public final String name;
    public final List navigation_urls;
    public final String short_name;

    static {
        BankinfoDetails$Companion$ADAPTER$1 bankinfoDetails$Companion$ADAPTER$1 = new BankinfoDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BankinfoDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BankinfoDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = bankinfoDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bankinfoDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankinfoDetails(String str, String str2, Country country, Bank$DisplaySettings bank$DisplaySettings, String str3, List list, CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.short_name = str2;
        this.country = country;
        this.display_settings = bank$DisplaySettings;
        this.bank_token = str3;
        this.card_display_settings = cardDetailsProto$DisplaySettings;
        this.navigation_urls = TransactorKt.immutableCopyOf("navigation_urls", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankinfoDetails)) {
            return false;
        }
        BankinfoDetails bankinfoDetails = (BankinfoDetails) obj;
        return Intrinsics.areEqual(unknownFields(), bankinfoDetails.unknownFields()) && Intrinsics.areEqual(this.name, bankinfoDetails.name) && Intrinsics.areEqual(this.short_name, bankinfoDetails.short_name) && this.country == bankinfoDetails.country && Intrinsics.areEqual(this.display_settings, bankinfoDetails.display_settings) && Intrinsics.areEqual(this.bank_token, bankinfoDetails.bank_token) && Intrinsics.areEqual(this.navigation_urls, bankinfoDetails.navigation_urls) && Intrinsics.areEqual(this.card_display_settings, bankinfoDetails.card_display_settings);
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
        Country country = this.country;
        int hashCode4 = (hashCode3 + (country != null ? country.hashCode() : 0)) * 37;
        Bank$DisplaySettings bank$DisplaySettings = this.display_settings;
        int hashCode5 = (hashCode4 + (bank$DisplaySettings != null ? bank$DisplaySettings.hashCode() : 0)) * 37;
        String str3 = this.bank_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.navigation_urls);
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = this.card_display_settings;
        int hashCode6 = m + (cardDetailsProto$DisplaySettings != null ? cardDetailsProto$DisplaySettings.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(3, false);
        builder.customer_token = this.name;
        builder.alias_value = this.short_name;
        builder.alias_type = this.country;
        builder.updated_at = this.display_settings;
        builder.hashed_alias_token = this.bank_token;
        builder.linked_at = this.navigation_urls;
        builder.version = this.card_display_settings;
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
        Country country = this.country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
        }
        Bank$DisplaySettings bank$DisplaySettings = this.display_settings;
        if (bank$DisplaySettings != null) {
            arrayList.add("display_settings=" + bank$DisplaySettings);
        }
        String str3 = this.bank_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "bank_token=", arrayList);
        }
        List list = this.navigation_urls;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("navigation_urls=", arrayList, list);
        }
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = this.card_display_settings;
        if (cardDetailsProto$DisplaySettings != null) {
            arrayList.add("card_display_settings=" + cardDetailsProto$DisplaySettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankinfoDetails{", "}", 0, null, null, 56);
    }
}
