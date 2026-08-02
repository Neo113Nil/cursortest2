package ru.yandex.video.m3.source;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.source.TrackItem;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "periodIndex", "groupIndex", "trackIndex", "Lkotlin/Function1;", "Lru/yandex/video/m3/source/TrackItem$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/source/TrackItem;", "TrackItem", "(IIILtls;)Lru/yandex/video/m3/source/TrackItem;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackItemKt {
    public static final /* synthetic */ TrackItem TrackItem(int i, int i2, int i3, tls tlsVar) {
        TrackItem.Builder builder = new TrackItem.Builder(i, i2, i3);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ TrackItem TrackItem$default(int i, int i2, int i3, tls tlsVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.source.TrackItemKt$TrackItem$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TrackItem.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TrackItem.Builder builder) {
                }
            };
        }
        return TrackItem(i, i2, i3, tlsVar);
    }
}
