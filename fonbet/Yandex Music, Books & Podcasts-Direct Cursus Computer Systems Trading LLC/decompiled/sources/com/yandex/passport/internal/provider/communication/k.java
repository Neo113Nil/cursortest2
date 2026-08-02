package com.yandex.passport.internal.provider.communication;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.v2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k extends m {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new com.yandex.passport.internal.properties.f(23);
    public final v2 a;

    public k(v2 v2Var) {
        v2Var.getClass();
        this.a = v2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PushTokenCommand(platform=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }
}
