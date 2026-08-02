package com.squareup.cash.clientsync.pipeline;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SyncScope {

    public final class Global implements SyncScope {
        public static final Global INSTANCE = new Global();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Global);
        }

        public final int hashCode() {
            return 1738561326;
        }

        public final String toString() {
            return "Global";
        }
    }

    /* loaded from: classes6.dex */
    public final class Topics implements SyncScope {
        public final Set topics;

        public Topics(Set set) {
            set.getClass();
            this.topics = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Topics) && Intrinsics.areEqual(this.topics, ((Topics) obj).topics);
        }

        public final Set getTopics() {
            return this.topics;
        }

        public final int hashCode() {
            return this.topics.hashCode();
        }

        public final String toString() {
            return "Topics(topics=" + this.topics + ")";
        }
    }
}
