package com.yandex.passport.internal.ui.bouncer.chooser;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {
    public final v a;

    public x(v vVar) {
        vVar.getClass();
        this.a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(item=" + this.a + ')';
    }
}
