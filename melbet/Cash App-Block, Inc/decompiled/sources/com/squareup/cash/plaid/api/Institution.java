package com.squareup.cash.plaid.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Institution {
    public final String id;
    public final String name;

    public Institution(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Institution)) {
            return false;
        }
        Institution institution = (Institution) obj;
        return Intrinsics.areEqual(this.id, institution.id) && Intrinsics.areEqual(this.name, institution.name);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Institution(id=", this.id, ", name=", this.name, ")");
    }
}
