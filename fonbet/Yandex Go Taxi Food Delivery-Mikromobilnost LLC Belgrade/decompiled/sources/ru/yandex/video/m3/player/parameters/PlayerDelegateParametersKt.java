package ru.yandex.video.m3.player.parameters;

import android.os.Looper;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.drm.DrmTypeConsumer;
import ru.yandex.video.m3.player.scaling.ScalingMode;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "drmTypeConsumer", "Landroid/os/Looper;", "exoPlayerLooper", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "videoScalingMode", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "PlayerDelegateParameters", "(Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;Landroid/os/Looper;Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;Lru/yandex/video/m3/player/scaling/ScalingMode;Ltls;)Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDelegateParametersKt {
    public static final /* synthetic */ PlayerDelegateParameters PlayerDelegateParameters(DrmTypeConsumer drmTypeConsumer, Looper looper, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, ScalingMode scalingMode, tls tlsVar) {
        PlayerDelegateParameters.Builder builder = new PlayerDelegateParameters.Builder(drmTypeConsumer, looper, trackSelectionRestrictionsProvider, scalingMode);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ PlayerDelegateParameters PlayerDelegateParameters$default(DrmTypeConsumer drmTypeConsumer, Looper looper, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, ScalingMode scalingMode, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.parameters.PlayerDelegateParametersKt$PlayerDelegateParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerDelegateParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerDelegateParameters.Builder builder) {
                }
            };
        }
        return PlayerDelegateParameters(drmTypeConsumer, looper, trackSelectionRestrictionsProvider, scalingMode, tlsVar);
    }
}
