package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Link$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MobilePlanHome.Link((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.Link link = (MobilePlanHome.Link) obj;
        reverseProtoWriter.getClass();
        link.getClass();
        reverseProtoWriter.writeBytes(link.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, link.destination);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, link.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, link.icon_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome.Link link = (MobilePlanHome.Link) obj;
        link.getClass();
        int size$okio = link.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, link.destination) + protoAdapter.encodedSizeWithTag(2, link.label) + protoAdapter.encodedSizeWithTag(1, link.icon_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.Link link = (MobilePlanHome.Link) obj;
        link.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = link.icon_id;
        String str2 = link.label;
        String str3 = link.destination;
        byteString.getClass();
        return new MobilePlanHome.Link(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.Link link = (MobilePlanHome.Link) obj;
        link.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, link.icon_id);
        protoAdapter.encodeWithTag(protoWriter, 2, link.label);
        protoAdapter.encodeWithTag(protoWriter, 3, link.destination);
        protoWriter.writeBytes(link.unknownFields());
    }
}
