package com.squareup.cash.db2.contacts;

import com.squareup.cash.db.contacts.AliasSyncState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectForSyncState {
    public final String hashed_alias;
    public final AliasSyncState sync_state;

    public SelectForSyncState(String str, AliasSyncState aliasSyncState) {
        str.getClass();
        this.hashed_alias = str;
        this.sync_state = aliasSyncState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectForSyncState)) {
            return false;
        }
        SelectForSyncState selectForSyncState = (SelectForSyncState) obj;
        return Intrinsics.areEqual(this.hashed_alias, selectForSyncState.hashed_alias) && this.sync_state == selectForSyncState.sync_state;
    }

    public final String getHashed_alias() {
        return this.hashed_alias;
    }

    public final AliasSyncState getSync_state() {
        return this.sync_state;
    }

    public final int hashCode() {
        int hashCode = this.hashed_alias.hashCode() * 31;
        AliasSyncState aliasSyncState = this.sync_state;
        return hashCode + (aliasSyncState == null ? 0 : aliasSyncState.hashCode());
    }

    public final String toString() {
        return "SelectForSyncState(hashed_alias=" + this.hashed_alias + ", sync_state=" + this.sync_state + ")";
    }
}
