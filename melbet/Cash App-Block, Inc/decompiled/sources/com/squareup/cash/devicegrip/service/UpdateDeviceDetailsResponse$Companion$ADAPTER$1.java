package com.squareup.cash.devicegrip.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class UpdateDeviceDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateDeviceDetailsResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateDeviceDetailsResponse updateDeviceDetailsResponse = (UpdateDeviceDetailsResponse) obj;
        reverseProtoWriter.getClass();
        updateDeviceDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(updateDeviceDetailsResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateDeviceDetailsResponse updateDeviceDetailsResponse = (UpdateDeviceDetailsResponse) obj;
        updateDeviceDetailsResponse.getClass();
        return updateDeviceDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UpdateDeviceDetailsResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateDeviceDetailsResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateDeviceDetailsResponse updateDeviceDetailsResponse = (UpdateDeviceDetailsResponse) obj;
        updateDeviceDetailsResponse.getClass();
        protoWriter.writeBytes(updateDeviceDetailsResponse.unknownFields());
    }
}
