package com.squareup.cash.cashapppay.settings.viewmodels;

import com.squareup.protos.franklin.common.SyncBusinessGrant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BusinessGrantDeleted extends CashAppPaySettingsViewEvent {
    public final SyncBusinessGrant.ActionType actionType;
    public final String businessGrantId;

    public BusinessGrantDeleted(SyncBusinessGrant.ActionType actionType, String str) {
        str.getClass();
        actionType.getClass();
        this.businessGrantId = str;
        this.actionType = actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGrantDeleted)) {
            return false;
        }
        BusinessGrantDeleted businessGrantDeleted = (BusinessGrantDeleted) obj;
        return Intrinsics.areEqual(this.businessGrantId, businessGrantDeleted.businessGrantId) && this.actionType == businessGrantDeleted.actionType;
    }

    public final int hashCode() {
        return this.actionType.hashCode() + (this.businessGrantId.hashCode() * 31);
    }

    public final String toString() {
        return "BusinessGrantDeleted(businessGrantId=" + this.businessGrantId + ", actionType=" + this.actionType + ")";
    }
}
