package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {
    public final List a;

    public g0(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("CreateProfile(masters="), this.a, ')');
    }
}
