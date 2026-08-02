package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.mediacodec.wrapper.a;

/* loaded from: classes10.dex */
public final class s5h implements xwo {
    public final kb3 a;
    public final kb3 b;
    public boolean c;

    public s5h(int i) {
        kb3 kb3Var = new kb3(i, 2);
        kb3 kb3Var2 = new kb3(i, 3);
        this.c = false;
        this.a = kb3Var;
        this.b = kb3Var2;
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        return p(lb10Var, null);
    }

    @Override // defpackage.xwo
    public final pb10 p(lb10 lb10Var, ub10 ub10Var) {
        Exception exc;
        hd10 hd10Var;
        sb10 sb10Var = lb10Var.a;
        e eVar = null;
        try {
            Trace.beginSection("createCodec:" + sb10Var.a);
            int i = 0;
            if (ub10Var == null) {
                hd10Var = new cd60(MediaCodec.createByCodecName(sb10Var.a), 0);
            } else {
                hd10Var = new a(lb10Var.a.a, new vbb(1, lb10Var), ub10Var.create());
            }
            try {
                e eVar2 = new e(hd10Var, (HandlerThread) this.a.get(), new d(hd10Var, (HandlerThread) this.b.get()), lb10Var.f, this.c);
                try {
                    Trace.endSection();
                    Surface surface = lb10Var.d;
                    if (surface == null && sb10Var.k && tw21.a >= 35) {
                        i = 8;
                    }
                    eVar2.h(lb10Var.b, surface, lb10Var.e, i);
                    return eVar2;
                } catch (Exception e) {
                    exc = e;
                    eVar = eVar2;
                    if (eVar != null) {
                        eVar.release();
                        throw exc;
                    }
                    if (hd10Var == null) {
                        throw exc;
                    }
                    hd10Var.release();
                    throw exc;
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            hd10Var = null;
        }
    }
}
