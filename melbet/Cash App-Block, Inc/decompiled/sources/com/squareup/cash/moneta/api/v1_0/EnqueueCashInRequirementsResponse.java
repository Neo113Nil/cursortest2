package com.squareup.cash.moneta.api.v1_0;

import android.os.Parcelable;
import com.google.mlkit.vision.text.zzc;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/moneta/api/v1_0/EnqueueCashInRequirementsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnqueueCashInRequirementsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EnqueueCashInRequirementsResponse> CREATOR;
    public final Status status;

    public enum Status implements WireEnum {
        SUCCESS(0),
        FAILURE(1);

        public static final EnqueueCashInRequirementsResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final zzc Companion;
        public final int value;

        static {
            Status status = SUCCESS;
            Companion = new zzc(28);
            ADAPTER = new EnqueueCashInRequirementsResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SUCCESS;
            }
            if (i != 1) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        EnqueueCashInRequirementsResponse$Companion$ADAPTER$1 enqueueCashInRequirementsResponse$Companion$ADAPTER$1 = new EnqueueCashInRequirementsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnqueueCashInRequirementsResponse.class), "type.googleapis.com/squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsResponse", Syntax.PROTO_2, null, "squareup/cash/moneta/api/v1_0/EnqueueCashInRequirements.proto");
        ADAPTER = enqueueCashInRequirementsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(enqueueCashInRequirementsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnqueueCashInRequirementsResponse(Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EnqueueCashInRequirementsResponse)) {
            return false;
        }
        EnqueueCashInRequirementsResponse enqueueCashInRequirementsResponse = (EnqueueCashInRequirementsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), enqueueCashInRequirementsResponse.unknownFields()) && this.status == enqueueCashInRequirementsResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = hashCode + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(9);
        builder.f1245type = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EnqueueCashInRequirementsResponse{", "}", 0, null, null, 56);
    }
}
