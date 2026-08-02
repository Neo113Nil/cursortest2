package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r0e implements azs {
    public static final dsc f;
    public static final dsc g;
    public final azs a;
    public final dsc b;
    public dsc c;
    public byte[] d;
    public int e;

    static {
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("application/id3");
        f = new dsc(bscVar);
        bsc bscVar2 = new bsc();
        bscVar2.m = l5i.p("application/x-emsg");
        g = new dsc(bscVar2);
    }

    public r0e(azs azsVar, int i) {
        this.a = azsVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                xq0.x(k5r.i(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.azs
    public final void a(long j, int i, int i2, int i3, zys zysVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        d7k d7kVar = new d7k(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        dsc dscVar = this.b;
        String str2 = dscVar.n;
        String str3 = dscVar.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                vq1.n0("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            tib g0 = au0.g0(d7kVar);
            dsc wrappedMetadataFormat = g0.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !Objects.equals(str3, wrappedMetadataFormat.n)) {
                vq1.n0("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + g0.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = g0.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            d7kVar = new d7k(wrappedMetadataBytes);
        }
        int a = d7kVar.a();
        azs azsVar = this.a;
        azsVar.b(d7kVar, a, 0);
        azsVar.a(j, i, a, 0, zysVar);
    }

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        d7kVar.f(this.d, this.e, i);
        this.e += i;
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = ma7Var.read(this.d, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        xq0.v();
        return 0;
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
        this.c = dscVar;
        this.a.d(this.b);
    }
}
