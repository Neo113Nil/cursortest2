package defpackage;

import androidx.media3.exoplayer.trackselection.a;

/* loaded from: classes.dex */
public final class ss7 extends at7 implements Comparable {
    public final int e;
    public final int f;

    public ss7(int i, xvs xvsVar, int i2, a aVar, int i3) {
        super(i, xvsVar, i2);
        int i4;
        this.e = at2.o(i3, aVar.u0) ? 1 : 0;
        dsc dscVar = this.d;
        int i5 = dscVar.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = dscVar.v) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
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
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((ss7) obj).f);
    }
}
