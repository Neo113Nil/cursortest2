package com.squareup.cash.appmessages;

import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public final class Actions$One extends StringUtilsKt {
    public final Action action;

    public Actions$One(Action action) {
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Actions$One) && this.action.equals(((Actions$One) obj).action);
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final String toString() {
        return "One(action=" + this.action + ")";
    }
}
