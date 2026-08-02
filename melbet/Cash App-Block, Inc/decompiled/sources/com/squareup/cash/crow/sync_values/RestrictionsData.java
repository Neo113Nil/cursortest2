package com.squareup.cash.crow.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
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
public final class RestrictionsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RestrictionsData> CREATOR;
    public final String restricted_usd_svb_token;
    public final Long sum_of_usd_restrictions_amount_cents;

    static {
        RestrictionsData$Companion$ADAPTER$1 restrictionsData$Companion$ADAPTER$1 = new RestrictionsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RestrictionsData.class), "type.googleapis.com/squareup.cash.crow.sync_values.RestrictionsData", Syntax.PROTO_2, null, "squareup/cash/crow/sync_values/restrictions_data.proto");
        ADAPTER = restrictionsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(restrictionsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionsData(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.restricted_usd_svb_token = str;
        this.sum_of_usd_restrictions_amount_cents = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RestrictionsData)) {
            return false;
        }
        RestrictionsData restrictionsData = (RestrictionsData) obj;
        return Intrinsics.areEqual(unknownFields(), restrictionsData.unknownFields()) && Intrinsics.areEqual(this.restricted_usd_svb_token, restrictionsData.restricted_usd_svb_token) && Intrinsics.areEqual(this.sum_of_usd_restrictions_amount_cents, restrictionsData.sum_of_usd_restrictions_amount_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.restricted_usd_svb_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.sum_of_usd_restrictions_amount_cents;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Pagination.Builder builder = new Pagination.Builder(1);
        builder.offset = this.restricted_usd_svb_token;
        builder.limit = this.sum_of_usd_restrictions_amount_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.restricted_usd_svb_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "restricted_usd_svb_token=", arrayList);
        }
        Long l = this.sum_of_usd_restrictions_amount_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sum_of_usd_restrictions_amount_cents=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RestrictionsData{", "}", 0, null, null, 56);
    }
}
