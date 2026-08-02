package app.cash.trifle.protos.api.alpha;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Certificate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Certificate((Integer) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Certificate certificate = (Certificate) obj;
        reverseProtoWriter.getClass();
        certificate.getClass();
        reverseProtoWriter.writeBytes(certificate.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, certificate.certificate);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 1, certificate.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Certificate certificate = (Certificate) obj;
        certificate.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, certificate.certificate) + ProtoAdapter.UINT32.encodedSizeWithTag(1, certificate.version) + certificate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Certificate certificate = (Certificate) obj;
        certificate.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = certificate.version;
        ByteString byteString2 = certificate.certificate;
        byteString.getClass();
        return new Certificate(num, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Certificate certificate = (Certificate) obj;
        certificate.getClass();
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, certificate.version);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, certificate.certificate);
        protoWriter.writeBytes(certificate.unknownFields());
    }
}
