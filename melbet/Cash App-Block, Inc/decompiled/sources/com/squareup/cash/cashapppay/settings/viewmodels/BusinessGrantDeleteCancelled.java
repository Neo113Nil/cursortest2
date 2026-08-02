package com.squareup.cash.cashapppay.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BusinessGrantDeleteCancelled extends CashAppPaySettingsViewEvent {
    public final String businessGrantId;

    public BusinessGrantDeleteCancelled(String str) {
        str.getClass();
        this.businessGrantId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessGrantDeleteCancelled) && Intrinsics.areEqual(this.businessGrantId, ((BusinessGrantDeleteCancelled) obj).businessGrantId);
    }

    public final int hashCode() {
        return this.businessGrantId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BusinessGrantDeleteCancelled(businessGrantId=", this.businessGrantId, ")");
    }
}
