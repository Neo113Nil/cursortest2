package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBenefitLeafletResponse(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBenefitLeafletResponse getBenefitLeafletResponse = (GetBenefitLeafletResponse) obj;
        reverseProtoWriter.getClass();
        getBenefitLeafletResponse.getClass();
        reverseProtoWriter.writeBytes(getBenefitLeafletResponse.unknownFields());
        ProtoAdapter protoAdapter = GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getBenefitLeafletResponse.footer_elements);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, getBenefitLeafletResponse.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBenefitLeafletResponse getBenefitLeafletResponse = (GetBenefitLeafletResponse) obj;
        getBenefitLeafletResponse.getClass();
        int size$okio = getBenefitLeafletResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, getBenefitLeafletResponse.footer_elements) + protoAdapter.asRepeated().encodedSizeWithTag(1, getBenefitLeafletResponse.elements) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBenefitLeafletResponse getBenefitLeafletResponse = (GetBenefitLeafletResponse) obj;
        getBenefitLeafletResponse.getClass();
        List list = getBenefitLeafletResponse.elements;
        ProtoAdapter protoAdapter = GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getBenefitLeafletResponse.footer_elements, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBenefitLeafletResponse(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBenefitLeafletResponse getBenefitLeafletResponse = (GetBenefitLeafletResponse) obj;
        getBenefitLeafletResponse.getClass();
        ProtoAdapter protoAdapter = GetBenefitLeafletResponse.BenefitLeafletElement.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, getBenefitLeafletResponse.elements);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getBenefitLeafletResponse.footer_elements);
        protoWriter.writeBytes(getBenefitLeafletResponse.unknownFields());
    }
}
