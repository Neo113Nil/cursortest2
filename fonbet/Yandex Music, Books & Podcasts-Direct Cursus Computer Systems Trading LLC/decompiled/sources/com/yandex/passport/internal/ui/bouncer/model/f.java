package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements k0 {
    public final b1 a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.api.y1 c;
    public final boolean d;

    public f(b1 b1Var, com.yandex.passport.common.core.f fVar, com.yandex.passport.api.y1 y1Var, boolean z) {
        b1Var.getClass();
        fVar.getClass();
        y1Var.getClass();
        this.a = b1Var;
        this.b = fVar;
        this.c = y1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeRequired(bouncerParameters=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", isCheckAgain=");
        return dfi.j(sb, this.d, ')');
    }
}
