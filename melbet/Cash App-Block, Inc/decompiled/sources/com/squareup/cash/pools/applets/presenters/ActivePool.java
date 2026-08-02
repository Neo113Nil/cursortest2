package com.squareup.cash.pools.applets.presenters;

import com.squareup.cash.pools.applets.presenters.PoolIcon;

/* loaded from: classes6.dex */
public final class ActivePool {
    public final PoolIcon.Pool icon;
    public final String name;

    public ActivePool(String str, PoolIcon.Pool pool) {
        this.name = str;
        this.icon = pool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivePool)) {
            return false;
        }
        ActivePool activePool = (ActivePool) obj;
        return this.name.equals(activePool.name) && this.icon.equals(activePool.icon);
    }

    public final int hashCode() {
        return this.icon.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "ActivePool(name=" + this.name + ", icon=" + this.icon + ")";
    }
}
