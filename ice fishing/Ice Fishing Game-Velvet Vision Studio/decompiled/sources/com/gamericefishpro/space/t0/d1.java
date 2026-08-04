package com.gamericefishpro.space.t0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends com.gamericefishpro.space.f1.d0 implements Parcelable, com.gamericefishpro.space.f1.q, v0, s2 {
    public static final Parcelable.Creator<d1> CREATOR = new a1(2);
    public k2 e;

    public d1(long j) {
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        k2 k2Var = new k2(gVarJ.g(), j);
        if (!(gVarJ instanceof com.gamericefishpro.space.f1.b)) {
            k2Var.b = new k2(1, j);
        }
        this.e = k2Var;
    }

    @Override // com.gamericefishpro.space.f1.q
    public final m2 a() {
        return f.z;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 b(com.gamericefishpro.space.f1.e0 e0Var, com.gamericefishpro.space.f1.e0 e0Var2, com.gamericefishpro.space.f1.e0 e0Var3) {
        if (((k2) e0Var2).c == ((k2) e0Var3).c) {
            return e0Var2;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 c() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final void d(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.e = (k2) e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        com.gamericefishpro.space.f1.g gVarJ;
        k2 k2Var = (k2) com.gamericefishpro.space.f1.p.h(this.e);
        if (k2Var.c != j) {
            k2 k2Var2 = this.e;
            synchronized (com.gamericefishpro.space.f1.p.c) {
                gVarJ = com.gamericefishpro.space.f1.p.j();
                ((k2) com.gamericefishpro.space.f1.p.o(k2Var2, this, gVarJ, k2Var)).c = j;
                Unit unit = Unit.a;
            }
            com.gamericefishpro.space.f1.p.n(gVarJ, this);
        }
    }

    @Override // com.gamericefishpro.space.t0.s2
    public Object getValue() {
        return Long.valueOf(((k2) com.gamericefishpro.space.f1.p.t(this.e, this)).c);
    }

    @Override // com.gamericefishpro.space.t0.v0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((k2) com.gamericefishpro.space.f1.p.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((k2) com.gamericefishpro.space.f1.p.t(this.e, this)).c);
    }
}
