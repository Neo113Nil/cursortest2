package com.squareup.cash.clientsync.pipeline;

/* loaded from: classes.dex */
public final class TaskId {
    public final String id;

    public TaskId(String str) {
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaskId) && this.id.equals(((TaskId) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return this.id;
    }
}
