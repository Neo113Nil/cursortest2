package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
public final class tnn implements n0c {
    public final rt1 a;
    public final rt1 b;
    public boolean c;
    public boolean d;

    public tnn(int i) {
        rt1 rt1Var = new rt1(i, 4);
        rt1 rt1Var2 = new rt1(i, 5);
        this.c = false;
        this.d = false;
        this.a = rt1Var;
        this.b = rt1Var2;
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.n0c
    public final iih c(rdk rdkVar, hr4 hr4Var) {
        Exception exc;
        dkh dkhVar;
        snn snnVar;
        mih mihVar = (mih) rdkVar.b;
        snn snnVar2 = null;
        try {
            Trace.beginSection("createCodec:" + mihVar.a);
            if (hr4Var == null) {
                MediaCodec createByCodecName = MediaCodec.createByCodecName(mihVar.a);
                createByCodecName.getClass();
                dkhVar = new o7j(createByCodecName);
            } else {
                yfx yfxVar = new yfx(3, rdkVar);
                String str = ((mih) rdkVar.b).a;
                str.getClass();
                dkhVar = new fkh(str, yfxVar, hr4Var);
            }
            try {
                snnVar = new snn(dkhVar, (HandlerThread) this.a.get(), new bq2(dkhVar, (HandlerThread) this.b.get()), (uzg) rdkVar.g, this.d);
            } catch (Exception e) {
                exc = e;
            }
            try {
                snnVar.h = this.c;
                Trace.endSection();
                Surface surface = (Surface) rdkVar.e;
                snnVar.y((MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && mihVar.k && dvt.a >= 35) ? 8 : 0);
                return snnVar;
            } catch (Exception e2) {
                exc = e2;
                snnVar2 = snnVar;
                if (snnVar2 != null) {
                    snnVar2.a();
                    throw exc;
                }
                if (dkhVar == null) {
                    throw exc;
                }
                dkhVar.a();
                throw exc;
            }
        } catch (Exception e3) {
            exc = e3;
            dkhVar = null;
        }
    }

    @Override // defpackage.gih
    public final iih h(rdk rdkVar) {
        return c(rdkVar, null);
    }
}
