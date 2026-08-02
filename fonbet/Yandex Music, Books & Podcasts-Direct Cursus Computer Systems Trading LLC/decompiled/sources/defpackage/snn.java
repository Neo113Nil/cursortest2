package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
public final class snn extends wj7 implements unn {
    public boolean h;

    @Override // defpackage.wj7, defpackage.iih
    public final void a() {
        try {
            if (this.h) {
                reset();
            }
        } finally {
            super.a();
        }
    }

    @Override // defpackage.unn
    public final boolean n(MediaCodec.CodecException codecException, rdk rdkVar) {
        dkh dkhVar = (dkh) this.d;
        if (!codecException.isRecoverable()) {
            return false;
        }
        Trace.beginSection("stopCodec");
        dkhVar.stop();
        Trace.endSection();
        z(rdkVar);
        Trace.beginSection("startCodec");
        dkhVar.start();
        Trace.endSection();
        return true;
    }

    @Override // defpackage.unn
    public final void q(rdk rdkVar) {
        reset();
        z(rdkVar);
        Trace.beginSection("startCodec");
        ((dkh) this.d).start();
        Trace.endSection();
    }

    @Override // defpackage.unn
    public final void r(rdk rdkVar) {
        Trace.beginSection("stopCodec");
        dkh dkhVar = (dkh) this.d;
        dkhVar.stop();
        Trace.endSection();
        z(rdkVar);
        Trace.beginSection("startCodec");
        dkhVar.start();
        Trace.endSection();
    }

    @Override // defpackage.unn
    public final void reset() {
        Trace.beginSection("resetCodec");
        ((dkh) this.d).reset();
        Trace.endSection();
    }

    public final void z(rdk rdkVar) {
        dkh dkhVar = (dkh) this.d;
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
}
