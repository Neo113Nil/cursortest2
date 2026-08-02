package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusResponse;
import com.squareup.protos.cash.local.client.v1.GetSuggestedReordersResponse;
import com.squareup.protos.cash.marketprices.service.GetCurrentPricesResponse;
import com.squareup.protos.cash.weaver.api.GetRecommendationsResponse;
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

/* loaded from: classes7.dex */
public final class CashOutFeeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashOutFeeData> CREATOR;
    public final List min_fee_steps;
    public final Long version;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List min_fee_steps;
        public Long version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CashOutFeeData(this.version, this.min_fee_steps, buildUnknownFields());
                case 1:
                    return new BatchGetLocationStatusResponse(this.version, this.min_fee_steps, buildUnknownFields());
                case 2:
                    return new GetSuggestedReordersResponse.SuggestedReorders(this.version, this.min_fee_steps, buildUnknownFields());
                case 3:
                    return new GetCurrentPricesResponse(this.version, this.min_fee_steps, buildUnknownFields());
                default:
                    return new GetRecommendationsResponse(this.version, this.min_fee_steps, buildUnknownFields());
            }
        }
    }

    static {
        CashOutFeeData$Companion$ADAPTER$1 cashOutFeeData$Companion$ADAPTER$1 = new CashOutFeeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashOutFeeData.class), "type.googleapis.com/squareup.cash.out.sync_entity.CashOutFeeData", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/CashOutFeeData.proto");
        ADAPTER = cashOutFeeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashOutFeeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOutFeeData(Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.version = l;
        this.min_fee_steps = TransactorKt.immutableCopyOf("min_fee_steps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashOutFeeData)) {
            return false;
        }
        CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
        return Intrinsics.areEqual(unknownFields(), cashOutFeeData.unknownFields()) && Intrinsics.areEqual(this.version, cashOutFeeData.version) && Intrinsics.areEqual(this.min_fee_steps, cashOutFeeData.min_fee_steps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.version;
        int hashCode2 = this.min_fee_steps.hashCode() + ((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.version = this.version;
        builder.min_fee_steps = this.min_fee_steps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        List list = this.min_fee_steps;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("min_fee_steps=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashOutFeeData{", "}", 0, null, null, 56);
    }
}
