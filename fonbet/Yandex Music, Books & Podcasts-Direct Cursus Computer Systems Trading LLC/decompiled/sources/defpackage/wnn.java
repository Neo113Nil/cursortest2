package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
public final class wnn extends fmq implements unn {
    public boolean f;

    public final void E(rdk rdkVar) {
        dkh dkhVar = (dkh) this.c;
        String name = dkhVar.getName();
        mih mihVar = (mih) rdkVar.b;
        if (!name.equals(mihVar.a)) {
            xq0.x(hrg.r("codec ", dkhVar.getName(), " does not match configuration with codec name ", mihVar.a));
            return;
        }
        Trace.beginSection("configureCodec");
        Surface surface = (Surface) rdkVar.e;
        dkhVar.n((MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && mihVar.k && dvt.a >= 35) ? 8 : 0);
        Trace.endSection();
    }

    public final void F() {
        Trace.beginSection("startCodec");
        ((dkh) this.c).start();
        Trace.endSection();
    }

    @Override // defpackage.fmq, defpackage.iih
    public final void a() {
        try {
            if (this.f) {
                reset();
            }
        } finally {
            super.a();
        }
    }

    @Override // defpackage.unn
    public final boolean n(MediaCodec.CodecException codecException, rdk rdkVar) {
        if (!codecException.isRecoverable()) {
            return false;
        }
        Trace.beginSection("stopCodec");
        ((dkh) this.c).stop();
        Trace.endSection();
        E(rdkVar);
        F();
        return true;
    }

    @Override // defpackage.unn
    public final void q(rdk rdkVar) {
        reset();
        E(rdkVar);
        F();
    }

    @Override // defpackage.unn
    public final void r(rdk rdkVar) {
        Trace.beginSection("stopCodec");
        ((dkh) this.c).stop();
        Trace.endSection();
        E(rdkVar);
        F();
    }

    @Override // defpackage.unn
    public final void reset() {
        Trace.beginSection("resetCodec");
        ((dkh) this.c).reset();
        Trace.endSection();
    }
}
