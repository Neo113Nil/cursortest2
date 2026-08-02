package com.squareup.cash.cashmeoutside.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InitiateRemittanceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InitiateRemittanceResponse((ClientScenario) obj3, (ResponseContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiateRemittanceResponse initiateRemittanceResponse = (InitiateRemittanceResponse) obj;
        reverseProtoWriter.getClass();
        initiateRemittanceResponse.getClass();
        reverseProtoWriter.writeBytes(initiateRemittanceResponse.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiateRemittanceResponse.client_scenario);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, initiateRemittanceResponse.flow_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateRemittanceResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateRemittanceResponse initiateRemittanceResponse = (InitiateRemittanceResponse) obj;
        initiateRemittanceResponse.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(3, initiateRemittanceResponse.client_scenario) + ProtoAdapter.STRING.encodedSizeWithTag(2, initiateRemittanceResponse.flow_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateRemittanceResponse.response_context) + initiateRemittanceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateRemittanceResponse initiateRemittanceResponse = (InitiateRemittanceResponse) obj;
        initiateRemittanceResponse.getClass();
        ResponseContext responseContext = initiateRemittanceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = initiateRemittanceResponse.flow_token;
        ClientScenario clientScenario = initiateRemittanceResponse.client_scenario;
        byteString.getClass();
        return new InitiateRemittanceResponse(clientScenario, responseContext2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateRemittanceResponse initiateRemittanceResponse = (InitiateRemittanceResponse) obj;
        initiateRemittanceResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateRemittanceResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initiateRemittanceResponse.flow_token);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 3, initiateRemittanceResponse.client_scenario);
        protoWriter.writeBytes(initiateRemittanceResponse.unknownFields());
    }
}
