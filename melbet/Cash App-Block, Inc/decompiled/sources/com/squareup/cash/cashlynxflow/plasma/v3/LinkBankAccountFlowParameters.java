package com.squareup.cash.cashlynxflow.plasma.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
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
public final class LinkBankAccountFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkBankAccountFlowParameters> CREATOR;
    public final List supported_subflows;

    static {
        LinkBankAccountFlowParameters$Companion$ADAPTER$1 linkBankAccountFlowParameters$Companion$ADAPTER$1 = new LinkBankAccountFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkBankAccountFlowParameters.class), "type.googleapis.com/squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashlynxflow/plasma/v3/link_bank_account_flow_parameters.proto");
        ADAPTER = linkBankAccountFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkBankAccountFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBankAccountFlowParameters(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.supported_subflows = TransactorKt.immutableCopyOf("supported_subflows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkBankAccountFlowParameters)) {
            return false;
        }
        LinkBankAccountFlowParameters linkBankAccountFlowParameters = (LinkBankAccountFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), linkBankAccountFlowParameters.unknownFields()) && Intrinsics.areEqual(this.supported_subflows, linkBankAccountFlowParameters.supported_subflows);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.supported_subflows.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(5, false);
        builder.colors = this.supported_subflows;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.supported_subflows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_subflows=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkBankAccountFlowParameters{", "}", 0, null, null, 56);
    }

    public LinkBankAccountFlowParameters(List list) {
        this(list, ByteString.EMPTY);
    }
}
