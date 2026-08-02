package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class xrf implements htf {
    public final tsf a;

    public xrf(tsf tsfVar) {
        this.a = tsfVar;
    }

    @Override // defpackage.htf
    public final int a() {
        return this.a.h().o;
    }

    @Override // defpackage.htf
    public final int b() {
        int i;
        boolean z;
        long j;
        tsf tsfVar = this.a;
        int i2 = 0;
        if (tsfVar.h().l.isEmpty()) {
            return 0;
        }
        ksf h = tsfVar.h();
        bxj bxjVar = h.p;
        bxj bxjVar2 = bxj.a;
        int g = (int) (bxjVar == bxjVar2 ? h.g() & 4294967295L : h.g() >> 32);
        ksf h2 = tsfVar.h();
        bxj bxjVar3 = h2.p;
        List list = h2.l;
        boolean z2 = bxjVar3 == bxjVar2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < list.size()) {
            lsf lsfVar = (lsf) list.get(i3);
            int i6 = z2 ? lsfVar.u : lsfVar.v;
            if (i6 == -1) {
                i3++;
            } else {
                int i7 = i2;
                while (i3 < list.size()) {
                    lsf lsfVar2 = (lsf) list.get(i3);
                    if ((z2 ? lsfVar2.u : lsfVar2.v) != i6) {
                        break;
                    }
                    if (z2) {
                        z = z2;
                        j = ((lsf) list.get(i3)).s & 4294967295L;
                    } else {
                        z = z2;
                        j = ((lsf) list.get(i3)).s >> 32;
                    }
                    i7 = Math.max(i7, (int) j);
                    i3++;
                    z2 = z;
                }
                i4 += i7;
                i5++;
                z2 = z2;
                i2 = 0;
            }
        }
        int i8 = (i4 / i5) + h2.r;
        if (i8 != 0 && (i = g / i8) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.htf
    public final boolean c() {
        return !this.a.h().l.isEmpty();
    }

    @Override // defpackage.htf
    public final int d() {
        return this.a.g();
    }

    @Override // defpackage.htf
    public final int e() {
        return ((lsf) CollectionsKt.Y(this.a.h().l)).a;
    }
}
