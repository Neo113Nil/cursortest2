package io.flutter.view;

import android.view.Choreographer;
import defpackage.msr;

/* loaded from: classes4.dex */
public final class d implements msr {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public final void a(long j) {
        VsyncWaiter$FrameCallback vsyncWaiter$FrameCallback;
        Choreographer choreographer = Choreographer.getInstance();
        e eVar = this.a;
        VsyncWaiter$FrameCallback vsyncWaiter$FrameCallback2 = eVar.c;
        if (vsyncWaiter$FrameCallback2 != null) {
            vsyncWaiter$FrameCallback2.cookie = j;
            vsyncWaiter$FrameCallback = eVar.c;
            eVar.c = null;
        } else {
            vsyncWaiter$FrameCallback = new VsyncWaiter$FrameCallback(eVar, j);
        }
        choreographer.postFrameCallback(vsyncWaiter$FrameCallback);
    }
}
