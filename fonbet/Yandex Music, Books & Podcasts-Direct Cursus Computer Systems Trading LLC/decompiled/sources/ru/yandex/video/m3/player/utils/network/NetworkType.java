package ru.yandex.video.m3.player.utils.network;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/utils/network/NetworkType;", "", "", "a", "Ljava/lang/String;", "getNetworkTypeName", "()Ljava/lang/String;", "networkTypeName", "NETWORK_TYPE_UNKNOWN", "NETWORK_TYPE_OFFLINE", "NETWORK_TYPE_WIFI", "NETWORK_TYPE_2G", "NETWORK_TYPE_3G", "NETWORK_TYPE_4G", "NETWORK_TYPE_5G_SA", "NETWORK_TYPE_5G_NSA", "NETWORK_TYPE_CELLULAR_UNKNOWN", "NETWORK_TYPE_ETHERNET", "NETWORK_TYPE_OTHER", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public enum NetworkType {
    NETWORK_TYPE_UNKNOWN("Unknown network type"),
    NETWORK_TYPE_OFFLINE("No network connection"),
    NETWORK_TYPE_WIFI("Wifi"),
    NETWORK_TYPE_2G("2G"),
    NETWORK_TYPE_3G("3G"),
    NETWORK_TYPE_4G("4G"),
    NETWORK_TYPE_5G_SA("5G stand-alone (SA)"),
    NETWORK_TYPE_5G_NSA("5G non-stand-alone (NSA)"),
    NETWORK_TYPE_CELLULAR_UNKNOWN("Cellular"),
    NETWORK_TYPE_ETHERNET("Ethernet connection"),
    NETWORK_TYPE_OTHER("Other connections which are not Wifi or cellular");


    /* renamed from: a, reason: from kotlin metadata */
    public final String networkTypeName;

    NetworkType(String str) {
        this.networkTypeName = str;
    }

    @NotNull
    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }
}
