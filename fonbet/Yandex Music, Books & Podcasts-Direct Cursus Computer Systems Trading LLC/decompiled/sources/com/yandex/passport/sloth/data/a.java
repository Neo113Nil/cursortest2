package com.yandex.passport.sloth.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new com.yandex.passport.internal.ui.authsdk.r(12);
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;

    public a(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2) {
        fVar.getClass();
        this.a = fVar;
        this.b = fVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.common.core.f fVar = this.b;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountForProfile(uid=");
        sb.append(this.a);
        sb.append(", muid=");
        return com.appsflyer.internal.k.n(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
