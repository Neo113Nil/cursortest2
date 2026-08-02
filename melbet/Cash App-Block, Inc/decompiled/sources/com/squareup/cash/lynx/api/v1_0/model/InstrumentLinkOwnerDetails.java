package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.idv.DisplayName;
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
public final class InstrumentLinkOwnerDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLinkOwnerDetails> CREATOR;
    public final String cardholder_full_name;

    static {
        InstrumentLinkOwnerDetails$Companion$ADAPTER$1 instrumentLinkOwnerDetails$Companion$ADAPTER$1 = new InstrumentLinkOwnerDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLinkOwnerDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.InstrumentLinkOwnerDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/InstrumentLinkOwnerDetails.proto");
        ADAPTER = instrumentLinkOwnerDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentLinkOwnerDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLinkOwnerDetails(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cardholder_full_name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkOwnerDetails)) {
            return false;
        }
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = (InstrumentLinkOwnerDetails) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLinkOwnerDetails.unknownFields()) && Intrinsics.areEqual(this.cardholder_full_name, instrumentLinkOwnerDetails.cardholder_full_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cardholder_full_name;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(4);
        builder.display_name = this.cardholder_full_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cardholder_full_name != null) {
            arrayList.add("cardholder_full_name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLinkOwnerDetails{", "}", 0, null, null, 56);
    }
}
