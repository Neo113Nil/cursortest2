package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Response;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yv60 implements Call {
    public Throwable A;
    public boolean B;
    public final m6j0 a;
    public final Object b;
    public final Object[] c;
    public final xf7 w;
    public final zme x;
    public volatile boolean y;
    public yf7 z;

    public yv60(m6j0 m6j0Var, Object obj, Object[] objArr, xf7 xf7Var, zme zmeVar) {
        this.a = m6j0Var;
        this.b = obj;
        this.c = objArr;
        this.w = xf7Var;
        this.x = zmeVar;
    }

    public final yf7 a() {
        jwu jwuVar;
        kwu e;
        m6j0 m6j0Var = this.a;
        d6z[] d6zVarArr = m6j0Var.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != d6zVarArr.length) {
            ny61.g(oyr.m(d6zVarArr.length, Extension.C_BRAKE, b64.t(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        q5j0 q5j0Var = new q5j0(m6j0Var.d, m6j0Var.c, m6j0Var.e, m6j0Var.f, m6j0Var.g, m6j0Var.h, m6j0Var.i, m6j0Var.j);
        if (m6j0Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            d6zVarArr[i].c(q5j0Var, objArr[i]);
        }
        jwu jwuVar2 = q5j0Var.d;
        if (jwuVar2 != null) {
            e = jwuVar2.e();
        } else {
            String str = q5j0Var.c;
            kwu kwuVar = q5j0Var.b;
            kwuVar.getClass();
            try {
                jwuVar = new jwu();
                jwuVar.i(kwuVar, str);
            } catch (IllegalArgumentException unused) {
                jwuVar = null;
            }
            e = jwuVar != null ? jwuVar.e() : null;
            if (e == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(kwuVar);
                w511.p(sb, ", Relative: ", q5j0Var.c);
                return null;
            }
        }
        m5j0 m5j0Var = q5j0Var.k;
        if (m5j0Var == null) {
            l3s l3sVar = q5j0Var.j;
            if (l3sVar != null) {
                m5j0Var = new m3s(l3sVar.a, l3sVar.b);
            } else {
                yw40 yw40Var = q5j0Var.i;
                if (yw40Var != null) {
                    m5j0Var = yw40Var.c();
                } else if (q5j0Var.h) {
                    int i2 = m5j0.a;
                    m5j0Var = wms.c(null, new byte[0]);
                }
            }
        }
        wg10 wg10Var = q5j0Var.g;
        keu keuVar = q5j0Var.f;
        if (wg10Var != null) {
            if (m5j0Var != null) {
                m5j0Var = new fzq(m5j0Var, wg10Var);
            } else {
                keuVar.a("Content-Type", wg10Var.a);
            }
        }
        t4j0 t4j0Var = q5j0Var.e;
        t4j0Var.a = e;
        t4j0Var.c = keuVar.d().d();
        t4j0Var.e(q5j0Var.a, m5j0Var);
        t4j0Var.g(bxw.class, new bxw(m6j0Var.a, this.b, m6j0Var.b, arrayList));
        yf7 newCall = this.w.newCall(new d5j0(t4j0Var));
        if (newCall != null) {
            return newCall;
        }
        ny61.t("Call.Factory returned null.");
        return null;
    }

    public final yf7 b() {
        yf7 yf7Var = this.z;
        if (yf7Var != null) {
            return yf7Var;
        }
        Throwable th = this.A;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            yf7 a = a();
            this.z = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            udq0.R(e);
            this.A = e;
            throw e;
        }
    }

    public final Response c(kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        cvj0 c = kvj0Var.c();
        c.g = new xv60(rvj0Var.contentLength(), rvj0Var.contentType());
        kvj0 a = c.a();
        int i = a.w;
        if (i < 200 || i >= 300) {
            try {
                yp6 yp6Var = new yp6();
                rvj0Var.source().y0(yp6Var);
                return Response.a(rvj0.create(rvj0Var.contentType(), rvj0Var.contentLength(), yp6Var), a);
            } finally {
                rvj0Var.close();
            }
        }
        if (i == 204 || i == 205) {
            rvj0Var.close();
            return Response.c(null, a);
        }
        wv60 wv60Var = new wv60(rvj0Var);
        try {
            return Response.c(this.x.l(wv60Var), a);
        } catch (RuntimeException e) {
            IOException iOException = wv60Var.c;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        yf7 yf7Var;
        this.y = true;
        synchronized (this) {
            yf7Var = this.z;
        }
        if (yf7Var != null) {
            yf7Var.cancel();
        }
    }

    public final Object clone() {
        return new yv60(this.a, this.b, this.c, this.w, this.x);
    }

    @Override // retrofit2.Call
    public final Response execute() {
        yf7 b;
        synchronized (this) {
            if (this.B) {
                throw new IllegalStateException("Already executed.");
            }
            this.B = true;
            b = b();
        }
        if (this.y) {
            b.cancel();
        }
        return c(b.execute());
    }

    @Override // retrofit2.Call
    public final synchronized d5j0 k() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().k();
    }

    @Override // retrofit2.Call
    public final void k0(yk7 yk7Var) {
        yf7 yf7Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.B) {
                    throw new IllegalStateException("Already executed.");
                }
                this.B = true;
                yf7Var = this.z;
                th = this.A;
                if (yf7Var == null && th == null) {
                    try {
                        yf7 a = a();
                        this.z = a;
                        yf7Var = a;
                    } catch (Throwable th2) {
                        th = th2;
                        udq0.R(th);
                        this.A = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            yk7Var.k(this, th);
            return;
        }
        if (this.y) {
            yf7Var.cancel();
        }
        yf7Var.I(new g5e(this, yk7Var));
    }

    @Override // retrofit2.Call
    public final synchronized boolean l1() {
        return this.B;
    }

    @Override // retrofit2.Call
    public final boolean n() {
        boolean z = true;
        if (this.y) {
            return true;
        }
        synchronized (this) {
            try {
                yf7 yf7Var = this.z;
                if (yf7Var == null || !yf7Var.n()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new yv60(this.a, this.b, this.c, this.w, this.x);
    }
}
