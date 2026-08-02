package defpackage;

import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
public final class ttu implements uis0 {
    public final ias a;
    public boolean b;
    public final /* synthetic */ xtu c;

    public ttu(xtu xtuVar) {
        this.c = xtuVar;
        this.a = new ias(((ici0) xtuVar.c.w).a.timeout());
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((ici0) this.c.c.w).p1("0\r\n\r\n");
        ias iasVar = this.a;
        ydz0 ydz0Var = iasVar.e;
        iasVar.e = ydz0.d;
        ydz0Var.a();
        ydz0Var.b();
        this.c.d = 3;
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((ici0) this.c.c.w).flush();
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.a;
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        if (this.b) {
            ny61.r("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        ici0 ici0Var = (ici0) this.c.c.w;
        if (ici0Var.c) {
            ny61.r("closed");
            return;
        }
        ici0Var.b.g0(j);
        ici0Var.a();
        ici0Var.p1(Constants.LINE_SEPARATOR);
        ici0Var.write(yp6Var, j);
        ici0Var.p1(Constants.LINE_SEPARATOR);
    }
}
