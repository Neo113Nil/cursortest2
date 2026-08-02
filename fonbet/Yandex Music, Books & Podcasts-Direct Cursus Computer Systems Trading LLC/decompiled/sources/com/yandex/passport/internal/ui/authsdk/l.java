package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.sloth.command.data.a1;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.v75;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new com.yandex.passport.internal.properties.f(28);
    public final String a;
    public final List b;
    public final String c;
    public final com.yandex.passport.internal.properties.l d;
    public final boolean e;
    public final z1 f;
    public final String g;
    public final String h;
    public final String i;

    public l(String str, List list, String str2, com.yandex.passport.internal.properties.l lVar, boolean z, z1 z1Var, String str3, String str4, String str5) {
        str.getClass();
        list.getClass();
        str2.getClass();
        lVar.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = lVar;
        this.e = z;
        this.f = z1Var;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final String d() {
        String str = this.i;
        if (str == null) {
            return null;
        }
        str.getClass();
        return new Regex("^https://").replace(str, "yandexta://");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final com.yandex.passport.sloth.data.m e(com.yandex.passport.common.core.f fVar, String str) {
        fVar.getClass();
        str.getClass();
        com.yandex.passport.internal.properties.l lVar = this.d;
        String str2 = lVar.r;
        com.yandex.passport.internal.entities.k kVar = lVar.d;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = str2;
        k0 k0Var = lVar.p;
        boolean z = k0Var.e;
        boolean z2 = k0Var.a;
        String str4 = lVar.w;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = str4;
        com.yandex.passport.sloth.data.o S = com.yandex.plus.core.network.api.utils.a.S(lVar.e);
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        jVar.L(kVar);
        jVar.y(com.yandex.passport.api.n.CHILDISH);
        EnumSet<com.yandex.passport.api.n> j = jVar.l().j();
        ArrayList arrayList = new ArrayList(v75.o(j, 10));
        for (com.yandex.passport.api.n nVar : j) {
            nVar.getClass();
            arrayList.add(com.yandex.plus.core.network.api.utils.a.R(nVar));
        }
        EnumSet noneOf = EnumSet.noneOf(a1.class);
        noneOf.addAll(arrayList);
        com.yandex.passport.sloth.dependencies.e eVar = new com.yandex.passport.sloth.dependencies.e(str3, z, z2, false, str5, S, noneOf, false, null);
        z1 z1Var = this.f;
        return new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.y(this.a, this.c, eVar, this.e, z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : fVar, this.g, this.h, str), com.yandex.plus.core.network.api.utils.a.L(kVar.a), new com.yandex.passport.common.properties.a(14, false, false), 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && Intrinsics.d(this.d, lVar.d) && this.e == lVar.e && Intrinsics.d(this.f, lVar.f) && Intrinsics.d(this.g, lVar.g) && Intrinsics.d(this.h, lVar.h) && Intrinsics.d(this.i, lVar.i);
    }

    public final int hashCode() {
        int e = k5r.e((this.d.hashCode() + k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        z1 z1Var = this.f;
        int hashCode = (e + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSdkProperties(clientId=");
        sb.append(this.a);
        sb.append(", scopes=");
        sb.append(this.b);
        sb.append(", responseType=");
        sb.append(this.c);
        sb.append(", loginProperties=");
        sb.append(this.d);
        sb.append(", forceConfirm=");
        sb.append(this.e);
        sb.append(", selectedUid=");
        sb.append(this.f);
        sb.append(", callerAppId=");
        sb.append(this.g);
        sb.append(", callerFingerprint=");
        sb.append(this.h);
        sb.append(", turboAppIdentifier=");
        return dfi.i(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
        z1 z1Var = this.f;
        if (z1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            z1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
