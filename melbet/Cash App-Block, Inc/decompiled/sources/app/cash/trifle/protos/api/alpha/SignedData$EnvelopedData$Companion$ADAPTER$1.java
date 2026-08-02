package app.cash.trifle.protos.api.alpha;

import app.cash.trifle.protos.api.alpha.SignedData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class SignedData$EnvelopedData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SignedData.EnvelopedData((Integer) obj, (SignedData.Algorithm) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SignedData.Algorithm.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SignedData.EnvelopedData envelopedData = (SignedData.EnvelopedData) obj;
        reverseProtoWriter.getClass();
        envelopedData.getClass();
        reverseProtoWriter.writeBytes(envelopedData.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, envelopedData.data_);
        SignedData.Algorithm.ADAPTER.encodeWithTag(reverseProtoWriter, 2, envelopedData.signing_algorithm);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 1, envelopedData.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SignedData.EnvelopedData envelopedData = (SignedData.EnvelopedData) obj;
        envelopedData.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(3, envelopedData.data_) + SignedData.Algorithm.ADAPTER.encodedSizeWithTag(2, envelopedData.signing_algorithm) + ProtoAdapter.UINT32.encodedSizeWithTag(1, envelopedData.version) + envelopedData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SignedData.EnvelopedData envelopedData = (SignedData.EnvelopedData) obj;
        envelopedData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = envelopedData.version;
        SignedData.Algorithm algorithm = envelopedData.signing_algorithm;
        ByteString byteString2 = envelopedData.data_;
        byteString.getClass();
        return new SignedData.EnvelopedData(num, algorithm, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SignedData.EnvelopedData envelopedData = (SignedData.EnvelopedData) obj;
        envelopedData.getClass();
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, envelopedData.version);
        SignedData.Algorithm.ADAPTER.encodeWithTag(protoWriter, 2, envelopedData.signing_algorithm);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, envelopedData.data_);
        protoWriter.writeBytes(envelopedData.unknownFields());
    }
}
