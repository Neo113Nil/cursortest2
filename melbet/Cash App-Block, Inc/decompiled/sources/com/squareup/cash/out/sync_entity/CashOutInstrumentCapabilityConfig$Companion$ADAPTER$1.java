package com.squareup.cash.out.sync_entity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CashOutInstrumentCapabilityConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashOutInstrumentCapabilityConfig((Long) obj, m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(InstrumentCapability.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(PreselectionPriorityItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(UnsupportedSpeedAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
        reverseProtoWriter.getClass();
        cashOutInstrumentCapabilityConfig.getClass();
        reverseProtoWriter.writeBytes(cashOutInstrumentCapabilityConfig.unknownFields());
        UnsupportedSpeedAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, cashOutInstrumentCapabilityConfig.unsupported_speed_actions);
        PreselectionPriorityItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, cashOutInstrumentCapabilityConfig.preselection_priority);
        InstrumentCapability.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashOutInstrumentCapabilityConfig.capabilities);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, cashOutInstrumentCapabilityConfig.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
        cashOutInstrumentCapabilityConfig.getClass();
        return UnsupportedSpeedAction.ADAPTER.asRepeated().encodedSizeWithTag(4, cashOutInstrumentCapabilityConfig.unsupported_speed_actions) + PreselectionPriorityItem.ADAPTER.asRepeated().encodedSizeWithTag(3, cashOutInstrumentCapabilityConfig.preselection_priority) + InstrumentCapability.ADAPTER.asRepeated().encodedSizeWithTag(2, cashOutInstrumentCapabilityConfig.capabilities) + ProtoAdapter.INT64.encodedSizeWithTag(1, cashOutInstrumentCapabilityConfig.version) + cashOutInstrumentCapabilityConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
        cashOutInstrumentCapabilityConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashOutInstrumentCapabilityConfig.capabilities, InstrumentCapability.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashOutInstrumentCapabilityConfig.preselection_priority, PreselectionPriorityItem.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(cashOutInstrumentCapabilityConfig.unsupported_speed_actions, UnsupportedSpeedAction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = cashOutInstrumentCapabilityConfig.version;
        byteString.getClass();
        return new CashOutInstrumentCapabilityConfig(l, m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
        cashOutInstrumentCapabilityConfig.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cashOutInstrumentCapabilityConfig.version);
        InstrumentCapability.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cashOutInstrumentCapabilityConfig.capabilities);
        PreselectionPriorityItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, cashOutInstrumentCapabilityConfig.preselection_priority);
        UnsupportedSpeedAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, cashOutInstrumentCapabilityConfig.unsupported_speed_actions);
        protoWriter.writeBytes(cashOutInstrumentCapabilityConfig.unknownFields());
    }
}
