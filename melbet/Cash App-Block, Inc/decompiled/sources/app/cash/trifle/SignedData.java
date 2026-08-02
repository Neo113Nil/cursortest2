package app.cash.trifle;

import app.cash.trifle.TrifleAlgorithmIdentifier;
import app.cash.trifle.protos.api.alpha.SignedData;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class SignedData {
    public final ArrayList certificates;
    public final EnvelopedData envelopedData;
    public final byte[] signature;

    public final class EnvelopedData {
        public final byte[] data;
        public final TrifleAlgorithmIdentifier signingAlgorithm;

        public EnvelopedData(TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier eCDSASha256AlgorithmIdentifier, byte[] bArr) {
            eCDSASha256AlgorithmIdentifier.getClass();
            bArr.getClass();
            this.signingAlgorithm = eCDSASha256AlgorithmIdentifier;
            this.data = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!EnvelopedData.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            EnvelopedData envelopedData = (EnvelopedData) obj;
            return Intrinsics.areEqual(this.signingAlgorithm, envelopedData.signingAlgorithm) && Arrays.equals(this.data, envelopedData.data);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.data) + (this.signingAlgorithm.hashCode() * 31);
        }

        public final byte[] serialize() {
            TrifleAlgorithmIdentifier trifleAlgorithmIdentifier = this.signingAlgorithm;
            trifleAlgorithmIdentifier.getClass();
            if (!(trifleAlgorithmIdentifier instanceof TrifleAlgorithmIdentifier.ECDSASha256AlgorithmIdentifier)) {
                throw new Exception("Unsupported signing algorithm encoding");
            }
            SignedData.Algorithm algorithm = SignedData.Algorithm.ECDSA_SHA256;
            ByteString.Companion companion = ByteString.Companion;
            return new SignedData.EnvelopedData(0, algorithm, ByteString.Companion.of$default(this.data), ByteString.EMPTY).encode();
        }

        public final String toString() {
            return "EnvelopedData(version=0, signingAlgorithm=" + this.signingAlgorithm + ", data=" + Arrays.toString(this.data) + ')';
        }
    }

    public SignedData(EnvelopedData envelopedData, byte[] bArr, ArrayList arrayList) {
        bArr.getClass();
        this.envelopedData = envelopedData;
        this.signature = bArr;
        this.certificates = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SignedData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SignedData signedData = (SignedData) obj;
        return this.envelopedData.equals(signedData.envelopedData) && Arrays.equals(this.signature, signedData.signature) && this.certificates.equals(signedData.certificates);
    }

    public final int hashCode() {
        return this.certificates.hashCode() + ((Arrays.hashCode(this.signature) + (this.envelopedData.hashCode() * 31)) * 31);
    }

    public final byte[] serialize() {
        ByteString.Companion companion = ByteString.Companion;
        ByteString of$default = ByteString.Companion.of$default(this.envelopedData.serialize());
        ByteString of$default2 = ByteString.Companion.of$default(this.signature);
        ArrayList<Certificate> arrayList = this.certificates;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Certificate certificate : arrayList) {
            ProtoAdapter protoAdapter = app.cash.trifle.protos.api.alpha.Certificate.ADAPTER;
            certificate.getClass();
            ByteString.Companion companion2 = ByteString.Companion;
            arrayList2.add((app.cash.trifle.protos.api.alpha.Certificate) protoAdapter.decode(new app.cash.trifle.protos.api.alpha.Certificate(0, ByteString.Companion.of$default(certificate.certificate), ByteString.EMPTY).encode()));
        }
        return new app.cash.trifle.protos.api.alpha.SignedData(arrayList2, of$default, of$default2, ByteString.EMPTY).encode();
    }

    public final String toString() {
        return "SignedData(envelopedData=" + this.envelopedData + ", signature=" + Arrays.toString(this.signature) + ", certificates=" + this.certificates + ')';
    }
}
