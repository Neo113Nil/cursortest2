package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
public final class vj7 implements n0c {
    public final rt1 a;
    public final rt1 b;
    public boolean c;

    public vj7(int i) {
        rt1 rt1Var = new rt1(i, 2);
        rt1 rt1Var2 = new rt1(i, 3);
        this.c = false;
        this.a = rt1Var;
        this.b = rt1Var2;
    }

    @Override // defpackage.n0c
    public final iih c(rdk rdkVar, hr4 hr4Var) {
        Exception exc;
        dkh dkhVar;
        wj7 wj7Var;
        mih mihVar = (mih) rdkVar.b;
        wj7 wj7Var2 = null;
        try {
            Trace.beginSection("createCodec:" + mihVar.a);
            if (hr4Var == null) {
                MediaCodec createByCodecName = MediaCodec.createByCodecName(mihVar.a);
                createByCodecName.getClass();
                dkhVar = new o7j(createByCodecName);
            } else {
                yfx yfxVar = new yfx(1, rdkVar);
                String str = ((mih) rdkVar.b).a;
                str.getClass();
                dkhVar = new fkh(str, yfxVar, hr4Var);
            }
            try {
                wj7Var = new wj7(dkhVar, (HandlerThread) this.a.get(), new bq2(dkhVar, (HandlerThread) this.b.get()), (uzg) rdkVar.g, this.c);
            } catch (Exception e) {
                exc = e;
            }
        } catch (Exception e2) {
            exc = e2;
            dkhVar = null;
        }
        try {
            Trace.endSection();
            Surface surface = (Surface) rdkVar.e;
            wj7Var.y((MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && mihVar.k && dvt.a >= 35) ? 8 : 0);
            return wj7Var;
        } catch (Exception e3) {
            exc = e3;
            wj7Var2 = wj7Var;
            if (wj7Var2 != null) {
                wj7Var2.a();
                throw exc;
            }
            if (dkhVar == null) {
                throw exc;
            }
            dkhVar.a();
            throw exc;
        }
    }

    @Override // defpackage.gih
    public final iih h(rdk rdkVar) {
        return c(rdkVar, null);
    }
}
