package com.yandex.passport.internal.properties;

import com.yandex.passport.api.e1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements e1 {
    public y1 a;
    public z1 b;
    public String c;
    public String d;
    public boolean e;

    @Override // com.yandex.passport.api.e1
    public final String d() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        Intrinsics.j("service");
        throw null;
    }

    @Override // com.yandex.passport.api.e1
    public final String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        Intrinsics.j("brand");
        throw null;
    }

    @Override // com.yandex.passport.api.e1
    public final boolean f() {
        return this.e;
    }

    @Override // com.yandex.passport.api.e1
    public final y1 getTheme() {
        return this.a;
    }

    @Override // com.yandex.passport.api.e1
    public final z1 getUid() {
        z1 z1Var = this.b;
        if (z1Var != null) {
            return z1Var;
        }
        Intrinsics.j("uid");
        throw null;
    }
}
