package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.e;

/* loaded from: classes10.dex */
public final class qii0 extends e implements sii0 {
    public boolean A;

    public final void j(lb10 lb10Var) {
        hd10 hd10Var = this.b;
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

    @Override // defpackage.sii0
    public final void m(lb10 lb10Var) {
        reset();
        j(lb10Var);
        Trace.beginSection("startCodec");
        this.b.start();
        Trace.endSection();
    }

    @Override // defpackage.sii0
    public final boolean n(MediaCodec.CodecException codecException, lb10 lb10Var) {
        if (!codecException.isRecoverable()) {
            return false;
        }
        Trace.beginSection("stopCodec");
        hd10 hd10Var = this.b;
        hd10Var.stop();
        Trace.endSection();
        j(lb10Var);
        Trace.beginSection("startCodec");
        hd10Var.start();
        Trace.endSection();
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.e, defpackage.pb10
    public final void release() {
        try {
            if (this.A) {
                reset();
            }
        } finally {
            super.release();
        }
    }

    @Override // defpackage.sii0
    public final void reset() {
        Trace.beginSection("resetCodec");
        this.b.reset();
        Trace.endSection();
    }

    @Override // defpackage.sii0
    public final void t(lb10 lb10Var) {
        Trace.beginSection("stopCodec");
        hd10 hd10Var = this.b;
        hd10Var.stop();
        Trace.endSection();
        j(lb10Var);
        Trace.beginSection("startCodec");
        hd10Var.start();
        Trace.endSection();
    }
}
