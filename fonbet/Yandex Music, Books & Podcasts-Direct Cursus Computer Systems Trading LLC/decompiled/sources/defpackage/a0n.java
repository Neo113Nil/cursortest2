package defpackage;

/* loaded from: classes.dex */
public final class a0n {
    public final /* synthetic */ int a;
    public final ojs b;
    public final d7k c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public a0n(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ojs(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d7k();
                break;
            default:
                this.b = new ojs(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d7k();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(d7k d7kVar) {
        int i = d7kVar.b;
        if (d7kVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d7kVar.f(bArr, 0, 9);
        d7kVar.H(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(s2c s2cVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = dvt.c;
                d7k d7kVar = this.c;
                d7kVar.getClass();
                d7kVar.F(bArr.length, bArr);
                this.d = true;
                s2cVar.n();
                break;
            default:
                byte[] bArr2 = dvt.c;
                d7k d7kVar2 = this.c;
                d7kVar2.getClass();
                d7kVar2.F(bArr2.length, bArr2);
                this.d = true;
                s2cVar.n();
                break;
        }
    }
}
