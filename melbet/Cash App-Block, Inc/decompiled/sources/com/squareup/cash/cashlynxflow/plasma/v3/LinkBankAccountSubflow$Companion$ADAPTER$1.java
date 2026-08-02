package com.squareup.cash.cashlynxflow.plasma.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountSubflow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkBankAccountSubflow((String) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountSubflow linkBankAccountSubflow = (LinkBankAccountSubflow) obj;
        reverseProtoWriter.getClass();
        linkBankAccountSubflow.getClass();
        reverseProtoWriter.writeBytes(linkBankAccountSubflow.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, linkBankAccountSubflow.subflow_data_parameters);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, linkBankAccountSubflow.subflow_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountSubflow linkBankAccountSubflow = (LinkBankAccountSubflow) obj;
        linkBankAccountSubflow.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, linkBankAccountSubflow.subflow_data_parameters) + ProtoAdapter.STRING.encodedSizeWithTag(1, linkBankAccountSubflow.subflow_type) + linkBankAccountSubflow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountSubflow linkBankAccountSubflow = (LinkBankAccountSubflow) obj;
        linkBankAccountSubflow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = linkBankAccountSubflow.subflow_type;
        ByteString byteString2 = linkBankAccountSubflow.subflow_data_parameters;
        byteString.getClass();
        return new LinkBankAccountSubflow(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountSubflow linkBankAccountSubflow = (LinkBankAccountSubflow) obj;
        linkBankAccountSubflow.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, linkBankAccountSubflow.subflow_type);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, linkBankAccountSubflow.subflow_data_parameters);
        protoWriter.writeBytes(linkBankAccountSubflow.unknownFields());
    }
}
