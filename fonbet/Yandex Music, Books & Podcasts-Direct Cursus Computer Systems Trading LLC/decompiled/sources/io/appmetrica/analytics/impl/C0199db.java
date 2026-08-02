package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfi;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0199db implements Parcelable {

    @NotNull
    public static final C0170cb CREATOR = new C0170cb();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public C0199db(Boolean bool, IdentifierStatus identifierStatus, String str) {
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
        if (!(obj instanceof C0199db)) {
            return false;
        }
        C0199db c0199db = (C0199db) obj;
        return Intrinsics.d(this.a, c0199db.a) && this.b == c0199db.b && Intrinsics.d(this.c, c0199db.c);
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
        return dfi.i(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String());
        parcel.writeString(this.c);
    }

    public C0199db() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
