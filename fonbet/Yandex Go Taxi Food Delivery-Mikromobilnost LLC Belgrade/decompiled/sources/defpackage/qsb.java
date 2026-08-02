package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class qsb implements f7q0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public qsb(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        long[] jArr = this.e;
        int e = tw21.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.c;
        h7q0 h7q0Var = new h7q0(j2, jArr2[e]);
        if (j2 >= j || e == this.a - 1) {
            return new e7q0(h7q0Var, h7q0Var);
        }
        int i = e + 1;
        return new e7q0(h7q0Var, new h7q0(jArr[i], jArr2[i]));
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + Extension.C_BRAKE;
    }
}
