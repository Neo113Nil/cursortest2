package com.squareup.cash.out.sync_entity;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class QualifiedCapability$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new QualifiedCapability(m, (DebitCardQualifier) obj, (BankAccountQualifier) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    SupportedFlows.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj = DebitCardQualifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = BankAccountQualifier.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
        reverseProtoWriter.getClass();
        qualifiedCapability.getClass();
        reverseProtoWriter.writeBytes(qualifiedCapability.unknownFields());
        BankAccountQualifier.ADAPTER.encodeWithTag(reverseProtoWriter, 3, qualifiedCapability.bank_account_qualifier);
        DebitCardQualifier.ADAPTER.encodeWithTag(reverseProtoWriter, 2, qualifiedCapability.debit_card_qualifier);
        SupportedFlows.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, qualifiedCapability.supported_flows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
        qualifiedCapability.getClass();
        return BankAccountQualifier.ADAPTER.encodedSizeWithTag(3, qualifiedCapability.bank_account_qualifier) + DebitCardQualifier.ADAPTER.encodedSizeWithTag(2, qualifiedCapability.debit_card_qualifier) + SupportedFlows.ADAPTER.asRepeated().encodedSizeWithTag(1, qualifiedCapability.supported_flows) + qualifiedCapability.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
        qualifiedCapability.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = qualifiedCapability.supported_flows;
        DebitCardQualifier debitCardQualifier = qualifiedCapability.debit_card_qualifier;
        BankAccountQualifier bankAccountQualifier = qualifiedCapability.bank_account_qualifier;
        list.getClass();
        byteString.getClass();
        return new QualifiedCapability(list, debitCardQualifier, bankAccountQualifier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
        qualifiedCapability.getClass();
        SupportedFlows.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, qualifiedCapability.supported_flows);
        DebitCardQualifier.ADAPTER.encodeWithTag(protoWriter, 2, qualifiedCapability.debit_card_qualifier);
        BankAccountQualifier.ADAPTER.encodeWithTag(protoWriter, 3, qualifiedCapability.bank_account_qualifier);
        protoWriter.writeBytes(qualifiedCapability.unknownFields());
    }
}
