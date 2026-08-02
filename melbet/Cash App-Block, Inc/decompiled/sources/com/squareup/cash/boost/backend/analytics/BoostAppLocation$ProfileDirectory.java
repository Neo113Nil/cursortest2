package com.squareup.cash.boost.backend.analytics;

import androidx.compose.ui.platform.DerivedSize;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BoostAppLocation$ProfileDirectory extends DerivedSize.Companion {
    public final String flowToken;

    public BoostAppLocation$ProfileDirectory(String str) {
        this.flowToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BoostAppLocation$ProfileDirectory) && Intrinsics.areEqual(this.flowToken, ((BoostAppLocation$ProfileDirectory) obj).flowToken);
    }

    public final int hashCode() {
        String str = this.flowToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileDirectory(flowToken=", this.flowToken, ")");
    }
}
