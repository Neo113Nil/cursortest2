package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.io.IOException;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class foj implements Call {
    public final x0o a;
    public final Object[] b;
    public final ds3 c;
    public final vj6 d;
    public volatile boolean e;
    public es3 f;
    public Throwable g;
    public boolean h;

    public foj(x0o x0oVar, Object[] objArr, ds3 ds3Var, vj6 vj6Var) {
        this.a = x0oVar;
        this.b = objArr;
        this.c = ds3Var;
        this.d = vj6Var;
    }

    @Override // retrofit2.Call
    public final void D(os3 os3Var) {
        es3 es3Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.h = true;
                es3Var = this.f;
                th = this.g;
                if (es3Var == null && th == null) {
                    try {
                        es3 b = b();
                        this.f = b;
                        es3Var = b;
                    } catch (Throwable th2) {
                        th = th2;
                        jf0.Z(th);
                        this.g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            os3Var.A(this, th);
            return;
        }
        if (this.e) {
            es3Var.cancel();
        }
        es3Var.z(new g02(2, this, os3Var));
    }

    @Override // retrofit2.Call
    public final synchronized d0o a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return c().a();
    }

    public final es3 b() {
        s7e s7eVar;
        u7e e;
        x0o x0oVar = this.a;
        p1g[] p1gVarArr = x0oVar.j;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length != p1gVarArr.length) {
            xq0.x(f1d.i(k5r.q(length, "Argument count (", ") doesn't match expected count ("), p1gVarArr.length, ")"));
            return null;
        }
        j0o j0oVar = new j0o(x0oVar.c, x0oVar.b, x0oVar.d, x0oVar.e, x0oVar.f, x0oVar.g, x0oVar.h, x0oVar.i);
        if (x0oVar.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            p1gVarArr[i].y(j0oVar, objArr[i]);
        }
        s7e s7eVar2 = j0oVar.d;
        if (s7eVar2 != null) {
            e = s7eVar2.e();
        } else {
            String str = j0oVar.c;
            u7e u7eVar = j0oVar.b;
            u7eVar.getClass();
            str.getClass();
            try {
                s7eVar = new s7e();
                s7eVar.h(u7eVar, str);
            } catch (IllegalArgumentException unused) {
                s7eVar = null;
            }
            e = s7eVar != null ? s7eVar.e() : null;
            if (e == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(u7eVar);
                wvs.l(sb, ", Relative: ", j0oVar.c);
                return null;
            }
        }
        h0o h0oVar = j0oVar.k;
        if (h0oVar == null) {
            xiu xiuVar = j0oVar.j;
            if (xiuVar != null) {
                h0oVar = new zrc((ArrayList) xiuVar.b, (ArrayList) xiuVar.c);
            } else {
                ime imeVar = j0oVar.i;
                if (imeVar != null) {
                    ArrayList arrayList2 = (ArrayList) imeVar.d;
                    if (arrayList2.isEmpty()) {
                        xq0.q("Multipart body must have at least one part.");
                        return null;
                    }
                    h0oVar = new bhi((pn3) imeVar.b, (twh) imeVar.c, cvt.x(arrayList2));
                } else if (j0oVar.h) {
                    long j = 0;
                    cvt.c(j, j, j);
                    h0oVar = new g0o(null, 0, new byte[0]);
                }
            }
        }
        twh twhVar = j0oVar.g;
        pv9 pv9Var = j0oVar.f;
        if (twhVar != null) {
            if (h0oVar != null) {
                h0oVar = new f0o(h0oVar, twhVar);
            } else {
                pv9Var.e(HttpMessage.CONTENT_TYPE_HEADER, twhVar.a);
            }
        }
        b0o b0oVar = j0oVar.e;
        b0oVar.getClass();
        b0oVar.a = e;
        b0oVar.c = pv9Var.r().m();
        b0oVar.e(j0oVar.a, h0oVar);
        b0oVar.f(jye.class, new jye(x0oVar.a, arrayList));
        es3 b = this.c.b(b0oVar.b());
        if (b != null) {
            return b;
        }
        jj4.j("Call.Factory returned null.");
        return null;
    }

    public final es3 c() {
        es3 es3Var = this.f;
        if (es3Var != null) {
            return es3Var;
        }
        Throwable th = this.g;
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
            es3 b = b();
            this.f = b;
            return b;
        } catch (IOException | Error | RuntimeException e) {
            jf0.Z(e);
            this.g = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        es3 es3Var;
        this.e = true;
        synchronized (this) {
            es3Var = this.f;
        }
        if (es3Var != null) {
            es3Var.cancel();
        }
    }

    public final Object clone() {
        return new foj(this.a, this.b, this.c, this.d);
    }

    public final Response d(l3o l3oVar) {
        o3o o3oVar = l3oVar.g;
        k3o g = l3oVar.g();
        g.g = new eoj(o3oVar.g(), o3oVar.o());
        l3o a = g.a();
        int i = a.d;
        if (i < 200 || i >= 300) {
            try {
                hi3 hi3Var = new hi3();
                o3oVar.z().q0(hi3Var);
                return Response.a(new wkn(o3oVar.o(), o3oVar.g(), hi3Var, 1), a);
            } finally {
                o3oVar.close();
            }
        }
        if (i == 204 || i == 205) {
            o3oVar.close();
            return Response.c(null, a);
        }
        doj dojVar = new doj(o3oVar);
        try {
            return Response.c(this.d.a(dojVar), a);
        } catch (RuntimeException e) {
            IOException iOException = dojVar.d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final boolean o() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            try {
                es3 es3Var = this.f;
                if (es3Var == null || !es3Var.o()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    /* renamed from: clone */
    public final Call mo12clone() {
        return new foj(this.a, this.b, this.c, this.d);
    }
}
