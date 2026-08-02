package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackParameters;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "autoPlay", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlaybackParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/PlaybackParameters;", "PlaybackParameters", "(ZLtls;)Lru/yandex/video/m3/data/PlaybackParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackParametersKt {
    public static final /* synthetic */ PlaybackParameters PlaybackParameters(boolean z, tls tlsVar) {
        PlaybackParameters.Builder builder = new PlaybackParameters.Builder(z);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ PlaybackParameters PlaybackParameters$default(boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.PlaybackParametersKt$PlaybackParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlaybackParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlaybackParameters.Builder builder) {
                }
            };
        }
        return PlaybackParameters(z, tlsVar);
    }
}
