package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o8b implements n0c {
    public boolean a;
    public boolean b;

    public static dkh a(rdk rdkVar, hr4 hr4Var) {
        dkh fkhVar;
        StringBuilder sb = new StringBuilder("createCodec:");
        mih mihVar = (mih) rdkVar.b;
        mih mihVar2 = (mih) rdkVar.b;
        sb.append(mihVar.a);
        Trace.beginSection(sb.toString());
        if (hr4Var == null) {
            MediaCodec createByCodecName = MediaCodec.createByCodecName(mihVar2.a);
            createByCodecName.getClass();
            fkhVar = new o7j(createByCodecName);
        } else {
            yfx yfxVar = new yfx(2, rdkVar);
            String str = mihVar2.a;
            str.getClass();
            fkhVar = new fkh(str, yfxVar, hr4Var);
        }
        Trace.endSection();
        return fkhVar;
    }

    @Override // defpackage.n0c
    public final iih c(rdk rdkVar, hr4 hr4Var) {
        dkh dkhVar = null;
        try {
            ((mih) rdkVar.b).getClass();
            if (hr4Var == null) {
                hr4Var = null;
            }
            dkhVar = a(rdkVar, hr4Var);
            wnn wnnVar = new wnn(dkhVar, (uzg) rdkVar.g, this.b);
            wnnVar.f = this.a;
            wnnVar.E(rdkVar);
            wnnVar.F();
            return wnnVar;
        } catch (IOException | RuntimeException e) {
            if (dkhVar != null) {
                dkhVar.a();
            }
            throw e;
        }
    }

    @Override // defpackage.gih
    public final iih h(rdk rdkVar) {
        return c(rdkVar, null);
    }
}
