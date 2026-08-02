package ru.yandex.video.m3.ott.data.repository.impl;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/ManifestData;", "", "fromBlock", "", "kpId", "deviceType", "Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;)V", "getDeviceType", "()Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;", "getFromBlock", "()Ljava/lang/String;", "getKpId", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManifestData {
    public static final int $stable = 0;
    private final Ott.DeviceType deviceType;
    private final String fromBlock;
    private final String kpId;

    public ManifestData(String str, String str2, Ott.DeviceType deviceType) {
        this.fromBlock = str;
        this.kpId = str2;
        this.deviceType = deviceType;
    }

    public final Ott.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getFromBlock() {
        return this.fromBlock;
    }

    public final String getKpId() {
        return this.kpId;
    }
}
