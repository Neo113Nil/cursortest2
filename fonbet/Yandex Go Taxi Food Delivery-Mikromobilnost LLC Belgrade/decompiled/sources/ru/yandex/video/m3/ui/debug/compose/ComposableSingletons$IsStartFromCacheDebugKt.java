package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import defpackage.bts;
import defpackage.fid;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$IsStartFromCacheDebugKt {
    public static final ComposableSingletons$IsStartFromCacheDebugKt INSTANCE = new ComposableSingletons$IsStartFromCacheDebugKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static wls f89lambda1 = new a(965432986, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ComposableSingletons$IsStartFromCacheDebugKt$lambda-1$1
        public final void invoke(fid fidVar, int i) {
            if ((i & 3) == 2) {
                bts btsVar = (bts) fidVar;
                if (btsVar.E()) {
                    btsVar.Y();
                    return;
                }
            }
            IsStartFromCacheDebugKt.IsStartFromCacheDebug(Boolean.TRUE, null, fidVar, 6, 2);
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((fid) obj, ((Number) obj2).intValue());
            return zy11.a;
        }
    }, false);

    /* renamed from: getLambda-1$video_player_internalRelease, reason: not valid java name */
    public final wls m919getLambda1$video_player_internalRelease() {
        return f89lambda1;
    }
}
