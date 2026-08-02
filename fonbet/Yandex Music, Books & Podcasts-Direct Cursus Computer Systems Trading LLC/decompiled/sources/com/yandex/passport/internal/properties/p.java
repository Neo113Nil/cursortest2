package com.yandex.passport.internal.properties;

import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.e5b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements com.yandex.passport.api.g0 {
    public z1 a;
    public v b;
    public y1 c;
    public e5b d;

    @Override // com.yandex.passport.api.g0
    public final Map d() {
        return this.d;
    }

    @Override // com.yandex.passport.api.g0
    public final v getProgressProperties() {
        return this.b;
    }

    @Override // com.yandex.passport.api.g0
    public final y1 getTheme() {
        return this.c;
    }

    @Override // com.yandex.passport.api.g0
    public final z1 getUid() {
        z1 z1Var = this.a;
        if (z1Var != null) {
            return z1Var;
        }
        Intrinsics.j("uid");
        throw null;
    }
}
