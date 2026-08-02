package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class di2 implements a0 {
    public final x0 a;
    public oa6 b;

    public di2(x0 x0Var) {
        this.a = x0Var;
    }

    public static ci2 b(x0 x0Var) {
        oa6 oa6Var = new oa6(x0Var);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = oa6Var.read(bArr, 0, 4096);
            if (read < 0) {
                return new ci2(byteArrayOutputStream.toByteArray(), oa6Var.c);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // defpackage.a0
    public final int g() {
        return this.b.c;
    }

    @Override // defpackage.xge
    public final s0 m() {
        return b(this.a);
    }

    @Override // defpackage.d0
    public final s0 n() {
        try {
            return b(this.a);
        } catch (IOException e) {
            wb8.k("IOException converting stream to byte array: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.a0
    public final InputStream q() {
        oa6 oa6Var = new oa6(this.a);
        this.b = oa6Var;
        return oa6Var;
    }
}
