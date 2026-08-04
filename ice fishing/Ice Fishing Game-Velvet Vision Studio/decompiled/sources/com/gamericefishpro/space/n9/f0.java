package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.f9.a implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void B(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 6);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final String C(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        Parcel parcelG = G(parcelH, 11);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void D(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 20);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void d(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 25);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List e(String str, String str2, boolean z, t4 t4Var) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = com.gamericefishpro.space.i9.y.a;
        parcelH.writeInt(z ? 1 : 0);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        Parcel parcelG = G(parcelH, 14);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(o4.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List f(String str, String str2, String str3, boolean z) {
        Parcel parcelH = H();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        ClassLoader classLoader = com.gamericefishpro.space.i9.y.a;
        parcelH.writeInt(z ? 1 : 0);
        Parcel parcelG = G(parcelH, 15);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(o4.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final byte[] g(u uVar, String str) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, uVar);
        parcelH.writeString(str);
        Parcel parcelG = G(parcelH, 9);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void i(o4 o4Var, t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, o4Var);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 2);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void k(t4 t4Var, e4 e4Var, l0 l0Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        com.gamericefishpro.space.i9.y.b(parcelH, e4Var);
        com.gamericefishpro.space.i9.y.c(parcelH, l0Var);
        I(parcelH, 29);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void l(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 18);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void m(long j, String str, String str2, String str3) {
        Parcel parcelH = H();
        parcelH.writeLong(j);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        I(parcelH, 10);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void n(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 27);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void o(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 4);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List p(String str, String str2, String str3) {
        Parcel parcelH = H();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        Parcel parcelG = G(parcelH, 17);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(e.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void q(t4 t4Var, d dVar) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        com.gamericefishpro.space.i9.y.b(parcelH, dVar);
        I(parcelH, 30);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void r(e eVar, t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, eVar);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 12);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void s(t4 t4Var, Bundle bundle, j0 j0Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        com.gamericefishpro.space.i9.y.b(parcelH, bundle);
        com.gamericefishpro.space.i9.y.c(parcelH, j0Var);
        I(parcelH, 31);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void u(Bundle bundle, t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, bundle);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 19);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void v(u uVar, t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, uVar);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 1);
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final i w(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        Parcel parcelG = G(parcelH, 21);
        i iVar = (i) com.gamericefishpro.space.i9.y.a(parcelG, i.CREATOR);
        parcelG.recycle();
        return iVar;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List y(String str, String str2, t4 t4Var) {
        Parcel parcelH = H();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        Parcel parcelG = G(parcelH, 16);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(e.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void z(t4 t4Var) {
        Parcel parcelH = H();
        com.gamericefishpro.space.i9.y.b(parcelH, t4Var);
        I(parcelH, 26);
    }
}
