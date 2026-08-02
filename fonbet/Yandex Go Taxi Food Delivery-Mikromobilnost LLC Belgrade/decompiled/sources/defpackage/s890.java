package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class s890 implements aa10 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final Orientation e;
    public final int f;
    public final int g;
    public final int h;
    public final da10 i;
    public final da10 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final k1t0 n;
    public final aa10 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final tse s;
    public final fwi t;
    public final long u;

    public s890(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, da10 da10Var, da10 da10Var2, float f, int i7, boolean z, k1t0 k1t0Var, aa10 aa10Var, boolean z2, List list2, List list3, tse tseVar, fwi fwiVar, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = orientation;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = da10Var;
        this.j = da10Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = k1t0Var;
        this.o = aa10Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = tseVar;
        this.t = fwiVar;
        this.u = j;
    }

    @Override // defpackage.aa10
    public final tls a() {
        return this.o.a();
    }

    @Override // defpackage.aa10
    public final Map b() {
        return this.o.b();
    }

    @Override // defpackage.aa10
    public final void c() {
        this.o.c();
    }

    public final s890 d(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        da10 da10Var = (da10) a.P(list);
        da10 da10Var2 = (da10) a.Z(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((da10Var.j + i3) - i5, (da10Var2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - da10Var.j, i4 - da10Var2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((da10) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((da10) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((da10) list3.get(i8)).a(i);
        }
        return new s890(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long e() {
        aa10 aa10Var = this.o;
        return (aa10Var.getWidth() << 32) | (aa10Var.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.aa10
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.aa10
    public final int getWidth() {
        return this.o.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ s890(int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, k1t0 k1t0Var, aa10 aa10Var, tse tseVar, fwi fwiVar, long j) {
        this(r1, i, i2, i3, orientation, i4, i5, i6, null, null, 0.0f, 0, false, k1t0Var, aa10Var, false, r1, r1, tseVar, fwiVar, j);
        EmptyList emptyList = EmptyList.a;
    }
}
