package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.FeeData;
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
public final class MinFeeStep extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MinFeeStep> CREATOR;
    public final Long lower_bound_amount_usd_cents;
    public final Long step_fee_bps;
    public final Long step_maximum_fee_cents;
    public final Long step_minimum_fee_cents;

    static {
        MinFeeStep$Companion$ADAPTER$1 minFeeStep$Companion$ADAPTER$1 = new MinFeeStep$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MinFeeStep.class), "type.googleapis.com/squareup.cash.out.sync_entity.MinFeeStep", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/CashOutFeeData.proto");
        ADAPTER = minFeeStep$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(minFeeStep$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinFeeStep(Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.lower_bound_amount_usd_cents = l;
        this.step_fee_bps = l2;
        this.step_minimum_fee_cents = l3;
        this.step_maximum_fee_cents = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinFeeStep)) {
            return false;
        }
        MinFeeStep minFeeStep = (MinFeeStep) obj;
        return Intrinsics.areEqual(unknownFields(), minFeeStep.unknownFields()) && Intrinsics.areEqual(this.lower_bound_amount_usd_cents, minFeeStep.lower_bound_amount_usd_cents) && Intrinsics.areEqual(this.step_fee_bps, minFeeStep.step_fee_bps) && Intrinsics.areEqual(this.step_minimum_fee_cents, minFeeStep.step_minimum_fee_cents) && Intrinsics.areEqual(this.step_maximum_fee_cents, minFeeStep.step_maximum_fee_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.lower_bound_amount_usd_cents;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.step_fee_bps;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.step_minimum_fee_cents;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.step_maximum_fee_cents;
        int hashCode5 = hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FeeData.Builder builder = new FeeData.Builder(1);
        builder.fee_bps = this.lower_bound_amount_usd_cents;
        builder.minimum_fee_cents = this.step_fee_bps;
        builder.fee_fixed_amount_cents = this.step_minimum_fee_cents;
        builder.maximum_fee_cents = this.step_maximum_fee_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.lower_bound_amount_usd_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("lower_bound_amount_usd_cents=", l, arrayList);
        }
        Long l2 = this.step_fee_bps;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("step_fee_bps=", l2, arrayList);
        }
        Long l3 = this.step_minimum_fee_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("step_minimum_fee_cents=", l3, arrayList);
        }
        Long l4 = this.step_maximum_fee_cents;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("step_maximum_fee_cents=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MinFeeStep{", "}", 0, null, null, 56);
    }
}
