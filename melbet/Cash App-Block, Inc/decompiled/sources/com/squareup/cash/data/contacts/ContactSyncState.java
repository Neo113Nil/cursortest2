package com.squareup.cash.data.contacts;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;

/* loaded from: classes.dex */
public abstract class ContactSyncState {

    /* loaded from: classes6.dex */
    public final class Synced extends ContactSyncState {
        public static final Synced INSTANCE = new Synced();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Synced);
        }

        public final int hashCode() {
            return 2004026601;
        }

        public final String toString() {
            return "Synced";
        }
    }

    /* loaded from: classes6.dex */
    public final class Syncing extends ContactSyncState {
        public final DeferredCoroutine job;

        public Syncing(DeferredCoroutine deferredCoroutine) {
            this.job = deferredCoroutine;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Syncing) && this.job.equals(((Syncing) obj).job);
        }

        public final Deferred getJob() {
            return this.job;
        }

        public final int hashCode() {
            return this.job.hashCode();
        }

        public final String toString() {
            return "Syncing(job=" + this.job + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SyncingInvalidated extends ContactSyncState {
        public final Deferred job;

        public SyncingInvalidated(Deferred deferred) {
            deferred.getClass();
            this.job = deferred;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SyncingInvalidated) && Intrinsics.areEqual(this.job, ((SyncingInvalidated) obj).job);
        }

        public final Deferred getJob() {
            return this.job;
        }

        public final int hashCode() {
            return this.job.hashCode();
        }

        public final String toString() {
            return "SyncingInvalidated(job=" + this.job + ")";
        }
    }

    public final class Unsynced extends ContactSyncState {
        public static final Unsynced INSTANCE = new Unsynced();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unsynced);
        }

        public final int hashCode() {
            return -94003966;
        }

        public final String toString() {
            return "Unsynced";
        }
    }

    public final ContactSyncState invalidateSynced() {
        if (this instanceof Synced) {
            return Unsynced.INSTANCE;
        }
        if (this instanceof Syncing) {
            return new SyncingInvalidated(((Syncing) this).getJob());
        }
        if ((this instanceof SyncingInvalidated) || (this instanceof Unsynced)) {
            return this;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
