package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class InstrumentCapability extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentCapability> CREATOR;
    public final InstrumentType instrument_type;
    public final List qualified_capabilities;

    static {
        InstrumentCapability$Companion$ADAPTER$1 instrumentCapability$Companion$ADAPTER$1 = new InstrumentCapability$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentCapability.class), "type.googleapis.com/squareup.cash.out.sync_entity.InstrumentCapability", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/InstrumentCapability.proto");
        ADAPTER = instrumentCapability$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentCapability$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentCapability(InstrumentType instrumentType, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.instrument_type = instrumentType;
        this.qualified_capabilities = TransactorKt.immutableCopyOf("qualified_capabilities", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentCapability)) {
            return false;
        }
        InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentCapability.unknownFields()) && this.instrument_type == instrumentCapability.instrument_type && Intrinsics.areEqual(this.qualified_capabilities, instrumentCapability.qualified_capabilities);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode2 = this.qualified_capabilities.hashCode() + ((hashCode + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(23);
        builder.customer_token = this.instrument_type;
        builder.sponsorship_tier = this.qualified_capabilities;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        List list = this.qualified_capabilities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("qualified_capabilities=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentCapability{", "}", 0, null, null, 56);
    }
}
