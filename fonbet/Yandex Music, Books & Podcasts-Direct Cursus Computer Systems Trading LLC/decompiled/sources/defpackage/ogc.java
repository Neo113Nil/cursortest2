package defpackage;

import androidx.media3.extractor.FlacStreamMetadata;

/* loaded from: classes.dex */
public final class ogc implements r03 {
    public final FlacStreamMetadata a;
    public final int b;
    public final ci0 c = new ci0();

    public ogc(FlacStreamMetadata flacStreamMetadata, int i) {
        this.a = flacStreamMetadata;
        this.b = i;
    }

    public final long a(s2c s2cVar) {
        ci0 ci0Var;
        FlacStreamMetadata flacStreamMetadata;
        int w;
        while (true) {
            long s = s2cVar.s();
            long length = s2cVar.getLength() - 6;
            ci0Var = this.c;
            flacStreamMetadata = this.a;
            if (s >= length) {
                break;
            }
            long s2 = s2cVar.s();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean Z = false;
            s2cVar.A(bArr, 0, 2);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (i2 != i3) {
                s2cVar.n();
                s2cVar.u((int) (s2 - s2cVar.getPosition()));
            } else {
                d7k d7kVar = new d7k(16);
                System.arraycopy(bArr, 0, d7kVar.a, 0, 2);
                byte[] bArr2 = d7kVar.a;
                while (i < 14 && (w = s2cVar.w(bArr2, 2 + i, 14 - i)) != -1) {
                    i += w;
                }
                d7kVar.G(i);
                s2cVar.n();
                s2cVar.u((int) (s2 - s2cVar.getPosition()));
                Z = bkp.Z(d7kVar, flacStreamMetadata, i3, ci0Var);
            }
            if (Z) {
                break;
            }
            s2cVar.u(1);
        }
        if (s2cVar.s() < s2cVar.getLength() - 6) {
            return ci0Var.a;
        }
        s2cVar.u((int) (s2cVar.getLength() - s2cVar.s()));
        return flacStreamMetadata.totalSamples;
    }

    @Override // defpackage.r03
    public final q03 b(s2c s2cVar, long j) {
        long position = s2cVar.getPosition();
        long a = a(s2cVar);
        long s = s2cVar.s();
        s2cVar.u(Math.max(6, this.a.minFrameSize));
        long a2 = a(s2cVar);
        return (a > j || a2 <= j) ? a2 <= j ? new q03(-2, a2, s2cVar.s()) : new q03(-1, a, position) : q03.b(s);
    }
}
