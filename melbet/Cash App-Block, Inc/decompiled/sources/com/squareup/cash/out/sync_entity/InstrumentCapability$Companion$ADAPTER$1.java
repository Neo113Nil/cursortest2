package com.squareup.cash.out.sync_entity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InstrumentCapability$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentCapability((InstrumentType) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(QualifiedCapability.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
        reverseProtoWriter.getClass();
        instrumentCapability.getClass();
        reverseProtoWriter.writeBytes(instrumentCapability.unknownFields());
        QualifiedCapability.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, instrumentCapability.qualified_capabilities);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, instrumentCapability.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
        instrumentCapability.getClass();
        return QualifiedCapability.ADAPTER.asRepeated().encodedSizeWithTag(2, instrumentCapability.qualified_capabilities) + InstrumentType.ADAPTER.encodedSizeWithTag(1, instrumentCapability.instrument_type) + instrumentCapability.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
        instrumentCapability.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(instrumentCapability.qualified_capabilities, QualifiedCapability.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        InstrumentType instrumentType = instrumentCapability.instrument_type;
        byteString.getClass();
        return new InstrumentCapability(instrumentType, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
        instrumentCapability.getClass();
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, instrumentCapability.instrument_type);
        QualifiedCapability.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, instrumentCapability.qualified_capabilities);
        protoWriter.writeBytes(instrumentCapability.unknownFields());
    }
}
