package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class yb2 implements khx {
    public final int b;
    public final khx c;

    public yb2(int i, khx khxVar) {
        this.b = i;
        this.c = khxVar;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (!(obj instanceof yb2)) {
            return false;
        }
        yb2 yb2Var = (yb2) obj;
        return this.b == yb2Var.b && this.c.equals(yb2Var.c);
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return pw21.l(this.b, this.c);
    }
}
