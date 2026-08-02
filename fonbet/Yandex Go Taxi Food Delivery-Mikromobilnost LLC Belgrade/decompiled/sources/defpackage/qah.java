package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.drm.c;

/* loaded from: classes10.dex */
public final class qah implements pmm {
    public final mmm a;
    public jmm b;
    public boolean c;
    public final /* synthetic */ c w;

    public qah(c cVar, mmm mmmVar) {
        this.w = cVar;
        this.a = mmmVar;
    }

    @Override // defpackage.pmm
    public final void release() {
        Handler handler = this.w.u;
        handler.getClass();
        tw21.a0(handler, new oxe(19, this));
    }
}
