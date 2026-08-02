package androidx.glance.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ActionParameters$Key {
    public final String name;

    public ActionParameters$Key(String str) {
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ActionParameters$Key) {
            return Intrinsics.areEqual(this.name, ((ActionParameters$Key) obj).name);
        }
        return false;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return this.name;
    }
}
