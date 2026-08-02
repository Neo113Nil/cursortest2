package com.squareup.cash.clientsync.network;

import com.squareup.cash.clientsync.models.SyncEntity;

/* loaded from: classes8.dex */
public interface SyncEntityAction {

    public final class Delete implements SyncEntityAction {
        public final SyncEntity entity;

        public Delete(SyncEntity syncEntity) {
            this.entity = syncEntity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Delete) && this.entity.equals(((Delete) obj).entity);
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final String toString() {
            return "Delete(entity=" + this.entity + ")";
        }
    }

    public final class Update implements SyncEntityAction {
        public final SyncEntity entity;

        public Update(SyncEntity syncEntity) {
            this.entity = syncEntity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Update) && this.entity.equals(((Update) obj).entity);
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final String toString() {
            return "Update(entity=" + this.entity + ")";
        }
    }
}
