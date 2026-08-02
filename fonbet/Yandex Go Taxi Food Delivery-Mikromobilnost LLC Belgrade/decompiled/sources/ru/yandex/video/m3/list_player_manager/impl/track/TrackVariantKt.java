package ru.yandex.video.m3.list_player_manager.impl.track;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "trackVariantType", "", "title", "", "selected", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "TrackVariant", "(ILjava/lang/String;ZILtls;)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackVariantKt {
    public static final /* synthetic */ TrackVariant TrackVariant(@TrackVariantType int i, String str, boolean z, @TrackType int i2, tls tlsVar) {
        TrackVariant.Builder builder = new TrackVariant.Builder(i, str, z, i2);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ TrackVariant TrackVariant$default(int i, String str, boolean z, int i2, tls tlsVar, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.track.TrackVariantKt$TrackVariant$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TrackVariant.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TrackVariant.Builder builder) {
                }
            };
        }
        return TrackVariant(i, str, z, i2, tlsVar);
    }
}
