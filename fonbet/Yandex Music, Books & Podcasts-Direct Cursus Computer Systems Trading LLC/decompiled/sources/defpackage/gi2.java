package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class gi2 implements p0 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public gi2(x0 x0Var) {
        this.b = x0Var;
    }

    public static fi2 b(x0 x0Var) {
        pa6 pa6Var = new pa6(x0Var);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = pa6Var.read(bArr, 0, 4096);
            if (read < 0) {
                return new fi2(byteArrayOutputStream.toByteArray(), null);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // defpackage.p0
    public final InputStream a() {
        switch (this.a) {
            case 0:
                return new pa6((x0) this.b);
            default:
                return (uu7) this.b;
        }
    }

    @Override // defpackage.xge
    public final s0 m() {
        switch (this.a) {
            case 0:
                return b((x0) this.b);
            default:
                return new a07(((uu7) this.b).b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        defpackage.wb8.k("IOException converting stream to byte array: ", r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000b, code lost:
    
        defpackage.wb8.k("IOException converting stream to byte array: ", r0.getMessage(), r0);
     */
    @Override // defpackage.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 n() {
        switch (this.a) {
        }
        return null;
    }

    public /* synthetic */ gi2() {
    }
}
