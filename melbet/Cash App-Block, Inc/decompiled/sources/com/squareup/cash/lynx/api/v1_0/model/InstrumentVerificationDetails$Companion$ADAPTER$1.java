package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InstrumentVerificationDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentVerificationDetails((Boolean) obj, (Long) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentVerificationDetails instrumentVerificationDetails = (InstrumentVerificationDetails) obj;
        reverseProtoWriter.getClass();
        instrumentVerificationDetails.getClass();
        reverseProtoWriter.writeBytes(instrumentVerificationDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, instrumentVerificationDetails.transaction_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, instrumentVerificationDetails.calling_service);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, instrumentVerificationDetails.instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, instrumentVerificationDetails.owner_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instrumentVerificationDetails.verification_id);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, instrumentVerificationDetails.microauth_completed_time_ms);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, instrumentVerificationDetails.is_successful);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentVerificationDetails instrumentVerificationDetails = (InstrumentVerificationDetails) obj;
        instrumentVerificationDetails.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, instrumentVerificationDetails.microauth_completed_time_ms) + ProtoAdapter.BOOL.encodedSizeWithTag(1, instrumentVerificationDetails.is_successful) + instrumentVerificationDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, instrumentVerificationDetails.transaction_identifier) + protoAdapter.encodedSizeWithTag(6, instrumentVerificationDetails.calling_service) + protoAdapter.encodedSizeWithTag(5, instrumentVerificationDetails.instrument_token) + protoAdapter.encodedSizeWithTag(4, instrumentVerificationDetails.owner_token) + protoAdapter.encodedSizeWithTag(3, instrumentVerificationDetails.verification_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentVerificationDetails instrumentVerificationDetails = (InstrumentVerificationDetails) obj;
        instrumentVerificationDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = instrumentVerificationDetails.is_successful;
        Long l = instrumentVerificationDetails.microauth_completed_time_ms;
        String str = instrumentVerificationDetails.verification_id;
        String str2 = instrumentVerificationDetails.owner_token;
        String str3 = instrumentVerificationDetails.instrument_token;
        String str4 = instrumentVerificationDetails.calling_service;
        String str5 = instrumentVerificationDetails.transaction_identifier;
        byteString.getClass();
        return new InstrumentVerificationDetails(bool, l, str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentVerificationDetails instrumentVerificationDetails = (InstrumentVerificationDetails) obj;
        instrumentVerificationDetails.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, instrumentVerificationDetails.is_successful);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, instrumentVerificationDetails.microauth_completed_time_ms);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, instrumentVerificationDetails.verification_id);
        protoAdapter.encodeWithTag(protoWriter, 4, instrumentVerificationDetails.owner_token);
        protoAdapter.encodeWithTag(protoWriter, 5, instrumentVerificationDetails.instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 6, instrumentVerificationDetails.calling_service);
        protoAdapter.encodeWithTag(protoWriter, 7, instrumentVerificationDetails.transaction_identifier);
        protoWriter.writeBytes(instrumentVerificationDetails.unknownFields());
    }
}
