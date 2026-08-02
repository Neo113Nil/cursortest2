package defpackage;

import NAlice.NAliceApi.quark.webchat.TLocalIoTSource;
import NAlice.NAliceApi.quark.webchat.TLocalScenarioSource;
import NAlice.NAliceApi.quark.webchat.TSourceInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class q4x0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TSourceInfo((TLocalIoTSource) obj, (TLocalScenarioSource) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TLocalIoTSource.a.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TLocalScenarioSource.a.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TSourceInfo tSourceInfo = (TSourceInfo) obj;
        TLocalIoTSource.a.encodeWithTag(protoWriter, 1, (int) tSourceInfo.getLocalIoTSource());
        TLocalScenarioSource.a.encodeWithTag(protoWriter, 2, (int) tSourceInfo.getLocalScenarioSource());
        protoWriter.writeBytes(tSourceInfo.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TSourceInfo tSourceInfo = (TSourceInfo) obj;
        return TLocalScenarioSource.a.encodedSizeWithTag(2, tSourceInfo.getLocalScenarioSource()) + TLocalIoTSource.a.encodedSizeWithTag(1, tSourceInfo.getLocalIoTSource()) + tSourceInfo.unknownFields().h();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TSourceInfo tSourceInfo = (TSourceInfo) obj;
        TLocalIoTSource localIoTSource = tSourceInfo.getLocalIoTSource();
        TLocalIoTSource tLocalIoTSource = localIoTSource != null ? (TLocalIoTSource) TLocalIoTSource.a.redact(localIoTSource) : null;
        TLocalScenarioSource localScenarioSource = tSourceInfo.getLocalScenarioSource();
        return new TSourceInfo(tLocalIoTSource, localScenarioSource != null ? (TLocalScenarioSource) TLocalScenarioSource.a.redact(localScenarioSource) : null, ByteString.c);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TSourceInfo tSourceInfo = (TSourceInfo) obj;
        reverseProtoWriter.writeBytes(tSourceInfo.unknownFields());
        TLocalScenarioSource.a.encodeWithTag(reverseProtoWriter, 2, (int) tSourceInfo.getLocalScenarioSource());
        TLocalIoTSource.a.encodeWithTag(reverseProtoWriter, 1, (int) tSourceInfo.getLocalIoTSource());
    }
}
