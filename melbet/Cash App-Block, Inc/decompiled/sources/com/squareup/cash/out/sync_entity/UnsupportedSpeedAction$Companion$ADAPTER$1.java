package com.squareup.cash.out.sync_entity;

import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class UnsupportedSpeedAction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UnsupportedSpeedAction((SupportedFlows) obj, (InstrumentType) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SupportedFlows.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = InstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
        reverseProtoWriter.getClass();
        unsupportedSpeedAction.getClass();
        reverseProtoWriter.writeBytes(unsupportedSpeedAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, unsupportedSpeedAction.title);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, unsupportedSpeedAction.instrument_type_to_link);
        SupportedFlows.ADAPTER.encodeWithTag(reverseProtoWriter, 1, unsupportedSpeedAction.supported_flow);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
        unsupportedSpeedAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, unsupportedSpeedAction.title) + InstrumentType.ADAPTER.encodedSizeWithTag(2, unsupportedSpeedAction.instrument_type_to_link) + SupportedFlows.ADAPTER.encodedSizeWithTag(1, unsupportedSpeedAction.supported_flow) + unsupportedSpeedAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
        unsupportedSpeedAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        SupportedFlows supportedFlows = unsupportedSpeedAction.supported_flow;
        InstrumentType instrumentType = unsupportedSpeedAction.instrument_type_to_link;
        String str = unsupportedSpeedAction.title;
        byteString.getClass();
        return new UnsupportedSpeedAction(supportedFlows, instrumentType, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
        unsupportedSpeedAction.getClass();
        SupportedFlows.ADAPTER.encodeWithTag(protoWriter, 1, unsupportedSpeedAction.supported_flow);
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 2, unsupportedSpeedAction.instrument_type_to_link);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, unsupportedSpeedAction.title);
        protoWriter.writeBytes(unsupportedSpeedAction.unknownFields());
    }
}
