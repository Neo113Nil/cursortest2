package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class jae implements db7 {
    public final db7 a;
    public final int b;
    public final rvm c;
    public final byte[] d;
    public int e;

    public jae(db7 db7Var, int i, rvm rvmVar) {
        vq1.v(i > 0);
        this.a = db7Var;
        this.b = i;
        this.c = rvmVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        db7 db7Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            if (db7Var.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = db7Var.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        d7k d7kVar = new d7k(bArr3, i4);
                        rvm rvmVar = this.c;
                        long max = !rvmVar.l ? rvmVar.i : Math.max(rvmVar.m.u(true), rvmVar.i);
                        int a = d7kVar.a();
                        azs azsVar = rvmVar.k;
                        azsVar.getClass();
                        azsVar.b(d7kVar, a, 0);
                        azsVar.a(max, 1, a, 0, null);
                        rvmVar.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = db7Var.read(bArr, i, Math.min(this.e, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
