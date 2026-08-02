package com.squareup.cash.cashlynxflow.plasma.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkBankAccountFlowParameters(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LinkBankAccountSubflow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountFlowParameters linkBankAccountFlowParameters = (LinkBankAccountFlowParameters) obj;
        reverseProtoWriter.getClass();
        linkBankAccountFlowParameters.getClass();
        reverseProtoWriter.writeBytes(linkBankAccountFlowParameters.unknownFields());
        LinkBankAccountSubflow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, linkBankAccountFlowParameters.supported_subflows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountFlowParameters linkBankAccountFlowParameters = (LinkBankAccountFlowParameters) obj;
        linkBankAccountFlowParameters.getClass();
        return LinkBankAccountSubflow.ADAPTER.asRepeated().encodedSizeWithTag(1, linkBankAccountFlowParameters.supported_subflows) + linkBankAccountFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountFlowParameters linkBankAccountFlowParameters = (LinkBankAccountFlowParameters) obj;
        linkBankAccountFlowParameters.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(linkBankAccountFlowParameters.supported_subflows, LinkBankAccountSubflow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LinkBankAccountFlowParameters(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountFlowParameters linkBankAccountFlowParameters = (LinkBankAccountFlowParameters) obj;
        linkBankAccountFlowParameters.getClass();
        LinkBankAccountSubflow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, linkBankAccountFlowParameters.supported_subflows);
        protoWriter.writeBytes(linkBankAccountFlowParameters.unknownFields());
    }
}
