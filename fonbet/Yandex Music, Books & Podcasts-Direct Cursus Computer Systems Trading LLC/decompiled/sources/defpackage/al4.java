package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class al4 extends dj3 {
    @Override // defpackage.dj3, defpackage.sa7
    public final void e(om3 om3Var) {
        if ((this.c.i() || this.b) && this.e != Integer.MAX_VALUE) {
            return;
        }
        om3Var.c(ByteBuffer.wrap((Integer.toString(om3Var.c, 16) + "\r\n").getBytes()));
        om3Var.a(ByteBuffer.wrap("\r\n".getBytes()));
        b(om3Var, true);
        om3Var.n();
    }

    @Override // defpackage.dj3, defpackage.sa7
    public final void end() {
        this.e = Integer.MAX_VALUE;
        e(new om3());
        this.e = 0;
    }
}
