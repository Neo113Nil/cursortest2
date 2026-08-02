package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class z4e extends x4e {
    public final u7e d;
    public long e;
    public boolean f;
    public final /* synthetic */ rd2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4e(rd2 rd2Var, u7e u7eVar) {
        super(rd2Var);
        u7eVar.getClass();
        this.g = rd2Var;
        this.d = u7eVar;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.b) {
            return;
        }
        if (this.f) {
            byte[] bArr = cvt.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = cvt.u(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                ((okn) this.g.d).k();
                a();
            }
        }
        this.b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r11.f == false) goto L34;
     */
    @Override // defpackage.x4e, defpackage.n3r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e0(hi3 hi3Var, long j) {
        rd2 rd2Var = this.g;
        ij3 ij3Var = (ij3) rd2Var.e;
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.b) {
            xq0.q("closed");
            return 0L;
        }
        if (this.f) {
            long j2 = this.e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    ij3Var.T();
                }
                try {
                    this.e = ij3Var.C0();
                    String obj = StringsKt.t0(ij3Var.T()).toString();
                    if (this.e < 0 || (obj.length() > 0 && !c.v(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + obj + '\"');
                    }
                    if (this.e == 0) {
                        this.f = false;
                        au1 au1Var = (au1) rd2Var.g;
                        au1Var.getClass();
                        pv9 pv9Var = new pv9(9);
                        while (true) {
                            String G = ((ij3) au1Var.c).G(au1Var.b);
                            au1Var.b -= G.length();
                            if (G.length() == 0) {
                                break;
                            }
                            pv9Var.f(G);
                        }
                        rd2Var.h = pv9Var.r();
                        OkHttpClient okHttpClient = (OkHttpClient) rd2Var.c;
                        okHttpClient.getClass();
                        e3s e3sVar = okHttpClient.j;
                        zvd zvdVar = (zvd) rd2Var.h;
                        zvdVar.getClass();
                        u6e.b(e3sVar, this.d, zvdVar);
                        a();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long e0 = super.e0(hi3Var, Math.min(j, this.e));
            if (e0 != -1) {
                this.e -= e0;
                return e0;
            }
            ((okn) rd2Var.d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        return -1L;
    }
}
