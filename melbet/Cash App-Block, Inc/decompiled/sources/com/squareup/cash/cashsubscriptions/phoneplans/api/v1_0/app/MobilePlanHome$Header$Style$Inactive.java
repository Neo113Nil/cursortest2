package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.InputState_androidKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Header$Style$Inactive extends InputState_androidKt {
    public final MobilePlanHome.InactiveHeader value;

    public MobilePlanHome$Header$Style$Inactive(MobilePlanHome.InactiveHeader inactiveHeader) {
        inactiveHeader.getClass();
        this.value = inactiveHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobilePlanHome$Header$Style$Inactive) && Intrinsics.areEqual(this.value, ((MobilePlanHome$Header$Style$Inactive) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Inactive(value=" + this.value + ")";
    }
}
