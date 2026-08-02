package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class npr implements r2c {
    public final upr a;
    public final dsc b;
    public final ArrayList c;
    public azs f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = dvt.c;
    public final d7k d = new d7k();

    public npr(upr uprVar, dsc dscVar) {
        dsc dscVar2;
        this.a = uprVar;
        if (dscVar != null) {
            bsc a = dscVar.a();
            a.m = l5i.p("application/x-media3-cues");
            a.j = dscVar.n;
            a.I = uprVar.y();
            dscVar2 = new dsc(a);
        } else {
            dscVar2 = null;
        }
        this.b = dscVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = dvt.d;
        this.j = -9223372036854775807L;
    }

    @Override // defpackage.r2c
    public final void a() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        int i = this.h;
        vq1.A((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    public final void c(mpr mprVar) {
        vq1.B(this.f);
        byte[] bArr = mprVar.b;
        int length = bArr.length;
        d7k d7kVar = this.d;
        d7kVar.getClass();
        d7kVar.F(bArr.length, bArr);
        this.f.b(d7kVar, length, 0);
        this.f.a(mprVar.a, 1, length, 0, null);
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new defpackage.tpr(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.i(r20.e, 0, r20.g, r2, new defpackage.h5n(13, r20));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.i[r2] = ((defpackage.mpr) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.e = defpackage.dvt.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = defpackage.tpr.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw defpackage.r7k.a(r0, "SubtitleParser failed.");
     */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        int i;
        int i2 = this.h;
        vq1.A((i2 == 0 || i2 == 5) ? false : true);
        if (this.h == 1) {
            int s = s2cVar.getLength() != -1 ? zc4.s(s2cVar.getLength()) : 1024;
            if (s > this.e.length) {
                this.e = new byte[s];
            }
            this.g = 0;
            this.h = 2;
        }
        int i3 = this.h;
        ArrayList arrayList = this.c;
        if (i3 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i4 = this.g;
            int read = s2cVar.read(bArr2, i4, bArr2.length - i4);
            if (read != -1) {
                this.g += read;
            }
            long length = s2cVar.getLength();
            if (length != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (s2cVar.v(s2cVar.getLength() != -1 ? zc4.s(s2cVar.getLength()) : 1024) == -1) {
                long j = this.j;
                for (int e = j == -9223372036854775807L ? i : dvt.e(this.i, j, true); e < arrayList.size(); e++) {
                    c((mpr) arrayList.get(e));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        vq1.A(this.h == 0);
        azs M = t2cVar.M(0, 3);
        this.f = M;
        dsc dscVar = this.b;
        if (dscVar != null) {
            M.d(dscVar);
            t2cVar.K();
            t2cVar.E(new wie(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }
}
