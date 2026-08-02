package com.yandex.passport.internal.ui.domik;

import android.os.Parcel;
import android.os.Parcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a0 extends e {

    @NotNull
    public static final Parcelable.Creator<a0> CREATOR = new c(6);
    public final com.yandex.passport.internal.properties.l a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final z j;
    public final com.yandex.passport.internal.l k;
    public final com.yandex.passport.internal.network.response.a l;
    public final com.yandex.passport.internal.entities.g m;
    public final String n;
    public final boolean o;
    public final b0 p;

    public a0(com.yandex.passport.internal.properties.l lVar, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, z zVar, com.yandex.passport.internal.l lVar2, com.yandex.passport.internal.network.response.a aVar, com.yandex.passport.internal.entities.g gVar, String str8, boolean z, b0 b0Var) {
        lVar.getClass();
        zVar.getClass();
        b0Var.getClass();
        this.a = lVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
        this.i = str7;
        this.j = zVar;
        this.k = lVar2;
        this.l = aVar;
        this.m = gVar;
        this.n = str8;
        this.o = z;
        this.p = b0Var;
    }

    public static a0 i(a0 a0Var, String str, String str2, String str3, com.yandex.passport.internal.l lVar, com.yandex.passport.internal.entities.g gVar, b0 b0Var, int i) {
        com.yandex.passport.internal.properties.l lVar2 = a0Var.a;
        String str4 = (i & 2) != 0 ? a0Var.b : str;
        String str5 = a0Var.c;
        String str6 = str4;
        String str7 = a0Var.d;
        String str8 = (i & 16) != 0 ? a0Var.e : str2;
        String str9 = a0Var.f;
        String str10 = str8;
        String str11 = a0Var.g;
        List list = a0Var.h;
        String str12 = (i & 256) != 0 ? a0Var.i : str3;
        z zVar = a0Var.j;
        com.yandex.passport.internal.l lVar3 = (i & 1024) != 0 ? a0Var.k : lVar;
        com.yandex.passport.internal.network.response.a aVar = a0Var.l;
        com.yandex.passport.internal.entities.g gVar2 = (i & 4096) != 0 ? a0Var.m : gVar;
        String str13 = a0Var.n;
        boolean z = (i & 16384) != 0 ? a0Var.o : true;
        b0 b0Var2 = (i & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? a0Var.p : b0Var;
        a0Var.getClass();
        lVar2.getClass();
        zVar.getClass();
        b0Var2.getClass();
        return new a0(lVar2, str6, str5, str7, str10, str9, str11, list, str12, zVar, lVar3, aVar, gVar2, str13, z, b0Var2);
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final String d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final com.yandex.passport.internal.properties.l e() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final com.yandex.passport.common.core.b f() {
        return com.yandex.plus.core.network.api.utils.a.L(this.a.d.a);
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final d h() {
        Parcelable.Creator<d> creator = d.CREATOR;
        return d.i(d.i(d.i(s.a(this.a).j(this.b), null, this.c, null, null, null, null, null, null, null, null, null, 524275), null, null, this.d, null, null, null, null, null, null, null, null, 524271), null, null, null, null, null, null, null, null, null, null, this.i, 507903);
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final String u() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j.name());
        com.yandex.passport.internal.l lVar = this.k;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i);
        }
        com.yandex.passport.internal.network.response.a aVar = this.l;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        com.yandex.passport.internal.entities.g gVar = this.m;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar.name());
        }
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeString(this.p.name());
    }
}
