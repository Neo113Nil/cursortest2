package flex.network.cache;

import defpackage.dyg;
import defpackage.glv;
import defpackage.gxj;
import defpackage.jp50;
import defpackage.kc7;
import defpackage.n8j0;
import defpackage.oy2;
import defpackage.p7j0;
import defpackage.tls;
import defpackage.yic;
import defpackage.zcx;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class a implements jp50 {
    public final /* synthetic */ yic a;

    public a(oy2 oy2Var, File file, File file2, zcx zcxVar) {
        this.a = new yic(new glv(oy2Var, NetworkCaching$Default$1.b, zcxVar), new gxj(oy2Var, file, file2, NetworkCaching$Default$2.b, zcxVar));
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        this.a.delete(p7j0Var);
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        this.a.invalidate();
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        return this.a.load(p7j0Var, tlsVar);
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        return this.a.save(n8j0Var, z, inputStream, tlsVar);
    }
}
