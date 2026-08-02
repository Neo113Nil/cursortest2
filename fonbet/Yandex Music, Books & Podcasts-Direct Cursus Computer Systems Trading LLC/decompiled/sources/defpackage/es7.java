package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes.dex */
public final class es7 implements n0c {
    public boolean a;

    public static dkh b(rdk rdkVar, hr4 hr4Var) {
        dkh fkhVar;
        ((mih) rdkVar.b).getClass();
        mih mihVar = (mih) rdkVar.b;
        Trace.beginSection("createCodec:" + mihVar.a);
        if (hr4Var == null) {
            MediaCodec createByCodecName = MediaCodec.createByCodecName(mihVar.a);
            createByCodecName.getClass();
            fkhVar = new o7j(createByCodecName);
        } else {
            yfx yfxVar = new yfx(0, rdkVar);
            String str = mihVar.a;
            str.getClass();
            fkhVar = new fkh(str, yfxVar, hr4Var);
        }
        Trace.endSection();
        return fkhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // defpackage.n0c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fmq c(rdk rdkVar, hr4 hr4Var) {
        dkh dkhVar = null;
        if (hr4Var == null) {
            hr4Var = null;
        }
        try {
            dkhVar = b(rdkVar, hr4Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) rdkVar.e;
            dkhVar.n((MediaFormat) rdkVar.c, surface, (MediaCrypto) rdkVar.f, (surface == null && ((mih) rdkVar.b).k && dvt.a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            dkhVar.start();
            Trace.endSection();
            return new fmq(dkhVar, (uzg) rdkVar.g, this.a);
        } catch (IOException e) {
            e = e;
            if (dkhVar != null) {
                dkhVar.a();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (dkhVar != null) {
            }
            throw e;
        }
    }

    @Override // defpackage.gih
    public final iih h(rdk rdkVar) {
        return c(rdkVar, null);
    }
}
