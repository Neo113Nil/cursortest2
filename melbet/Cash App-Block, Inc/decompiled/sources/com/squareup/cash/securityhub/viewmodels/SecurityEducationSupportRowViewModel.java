package com.squareup.cash.securityhub.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SecurityEducationSupportRowViewModel {
    public final SecurityEducationSupportRowId id;
    public final boolean isActionable;
    public final String subtitle;
    public final String title;

    public SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId securityEducationSupportRowId, String str, String str2, boolean z) {
        str.getClass();
        this.id = securityEducationSupportRowId;
        this.title = str;
        this.subtitle = str2;
        this.isActionable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityEducationSupportRowViewModel)) {
            return false;
        }
        SecurityEducationSupportRowViewModel securityEducationSupportRowViewModel = (SecurityEducationSupportRowViewModel) obj;
        return this.id == securityEducationSupportRowViewModel.id && Intrinsics.areEqual(this.title, securityEducationSupportRowViewModel.title) && Intrinsics.areEqual(this.subtitle, securityEducationSupportRowViewModel.subtitle) && this.isActionable == securityEducationSupportRowViewModel.isActionable;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        return Boolean.hashCode(this.isActionable) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecurityEducationSupportRowViewModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return re$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", isActionable=", this.isActionable, ")");
    }
}
