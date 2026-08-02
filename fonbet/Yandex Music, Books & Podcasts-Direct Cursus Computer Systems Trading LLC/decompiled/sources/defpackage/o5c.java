package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class o5c extends xsc {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public final uif d;

    /* JADX WARN: Multi-variable type inference failed */
    public o5c(kt1 kt1Var, Function1 function1) {
        super(kt1Var);
        this.d = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.xsc, defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                if (!this.c) {
                    try {
                        super.close();
                        break;
                    } catch (IOException e) {
                        this.c = true;
                        this.d.invoke(e);
                    }
                }
                break;
            default:
                try {
                    super.close();
                    break;
                } catch (IOException e2) {
                    this.c = true;
                    ((az6) this.d).invoke(e2);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.xsc, defpackage.jmq, java.io.Flushable
    public final void flush() {
        switch (this.b) {
            case 0:
                if (!this.c) {
                    try {
                        super.flush();
                        break;
                    } catch (IOException e) {
                        this.c = true;
                        this.d.invoke(e);
                    }
                }
                break;
            default:
                try {
                    super.flush();
                    break;
                } catch (IOException e2) {
                    this.c = true;
                    ((az6) this.d).invoke(e2);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.xsc, defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        switch (this.b) {
            case 0:
                hi3Var.getClass();
                if (this.c) {
                    hi3Var.skip(j);
                    break;
                } else {
                    try {
                        this.a.t0(hi3Var, j);
                        break;
                    } catch (IOException e) {
                        this.c = true;
                        this.d.invoke(e);
                        return;
                    }
                }
            default:
                if (this.c) {
                    hi3Var.skip(j);
                    break;
                } else {
                    try {
                        super.t0(hi3Var, j);
                        break;
                    } catch (IOException e2) {
                        this.c = true;
                        ((az6) this.d).invoke(e2);
                    }
                }
        }
    }

    public o5c(jmq jmqVar, az6 az6Var) {
        super(jmqVar);
        this.d = az6Var;
    }
}
