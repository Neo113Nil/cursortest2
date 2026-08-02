package ru.yandex.video.m3.data.loadcontrol;

import defpackage.nwy;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.loadcontrol.LoadControlParameters;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "LoadControlParameters", "(Ltls;)Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "Lnwy;", "parameters", "(Lnwy;)Lru/yandex/video/m3/data/loadcontrol/LoadControlParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadControlParametersKt {
    public static final LoadControlParameters LoadControlParameters(nwy nwyVar) {
        LoadControlParameters.Builder builder = new LoadControlParameters.Builder();
        long j = nwyVar.d;
        builder.setPlaybackPositionUs$video_player_internalRelease(Long.valueOf(j));
        builder.setPlaybackSpeed$video_player_internalRelease(Float.valueOf(nwyVar.f));
        builder.setBufferedDurationUs$video_player_internalRelease(Long.valueOf(nwyVar.e));
        builder.setPlaybackPositionUs$video_player_internalRelease(Long.valueOf(j));
        builder.setRebuffering$video_player_internalRelease(Boolean.valueOf(nwyVar.g));
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ LoadControlParameters LoadControlParameters$default(tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.loadcontrol.LoadControlParametersKt$LoadControlParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadControlParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadControlParameters.Builder builder) {
                }
            };
        }
        return LoadControlParameters(tlsVar);
    }

    public static final LoadControlParameters LoadControlParameters(tls tlsVar) {
        LoadControlParameters.Builder builder = new LoadControlParameters.Builder();
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
