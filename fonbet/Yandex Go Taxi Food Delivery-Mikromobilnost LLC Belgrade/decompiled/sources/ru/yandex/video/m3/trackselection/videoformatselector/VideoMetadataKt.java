package ru.yandex.video.m3.trackselection.videoformatselector;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Format;
import ru.yandex.video.m3.trackselection.videoformatselector.VideoMetadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", LaunchBrowserActivity.KEY_URI, "Lru/yandex/video/m3/data/Format;", "format", "Lkotlin/Function1;", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "VideoMetadata", "(Ljava/lang/String;Lru/yandex/video/m3/data/Format;Ltls;)Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoMetadataKt {
    public static final /* synthetic */ VideoMetadata VideoMetadata(String str, Format format, tls tlsVar) {
        VideoMetadata.Builder builder = new VideoMetadata.Builder(str, format);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ VideoMetadata VideoMetadata$default(String str, Format format, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.trackselection.videoformatselector.VideoMetadataKt$VideoMetadata$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VideoMetadata.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VideoMetadata.Builder builder) {
                }
            };
        }
        return VideoMetadata(str, format, tlsVar);
    }
}
