package defpackage;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class stu implements y9t0 {
    public final kwu a;
    public final ias b;
    public boolean c;
    public final /* synthetic */ xtu w;

    public stu(xtu xtuVar, kwu kwuVar) {
        this.w = xtuVar;
        this.a = kwuVar;
        this.b = new ias(((jci0) xtuVar.c.c).a.timeout());
    }

    public final void a(meu meuVar) {
        OkHttpClient okHttpClient;
        ine ineVar;
        xtu xtuVar = this.w;
        int i = xtuVar.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            w511.d(xtuVar.d, "state: ");
            return;
        }
        ias iasVar = this.b;
        ydz0 ydz0Var = iasVar.e;
        iasVar.e = ydz0.d;
        ydz0Var.a();
        ydz0Var.b();
        xtuVar.d = 6;
        if (meuVar.size() <= 0 || (okHttpClient = xtuVar.a) == null || (ineVar = okHttpClient.C) == null) {
            return;
        }
        ByteString byteString = lvu.a;
        if (ineVar == ine.a) {
            return;
        }
        Pattern pattern = ane.k;
        orb1.d(this.a, meuVar).isEmpty();
    }

    @Override // defpackage.y9t0
    public long read(yp6 yp6Var, long j) {
        xtu xtuVar = this.w;
        try {
            return ((jci0) xtuVar.c.c).read(yp6Var, j);
        } catch (IOException e) {
            xtuVar.b.b();
            this.a(xtu.f);
            throw e;
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.b;
    }
}
