package ru.yandex.taxi.masstransit.main.ui.modal;

import android.os.SystemClock;
import android.view.Choreographer;
import defpackage.e211;
import defpackage.lo30;
import kotlin.Metadata;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MtMainFlexModalView$onAttachedToWindow$$inlined$doOnFrameDrawn$1$2 implements Choreographer.FrameCallback {
    final /* synthetic */ long $start;
    final /* synthetic */ MtMainFlexModalView this$0;

    public MtMainFlexModalView$onAttachedToWindow$$inlined$doOnFrameDrawn$1$2(long j, MtMainFlexModalView mtMainFlexModalView) {
        this.$start = j;
        this.this$0 = mtMainFlexModalView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        lo30 lo30Var;
        SystemClock.elapsedRealtimeNanos();
        lo30Var = this.this$0.presenter;
        lo30Var.J.i(new e211(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
    }
}
