package app.cash.trifle.protos.api.alpha;

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
public final class Certificate extends Message {
    public static final ProtoAdapter ADAPTER = new Certificate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Certificate.class), "type.googleapis.com/app.cash.trifle.api.alpha.Certificate", Syntax.PROTO_2, null, "app/cash/trifle/api/alpha/public.proto");
    public final ByteString certificate;
    public final Integer version;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ByteString certificate;
        public Integer version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Certificate(this.version, this.certificate, buildUnknownFields());
                default:
                    return new MobileCertificateRequest(this.version, this.certificate, buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Certificate(Integer num, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.version = num;
        this.certificate = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) obj;
        return Intrinsics.areEqual(unknownFields(), certificate.unknownFields()) && Intrinsics.areEqual(this.version, certificate.version) && Intrinsics.areEqual(this.certificate, certificate.certificate);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        ByteString byteString = this.certificate;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.version = this.version;
        builder.certificate = this.certificate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        ByteString byteString = this.certificate;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("certificate=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Certificate{", "}", 0, null, null, 56);
    }
}
