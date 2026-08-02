package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class pzh implements tvc {
    public final u5 a;
    public dpj c;
    public final mvn g;
    public final qgr h;
    public boolean i;
    public int j;
    public long l;
    public int b = -1;
    public nq4 d = e3s.b;
    public final gi3 e = new gi3(1, this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public pzh(u5 u5Var, mvn mvnVar, qgr qgrVar) {
        this.a = u5Var;
        this.g = mvnVar;
        this.h = qgrVar;
    }

    public final void a(ozh ozhVar, boolean z) {
        ArrayList arrayList = ozhVar.a;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((dpj) it.next()).c;
        }
        int i2 = this.b;
        if (i2 >= 0 && i > i2) {
            sgr sgrVar = sgr.l;
            Locale locale = Locale.US;
            throw sgrVar.i("message too large " + i + " > " + i2).b();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i);
        this.g.getClass();
        dpj l = mvn.l(5);
        l.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.c = l;
            return;
        }
        int i3 = this.j - 1;
        u5 u5Var = this.a;
        u5Var.b(l, false, false, i3);
        this.j = 1;
        for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
            u5Var.b((dpj) arrayList.get(i4), false, false, 0);
        }
        this.c = (dpj) vz1.m(arrayList, 1);
        this.l = i;
    }

    public final int b(rym rymVar) {
        ozh ozhVar = new ozh(this);
        OutputStream I = this.d.I(ozhVar);
        try {
            int a = rymVar.a(I);
            I.close();
            int i = this.b;
            if (i < 0 || a <= i) {
                a(ozhVar, true);
                return a;
            }
            sgr sgrVar = sgr.l;
            Locale locale = Locale.US;
            throw sgrVar.i("message too large " + a + " > " + i).b();
        } catch (Throwable th) {
            I.close();
            throw th;
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            dpj dpjVar = this.c;
            if (dpjVar != null && dpjVar.b == 0) {
                this.c = null;
                this.a.b(dpjVar, false, false, this.j);
                this.j = 0;
            }
            if (this.c == null) {
                this.g.getClass();
                this.c = mvn.l(i2);
            }
            int min = Math.min(i2, this.c.b);
            this.c.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    @Override // defpackage.tvc
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        dpj dpjVar = this.c;
        if (dpjVar != null && dpjVar.c == 0) {
            this.c = null;
        }
        dpj dpjVar2 = this.c;
        this.c = null;
        this.a.b(dpjVar2, true, true, this.j);
        this.j = 0;
    }

    public final int d(rym rymVar, int i) {
        if (i == -1) {
            ozh ozhVar = new ozh(this);
            int a = rymVar.a(ozhVar);
            a(ozhVar, false);
            return a;
        }
        this.l = i;
        int i2 = this.b;
        if (i2 >= 0 && i > i2) {
            sgr sgrVar = sgr.l;
            Locale locale = Locale.US;
            throw sgrVar.i("message too large " + i + " > " + i2).b();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.c == null) {
            int position = byteBuffer.position() + i;
            this.g.getClass();
            this.c = mvn.l(position);
        }
        c(byteBuffer.array(), 0, byteBuffer.position());
        return rymVar.a(this.e);
    }

    @Override // defpackage.tvc
    public final void flush() {
        dpj dpjVar = this.c;
        if (dpjVar == null || dpjVar.c <= 0) {
            return;
        }
        this.c = null;
        this.a.b(dpjVar, false, true, this.j);
        this.j = 0;
    }

    @Override // defpackage.tvc
    public final boolean isClosed() {
        return this.i;
    }

    @Override // defpackage.tvc
    public final void l(int i) {
        o2g.U("max size already set", this.b == -1);
        this.b = i;
    }

    @Override // defpackage.tvc
    public final tvc r(nq4 nq4Var) {
        this.d = nq4Var;
        return this;
    }

    @Override // defpackage.tvc
    public final void s(rym rymVar) {
        if (this.i) {
            xq0.q("Framer already closed");
            return;
        }
        this.j++;
        int i = this.k + 1;
        this.k = i;
        this.l = 0L;
        qgr qgrVar = this.h;
        qgrVar.c(i);
        boolean z = this.d != e3s.b;
        try {
            int available = rymVar.available();
            int d = (available == 0 || !z) ? d(rymVar, available) : b(rymVar);
            if (available != -1 && d != available) {
                throw sgr.n.i(f1d.e(d, available, "Message length inaccurate ", " != ")).b();
            }
            long j = d;
            qgrVar.e(j);
            qgrVar.f(this.l);
            this.h.d(this.k, this.l, j);
        } catch (IOException e) {
            throw sgr.n.i("Failed to frame message").h(e).b();
        } catch (wgr e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw sgr.n.i("Failed to frame message").h(e3).b();
        }
    }
}
