package ru.yandex.video.m3.playback.features;

import android.graphics.Point;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.playback.features.VideoCodecInfo;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "codecName", "Landroid/graphics/Point;", "size", "", "isTunneled", "isSecure", "isHardwareAccelerated", "", "maxSupportedInstances", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/VideoCodecInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "VideoCodecInfo", "(Ljava/lang/String;Landroid/graphics/Point;ZZZILtls;)Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoCodecInfoKt {
    public static final /* synthetic */ VideoCodecInfo VideoCodecInfo(String str, Point point, boolean z, boolean z2, boolean z3, int i, tls tlsVar) {
        VideoCodecInfo.Builder builder = new VideoCodecInfo.Builder(str, point, z2, z, z3, i);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ VideoCodecInfo VideoCodecInfo$default(String str, Point point, boolean z, boolean z2, boolean z3, int i, tls tlsVar, int i2, Object obj) {
        if ((i2 & 64) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.VideoCodecInfoKt$VideoCodecInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VideoCodecInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VideoCodecInfo.Builder builder) {
                }
            };
        }
        return VideoCodecInfo(str, point, z, z2, z3, i, tlsVar);
    }
}
