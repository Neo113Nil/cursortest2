package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes10.dex */
public final class uii0 extends tis0 implements sii0 {
    public boolean y;

    public final void b0(lb10 lb10Var) {
        hd10 hd10Var = (hd10) this.c;
        String name = hd10Var.getName();
        sb10 sb10Var = lb10Var.a;
        if (!name.equals(sb10Var.a)) {
            ny61.g(b64.l("codec ", hd10Var.getName(), " does not match configuration with codec name ", sb10Var.a));
            return;
        }
        Trace.beginSection("configureCodec");
        Surface surface = lb10Var.d;
        hd10Var.configure(lb10Var.b, surface, lb10Var.e, (surface == null && sb10Var.k && tw21.a >= 35) ? 8 : 0);
        Trace.endSection();
    }

    public final void c0() {
        Trace.beginSection("startCodec");
        ((hd10) this.c).start();
        Trace.endSection();
    }

    @Override // defpackage.sii0
    public final void m(lb10 lb10Var) {
        reset();
        b0(lb10Var);
        c0();
    }

    @Override // defpackage.sii0
    public final boolean n(MediaCodec.CodecException codecException, lb10 lb10Var) {
        if (!codecException.isRecoverable()) {
            return false;
        }
        Trace.beginSection("stopCodec");
        ((hd10) this.c).stop();
        Trace.endSection();
        b0(lb10Var);
        c0();
        return true;
    }

    @Override // defpackage.tis0, defpackage.pb10
    public final void release() {
        try {
            if (this.y) {
                reset();
            }
        } finally {
            super.release();
        }
    }

    @Override // defpackage.sii0
    public final void reset() {
        Trace.beginSection("resetCodec");
        ((hd10) this.c).reset();
        Trace.endSection();
    }

    @Override // defpackage.sii0
    public final void t(lb10 lb10Var) {
        Trace.beginSection("stopCodec");
        ((hd10) this.c).stop();
        Trace.endSection();
        b0(lb10Var);
        c0();
    }
}
