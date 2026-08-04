package com.gamericefishpro.space.t0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends com.gamericefishpro.space.f1.d0 implements Parcelable, com.gamericefishpro.space.f1.q, v0, s2 {
    public static final Parcelable.Creator<b1> CREATOR = new a1(0);
    public i2 e;

    public b1(float f) {
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        i2 i2Var = new i2(gVarJ.g(), f);
        if (!(gVarJ instanceof com.gamericefishpro.space.f1.b)) {
            i2Var.b = new i2(1, f);
        }
        this.e = i2Var;
    }

    @Override // com.gamericefishpro.space.f1.q
    public final m2 a() {
        return f.z;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 b(com.gamericefishpro.space.f1.e0 e0Var, com.gamericefishpro.space.f1.e0 e0Var2, com.gamericefishpro.space.f1.e0 e0Var3) {
        if (((i2) e0Var2).c == ((i2) e0Var3).c) {
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
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.e = (i2) e0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((i2) com.gamericefishpro.space.f1.p.t(this.e, this)).c;
    }

    @Override // com.gamericefishpro.space.t0.s2
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        com.gamericefishpro.space.f1.g gVarJ;
        i2 i2Var = (i2) com.gamericefishpro.space.f1.p.h(this.e);
        if (i2Var.c == f) {
            return;
        }
        i2 i2Var2 = this.e;
        synchronized (com.gamericefishpro.space.f1.p.c) {
            gVarJ = com.gamericefishpro.space.f1.p.j();
            ((i2) com.gamericefishpro.space.f1.p.o(i2Var2, this, gVarJ, i2Var)).c = f;
            Unit unit = Unit.a;
        }
        com.gamericefishpro.space.f1.p.n(gVarJ, this);
    }

    @Override // com.gamericefishpro.space.t0.v0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((i2) com.gamericefishpro.space.f1.p.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
