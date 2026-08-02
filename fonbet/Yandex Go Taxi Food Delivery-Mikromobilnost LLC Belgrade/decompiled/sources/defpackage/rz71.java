package defpackage;

import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes7.dex */
public final class rz71 extends yh81 {
    public long A;
    public int B;
    public int C;

    public rz71() {
        super(2);
        this.C = 32;
    }

    @Override // defpackage.yh81
    public final void e() {
        super.e();
        this.B = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(yh81 yh81Var) {
        if (yh81Var.c(1073741824)) {
            w511.q();
            return false;
        }
        if (yh81Var.c(SelfTester_JCP.IMITA)) {
            w511.q();
            return false;
        }
        if (yh81Var.c(4)) {
            w511.q();
            return false;
        }
        int i = this.B;
        if (i > 0) {
            if (i < this.C && yh81Var.c(Integer.MIN_VALUE) == c(Integer.MIN_VALUE)) {
                ByteBuffer byteBuffer = yh81Var.c;
                if (byteBuffer != null && (r3 = this.c) != null) {
                }
            }
            return false;
        }
        int i2 = this.B;
        this.B = i2 + 1;
        if (i2 == 0) {
            this.x = yh81Var.x;
            if (yh81Var.c(1)) {
                this.a = 1;
            }
        }
        if (yh81Var.c(Integer.MIN_VALUE)) {
            this.a = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer2 = yh81Var.c;
        if (byteBuffer2 != null) {
            g(byteBuffer2.remaining());
            this.c.put(byteBuffer2);
        }
        this.A = yh81Var.x;
        return true;
    }
}
