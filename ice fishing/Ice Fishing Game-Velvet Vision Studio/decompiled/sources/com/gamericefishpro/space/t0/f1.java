package com.gamericefishpro.space.t0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends com.gamericefishpro.space.f1.d0 implements Parcelable, com.gamericefishpro.space.f1.q {
    public static final Parcelable.Creator<f1> CREATOR = new e1();
    public final m2 e;
    public l2 i;

    public f1(Object obj, m2 m2Var) {
        this.e = m2Var;
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        l2 l2Var = new l2(gVarJ.g(), obj);
        if (!(gVarJ instanceof com.gamericefishpro.space.f1.b)) {
            l2Var.b = new l2(1, obj);
        }
        this.i = l2Var;
    }

    @Override // com.gamericefishpro.space.f1.q
    public final m2 a() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 b(com.gamericefishpro.space.f1.e0 e0Var, com.gamericefishpro.space.f1.e0 e0Var2, com.gamericefishpro.space.f1.e0 e0Var3) {
        if (this.e.a(((l2) e0Var2).c, ((l2) e0Var3).c)) {
            return e0Var2;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 c() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final void d(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.i = (l2) e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return ((l2) com.gamericefishpro.space.f1.p.t(this.i, this)).c;
    }

    @Override // com.gamericefishpro.space.t0.v0
    public final void setValue(Object obj) {
        com.gamericefishpro.space.f1.g gVarJ;
        l2 l2Var = (l2) com.gamericefishpro.space.f1.p.h(this.i);
        if (this.e.a(l2Var.c, obj)) {
            return;
        }
        l2 l2Var2 = this.i;
        synchronized (com.gamericefishpro.space.f1.p.c) {
            gVarJ = com.gamericefishpro.space.f1.p.j();
            ((l2) com.gamericefishpro.space.f1.p.o(l2Var2, this, gVarJ, l2Var)).c = obj;
            Unit unit = Unit.a;
        }
        com.gamericefishpro.space.f1.p.n(gVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((l2) com.gamericefishpro.space.f1.p.h(this.i)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        f fVar = f.v;
        m2 m2Var = this.e;
        if (Intrinsics.a(m2Var, fVar)) {
            i2 = 0;
        } else if (Intrinsics.a(m2Var, f.z)) {
            i2 = 1;
        } else {
            if (!Intrinsics.a(m2Var, f.w)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
