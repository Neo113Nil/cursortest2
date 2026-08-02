package ru.yandex.video.m3.list_player_manager.impl.track;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.track.Format;
import ru.yandex.video.m3.player.tracks.TrackFormat;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toFormat", "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackManagerImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Format toFormat(final TrackFormat trackFormat) {
        return FormatKt.Format(trackFormat.getWidth(), trackFormat.getHeight(), trackFormat.getBitrate(), trackFormat.getFrameRate(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImplKt$toFormat$1
            {
                super(1);
            }

            public final void invoke(Format.Builder builder) {
                builder.setLabel(TrackFormat.this.getLabel());
                builder.setLanguage(TrackFormat.this.getLanguage());
                builder.setIso3Language(TrackFormat.this.getIso3Language());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Format.Builder) obj);
                return zy11.a;
            }
        });
    }
}
