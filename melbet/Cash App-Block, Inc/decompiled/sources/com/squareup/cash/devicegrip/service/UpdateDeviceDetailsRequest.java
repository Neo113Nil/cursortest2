package com.squareup.cash.devicegrip.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.cash.devicegrip.api.DeviceSyncValue$DeviceType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateDeviceDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDeviceDetailsRequest> CREATOR;
    public final String device_model;
    public final String device_name;
    public final DeviceSyncValue$DeviceType device_type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateDeviceDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.devicegrip.service.UpdateDeviceDetailsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

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
                        return new UpdateDeviceDetailsRequest((String) obj, (DeviceSyncValue$DeviceType) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = DeviceSyncValue$DeviceType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateDeviceDetailsRequest updateDeviceDetailsRequest = (UpdateDeviceDetailsRequest) obj;
                reverseProtoWriter.getClass();
                updateDeviceDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(updateDeviceDetailsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, updateDeviceDetailsRequest.device_model);
                DeviceSyncValue$DeviceType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateDeviceDetailsRequest.device_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, updateDeviceDetailsRequest.device_name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateDeviceDetailsRequest updateDeviceDetailsRequest = (UpdateDeviceDetailsRequest) obj;
                updateDeviceDetailsRequest.getClass();
                int size$okio = updateDeviceDetailsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, updateDeviceDetailsRequest.device_model) + DeviceSyncValue$DeviceType.ADAPTER.encodedSizeWithTag(2, updateDeviceDetailsRequest.device_type) + protoAdapter2.encodedSizeWithTag(1, updateDeviceDetailsRequest.device_name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateDeviceDetailsRequest updateDeviceDetailsRequest = (UpdateDeviceDetailsRequest) obj;
                updateDeviceDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                DeviceSyncValue$DeviceType deviceSyncValue$DeviceType = updateDeviceDetailsRequest.device_type;
                String str = updateDeviceDetailsRequest.device_model;
                byteString.getClass();
                return new UpdateDeviceDetailsRequest(null, deviceSyncValue$DeviceType, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateDeviceDetailsRequest updateDeviceDetailsRequest = (UpdateDeviceDetailsRequest) obj;
                updateDeviceDetailsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, updateDeviceDetailsRequest.device_name);
                DeviceSyncValue$DeviceType.ADAPTER.encodeWithTag(protoWriter, 2, updateDeviceDetailsRequest.device_type);
                protoAdapter2.encodeWithTag(protoWriter, 3, updateDeviceDetailsRequest.device_model);
                protoWriter.writeBytes(updateDeviceDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDeviceDetailsRequest(String str, DeviceSyncValue$DeviceType deviceSyncValue$DeviceType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_name = str;
        this.device_type = deviceSyncValue$DeviceType;
        this.device_model = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateDeviceDetailsRequest)) {
            return false;
        }
        UpdateDeviceDetailsRequest updateDeviceDetailsRequest = (UpdateDeviceDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateDeviceDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.device_name, updateDeviceDetailsRequest.device_name) && this.device_type == updateDeviceDetailsRequest.device_type && Intrinsics.areEqual(this.device_model, updateDeviceDetailsRequest.device_model);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        DeviceSyncValue$DeviceType deviceSyncValue$DeviceType = this.device_type;
        int hashCode3 = (hashCode2 + (deviceSyncValue$DeviceType != null ? deviceSyncValue$DeviceType.hashCode() : 0)) * 37;
        String str2 = this.device_model;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(15);
        builder.customer_token = this.device_name;
        builder.withdrawalType = this.device_type;
        builder.customer_supplied_amount = this.device_model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.device_name != null) {
            arrayList.add("device_name=██");
        }
        DeviceSyncValue$DeviceType deviceSyncValue$DeviceType = this.device_type;
        if (deviceSyncValue$DeviceType != null) {
            arrayList.add("device_type=" + deviceSyncValue$DeviceType);
        }
        String str = this.device_model;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_model=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDeviceDetailsRequest{", "}", 0, null, null, 56);
    }
}
