package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import defpackage.bts;
import defpackage.fid;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$SpeedTelemetryDebugKt {
    public static final ComposableSingletons$SpeedTelemetryDebugKt INSTANCE = new ComposableSingletons$SpeedTelemetryDebugKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static wls f91lambda1 = new a(-1201970562, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ComposableSingletons$SpeedTelemetryDebugKt$lambda-1$1
        public final void invoke(fid fidVar, int i) {
            if ((i & 3) == 2) {
                bts btsVar = (bts) fidVar;
                if (btsVar.E()) {
                    btsVar.Y();
                    return;
                }
            }
            SpeedTelemetryDebugKt.SpeedTelemetryDebug(new SpeedTelemetry("vplvqpheuhe4ee7lotxq", null, 280L, 2258L, 2258L, "start_playback"), 123L, false, null, fidVar, 432, 8);
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((fid) obj, ((Number) obj2).intValue());
            return zy11.a;
        }
    }, false);

    /* renamed from: lambda-2, reason: not valid java name */
    public static wls f92lambda2 = new a(-1440678221, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ComposableSingletons$SpeedTelemetryDebugKt$lambda-2$1
        public final void invoke(fid fidVar, int i) {
            if ((i & 3) == 2) {
                bts btsVar = (bts) fidVar;
                if (btsVar.E()) {
                    btsVar.Y();
                    return;
                }
            }
            SpeedTelemetryDebugKt.SpeedTelemetryDebug(new SpeedTelemetry("vplvqpheuhe4ee7lotxq", null, 280L, 2258L, 2258L, "start_playback"), 342L, true, null, fidVar, 432, 8);
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((fid) obj, ((Number) obj2).intValue());
            return zy11.a;
        }
    }, false);

    /* renamed from: getLambda-1$video_player_internalRelease, reason: not valid java name */
    public final wls m921getLambda1$video_player_internalRelease() {
        return f91lambda1;
    }

    /* renamed from: getLambda-2$video_player_internalRelease, reason: not valid java name */
    public final wls m922getLambda2$video_player_internalRelease() {
        return f92lambda2;
    }
}
