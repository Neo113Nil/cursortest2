package com.squareup.cash.appmessages;

import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public final class Actions$Two extends StringUtilsKt {
    public final Action primary;
    public final Action secondary;

    public Actions$Two(Action action, Action action2) {
        this.primary = action;
        this.secondary = action2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Actions$Two)) {
            return false;
        }
        Actions$Two actions$Two = (Actions$Two) obj;
        return this.primary.equals(actions$Two.primary) && this.secondary.equals(actions$Two.secondary);
    }

    public final int hashCode() {
        return this.secondary.hashCode() + (this.primary.hashCode() * 31);
    }

    public final String toString() {
        return "Two(primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }
}
