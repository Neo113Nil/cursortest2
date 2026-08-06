package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class V9 implements Parcelable {
    public static final U9 CREATOR = new U9();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f5225a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f5226b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5227c;

    public V9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f5225a = bool;
        this.f5226b = identifierStatus;
        this.f5227c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9)) {
            return false;
        }
        V9 v9 = (V9) obj;
        return kotlin.jvm.internal.i.a(this.f5225a, v9.f5225a) && this.f5226b == v9.f5226b && kotlin.jvm.internal.i.a(this.f5227c, v9.f5227c);
    }

    public final int hashCode() {
        Boolean bool = this.f5225a;
        int hashCode = (this.f5226b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f5227c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f5225a + ", status=" + this.f5226b + ", errorExplanation=" + this.f5227c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.f5225a);
        parcel.writeString(this.f5226b.getValue());
        parcel.writeString(this.f5227c);
    }

    public V9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
