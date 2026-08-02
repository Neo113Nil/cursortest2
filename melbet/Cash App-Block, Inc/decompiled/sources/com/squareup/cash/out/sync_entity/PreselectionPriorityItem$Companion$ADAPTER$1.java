package com.squareup.cash.out.sync_entity;

import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class PreselectionPriorityItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PreselectionPriorityItem((InstrumentType) obj, (DebitCardQualifier) obj2, (BankAccountQualifier) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = DebitCardQualifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = BankAccountQualifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
        reverseProtoWriter.getClass();
        preselectionPriorityItem.getClass();
        reverseProtoWriter.writeBytes(preselectionPriorityItem.unknownFields());
        BankAccountQualifier.ADAPTER.encodeWithTag(reverseProtoWriter, 3, preselectionPriorityItem.bank_account_qualifier);
        DebitCardQualifier.ADAPTER.encodeWithTag(reverseProtoWriter, 2, preselectionPriorityItem.debit_card_qualifier);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, preselectionPriorityItem.instrument_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
        preselectionPriorityItem.getClass();
        return BankAccountQualifier.ADAPTER.encodedSizeWithTag(3, preselectionPriorityItem.bank_account_qualifier) + DebitCardQualifier.ADAPTER.encodedSizeWithTag(2, preselectionPriorityItem.debit_card_qualifier) + InstrumentType.ADAPTER.encodedSizeWithTag(1, preselectionPriorityItem.instrument_type) + preselectionPriorityItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
        preselectionPriorityItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        InstrumentType instrumentType = preselectionPriorityItem.instrument_type;
        DebitCardQualifier debitCardQualifier = preselectionPriorityItem.debit_card_qualifier;
        BankAccountQualifier bankAccountQualifier = preselectionPriorityItem.bank_account_qualifier;
        byteString.getClass();
        return new PreselectionPriorityItem(instrumentType, debitCardQualifier, bankAccountQualifier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
        preselectionPriorityItem.getClass();
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, preselectionPriorityItem.instrument_type);
        DebitCardQualifier.ADAPTER.encodeWithTag(protoWriter, 2, preselectionPriorityItem.debit_card_qualifier);
        BankAccountQualifier.ADAPTER.encodeWithTag(protoWriter, 3, preselectionPriorityItem.bank_account_qualifier);
        protoWriter.writeBytes(preselectionPriorityItem.unknownFields());
    }
}
