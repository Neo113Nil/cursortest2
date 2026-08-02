package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.InputState_androidKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Header$Style$Active extends InputState_androidKt {
    public final MobilePlanHome.ActiveHeader value;

    public MobilePlanHome$Header$Style$Active(MobilePlanHome.ActiveHeader activeHeader) {
        activeHeader.getClass();
        this.value = activeHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobilePlanHome$Header$Style$Active) && Intrinsics.areEqual(this.value, ((MobilePlanHome$Header$Style$Active) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Active(value=" + this.value + ")";
    }
}
