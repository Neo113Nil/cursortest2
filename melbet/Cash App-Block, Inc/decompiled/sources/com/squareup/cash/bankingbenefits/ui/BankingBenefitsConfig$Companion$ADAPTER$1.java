package com.squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BankingBenefitsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankingBenefitsConfig((BankingBenefitsConfig.ActivitySection) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BankingBenefitsConfig.ActivitySection.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankingBenefitsConfig bankingBenefitsConfig = (BankingBenefitsConfig) obj;
        reverseProtoWriter.getClass();
        bankingBenefitsConfig.getClass();
        reverseProtoWriter.writeBytes(bankingBenefitsConfig.unknownFields());
        BankingBenefitsConfig.ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bankingBenefitsConfig.activity_section);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankingBenefitsConfig bankingBenefitsConfig = (BankingBenefitsConfig) obj;
        bankingBenefitsConfig.getClass();
        return BankingBenefitsConfig.ActivitySection.ADAPTER.encodedSizeWithTag(1, bankingBenefitsConfig.activity_section) + bankingBenefitsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankingBenefitsConfig bankingBenefitsConfig = (BankingBenefitsConfig) obj;
        bankingBenefitsConfig.getClass();
        BankingBenefitsConfig.ActivitySection activitySection = bankingBenefitsConfig.activity_section;
        BankingBenefitsConfig.ActivitySection activitySection2 = activitySection != null ? (BankingBenefitsConfig.ActivitySection) BankingBenefitsConfig.ActivitySection.ADAPTER.redact(activitySection) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BankingBenefitsConfig(activitySection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankingBenefitsConfig bankingBenefitsConfig = (BankingBenefitsConfig) obj;
        bankingBenefitsConfig.getClass();
        BankingBenefitsConfig.ActivitySection.ADAPTER.encodeWithTag(protoWriter, 1, bankingBenefitsConfig.activity_section);
        protoWriter.writeBytes(bankingBenefitsConfig.unknownFields());
    }
}
