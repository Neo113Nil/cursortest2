package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DelegatePlaybackParameters;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "mediaSourceUriString", "", "startPosition", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/DelegatePlaybackParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "DelegatePlaybackParameters", "(Ljava/lang/String;Ljava/lang/Long;Ltls;)Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DelegatePlaybackParametersKt {
    public static final /* synthetic */ DelegatePlaybackParameters DelegatePlaybackParameters(String str, Long l, tls tlsVar) {
        DelegatePlaybackParameters.Builder builder = new DelegatePlaybackParameters.Builder(str, l);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DelegatePlaybackParameters DelegatePlaybackParameters$default(String str, Long l, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.DelegatePlaybackParametersKt$DelegatePlaybackParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DelegatePlaybackParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DelegatePlaybackParameters.Builder builder) {
                }
            };
        }
        return DelegatePlaybackParameters(str, l, tlsVar);
    }
}
