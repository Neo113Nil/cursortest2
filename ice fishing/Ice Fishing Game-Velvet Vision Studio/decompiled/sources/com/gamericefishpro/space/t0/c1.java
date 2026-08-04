package com.gamericefishpro.space.t0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends com.gamericefishpro.space.f1.d0 implements Parcelable, com.gamericefishpro.space.f1.q, v0, s2 {
    public static final Parcelable.Creator<c1> CREATOR = new a1(1);
    public j2 e;

    public c1(int i) {
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        j2 j2Var = new j2(i, gVarJ.g());
        if (!(gVarJ instanceof com.gamericefishpro.space.f1.b)) {
            j2Var.b = new j2(i, 1);
        }
        this.e = j2Var;
    }

    @Override // com.gamericefishpro.space.f1.q
    public final m2 a() {
        return f.z;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 b(com.gamericefishpro.space.f1.e0 e0Var, com.gamericefishpro.space.f1.e0 e0Var2, com.gamericefishpro.space.f1.e0 e0Var3) {
        if (((j2) e0Var2).c == ((j2) e0Var3).c) {
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
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.e = (j2) e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((j2) com.gamericefishpro.space.f1.p.t(this.e, this)).c;
    }

    @Override // com.gamericefishpro.space.t0.s2
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        com.gamericefishpro.space.f1.g gVarJ;
        j2 j2Var = (j2) com.gamericefishpro.space.f1.p.h(this.e);
        if (j2Var.c != i) {
            j2 j2Var2 = this.e;
            synchronized (com.gamericefishpro.space.f1.p.c) {
                gVarJ = com.gamericefishpro.space.f1.p.j();
                ((j2) com.gamericefishpro.space.f1.p.o(j2Var2, this, gVarJ, j2Var)).c = i;
                Unit unit = Unit.a;
            }
            com.gamericefishpro.space.f1.p.n(gVarJ, this);
        }
    }

    @Override // com.gamericefishpro.space.t0.v0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((j2) com.gamericefishpro.space.f1.p.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
