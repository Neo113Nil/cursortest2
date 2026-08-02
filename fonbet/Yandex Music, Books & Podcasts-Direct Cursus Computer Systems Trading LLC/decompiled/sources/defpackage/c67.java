package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class c67 implements a0 {
    public final uu7 a;
    public int b = 0;

    public c67(uu7 uu7Var) {
        this.a = uu7Var;
    }

    @Override // defpackage.a0
    public final int g() {
        return this.b;
    }

    @Override // defpackage.xge
    public final s0 m() {
        return z.B(this.a.b());
    }

    @Override // defpackage.d0
    public final s0 n() {
        try {
            return m();
        } catch (IOException e) {
            wb8.k("IOException converting stream to byte array: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.a0
    public final InputStream q() {
        uu7 uu7Var = this.a;
        int i = uu7Var.d;
        if (i < 1) {
            xq0.q("content octets cannot be empty");
            return null;
        }
        int read = uu7Var.read();
        this.b = read;
        if (read > 0) {
            if (i < 2) {
                xq0.q("zero length data with non-zero pad bits");
                return null;
            }
            if (read > 7) {
                xq0.q("pad bits cannot be greater than 7 or less than 0");
                return null;
            }
        }
        return uu7Var;
    }
}
