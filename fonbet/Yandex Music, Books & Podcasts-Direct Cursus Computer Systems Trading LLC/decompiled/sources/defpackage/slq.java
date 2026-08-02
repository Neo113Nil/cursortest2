package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class slq implements jgg {
    public final nb7 a;
    public final ngr b;
    public byte[] c;

    public slq(db7 db7Var, nb7 nb7Var) {
        cfg.f.getAndIncrement();
        this.a = nb7Var;
        this.b = new ngr(db7Var);
    }

    @Override // defpackage.jgg
    public final void a() {
        ngr ngrVar = this.b;
        ngrVar.b = 0L;
        try {
            ngrVar.a(this.a);
            int i = 0;
            while (i != -1) {
                int i2 = (int) ngrVar.b;
                byte[] bArr = this.c;
                if (bArr == null) {
                    this.c = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.c;
                i = ngrVar.read(bArr2, i2, bArr2.length - i2);
            }
            hld.x(ngrVar);
        } catch (Throwable th) {
            hld.x(ngrVar);
            throw th;
        }
    }

    @Override // defpackage.jgg
    public final void f() {
    }
}
