package com.squareup.cash.cashapppay.settings.viewmodels;

import com.squareup.protos.franklin.common.SyncBusinessGrant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RemoveLinkedBusinessViewModel {
    public final SyncBusinessGrant.ActionType actionType;
    public final String name;

    public RemoveLinkedBusinessViewModel(SyncBusinessGrant.ActionType actionType, String str) {
        actionType.getClass();
        str.getClass();
        this.actionType = actionType;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveLinkedBusinessViewModel)) {
            return false;
        }
        RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel = (RemoveLinkedBusinessViewModel) obj;
        return this.actionType == removeLinkedBusinessViewModel.actionType && Intrinsics.areEqual(this.name, removeLinkedBusinessViewModel.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.actionType.hashCode() * 31);
    }

    public final String toString() {
        return "RemoveLinkedBusinessViewModel(actionType=" + this.actionType + ", name=" + this.name + ")";
    }
}
