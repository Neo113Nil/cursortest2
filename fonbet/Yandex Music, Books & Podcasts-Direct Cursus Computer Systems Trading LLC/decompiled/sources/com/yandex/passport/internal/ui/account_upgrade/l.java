package com.yandex.passport.internal.ui.account_upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new com.yandex.passport.internal.properties.f(27);
    public final com.yandex.passport.common.core.f a;
    public final y1 b;

    public l(com.yandex.passport.common.core.f fVar, y1 y1Var) {
        fVar.getClass();
        y1Var.getClass();
        this.a = fVar;
        this.b = y1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && this.b == lVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpgraderExtras(uid=" + this.a + ", theme=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
    }
}
