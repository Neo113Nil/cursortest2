package com.squareup.cash.bankingbenefits.ui;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.ui.BankingBenefitsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankingBenefitsConfig.ActivitySection(m, arrayList, (Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankingBenefitsConfig.ActivitySection activitySection = (BankingBenefitsConfig.ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, activitySection.page_size);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, activitySection.exclude_product_classifiers);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, activitySection.include_product_classifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankingBenefitsConfig.ActivitySection activitySection = (BankingBenefitsConfig.ActivitySection) obj;
        activitySection.getClass();
        int size$okio = activitySection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(3, activitySection.page_size) + protoAdapter.asRepeated().encodedSizeWithTag(2, activitySection.exclude_product_classifiers) + protoAdapter.asRepeated().encodedSizeWithTag(1, activitySection.include_product_classifiers) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankingBenefitsConfig.ActivitySection activitySection = (BankingBenefitsConfig.ActivitySection) obj;
        activitySection.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = activitySection.include_product_classifiers;
        List list2 = activitySection.exclude_product_classifiers;
        Integer num = activitySection.page_size;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new BankingBenefitsConfig.ActivitySection(list, list2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankingBenefitsConfig.ActivitySection activitySection = (BankingBenefitsConfig.ActivitySection) obj;
        activitySection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, activitySection.include_product_classifiers);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, activitySection.exclude_product_classifiers);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, activitySection.page_size);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
