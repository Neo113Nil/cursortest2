package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class r4e {
    public final ikn b;
    public final ArrayList a = new ArrayList();
    public vtd[] e = new vtd[8];
    public int f = 7;
    public int g = 0;
    public int h = 0;
    public int c = 4096;
    public int d = 4096;

    public r4e(c5e c5eVar) {
        this.b = new ikn(c5eVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            vtd[] vtdVarArr = this.e;
            System.arraycopy(vtdVarArr, i2 + 1, vtdVarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final pn3 b(int i) {
        if (i >= 0) {
            vtd[] vtdVarArr = u4e.b;
            if (i <= vtdVarArr.length - 1) {
                return vtdVarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - u4e.b.length);
        if (length >= 0) {
            vtd[] vtdVarArr2 = this.e;
            if (length < vtdVarArr2.length) {
                return vtdVarArr2[length].a;
            }
        }
        kac.i(i + 1, "Header index too large ");
        return null;
    }

    public final void c(vtd vtdVar) {
        this.a.add(vtdVar);
        int i = vtdVar.c;
        int i2 = this.d;
        if (i > i2) {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        vtd[] vtdVarArr = this.e;
        if (i3 > vtdVarArr.length) {
            vtd[] vtdVarArr2 = new vtd[vtdVarArr.length * 2];
            System.arraycopy(vtdVarArr, 0, vtdVarArr2, vtdVarArr.length, vtdVarArr.length);
            this.f = this.e.length - 1;
            this.e = vtdVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = vtdVar;
        this.g++;
        this.h += i;
    }

    public final pn3 d() {
        ikn iknVar = this.b;
        byte readByte = iknVar.readByte();
        int i = readByte & 255;
        boolean z = (readByte & 128) == 128;
        int e = e(i, 127);
        if (!z) {
            return iknVar.g0(e);
        }
        d8e d8eVar = d8e.d;
        long j = e;
        iknVar.a0(j);
        byte[] X = iknVar.b.X(j);
        d8eVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        rnj rnjVar = d8eVar.a;
        rnj rnjVar2 = rnjVar;
        int i2 = 0;
        int i3 = 0;
        for (byte b : X) {
            i2 = (i2 << 8) | (b & 255);
            i3 += 8;
            while (i3 >= 8) {
                rnjVar2 = ((rnj[]) rnjVar2.d)[(i2 >>> (i3 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (((rnj[]) rnjVar2.d) == null) {
                    byteArrayOutputStream.write(rnjVar2.b);
                    i3 -= rnjVar2.c;
                    rnjVar2 = rnjVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            rnj rnjVar3 = ((rnj[]) rnjVar2.d)[(i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE];
            rnj[] rnjVarArr = (rnj[]) rnjVar3.d;
            int i4 = rnjVar3.c;
            if (rnjVarArr != null || i4 > i3) {
                break;
            }
            byteArrayOutputStream.write(rnjVar3.b);
            i3 -= i4;
            rnjVar2 = rnjVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        pn3 pn3Var = pn3.d;
        return ovn.M(byteArray);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.b.readByte();
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
