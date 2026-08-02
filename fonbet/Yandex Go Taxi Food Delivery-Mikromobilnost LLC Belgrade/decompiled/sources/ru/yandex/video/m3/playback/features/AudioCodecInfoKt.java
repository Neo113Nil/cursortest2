package ru.yandex.video.m3.playback.features;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.playback.features.AudioCodecInfo;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "codecName", "", "isTunneled", "isSecure", "isHardwareAccelerated", "", "maxSupportedInstances", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/AudioCodecInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "AudioCodecInfo", "(Ljava/lang/String;ZZZILtls;)Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioCodecInfoKt {
    public static final /* synthetic */ AudioCodecInfo AudioCodecInfo(String str, boolean z, boolean z2, boolean z3, int i, tls tlsVar) {
        AudioCodecInfo.Builder builder = new AudioCodecInfo.Builder(str, z2, z, z3, i);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ AudioCodecInfo AudioCodecInfo$default(String str, boolean z, boolean z2, boolean z3, int i, tls tlsVar, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.AudioCodecInfoKt$AudioCodecInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AudioCodecInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AudioCodecInfo.Builder builder) {
                }
            };
        }
        return AudioCodecInfo(str, z, z2, z3, i, tlsVar);
    }
}
