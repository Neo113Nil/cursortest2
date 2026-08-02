package com.squareup.cash.devicegrip.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.devicegrip.service.GetDevicesResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetDevicesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDevicesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetDevicesResponse.Device.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) obj;
        reverseProtoWriter.getClass();
        getDevicesResponse.getClass();
        reverseProtoWriter.writeBytes(getDevicesResponse.unknownFields());
        GetDevicesResponse.Device.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getDevicesResponse.devices);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) obj;
        getDevicesResponse.getClass();
        return GetDevicesResponse.Device.ADAPTER.asRepeated().encodedSizeWithTag(1, getDevicesResponse.devices) + getDevicesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) obj;
        getDevicesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getDevicesResponse.devices, GetDevicesResponse.Device.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetDevicesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) obj;
        getDevicesResponse.getClass();
        GetDevicesResponse.Device.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getDevicesResponse.devices);
        protoWriter.writeBytes(getDevicesResponse.unknownFields());
    }
}
