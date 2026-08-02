package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InstrumentLinkOwnerDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentLinkOwnerDetails((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = (InstrumentLinkOwnerDetails) obj;
        reverseProtoWriter.getClass();
        instrumentLinkOwnerDetails.getClass();
        reverseProtoWriter.writeBytes(instrumentLinkOwnerDetails.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, instrumentLinkOwnerDetails.cardholder_full_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = (InstrumentLinkOwnerDetails) obj;
        instrumentLinkOwnerDetails.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, instrumentLinkOwnerDetails.cardholder_full_name) + instrumentLinkOwnerDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((InstrumentLinkOwnerDetails) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InstrumentLinkOwnerDetails(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = (InstrumentLinkOwnerDetails) obj;
        instrumentLinkOwnerDetails.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instrumentLinkOwnerDetails.cardholder_full_name);
        protoWriter.writeBytes(instrumentLinkOwnerDetails.unknownFields());
    }
}
