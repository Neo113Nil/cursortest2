package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
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
public final class UnsupportedSpeedAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnsupportedSpeedAction> CREATOR;
    public final InstrumentType instrument_type_to_link;
    public final SupportedFlows supported_flow;
    public final String title;

    static {
        UnsupportedSpeedAction$Companion$ADAPTER$1 unsupportedSpeedAction$Companion$ADAPTER$1 = new UnsupportedSpeedAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnsupportedSpeedAction.class), "type.googleapis.com/squareup.cash.out.sync_entity.UnsupportedSpeedAction", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/InstrumentCapability.proto");
        ADAPTER = unsupportedSpeedAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unsupportedSpeedAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedSpeedAction(SupportedFlows supportedFlows, InstrumentType instrumentType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.supported_flow = supportedFlows;
        this.instrument_type_to_link = instrumentType;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnsupportedSpeedAction)) {
            return false;
        }
        UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
        return Intrinsics.areEqual(unknownFields(), unsupportedSpeedAction.unknownFields()) && this.supported_flow == unsupportedSpeedAction.supported_flow && this.instrument_type_to_link == unsupportedSpeedAction.instrument_type_to_link && Intrinsics.areEqual(this.title, unsupportedSpeedAction.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SupportedFlows supportedFlows = this.supported_flow;
        int hashCode2 = (hashCode + (supportedFlows != null ? supportedFlows.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.instrument_type_to_link;
        int hashCode3 = (hashCode2 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(26);
        builder.withdrawalType = this.supported_flow;
        builder.customer_supplied_amount = this.instrument_type_to_link;
        builder.customer_token = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SupportedFlows supportedFlows = this.supported_flow;
        if (supportedFlows != null) {
            arrayList.add("supported_flow=" + supportedFlows);
        }
        InstrumentType instrumentType = this.instrument_type_to_link;
        if (instrumentType != null) {
            arrayList.add("instrument_type_to_link=" + instrumentType);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnsupportedSpeedAction{", "}", 0, null, null, 56);
    }
}
