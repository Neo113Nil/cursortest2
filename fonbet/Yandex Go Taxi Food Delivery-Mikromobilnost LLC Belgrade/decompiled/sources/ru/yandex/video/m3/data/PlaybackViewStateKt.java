package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackViewState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlaybackViewState$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/PlaybackViewState;", "PlaybackViewState", "(Ltls;)Lru/yandex/video/m3/data/PlaybackViewState;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackViewStateKt {
    public static final /* synthetic */ PlaybackViewState PlaybackViewState(tls tlsVar) {
        PlaybackViewState.Builder builder = new PlaybackViewState.Builder();
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PlaybackViewState PlaybackViewState$default(tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.PlaybackViewStateKt$PlaybackViewState$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlaybackViewState.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlaybackViewState.Builder builder) {
                }
            };
        }
        return PlaybackViewState(tlsVar);
    }
}
