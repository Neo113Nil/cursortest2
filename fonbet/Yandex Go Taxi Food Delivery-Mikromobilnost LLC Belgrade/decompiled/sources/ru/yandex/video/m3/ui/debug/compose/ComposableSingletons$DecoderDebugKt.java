package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import defpackage.bts;
import defpackage.c530;
import defpackage.fid;
import defpackage.ldc;
import defpackage.m4m0;
import defpackage.qke;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$DecoderDebugKt {
    public static final ComposableSingletons$DecoderDebugKt INSTANCE = new ComposableSingletons$DecoderDebugKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static wls f87lambda1 = new a(-920163902, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ComposableSingletons$DecoderDebugKt$lambda-1$1
        public final void invoke(fid fidVar, int i) {
            if ((i & 3) == 2) {
                bts btsVar = (bts) fidVar;
                if (btsVar.E()) {
                    btsVar.Y();
                    return;
                }
            }
            DecoderDebugKt.DecoderDebug(0, "c2.goldfish.h264.decoder", 5, 2, 4, m4m0.b(c530.a, ldc.f, qke.q), fidVar, 224694, 0);
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((fid) obj, ((Number) obj2).intValue());
            return zy11.a;
        }
    }, false);

    /* renamed from: getLambda-1$video_player_internalRelease, reason: not valid java name */
    public final wls m917getLambda1$video_player_internalRelease() {
        return f87lambda1;
    }
}
