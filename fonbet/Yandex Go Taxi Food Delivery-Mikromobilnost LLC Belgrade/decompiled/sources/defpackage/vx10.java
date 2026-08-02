package defpackage;

import defpackage.jrb0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.scer.pdfx.a;

/* loaded from: classes4.dex */
public final class vx10 implements wuy0 {
    public final /* synthetic */ a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TextureRegistry$SurfaceProducer c;

    public vx10(a aVar, int i, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        this.a = aVar;
        this.b = i;
        this.c = textureRegistry$SurfaceProducer;
    }

    @Override // defpackage.wuy0
    public final void onSurfaceAvailable() {
        a aVar = this.a;
        jrb0.l lVar = (jrb0.l) aVar.e.get(this.b);
        if (lVar != null) {
            aVar.e(this.c.getSurface(), lVar, null);
        }
    }

    @Override // defpackage.wuy0
    public final void onSurfaceCleanup() {
    }
}
