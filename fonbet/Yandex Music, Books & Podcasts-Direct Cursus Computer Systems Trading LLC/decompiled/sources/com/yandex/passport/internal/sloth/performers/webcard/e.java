package com.yandex.passport.internal.sloth.performers.webcard;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements f {
    public final Throwable a;

    public e(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("ShowError(throwable="), this.a, ')');
    }
}
