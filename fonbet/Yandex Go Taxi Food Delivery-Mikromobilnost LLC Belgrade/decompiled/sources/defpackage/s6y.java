package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.b;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class s6y implements aa10 {
    public final t6y a;
    public final int b;
    public final boolean c;
    public final float d;
    public final aa10 e;
    public final float f;
    public final boolean g;
    public final tse h;
    public final fwi i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final Orientation o;
    public final int p;
    public final int q;

    public s6y(t6y t6yVar, int i, boolean z, float f, aa10 aa10Var, float f2, boolean z2, tse tseVar, fwi fwiVar, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.a = t6yVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = aa10Var;
        this.f = f2;
        this.g = z2;
        this.h = tseVar;
        this.i = fwiVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = orientation;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.aa10
    public final tls a() {
        return this.e.a();
    }

    @Override // defpackage.aa10
    public final Map b() {
        return this.e.b();
    }

    @Override // defpackage.aa10
    public final void c() {
        this.e.c();
    }

    public final s6y d(int i, boolean z) {
        t6y t6yVar;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (t6yVar = this.a) == null) {
            return null;
        }
        int i5 = t6yVar.q;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        t6y t6yVar2 = (t6y) a.P(list);
        t6y t6yVar3 = (t6y) a.Z(list);
        if (t6yVar2.s || t6yVar3.s) {
            return null;
        }
        int i7 = t6yVar2.o;
        int i8 = this.m;
        int i9 = this.l;
        if (i < 0) {
            if (Math.min((i7 + t6yVar2.q) - i9, (t6yVar3.o + t6yVar3.q) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - t6yVar3.o) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            t6y t6yVar4 = (t6y) list.get(i10);
            boolean z2 = t6yVar4.c;
            int[] iArr = t6yVar4.w;
            if (!t6yVar4.s) {
                t6yVar4.o += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = t6yVar4.b.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        b a = t6yVar4.m.a(i13, t6yVar4.k);
                        if (a != null) {
                            long j = a.l;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            }
                            a.l = (i4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i3 << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new s6y(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long e() {
        aa10 aa10Var = this.e;
        return (aa10Var.getWidth() << 32) | (aa10Var.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.aa10
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.aa10
    public final int getWidth() {
        return this.e.getWidth();
    }
}
