package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import com.google.android.datatransport.runtime.scheduling.persistence.e;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class tu6 implements cjf {
    public Context a;

    public tu6(Context context) {
        this.a = context.getApplicationContext();
    }

    public sbg a() {
        Context context = this.a;
        if (context == null) {
            vg10.n(Context.class.getCanonicalName(), " must be set");
            return null;
        }
        sbg sbgVar = new sbg();
        sbgVar.a = j5m.a(vko.a);
        k5m k5mVar = new k5m(context);
        sbgVar.b = k5mVar;
        l6z0 l6z0Var = k6z0.a;
        n6z0 n6z0Var = m6z0.a;
        sbgVar.c = j5m.a(new y820(k5mVar, new v8f(k5mVar, l6z0Var, n6z0Var)));
        k5m k5mVar2 = sbgVar.b;
        sbgVar.w = new e(k5mVar2, vgo.a, ygo.a);
        yvf0 a = j5m.a(new c(l6z0Var, n6z0Var, zgo.a, sbgVar.w, j5m.a(new xgo(k5mVar2, 0))));
        sbgVar.x = a;
        xgo xgoVar = new xgo(l6z0Var, 1);
        k5m k5mVar3 = sbgVar.b;
        qom0 qom0Var = new qom0(k5mVar3, a, xgoVar, n6z0Var, 0);
        yvf0 yvf0Var = sbgVar.a;
        yvf0 yvf0Var2 = sbgVar.c;
        sbgVar.y = j5m.a(new ujh(l6z0Var, n6z0Var, new ujh(yvf0Var, yvf0Var2, qom0Var, a, a), new xd21(k5mVar3, yvf0Var2, a, qom0Var, yvf0Var, a, l6z0Var, n6z0Var, a), new qom0(yvf0Var, a, qom0Var, a, 1)));
        return sbgVar;
    }

    @Override // defpackage.cjf
    public byte[][] provide() {
        try {
            InputStream openRawResource = this.a.getResources().openRawResource(exh0.bundled_cert);
            try {
                byte[] R = rzo.R(openRawResource);
                ooc.g(openRawResource, null);
                return new byte[][]{R};
            } finally {
            }
        } catch (IOException e) {
            ny61.h("Failed to create cert", e);
            return null;
        }
    }
}
