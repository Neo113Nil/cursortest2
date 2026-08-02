package ru.yandex.video.m3.player.impl.utils;

import android.os.Build;
import defpackage.sls;
import defpackage.tls;
import defpackage.u601;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.PlaybackViewStateKt;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.utils.DRMInfo;
import ru.yandex.video.m3.player.utils.MediaCodecInfo;
import ru.yandex.video.m3.player.utils.MediaInfo;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo;", "", "toStringInfo", "(Lru/yandex/video/m3/player/utils/DRMInfo;)Ljava/lang/String;", "Lru/yandex/video/m3/player/utils/MediaInfo;", "(Lru/yandex/video/m3/player/utils/MediaInfo;)Ljava/lang/String;", "", "apiLevel", "", "isApiAchieved", "(I)Z", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "getDummyPlayerState", "()Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "", "entry", "Lzy11;", "putEntry", "(Ljava/util/Map;Ljava/util/Map$Entry;)V", "Lkotlin/Function0;", "block", "Ljava/lang/Runnable;", "runnable", "(Lsls;)Ljava/lang/Runnable;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final PlayerState getDummyPlayerState() {
        return new PlayerState(0L, null, false, 0L, null, 0L, null, null, null, null, null, null, 0, 0L, null, null, PlaybackState.END, null, null, null, false, null, NetworkType.NETWORK_TYPE_UNKNOWN, null, null, null, null, null, null, 0L, 0L, ViewPortState.DEFAULT, 1.0d, 1.0d, null, null, false, null, null, PlaybackViewStateKt.PlaybackViewState(new tls() { // from class: ru.yandex.video.m3.player.impl.utils.UtilsKt$getDummyPlayerState$1
            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackViewState.Builder) obj);
                return zy11.a;
            }

            public final void invoke(PlaybackViewState.Builder builder) {
            }
        }), null, null, null);
    }

    public static final boolean isApiAchieved(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static final <K, V> void putEntry(Map<K, V> map, Map.Entry<? extends K, ? extends V> entry) {
        map.put(entry.getKey(), entry.getValue());
    }

    public static final Runnable runnable(sls slsVar) {
        return new u601(6, slsVar);
    }

    public static final String toStringInfo(DRMInfo dRMInfo) {
        if (dRMInfo.equals(DRMInfo.Unsupported.INSTANCE)) {
            return "Unsupported";
        }
        if (dRMInfo.equals(DRMInfo.SchemeSupported.INSTANCE)) {
            return "SchemeSupported";
        }
        if (!(dRMInfo instanceof DRMInfo.Supported)) {
            w511.b();
            return null;
        }
        StringBuilder sb = new StringBuilder("version: ");
        DRMInfo.Supported supported = (DRMInfo.Supported) dRMInfo;
        sb.append(supported.getVersion());
        sb.append("\nvendor: ");
        sb.append(supported.getVendor());
        sb.append("\nalgorithms: ");
        sb.append(supported.getAlgorithms());
        sb.append("\nsystemId: ");
        sb.append(supported.getSystemId());
        sb.append("\nsecurityLevel ");
        sb.append(supported.getSecurityLevel());
        sb.append("\nHDCPLevel: ");
        sb.append(supported.getHDCPLevel());
        sb.append("\nmaxHDCPLevel: ");
        sb.append(supported.getMaxHDCPLevel());
        sb.append("\nusageReportingSupport: ");
        sb.append(supported.getUsageReportingSupport());
        sb.append("\nmaxNumberOfOpenSessions: ");
        sb.append(supported.getMaxNumberOfOpenSessions());
        sb.append("\nnumberOfOpenSessions: ");
        sb.append(supported.getNumberOfOpenSessions());
        sb.append("\nplugin description: ");
        sb.append(supported.getDescription());
        sb.append("\ndevice id: ");
        sb.append(supported.getDeviceId());
        sb.append("\nprovisioningUniqueId: ");
        sb.append(supported.getProvisioningUniqueId());
        sb.append("\nprivacyMode: ");
        sb.append(supported.getPrivacyMode());
        sb.append("\nsessionSharing: ");
        sb.append(supported.getSessionSharing());
        sb.append("\noemCryptoApiVersion: ");
        sb.append(supported.getOemCryptoApiVersion());
        return sb.toString();
    }

    public static final String toStringInfo(MediaInfo mediaInfo) {
        return a.X(mediaInfo.getSupportedCodecs(), "\n", null, null, new tls() { // from class: ru.yandex.video.m3.player.impl.utils.UtilsKt$toStringInfo$1$1
            @Override // defpackage.tls
            public final CharSequence invoke(MediaCodecInfo mediaCodecInfo) {
                return mediaCodecInfo.getName();
            }
        }, 30);
    }
}
