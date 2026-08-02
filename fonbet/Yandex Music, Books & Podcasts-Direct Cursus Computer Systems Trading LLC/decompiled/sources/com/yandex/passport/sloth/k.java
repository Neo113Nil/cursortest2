package com.yandex.passport.sloth;

import defpackage.dfi;
import defpackage.xz0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {
    public static final Set b = xz0.Y(new String[]{"2fa.ya_team_wrong_way", "register_webauthn_error"});
    public final String a;

    public k(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("SlothError(value="), this.a, ')');
    }
}
