package defpackage;

import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public final class tnt0 extends vku {
    public final Object b;
    public final ryl0 c;
    public final ryl0 d;

    public tnt0() {
        super("UMA.LogUpload.ResponseOrErrorCode");
        this.b = new Object();
        try {
            ryl0 ryl0Var = new ryl0(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest("UMA.LogUpload.ResponseOrErrorCode".getBytes(uza.a))).order(ByteOrder.BIG_ENDIAN).getLong());
            this.c = ryl0Var;
            this.d = new ryl0(ryl0Var.a.a);
        } catch (NoSuchAlgorithmException e) {
            ny61.o(e);
            throw null;
        }
    }

    @Override // defpackage.vku
    public final void a(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        synchronized (this.b) {
            ryl0 ryl0Var = this.c;
            SparseIntArray sparseIntArray = ryl0Var.b;
            sparseIntArray.put(i, sparseIntArray.get(i) + i2);
            long j = i2 * i;
            ryl0Var.d(i2, j, j);
        }
    }

    @Override // defpackage.vku
    public final void b(int i) {
        a(i, 1);
    }

    @Override // defpackage.vku
    public final boolean e(int i, int i2, int i3) {
        return false;
    }

    @Override // defpackage.vku
    public final long f() {
        return this.c.a.a;
    }

    @Override // defpackage.vku
    public final nlu g() {
        ryl0 ryl0Var = new ryl0(f());
        synchronized (this.b) {
            ryl0Var.a(this.c);
            ryl0 ryl0Var2 = this.c;
            ryl0Var2.getClass();
            v820 v820Var = ryl0Var.a;
            ryl0Var2.d(-v820Var.d.get(), -v820Var.b.get(), -v820Var.c.get());
            ryl0Var2.b(ryl0Var.e(), 1);
            this.d.a(ryl0Var);
        }
        return ryl0Var;
    }
}
