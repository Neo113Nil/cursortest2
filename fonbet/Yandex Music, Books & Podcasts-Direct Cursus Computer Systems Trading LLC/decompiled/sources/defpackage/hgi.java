package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hgi implements kfh {
    public final ggi a;

    public hgi(ggi ggiVar) {
        this.a = ggiVar;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        return this.a.a(fxeVar, bzf.C(fxeVar), i);
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        return this.a.b(mfhVar, bzf.C(mfhVar), j);
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        return this.a.c(fxeVar, bzf.C(fxeVar), i);
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        return this.a.d(fxeVar, bzf.C(fxeVar), i);
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        return this.a.e(fxeVar, bzf.C(fxeVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgi) && Intrinsics.d(this.a, ((hgi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
