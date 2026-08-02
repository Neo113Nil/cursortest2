package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import com.google.mlkit.vision.text.zzd;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/cryptonauts/api/SetBtcP2pConversionBpsV2Response;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetBtcP2pConversionBpsV2Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetBtcP2pConversionBpsV2Response> CREATOR;
    public final Status status;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        SUCCESS(1),
        FAILED(2);

        public static final SetBtcP2pConversionBpsV2Response$Status$Companion$ADAPTER$1 ADAPTER;
        public static final zzd Companion;
        public final int value;

        static {
            Status status = UNKNOWN;
            Companion = new zzd(23);
            ADAPTER = new SetBtcP2pConversionBpsV2Response$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_3, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAILED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetBtcP2pConversionBpsV2Response$Companion$ADAPTER$1 setBtcP2pConversionBpsV2Response$Companion$ADAPTER$1 = new SetBtcP2pConversionBpsV2Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetBtcP2pConversionBpsV2Response.class), "type.googleapis.com/squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response", Syntax.PROTO_3, null, "squareup/cash/cryptonauts/api/api.proto");
        ADAPTER = setBtcP2pConversionBpsV2Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setBtcP2pConversionBpsV2Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetBtcP2pConversionBpsV2Response(Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        status.getClass();
        byteString.getClass();
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetBtcP2pConversionBpsV2Response)) {
            return false;
        }
        SetBtcP2pConversionBpsV2Response setBtcP2pConversionBpsV2Response = (SetBtcP2pConversionBpsV2Response) obj;
        return Intrinsics.areEqual(unknownFields(), setBtcP2pConversionBpsV2Response.unknownFields()) && this.status == setBtcP2pConversionBpsV2Response.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.status.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(6);
        zzd zzdVar = Status.Companion;
        builder.f1245type = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetBtcP2pConversionBpsV2Response{", "}", 0, null, null, 56);
    }
}
