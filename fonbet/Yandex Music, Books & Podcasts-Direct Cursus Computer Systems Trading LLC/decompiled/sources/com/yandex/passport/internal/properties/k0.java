package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.q0;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k0> CREATOR = new f(19);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final q0 d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final a m;
    public final v n;
    public final boolean o;
    public final boolean p;

    public k0(boolean z, boolean z2, boolean z3, q0 q0Var, boolean z4, String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, a aVar, v vVar, boolean z7, boolean z8) {
        q0Var.getClass();
        aVar.getClass();
        vVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = q0Var;
        this.e = z4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z5;
        this.k = z6;
        this.l = str5;
        this.m = aVar;
        this.n = vVar;
        this.o = z7;
        this.p = z8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a == k0Var.a && this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && this.e == k0Var.e && Intrinsics.d(this.f, k0Var.f) && Intrinsics.d(this.g, k0Var.g) && Intrinsics.d(this.h, k0Var.h) && Intrinsics.d(this.i, k0Var.i) && this.j == k0Var.j && this.k == k0Var.k && Intrinsics.d(this.l, k0Var.l) && Intrinsics.d(this.m, k0Var.m) && Intrinsics.d(this.n, k0Var.n) && this.o == k0Var.o && this.p == k0Var.p;
    }

    public final int hashCode() {
        int e = k5r.e((this.d.hashCode() + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int e2 = k5r.e(k5r.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.j), 31, this.k);
        String str5 = this.l;
        return Boolean.hashCode(this.p) + k5r.e((this.n.hashCode() + ((this.m.hashCode() + ((e2 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisualProperties(isNoReturnToHost=");
        sb.append(this.a);
        sb.append(", isSkipButtonShown=");
        sb.append(this.b);
        sb.append(", blockBackButton=");
        sb.append(this.c);
        sb.append(", identifierHintVariant=");
        sb.append(this.d);
        sb.append(", isSocialAuthorizationEnabled=");
        sb.append(this.e);
        sb.append(", authMessage=");
        sb.append(this.f);
        sb.append(", usernameMessage=");
        sb.append(this.g);
        sb.append(", registrationMessage=");
        sb.append(this.h);
        sb.append(", deleteAccountMessage=");
        sb.append(this.i);
        sb.append(", isPreferPhonishAuth=");
        sb.append(this.j);
        sb.append(", isChoosingAnotherAccountOnReloginButtonHidden=");
        sb.append(this.k);
        sb.append(", customLogoText=");
        sb.append(this.l);
        sb.append(", accountListProperties=");
        sb.append(this.m);
        sb.append(", progressProperties=");
        sb.append(this.n);
        sb.append(", isShowBackgroundAfterAuth=");
        sb.append(this.o);
        sb.append(", isReloginEditable=");
        return dfi.j(sb, this.p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
        this.m.writeToParcel(parcel, i);
        this.n.writeToParcel(parcel, i);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
