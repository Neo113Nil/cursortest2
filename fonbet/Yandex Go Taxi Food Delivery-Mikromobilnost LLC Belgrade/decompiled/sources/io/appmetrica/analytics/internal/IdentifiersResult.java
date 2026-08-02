package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.AbstractC0748tp;
import io.appmetrica.analytics.impl.C0851xc;

/* loaded from: classes9.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new C0851xc();
    public final String errorExplanation;
    public final String id;
    public final IdentifierStatus status;

    public IdentifiersResult(String str, IdentifierStatus identifierStatus, String str2) {
        this.id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentifiersResult identifiersResult = (IdentifiersResult) obj;
            String str = this.id;
            String str2 = identifiersResult.id;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.status != identifiersResult.status) {
                return false;
            }
            String str3 = this.errorExplanation;
            String str4 = identifiersResult.errorExplanation;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentifiersResult{id='");
        sb.append(this.id);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", errorExplanation='");
        return AbstractC0748tp.a(sb, this.errorExplanation, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
