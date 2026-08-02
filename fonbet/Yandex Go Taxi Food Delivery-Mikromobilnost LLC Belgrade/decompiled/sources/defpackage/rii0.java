package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.wrapper.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class rii0 implements xwo {
    public final kb3 a;
    public final kb3 b;
    public boolean c;
    public boolean w;

    public rii0(int i) {
        kb3 kb3Var = new kb3(i, 4);
        kb3 kb3Var2 = new kb3(i, 5);
        this.c = false;
        this.w = false;
        this.a = kb3Var;
        this.b = kb3Var2;
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            n.A(sb, "Unknown(", i, Extension.C_BRAKE);
        }
        return sb.toString();
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        return p(lb10Var, null);
    }

    @Override // defpackage.xwo
    public final pb10 p(lb10 lb10Var, ub10 ub10Var) {
        Exception exc;
        hd10 hd10Var;
        qii0 qii0Var;
        sb10 sb10Var = lb10Var.a;
        qii0 qii0Var2 = null;
        try {
            Trace.beginSection("createCodec:" + sb10Var.a);
            int i = 0;
            if (ub10Var == null) {
                hd10Var = new cd60(MediaCodec.createByCodecName(sb10Var.a), 0);
            } else {
                hd10Var = new a(lb10Var.a.a, new vbb(3, lb10Var), ub10Var.create());
            }
            try {
                qii0Var = new qii0(hd10Var, (HandlerThread) this.a.get(), new d(hd10Var, (HandlerThread) this.b.get()), lb10Var.f, this.w);
            } catch (Exception e) {
                exc = e;
            }
            try {
                qii0Var.A = this.c;
                Trace.endSection();
                Surface surface = lb10Var.d;
                if (surface == null && sb10Var.k && tw21.a >= 35) {
                    i = 8;
                }
                qii0Var.h(lb10Var.b, surface, lb10Var.e, i);
                return qii0Var;
            } catch (Exception e2) {
                exc = e2;
                qii0Var2 = qii0Var;
                if (qii0Var2 != null) {
                    qii0Var2.release();
                    throw exc;
                }
                if (hd10Var == null) {
                    throw exc;
                }
                hd10Var.release();
                throw exc;
            }
        } catch (Exception e3) {
            exc = e3;
            hd10Var = null;
        }
    }
}
