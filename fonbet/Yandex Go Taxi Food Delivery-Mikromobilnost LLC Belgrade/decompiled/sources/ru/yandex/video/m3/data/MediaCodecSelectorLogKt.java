package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "mimeType", "", "requiresSecureDecoder", "requiresTunnelingDecoder", "", "Lru/yandex/video/m3/data/CodecInfo;", "codecsInfo", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/MediaCodecSelectorLog$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "MediaCodecSelectorLog", "(Ljava/lang/String;ZZLjava/util/List;Ltls;)Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaCodecSelectorLogKt {
    public static final /* synthetic */ MediaCodecSelectorLog MediaCodecSelectorLog(String str, boolean z, boolean z2, List list, tls tlsVar) {
        MediaCodecSelectorLog.Builder builder = new MediaCodecSelectorLog.Builder(str, z, z2, list);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ MediaCodecSelectorLog MediaCodecSelectorLog$default(String str, boolean z, boolean z2, List list, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.MediaCodecSelectorLogKt$MediaCodecSelectorLog$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaCodecSelectorLog.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaCodecSelectorLog.Builder builder) {
                }
            };
        }
        return MediaCodecSelectorLog(str, z, z2, list, tlsVar);
    }
}
