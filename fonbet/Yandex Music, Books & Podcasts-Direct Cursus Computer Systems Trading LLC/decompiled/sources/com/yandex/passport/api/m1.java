package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ouj;
import defpackage.vhp;
import defpackage.xq0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m1 implements Parcelable {
    public static final String b;
    public static final String c;
    public final String a;

    @NotNull
    public static final l1 Companion = new l1();

    @NotNull
    public static final Parcelable.Creator<m1> CREATOR = new a(5);

    static {
        a("default");
        b = "default";
        a("_!EMPTY#_");
        c = "_!EMPTY#_";
        a("yango");
        a("yango-israel");
        a("yango-france");
        a("yango-norway");
        a("delivery-club");
        a("toloka");
        a("meteum");
    }

    public /* synthetic */ m1(String str) {
        this.a = str;
    }

    public static void a(String str) {
        str.getClass();
        if (StringsKt.U(str)) {
            xq0.q("Blank partitions are not allowed");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return Intrinsics.d(this.a, ((m1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "PassportPartition(value=", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
