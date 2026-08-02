package app.cash.trifle.protos.api.alpha;

import app.cash.trifle.protos.api.alpha.Certificate;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class MobileCertificateRequest extends Message {
    public static final ProtoAdapter ADAPTER = new MobileCertificateRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MobileCertificateRequest.class), "type.googleapis.com/app.cash.trifle.api.alpha.MobileCertificateRequest", Syntax.PROTO_2, null, "app/cash/trifle/api/alpha/public.proto");
    public final ByteString pkcs10_request;
    public final Integer version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileCertificateRequest(Integer num, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.version = num;
        this.pkcs10_request = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MobileCertificateRequest)) {
            return false;
        }
        MobileCertificateRequest mobileCertificateRequest = (MobileCertificateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), mobileCertificateRequest.unknownFields()) && Intrinsics.areEqual(this.version, mobileCertificateRequest.version) && Intrinsics.areEqual(this.pkcs10_request, mobileCertificateRequest.pkcs10_request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        ByteString byteString = this.pkcs10_request;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Certificate.Builder builder = new Certificate.Builder(1);
        builder.version = this.version;
        builder.certificate = this.pkcs10_request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        ByteString byteString = this.pkcs10_request;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("pkcs10_request=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MobileCertificateRequest{", "}", 0, null, null, 56);
    }
}
