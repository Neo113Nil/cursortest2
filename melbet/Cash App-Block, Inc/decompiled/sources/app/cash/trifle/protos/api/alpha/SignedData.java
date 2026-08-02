package app.cash.trifle.protos.api.alpha;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.hieroglyph.ClientPublicKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class SignedData extends Message {
    public static final ProtoAdapter ADAPTER = new SignedData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SignedData.class), "type.googleapis.com/app.cash.trifle.api.alpha.SignedData", Syntax.PROTO_2, null, "app/cash/trifle/api/alpha/public.proto");
    public final List certificates;
    public final ByteString enveloped_data;
    public final ByteString signature;

    public enum Algorithm implements WireEnum {
        DO_NOT_USE(0),
        ECDSA_SHA256(1),
        ED25519(2);

        public final int value;
        public static final SignedData$Algorithm$Companion$ADAPTER$1 ADAPTER = new SignedData$Algorithm$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Algorithm.class), Syntax.PROTO_2, DO_NOT_USE);

        Algorithm(int i) {
            this.value = i;
        }

        public static final Algorithm fromValue(int i) {
            if (i == 0) {
                return DO_NOT_USE;
            }
            if (i == 1) {
                return ECDSA_SHA256;
            }
            if (i != 2) {
                return null;
            }
            return ED25519;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class EnvelopedData extends Message {
        public static final ProtoAdapter ADAPTER = new SignedData$EnvelopedData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnvelopedData.class), "type.googleapis.com/app.cash.trifle.api.alpha.SignedData.EnvelopedData", Syntax.PROTO_2, null, "app/cash/trifle/api/alpha/public.proto");
        public final ByteString data_;
        public final Algorithm signing_algorithm;
        public final Integer version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnvelopedData(Integer num, Algorithm algorithm, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.version = num;
            this.signing_algorithm = algorithm;
            this.data_ = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnvelopedData)) {
                return false;
            }
            EnvelopedData envelopedData = (EnvelopedData) obj;
            return Intrinsics.areEqual(unknownFields(), envelopedData.unknownFields()) && Intrinsics.areEqual(this.version, envelopedData.version) && this.signing_algorithm == envelopedData.signing_algorithm && Intrinsics.areEqual(this.data_, envelopedData.data_);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.version;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Algorithm algorithm = this.signing_algorithm;
            int hashCode3 = (hashCode2 + (algorithm != null ? algorithm.hashCode() : 0)) * 37;
            ByteString byteString = this.data_;
            int hashCode4 = hashCode3 + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(1);
            builder.withdrawalType = this.version;
            builder.customer_supplied_amount = this.signing_algorithm;
            builder.customer_token = this.data_;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.version;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
            }
            Algorithm algorithm = this.signing_algorithm;
            if (algorithm != null) {
                arrayList.add("signing_algorithm=" + algorithm);
            }
            ByteString byteString = this.data_;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("data_=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EnvelopedData{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedData(List list, ByteString byteString, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        list.getClass();
        byteString3.getClass();
        this.enveloped_data = byteString;
        this.signature = byteString2;
        this.certificates = TransactorKt.immutableCopyOf("certificates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignedData)) {
            return false;
        }
        SignedData signedData = (SignedData) obj;
        return Intrinsics.areEqual(unknownFields(), signedData.unknownFields()) && Intrinsics.areEqual(this.enveloped_data, signedData.enveloped_data) && Intrinsics.areEqual(this.signature, signedData.signature) && Intrinsics.areEqual(this.certificates, signedData.certificates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.enveloped_data;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.signature;
        int hashCode3 = this.certificates.hashCode() + ((hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.enveloped_data = this.enveloped_data;
        builder.signature = this.signature;
        builder.certificates = this.certificates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.enveloped_data;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("enveloped_data=", byteString, arrayList);
        }
        ByteString byteString2 = this.signature;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signature=", byteString2, arrayList);
        }
        List list = this.certificates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("certificates=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignedData{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List certificates;
        public ByteString enveloped_data;
        public ByteString signature;

        public Builder() {
            this.$r8$classId = 2;
            this.certificates = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SignedData(this.certificates, this.enveloped_data, this.signature, buildUnknownFields());
                case 1:
                    return new DigitalWalletTokenProvisioningRequestData.ApplePayRequest(this.certificates, this.enveloped_data, this.signature, buildUnknownFields());
                default:
                    return new ClientPublicKey(this.certificates, this.enveloped_data, this.signature, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
