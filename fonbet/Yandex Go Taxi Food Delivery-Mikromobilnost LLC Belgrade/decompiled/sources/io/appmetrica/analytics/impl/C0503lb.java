package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0503lb implements Parcelable {
    public static final C0474kb CREATOR = new C0474kb();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public C0503lb(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0503lb)) {
            return false;
        }
        C0503lb c0503lb = (C0503lb) obj;
        return jl40.l(this.a, c0503lb.a) && this.b == c0503lb.b && jl40.l(this.c, c0503lb.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return b64.p(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public C0503lb() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
