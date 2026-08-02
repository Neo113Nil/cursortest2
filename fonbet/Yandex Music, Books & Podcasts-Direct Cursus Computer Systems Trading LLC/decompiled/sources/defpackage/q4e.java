package defpackage;

import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class q4e {
    public final ikn c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public wtd[] d = new wtd[8];
    public int e = 7;

    public q4e(s5e s5eVar) {
        this.c = new ikn(s5eVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                wtd wtdVar = this.d[length];
                wtdVar.getClass();
                int i4 = wtdVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            wtd[] wtdVarArr = this.d;
            System.arraycopy(wtdVarArr, i2 + 1, wtdVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final pn3 b(int i) {
        if (i >= 0) {
            wtd[] wtdVarArr = t4e.a;
            if (i <= wtdVarArr.length - 1) {
                return wtdVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - t4e.a.length);
        if (length >= 0) {
            wtd[] wtdVarArr2 = this.d;
            if (length < wtdVarArr2.length) {
                wtd wtdVar = wtdVarArr2[length];
                wtdVar.getClass();
                return wtdVar.a;
            }
        }
        kac.i(i + 1, "Header index too large ");
        return null;
    }

    public final void c(wtd wtdVar) {
        this.b.add(wtdVar);
        int i = wtdVar.c;
        int i2 = this.a;
        if (i > i2) {
            uz0.l(0, r7.length, null, this.d);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        wtd[] wtdVarArr = this.d;
        if (i3 > wtdVarArr.length) {
            wtd[] wtdVarArr2 = new wtd[wtdVarArr.length * 2];
            System.arraycopy(wtdVarArr, 0, wtdVarArr2, wtdVarArr.length, wtdVarArr.length);
            this.e = this.d.length - 1;
            this.d = wtdVarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = wtdVar;
        this.f++;
        this.g += i;
    }

    public final pn3 d() {
        ikn iknVar = this.c;
        byte readByte = iknVar.readByte();
        byte[] bArr = cvt.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return iknVar.g0(e);
        }
        hi3 hi3Var = new hi3();
        int[] iArr = c8e.a;
        iknVar.getClass();
        rnj rnjVar = c8e.c;
        rnj rnjVar2 = rnjVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = iknVar.readByte();
            byte[] bArr2 = cvt.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = (i2 >>> (i3 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                rnj[] rnjVarArr = (rnj[]) rnjVar2.d;
                rnjVarArr.getClass();
                rnjVar2 = rnjVarArr[i4];
                rnjVar2.getClass();
                if (((rnj[]) rnjVar2.d) == null) {
                    hi3Var.M0(rnjVar2.b);
                    i3 -= rnjVar2.c;
                    rnjVar2 = rnjVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            int i5 = (i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE;
            rnj[] rnjVarArr2 = (rnj[]) rnjVar2.d;
            rnjVarArr2.getClass();
            rnj rnjVar3 = rnjVarArr2[i5];
            rnjVar3.getClass();
            int i6 = rnjVar3.c;
            if (((rnj[]) rnjVar3.d) != null || i6 > i3) {
                break;
            }
            hi3Var.M0(rnjVar3.b);
            i3 -= i6;
            rnjVar2 = rnjVar;
        }
        return hi3Var.g0(hi3Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = cvt.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
