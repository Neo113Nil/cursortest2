package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hzd extends sk4 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.jgg
    public final void a() {
        try {
            this.i.a(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            hld.x(this.i);
        } catch (Throwable th) {
            hld.x(this.i);
            throw th;
        }
    }

    @Override // defpackage.jgg
    public final void f() {
        this.k = true;
    }
}
