package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements e0 {
    public final com.yandex.passport.sloth.u a;

    public c0(com.yandex.passport.sloth.u uVar) {
        uVar.getClass();
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSlothEvent(event=" + this.a + ')';
    }
}
