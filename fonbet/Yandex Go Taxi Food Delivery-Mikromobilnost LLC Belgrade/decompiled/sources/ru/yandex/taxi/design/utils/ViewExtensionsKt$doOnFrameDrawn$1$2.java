package ru.yandex.taxi.design.utils;

import android.os.SystemClock;
import android.view.Choreographer;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 176)
/* loaded from: classes14.dex */
public final class ViewExtensionsKt$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ tls $block;
    final /* synthetic */ long $start;

    public ViewExtensionsKt$doOnFrameDrawn$1$2(tls tlsVar, long j) {
        this.$block = tlsVar;
        this.$start = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.$block.invoke(Long.valueOf(SystemClock.elapsedRealtimeNanos() - this.$start));
    }
}
