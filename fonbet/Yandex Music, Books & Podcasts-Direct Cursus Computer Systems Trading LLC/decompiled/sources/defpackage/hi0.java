package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class hi0 implements daf {
    public final int b;
    public final daf c;

    public hi0(int i, daf dafVar) {
        this.b = i;
        this.c = dafVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return this.b == hi0Var.b && this.c.equals(hi0Var.c);
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return xut.h(this.b, this.c);
    }
}
