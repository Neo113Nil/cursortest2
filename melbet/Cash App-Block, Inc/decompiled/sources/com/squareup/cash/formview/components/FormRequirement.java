package com.squareup.cash.formview.components;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormRequirement {
    public final String groupId;
    public final boolean isFulfilled;

    public FormRequirement(boolean z, String str) {
        this.isFulfilled = z;
        this.groupId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormRequirement)) {
            return false;
        }
        FormRequirement formRequirement = (FormRequirement) obj;
        return this.isFulfilled == formRequirement.isFulfilled && Intrinsics.areEqual(this.groupId, formRequirement.groupId);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isFulfilled) * 31;
        String str = this.groupId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FormRequirement(isFulfilled=" + this.isFulfilled + ", groupId=" + this.groupId + ")";
    }
}
