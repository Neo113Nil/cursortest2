package com.squareup.cash.devicegrip.service;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/devicegrip/service/GetDevicesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/appthemes/Gradient$Builder;", "Builder", "Device", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetDevicesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDevicesResponse> CREATOR;
    public final List devices;

    public final class Device extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Device> CREATOR;
        public final DeviceInfo info;
        public final Boolean is_current_device;

        static {
            GetDevicesResponse$Device$Companion$ADAPTER$1 getDevicesResponse$Device$Companion$ADAPTER$1 = new GetDevicesResponse$Device$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Device.class), "type.googleapis.com/squareup.cash.devicegrip.service.GetDevicesResponse.Device", Syntax.PROTO_2, null, "squareup/cash/devicegrip/app.proto");
            ADAPTER = getDevicesResponse$Device$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getDevicesResponse$Device$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Device(Boolean bool, DeviceInfo deviceInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.is_current_device = bool;
            this.info = deviceInfo;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return Intrinsics.areEqual(unknownFields(), device.unknownFields()) && Intrinsics.areEqual(this.is_current_device, device.is_current_device) && Intrinsics.areEqual(this.info, device.info);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.is_current_device;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            DeviceInfo deviceInfo = this.info;
            int hashCode3 = hashCode2 + (deviceInfo != null ? deviceInfo.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(15);
            builder.customer_token = this.is_current_device;
            builder.sponsorship_tier = this.info;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.is_current_device;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_current_device=", bool, arrayList);
            }
            DeviceInfo deviceInfo = this.info;
            if (deviceInfo != null) {
                arrayList.add("info=" + deviceInfo);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Device{", "}", 0, null, null, 56);
        }
    }

    static {
        GetDevicesResponse$Companion$ADAPTER$1 getDevicesResponse$Companion$ADAPTER$1 = new GetDevicesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDevicesResponse.class), "type.googleapis.com/squareup.cash.devicegrip.service.GetDevicesResponse", Syntax.PROTO_2, null, "squareup/cash/devicegrip/app.proto");
        ADAPTER = getDevicesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDevicesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDevicesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.devices = TransactorKt.immutableCopyOf("devices", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDevicesResponse)) {
            return false;
        }
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDevicesResponse.unknownFields()) && Intrinsics.areEqual(this.devices, getDevicesResponse.devices);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.devices.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(9, false);
        builder.colors = this.devices;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.devices;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("devices=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDevicesResponse{", "}", 0, null, null, 56);
    }
}
