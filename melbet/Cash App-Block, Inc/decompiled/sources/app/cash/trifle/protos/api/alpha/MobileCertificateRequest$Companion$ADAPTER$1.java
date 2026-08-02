package app.cash.trifle.protos.api.alpha;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class MobileCertificateRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobileCertificateRequest((Integer) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        MobileCertificateRequest mobileCertificateRequest = (MobileCertificateRequest) obj;
        reverseProtoWriter.getClass();
        mobileCertificateRequest.getClass();
        reverseProtoWriter.writeBytes(mobileCertificateRequest.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, mobileCertificateRequest.pkcs10_request);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 1, mobileCertificateRequest.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobileCertificateRequest mobileCertificateRequest = (MobileCertificateRequest) obj;
        mobileCertificateRequest.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, mobileCertificateRequest.pkcs10_request) + ProtoAdapter.UINT32.encodedSizeWithTag(1, mobileCertificateRequest.version) + mobileCertificateRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobileCertificateRequest mobileCertificateRequest = (MobileCertificateRequest) obj;
        mobileCertificateRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = mobileCertificateRequest.version;
        ByteString byteString2 = mobileCertificateRequest.pkcs10_request;
        byteString.getClass();
        return new MobileCertificateRequest(num, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobileCertificateRequest mobileCertificateRequest = (MobileCertificateRequest) obj;
        mobileCertificateRequest.getClass();
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, mobileCertificateRequest.version);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, mobileCertificateRequest.pkcs10_request);
        protoWriter.writeBytes(mobileCertificateRequest.unknownFields());
    }
}
