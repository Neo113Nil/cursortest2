package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.wrapper.a;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class qlh implements xwo {
    public boolean a;

    public static hd10 b(lb10 lb10Var, tb10 tb10Var) {
        hd10 aVar;
        lb10Var.a.getClass();
        sb10 sb10Var = lb10Var.a;
        Trace.beginSection("createCodec:" + sb10Var.a);
        if (tb10Var == null) {
            aVar = new cd60(MediaCodec.createByCodecName(sb10Var.a), 0);
        } else {
            aVar = new a(sb10Var.a, new vbb(0, lb10Var), tb10Var);
        }
        Trace.endSection();
        return aVar;
    }

    @Override // defpackage.xwo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tis0 p(lb10 lb10Var, ub10 ub10Var) {
        tb10 create;
        hd10 hd10Var = null;
        if (ub10Var == null) {
            create = null;
        } else {
            try {
                create = ub10Var.create();
            } catch (IOException | RuntimeException e) {
                if (hd10Var != null) {
                    hd10Var.release();
                }
                throw e;
            }
        }
        hd10Var = b(lb10Var, create);
        Trace.beginSection("configureCodec");
        Surface surface = lb10Var.d;
        hd10Var.configure(lb10Var.b, surface, lb10Var.e, (surface == null && lb10Var.a.k && tw21.a >= 35) ? 8 : 0);
        Trace.endSection();
        Trace.beginSection("startCodec");
        hd10Var.start();
        Trace.endSection();
        return new tis0(hd10Var, lb10Var.f, this.a);
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        return p(lb10Var, null);
    }
}
