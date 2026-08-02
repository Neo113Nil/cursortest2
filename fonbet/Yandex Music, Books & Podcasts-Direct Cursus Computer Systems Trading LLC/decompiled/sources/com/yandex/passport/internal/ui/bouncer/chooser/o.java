package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.eta;
import defpackage.n8g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements p {
    public final List a;

    public o(n8g n8gVar) {
        n8gVar.getClass();
        this.a = n8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("SetMasterChooserItems(value="), this.a, ')');
    }
}
