package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ome extends j5m {
    public final boolean m;

    public ome(String str, p3d p3dVar) {
        super(str, p3dVar, 1);
        this.m = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [arf, java.lang.Object] */
    @Override // defpackage.j5m
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ome) {
            mhp mhpVar = (mhp) obj;
            if (Intrinsics.d(this.a, mhpVar.i())) {
                ome omeVar = (ome) obj;
                if (omeVar.m && Arrays.equals((mhp[]) this.k.getValue(), (mhp[]) omeVar.k.getValue())) {
                    int e = mhpVar.e();
                    int i2 = this.c;
                    if (i2 == e) {
                        for (0; i < i2; i + 1) {
                            i = (Intrinsics.d(h(i).i(), mhpVar.h(i).i()) && Intrinsics.d(h(i).a(), mhpVar.h(i).a())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.j5m
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.j5m, defpackage.mhp
    public final boolean isInline() {
        return this.m;
    }
}
