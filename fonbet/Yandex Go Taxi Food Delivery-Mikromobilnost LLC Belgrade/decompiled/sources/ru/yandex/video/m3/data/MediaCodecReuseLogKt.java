package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.MediaCodecReuseLog;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/MediaCodecReuseLog$DecoderReuseMethod;", "reuseMethod", "", "discardReason", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/MediaCodecReuseLog$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "MediaCodecReuseLog", "(Lru/yandex/video/m3/data/MediaCodecReuseLog$DecoderReuseMethod;Ljava/lang/String;Ltls;)Lru/yandex/video/m3/data/MediaCodecReuseLog;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaCodecReuseLogKt {
    public static final /* synthetic */ MediaCodecReuseLog MediaCodecReuseLog(MediaCodecReuseLog.DecoderReuseMethod decoderReuseMethod, String str, tls tlsVar) {
        MediaCodecReuseLog.Builder builder = new MediaCodecReuseLog.Builder(decoderReuseMethod, str);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ MediaCodecReuseLog MediaCodecReuseLog$default(MediaCodecReuseLog.DecoderReuseMethod decoderReuseMethod, String str, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.MediaCodecReuseLogKt$MediaCodecReuseLog$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaCodecReuseLog.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaCodecReuseLog.Builder builder) {
                }
            };
        }
        return MediaCodecReuseLog(decoderReuseMethod, str, tlsVar);
    }
}
