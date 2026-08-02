package defpackage;

import android.view.Choreographer;
import flex.engine.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class uxl implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ d3m c;

    public /* synthetic */ uxl(a aVar, d3m d3mVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = d3mVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        d3m d3mVar = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.V.onRenderingFinishedLegacy(aVar.Q, d3mVar.c, d3mVar.b.a, j, aVar.a.c());
                break;
            default:
                aVar.V.onRenderingFinished(aVar.Q, d3mVar.c, d3mVar.b, j, aVar.a.c());
                aVar.P.z(new hzl(d3mVar.b));
                break;
        }
    }
}
