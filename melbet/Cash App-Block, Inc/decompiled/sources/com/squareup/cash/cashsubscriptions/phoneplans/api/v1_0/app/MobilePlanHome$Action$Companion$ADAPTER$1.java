package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Action$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MobilePlanHome.Action((String) obj, (String) obj2, (MobilePlanHome.CtaStyle) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = MobilePlanHome.CtaStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.Action action = (MobilePlanHome.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        MobilePlanHome.CtaStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, action.style);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, action.destination);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, action.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome.Action action = (MobilePlanHome.Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return MobilePlanHome.CtaStyle.ADAPTER.encodedSizeWithTag(3, action.style) + protoAdapter.encodedSizeWithTag(2, action.destination) + protoAdapter.encodedSizeWithTag(1, action.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.Action action = (MobilePlanHome.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = action.text;
        String str2 = action.destination;
        MobilePlanHome.CtaStyle ctaStyle = action.style;
        byteString.getClass();
        return new MobilePlanHome.Action(str, str2, ctaStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.Action action = (MobilePlanHome.Action) obj;
        action.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, action.text);
        protoAdapter.encodeWithTag(protoWriter, 2, action.destination);
        MobilePlanHome.CtaStyle.ADAPTER.encodeWithTag(protoWriter, 3, action.style);
        protoWriter.writeBytes(action.unknownFields());
    }
}
