package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class zhs0 implements pyy {
    public final long a = uwy.f.getAndIncrement();
    public final npg b;
    public final x7u0 c;
    public byte[] w;

    public zhs0(kpg kpgVar, npg npgVar) {
        this.b = npgVar;
        this.c = new x7u0(kpgVar);
    }

    @Override // defpackage.pyy
    public final void d() {
    }

    @Override // defpackage.pyy
    public final void load() {
        x7u0 x7u0Var = this.c;
        x7u0Var.b = 0L;
        try {
            x7u0Var.open(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) x7u0Var.b;
                byte[] bArr = this.w;
                if (bArr == null) {
                    this.w = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.w = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.w;
                i = x7u0Var.read(bArr2, i2, bArr2.length - i2);
            }
            yri0.b(x7u0Var);
        } catch (Throwable th) {
            yri0.b(x7u0Var);
            throw th;
        }
    }
}
