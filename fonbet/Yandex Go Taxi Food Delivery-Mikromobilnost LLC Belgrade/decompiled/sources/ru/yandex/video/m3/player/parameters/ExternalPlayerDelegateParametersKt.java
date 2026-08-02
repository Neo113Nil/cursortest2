package ru.yandex.video.m3.player.parameters;

import android.os.Looper;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.provider.ImmutableTrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.drm.DrmTypeConsumer;
import ru.yandex.video.m3.player.scaling.ScalingMode;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ExternalPlayerDelegateParameters", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "getExternalPlayerDelegateParameters", "()Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalPlayerDelegateParametersKt {
    private static final PlayerDelegateParameters ExternalPlayerDelegateParameters = PlayerDelegateParametersKt.PlayerDelegateParameters(new DrmTypeConsumer() { // from class: ru.yandex.video.m3.player.parameters.ExternalPlayerDelegateParametersKt$ExternalPlayerDelegateParameters$1
        @Override // ru.yandex.video.m3.player.provider.Consumer
        public void accept(DrmType value) {
        }
    }, Looper.getMainLooper(), new ImmutableTrackSelectionRestrictionsProvider(0, 0, 0, 7, null), ScalingMode.DEFAULT, new tls() { // from class: ru.yandex.video.m3.player.parameters.ExternalPlayerDelegateParametersKt$ExternalPlayerDelegateParameters$2
        @Override // defpackage.tls
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PlayerDelegateParameters.Builder) obj);
            return zy11.a;
        }

        public final void invoke(PlayerDelegateParameters.Builder builder) {
            builder.setReportBuilder(null);
        }
    });

    public static final PlayerDelegateParameters getExternalPlayerDelegateParameters() {
        return ExternalPlayerDelegateParameters;
    }
}
