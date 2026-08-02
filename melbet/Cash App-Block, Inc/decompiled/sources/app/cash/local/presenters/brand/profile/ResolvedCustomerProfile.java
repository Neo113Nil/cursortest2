package app.cash.local.presenters.brand.profile;

import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ResolvedCustomerProfile {
    public final Color backgroundColor;
    public final String monogram;
    public final String photoUrl;

    public ResolvedCustomerProfile(Color color, String str, String str2) {
        this.photoUrl = str;
        this.monogram = str2;
        this.backgroundColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedCustomerProfile)) {
            return false;
        }
        ResolvedCustomerProfile resolvedCustomerProfile = (ResolvedCustomerProfile) obj;
        return Intrinsics.areEqual(this.photoUrl, resolvedCustomerProfile.photoUrl) && Intrinsics.areEqual(this.monogram, resolvedCustomerProfile.monogram) && this.backgroundColor.equals(resolvedCustomerProfile.backgroundColor);
    }

    public final int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.monogram;
        return this.backgroundColor.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResolvedCustomerProfile(photoUrl=", this.photoUrl, ", monogram=", this.monogram, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(")");
        return m.toString();
    }
}
