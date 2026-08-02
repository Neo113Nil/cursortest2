package com.squareup.cash.cashlynxflow.plasma.v3;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
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
public final class LinkBankAccountSubflow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkBankAccountSubflow> CREATOR;
    public final ByteString subflow_data_parameters;
    public final String subflow_type;

    static {
        LinkBankAccountSubflow$Companion$ADAPTER$1 linkBankAccountSubflow$Companion$ADAPTER$1 = new LinkBankAccountSubflow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkBankAccountSubflow.class), "type.googleapis.com/squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountSubflow", Syntax.PROTO_2, null, "squareup/cash/cashlynxflow/plasma/v3/link_bank_account_flow_parameters.proto");
        ADAPTER = linkBankAccountSubflow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkBankAccountSubflow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBankAccountSubflow(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.subflow_type = str;
        this.subflow_data_parameters = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkBankAccountSubflow)) {
            return false;
        }
        LinkBankAccountSubflow linkBankAccountSubflow = (LinkBankAccountSubflow) obj;
        return Intrinsics.areEqual(unknownFields(), linkBankAccountSubflow.unknownFields()) && Intrinsics.areEqual(this.subflow_type, linkBankAccountSubflow.subflow_type) && Intrinsics.areEqual(this.subflow_data_parameters, linkBankAccountSubflow.subflow_data_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.subflow_type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.subflow_data_parameters;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EncryptedCardData.Builder builder = new EncryptedCardData.Builder(1);
        builder.encrypted_ephemeral_key = this.subflow_type;
        builder.encrypted_card_info = this.subflow_data_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.subflow_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subflow_type=", arrayList);
        }
        ByteString byteString = this.subflow_data_parameters;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("subflow_data_parameters=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkBankAccountSubflow{", "}", 0, null, null, 56);
    }

    public /* synthetic */ LinkBankAccountSubflow(int i, String str, ByteString byteString) {
        this(str, (i & 2) != 0 ? null : byteString, ByteString.EMPTY);
    }
}
