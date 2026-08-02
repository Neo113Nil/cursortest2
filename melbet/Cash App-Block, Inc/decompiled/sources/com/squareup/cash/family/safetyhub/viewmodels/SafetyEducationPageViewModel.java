package com.squareup.cash.family.safetyhub.viewmodels;

import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SafetyEducationPageViewModel {
    public final SafetyEducationPage page;

    public SafetyEducationPageViewModel(SafetyEducationPage safetyEducationPage) {
        safetyEducationPage.getClass();
        this.page = safetyEducationPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafetyEducationPageViewModel) && Intrinsics.areEqual(this.page, ((SafetyEducationPageViewModel) obj).page);
    }

    public final int hashCode() {
        return this.page.hashCode();
    }

    public final String toString() {
        return "SafetyEducationPageViewModel(page=" + this.page + ")";
    }
}
