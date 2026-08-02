package app.cash.trifle.protos.api.alpha;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class SignedData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SignedData(m, (ByteString) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Certificate.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SignedData signedData = (SignedData) obj;
        reverseProtoWriter.getClass();
        signedData.getClass();
        reverseProtoWriter.writeBytes(signedData.unknownFields());
        Certificate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, signedData.certificates);
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, signedData.signature);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, signedData.enveloped_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SignedData signedData = (SignedData) obj;
        signedData.getClass();
        int size$okio = signedData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return Certificate.ADAPTER.asRepeated().encodedSizeWithTag(3, signedData.certificates) + protoAdapter.encodedSizeWithTag(2, signedData.signature) + protoAdapter.encodedSizeWithTag(1, signedData.enveloped_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SignedData signedData = (SignedData) obj;
        signedData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(signedData.certificates, Certificate.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = signedData.enveloped_data;
        ByteString byteString3 = signedData.signature;
        byteString.getClass();
        return new SignedData(m1169redactElements, byteString2, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SignedData signedData = (SignedData) obj;
        signedData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, signedData.enveloped_data);
        protoAdapter.encodeWithTag(protoWriter, 2, signedData.signature);
        Certificate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, signedData.certificates);
        protoWriter.writeBytes(signedData.unknownFields());
    }
}
