package com.squareup.cash.devicegrip.service;

import androidx.room.TransactorKt;
import com.squareup.cash.devicegrip.service.GetDevicesResponse;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetDevicesResponse$Device$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetDevicesResponse.Device((Boolean) obj, (DeviceInfo) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(DeviceInfo.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDevicesResponse.Device device = (GetDevicesResponse.Device) obj;
        reverseProtoWriter.getClass();
        device.getClass();
        reverseProtoWriter.writeBytes(device.unknownFields());
        DeviceInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, device.info);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, device.is_current_device);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDevicesResponse.Device device = (GetDevicesResponse.Device) obj;
        device.getClass();
        return DeviceInfo.ADAPTER.encodedSizeWithTag(2, device.info) + ProtoAdapter.BOOL.encodedSizeWithTag(1, device.is_current_device) + device.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDevicesResponse.Device device = (GetDevicesResponse.Device) obj;
        device.getClass();
        DeviceInfo deviceInfo = device.info;
        DeviceInfo deviceInfo2 = deviceInfo != null ? (DeviceInfo) DeviceInfo.ADAPTER.redact(deviceInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = device.is_current_device;
        byteString.getClass();
        return new GetDevicesResponse.Device(bool, deviceInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDevicesResponse.Device device = (GetDevicesResponse.Device) obj;
        device.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, device.is_current_device);
        DeviceInfo.ADAPTER.encodeWithTag(protoWriter, 2, device.info);
        protoWriter.writeBytes(device.unknownFields());
    }
}
