package com.yandex.music.communication.dynamic.banner.data;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.inq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDto;", "Linq;", "", ConnectableDevice.KEY_ID, "type", "Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDataDto;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDataDto;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getType", "Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDataDto;", "a", "()Lcom/yandex/music/communication/dynamic/banner/data/DynamicBannerBlockDataDto;", "dynamic-banner-block"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class DynamicBannerBlockDto implements inq {

    @SerializedName("data")
    private final DynamicBannerBlockDataDto data;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("type")
    private final String type;

    public DynamicBannerBlockDto(String str, String str2, DynamicBannerBlockDataDto dynamicBannerBlockDataDto) {
        this.id = str;
        this.type = str2;
        this.data = dynamicBannerBlockDataDto;
    }

    /* renamed from: a, reason: from getter */
    public final DynamicBannerBlockDataDto getData() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicBannerBlockDto)) {
            return false;
        }
        DynamicBannerBlockDto dynamicBannerBlockDto = (DynamicBannerBlockDto) obj;
        return Intrinsics.d(this.id, dynamicBannerBlockDto.id) && Intrinsics.d(this.type, dynamicBannerBlockDto.type) && Intrinsics.d(this.data, dynamicBannerBlockDto.data);
    }

    @Override // defpackage.inq
    public final String getId() {
        return this.id;
    }

    @Override // defpackage.inq
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DynamicBannerBlockDataDto dynamicBannerBlockDataDto = this.data;
        return hashCode2 + (dynamicBannerBlockDataDto != null ? dynamicBannerBlockDataDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.type;
        DynamicBannerBlockDataDto dynamicBannerBlockDataDto = this.data;
        StringBuilder m = f1d.m("DynamicBannerBlockDto(id=", str, ", type=", str2, ", data=");
        m.append(dynamicBannerBlockDataDto);
        m.append(")");
        return m.toString();
    }
}
