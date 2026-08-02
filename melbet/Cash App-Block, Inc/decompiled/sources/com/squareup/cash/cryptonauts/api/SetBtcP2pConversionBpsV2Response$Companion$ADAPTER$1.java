package com.squareup.cash.cryptonauts.api;

import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SetBtcP2pConversionBpsV2Response$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = SetBtcP2pConversionBpsV2Response.Status.UNKNOWN;
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetBtcP2pConversionBpsV2Response((SetBtcP2pConversionBpsV2Response.Status) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SetBtcP2pConversionBpsV2Response.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetBtcP2pConversionBpsV2Response setBtcP2pConversionBpsV2Response = (SetBtcP2pConversionBpsV2Response) obj;
        reverseProtoWriter.getClass();
        setBtcP2pConversionBpsV2Response.getClass();
        reverseProtoWriter.writeBytes(setBtcP2pConversionBpsV2Response.unknownFields());
        SetBtcP2pConversionBpsV2Response.Status status = setBtcP2pConversionBpsV2Response.status;
        if (status != SetBtcP2pConversionBpsV2Response.Status.UNKNOWN) {
            SetBtcP2pConversionBpsV2Response.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, status);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetBtcP2pConversionBpsV2Response setBtcP2pConversionBpsV2Response = (SetBtcP2pConversionBpsV2Response) obj;
        setBtcP2pConversionBpsV2Response.getClass();
        int size$okio = setBtcP2pConversionBpsV2Response.unknownFields().getSize$okio();
        SetBtcP2pConversionBpsV2Response.Status status = setBtcP2pConversionBpsV2Response.status;
        return status != SetBtcP2pConversionBpsV2Response.Status.UNKNOWN ? SetBtcP2pConversionBpsV2Response.Status.ADAPTER.encodedSizeWithTag(1, status) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetBtcP2pConversionBpsV2Response setBtcP2pConversionBpsV2Response = (SetBtcP2pConversionBpsV2Response) obj;
        setBtcP2pConversionBpsV2Response.getClass();
        ByteString byteString = ByteString.EMPTY;
        SetBtcP2pConversionBpsV2Response.Status status = setBtcP2pConversionBpsV2Response.status;
        status.getClass();
        byteString.getClass();
        return new SetBtcP2pConversionBpsV2Response(status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetBtcP2pConversionBpsV2Response setBtcP2pConversionBpsV2Response = (SetBtcP2pConversionBpsV2Response) obj;
        setBtcP2pConversionBpsV2Response.getClass();
        SetBtcP2pConversionBpsV2Response.Status status = setBtcP2pConversionBpsV2Response.status;
        if (status != SetBtcP2pConversionBpsV2Response.Status.UNKNOWN) {
            SetBtcP2pConversionBpsV2Response.Status.ADAPTER.encodeWithTag(protoWriter, 1, status);
        }
        protoWriter.writeBytes(setBtcP2pConversionBpsV2Response.unknownFields());
    }
}
