package defpackage;

import androidx.media3.exoplayer.trackselection.a;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class ys7 extends at7 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public ys7(int i, xvs xvsVar, int i2, a aVar, int i3, String str, String str2) {
        super(i, xvsVar, i2);
        int i4;
        int i5 = 0;
        this.f = at2.o(i3, false);
        int i6 = this.d.e;
        int i7 = aVar.y;
        yde ydeVar = aVar.v;
        int i8 = i6 & (~i7);
        this.g = (i8 & 1) != 0;
        this.h = (i8 & 2) != 0;
        yde y = str2 != null ? yde.y(str2) : ydeVar.isEmpty() ? yde.y("") : ydeVar;
        int i9 = 0;
        while (true) {
            if (i9 >= y.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = ct7.c(this.d, (String) y.get(i9), aVar.z);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.i = i9;
        this.j = i4;
        int i10 = str2 != null ? 1088 : aVar.w;
        int i11 = this.d.f;
        zwj zwjVar = ct7.j;
        int bitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.k = bitCount;
        this.m = (1088 & this.d.f) != 0;
        int c = ct7.c(this.d, str, ct7.f(str) == null);
        this.l = c;
        boolean z = i4 > 0 || (ydeVar.isEmpty() && bitCount > 0) || this.g || (this.h && c > 0);
        if (at2.o(i3, aVar.u0) && z) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.at7
    public final int a() {
        return this.e;
    }

    @Override // defpackage.at7
    public final /* bridge */ /* synthetic */ boolean b(at7 at7Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ys7 ys7Var) {
        dl5 c = dl5.a.c(this.f, ys7Var.f);
        Integer valueOf = Integer.valueOf(this.i);
        Integer valueOf2 = Integer.valueOf(ys7Var.i);
        Comparator comparator = gdo.a;
        dl5 b = c.b(valueOf, valueOf2, comparator);
        int i = ys7Var.j;
        int i2 = this.j;
        dl5 a = b.a(i2, i);
        int i3 = ys7Var.k;
        int i4 = this.k;
        dl5 c2 = a.a(i4, i3).c(this.g, ys7Var.g);
        Boolean valueOf3 = Boolean.valueOf(this.h);
        Boolean valueOf4 = Boolean.valueOf(ys7Var.h);
        if (i2 == 0) {
            comparator = dxi.a;
        }
        dl5 a2 = c2.b(valueOf3, valueOf4, comparator).a(this.l, ys7Var.l);
        if (i4 == 0) {
            a2 = a2.d(this.m, ys7Var.m);
        }
        return a2.e();
    }
}
