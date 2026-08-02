package defpackage;

import java.util.Arrays;
import yads.cs1;

/* loaded from: classes7.dex */
public final class r171 extends co61 {
    public cfr n;
    public zer o;

    @Override // defpackage.co61
    public final long a(dl81 dl81Var) {
        int i;
        int i2;
        int s;
        byte[] bArr = dl81Var.a;
        int i3 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            dl81Var.m(dl81Var.b + 4);
            dl81Var.y();
        }
        switch (i4) {
            case 1:
                i3 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i4 - 2;
                i2 = 576;
                i3 = i2 << i;
                break;
            case 6:
                s = dl81Var.s();
                i3 = s + 1;
                break;
            case 7:
                s = dl81Var.x();
                i3 = s + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i4 - 8;
                i2 = 256;
                i3 = i2 << i;
                break;
        }
        dl81Var.m(0);
        return i3;
    }

    @Override // defpackage.co61
    public final void c(boolean z) {
        super.c(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.co61
    public final boolean d(dl81 dl81Var, long j, lg61 lg61Var) {
        byte[] bArr = dl81Var.a;
        cfr cfrVar = this.n;
        if (cfrVar == null) {
            cfr cfrVar2 = new cfr(bArr, 17, 1);
            this.n = cfrVar2;
            lg61Var.a = cfrVar2.a(Arrays.copyOfRange(bArr, 9, dl81Var.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            zer zerVar = this.o;
            if (zerVar != null) {
                zerVar.a = j;
                lg61Var.b = zerVar;
            }
            lg61Var.a.getClass();
            return false;
        }
        bfr a = p4a1.a(dl81Var);
        cfr cfrVar3 = new cfr(cfrVar.a, cfrVar.b, cfrVar.c, cfrVar.d, cfrVar.e, cfrVar.g, cfrVar.h, cfrVar.j, a, (cs1) cfrVar.l);
        this.n = cfrVar3;
        zer zerVar2 = new zer();
        zerVar2.c = cfrVar3;
        zerVar2.w = a;
        zerVar2.a = -1L;
        zerVar2.b = -1L;
        this.o = zerVar2;
        return true;
    }
}
