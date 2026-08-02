package com.squareup.cash.cashlynxflow.plasma.v3;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountPlaidFlowParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkBankAccountPlaidFlowParameters((Boolean) obj, (Boolean) obj2, m, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    LinkBankAccountPlaidFlowParameters.PlaidProduct.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountPlaidFlowParameters linkBankAccountPlaidFlowParameters = (LinkBankAccountPlaidFlowParameters) obj;
        reverseProtoWriter.getClass();
        linkBankAccountPlaidFlowParameters.getClass();
        reverseProtoWriter.writeBytes(linkBankAccountPlaidFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, linkBankAccountPlaidFlowParameters.instrument_token_to_replace);
        LinkBankAccountPlaidFlowParameters.PlaidProduct.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, linkBankAccountPlaidFlowParameters.additional_products);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, linkBankAccountPlaidFlowParameters.use_update_mode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, linkBankAccountPlaidFlowParameters.allow_manual_linking);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountPlaidFlowParameters linkBankAccountPlaidFlowParameters = (LinkBankAccountPlaidFlowParameters) obj;
        linkBankAccountPlaidFlowParameters.getClass();
        int size$okio = linkBankAccountPlaidFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, linkBankAccountPlaidFlowParameters.instrument_token_to_replace) + LinkBankAccountPlaidFlowParameters.PlaidProduct.ADAPTER.asRepeated().encodedSizeWithTag(3, linkBankAccountPlaidFlowParameters.additional_products) + protoAdapter.encodedSizeWithTag(2, linkBankAccountPlaidFlowParameters.use_update_mode) + protoAdapter.encodedSizeWithTag(1, linkBankAccountPlaidFlowParameters.allow_manual_linking) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountPlaidFlowParameters linkBankAccountPlaidFlowParameters = (LinkBankAccountPlaidFlowParameters) obj;
        linkBankAccountPlaidFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = linkBankAccountPlaidFlowParameters.allow_manual_linking;
        Boolean bool2 = linkBankAccountPlaidFlowParameters.use_update_mode;
        List list = linkBankAccountPlaidFlowParameters.additional_products;
        String str = linkBankAccountPlaidFlowParameters.instrument_token_to_replace;
        list.getClass();
        byteString.getClass();
        return new LinkBankAccountPlaidFlowParameters(bool, bool2, list, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountPlaidFlowParameters linkBankAccountPlaidFlowParameters = (LinkBankAccountPlaidFlowParameters) obj;
        linkBankAccountPlaidFlowParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, linkBankAccountPlaidFlowParameters.allow_manual_linking);
        protoAdapter.encodeWithTag(protoWriter, 2, linkBankAccountPlaidFlowParameters.use_update_mode);
        LinkBankAccountPlaidFlowParameters.PlaidProduct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, linkBankAccountPlaidFlowParameters.additional_products);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, linkBankAccountPlaidFlowParameters.instrument_token_to_replace);
        protoWriter.writeBytes(linkBankAccountPlaidFlowParameters.unknownFields());
    }
}
