package defpackage;

import android.util.Log;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;

/* loaded from: classes3.dex */
public final class ms1 implements dt1 {
    public a3r a;
    public SelectionKey b;
    public ys1 c;
    public final om3 d = new om3();
    public aa e;
    public boolean f;
    public d6w g;
    public u97 h;
    public pm5 i;
    public boolean j;
    public pm5 k;

    @Override // defpackage.aa7
    public final ys1 a() {
        return this.c;
    }

    public final void b() {
        this.b.cancel();
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.aa7
    public final void c(u97 u97Var) {
        this.h = u97Var;
    }

    @Override // defpackage.aa7
    public final void close() {
        b();
        i(null);
    }

    @Override // defpackage.sa7
    public final void d(pm5 pm5Var) {
        this.i = pm5Var;
    }

    @Override // defpackage.sa7
    public final void e(om3 om3Var) {
        if (this.c.e != Thread.currentThread()) {
            this.c.h(new x8x(this, om3Var, false, 9));
            return;
        }
        if (this.a.b.isConnected()) {
            try {
                int i = om3Var.c;
                ay0 ay0Var = om3Var.a;
                ByteBuffer[] byteBufferArr = (ByteBuffer[]) ay0Var.toArray(new ByteBuffer[ay0Var.size()]);
                ay0Var.clear();
                om3Var.c = 0;
                this.a.b.write(byteBufferArr);
                om3Var.b(byteBufferArr);
                int i2 = om3Var.c;
                if (!this.b.isValid()) {
                    throw new IOException(new CancelledKeyException());
                }
                SelectionKey selectionKey = this.b;
                if (i2 > 0) {
                    selectionKey.interestOps(selectionKey.interestOps() | 4);
                } else {
                    selectionKey.interestOps(selectionKey.interestOps() & (-5));
                }
                this.c.getClass();
            } catch (IOException e) {
                b();
                j(e);
                i(e);
            }
        }
    }

    @Override // defpackage.sa7
    public final void end() {
        a3r a3rVar = this.a;
        a3rVar.getClass();
        try {
            a3rVar.b.socket().shutdownOutput();
        } catch (Exception unused) {
        }
    }

    public final void f() {
        boolean z;
        om3 om3Var = this.d;
        if (om3Var.i()) {
            v7g.s(this, om3Var);
        }
        try {
            aa aaVar = this.e;
            ByteBuffer j = om3.j(Math.min(Math.max(aaVar.b, aaVar.c), aaVar.a));
            long read = this.a.b.read(j);
            if (read < 0) {
                b();
                z = true;
            } else {
                z = false;
            }
            if (read > 0) {
                this.e.b = ((int) read) * 2;
                j.flip();
                om3Var.a(j);
                v7g.s(this, om3Var);
            } else {
                om3.m(j);
            }
            if (z) {
                j(null);
                i(null);
            }
        } catch (Exception e) {
            b();
            j(e);
            i(e);
        }
    }

    @Override // defpackage.aa7
    public final boolean g() {
        return false;
    }

    @Override // defpackage.sa7
    public final void h(d6w d6wVar) {
        this.g = d6wVar;
    }

    public final void i(Exception exc) {
        if (this.f) {
            return;
        }
        this.f = true;
        pm5 pm5Var = this.i;
        if (pm5Var != null) {
            pm5Var.r(exc);
            this.i = null;
        }
    }

    @Override // defpackage.sa7
    public final boolean isOpen() {
        return this.a.b.isConnected() && this.b.isValid();
    }

    public final void j(Exception exc) {
        if (this.d.i() || this.j) {
            return;
        }
        this.j = true;
        pm5 pm5Var = this.k;
        if (pm5Var != null) {
            pm5Var.r(exc);
        } else if (exc != null) {
            Log.e("NIO", Constants.DEFAULT_MESSAGE, exc);
        }
    }

    @Override // defpackage.aa7
    public final void m() {
        if (this.c.e != Thread.currentThread()) {
            this.c.h(new q9(5, this));
        }
    }

    @Override // defpackage.aa7
    public final void s(pm5 pm5Var) {
        this.k = pm5Var;
    }

    @Override // defpackage.aa7
    public final u97 u() {
        return this.h;
    }
}
