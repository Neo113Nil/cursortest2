package com.squareup.cash.family.familyhub.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AllowanceSectionViewEvent$TapAllowanceView {
    public final AllowanceViewEvent allowanceViewEvent;

    public AllowanceSectionViewEvent$TapAllowanceView(AllowanceViewEvent allowanceViewEvent) {
        allowanceViewEvent.getClass();
        this.allowanceViewEvent = allowanceViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowanceSectionViewEvent$TapAllowanceView) && Intrinsics.areEqual(this.allowanceViewEvent, ((AllowanceSectionViewEvent$TapAllowanceView) obj).allowanceViewEvent);
    }

    public final int hashCode() {
        return this.allowanceViewEvent.hashCode();
    }

    public final String toString() {
        return "TapAllowanceView(allowanceViewEvent=" + this.allowanceViewEvent + ")";
    }
}
