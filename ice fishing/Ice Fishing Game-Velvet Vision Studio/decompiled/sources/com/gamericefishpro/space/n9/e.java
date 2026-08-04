package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<e> CREATOR = new com.gamericefishpro.space.h.a(5);
    public long A;
    public u B;
    public final long C;
    public final u D;
    public String d;
    public String e;
    public o4 i;
    public long v;
    public boolean w;
    public String y;
    public final u z;

    public e(e eVar) {
        com.gamericefishpro.space.v8.c0.g(eVar);
        this.d = eVar.d;
        this.e = eVar.e;
        this.i = eVar.i;
        this.v = eVar.v;
        this.w = eVar.w;
        this.y = eVar.y;
        this.z = eVar.z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.Q(parcel, 2, this.d);
        com.gamericefishpro.space.i9.y3.Q(parcel, 3, this.e);
        com.gamericefishpro.space.i9.y3.P(parcel, 4, this.i, i);
        long j = this.v;
        com.gamericefishpro.space.i9.y3.U(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.w;
        com.gamericefishpro.space.i9.y3.U(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        com.gamericefishpro.space.i9.y3.Q(parcel, 7, this.y);
        com.gamericefishpro.space.i9.y3.P(parcel, 8, this.z, i);
        long j2 = this.A;
        com.gamericefishpro.space.i9.y3.U(parcel, 9, 8);
        parcel.writeLong(j2);
        com.gamericefishpro.space.i9.y3.P(parcel, 10, this.B, i);
        com.gamericefishpro.space.i9.y3.U(parcel, 11, 8);
        parcel.writeLong(this.C);
        com.gamericefishpro.space.i9.y3.P(parcel, 12, this.D, i);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }

    public e(String str, String str2, o4 o4Var, long j, boolean z, String str3, u uVar, long j2, u uVar2, long j3, u uVar3) {
        this.d = str;
        this.e = str2;
        this.i = o4Var;
        this.v = j;
        this.w = z;
        this.y = str3;
        this.z = uVar;
        this.A = j2;
        this.B = uVar2;
        this.C = j3;
        this.D = uVar3;
    }
}
