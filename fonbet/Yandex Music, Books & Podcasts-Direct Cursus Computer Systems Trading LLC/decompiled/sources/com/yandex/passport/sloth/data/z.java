package com.yandex.passport.sloth.data;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z extends o0 implements p, q {
    public final String b;
    public final com.yandex.passport.common.core.f c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.passport.common.core.f fVar, o oVar, String str) {
        super(k.Bear);
        str.getClass();
        fVar.getClass();
        this.b = str;
        this.c = fVar;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.b, zVar.b) && Intrinsics.d(this.c, zVar.c) && this.d == zVar.d;
    }

    @Override // com.yandex.passport.sloth.data.p
    public final o getTheme() {
        return this.d;
    }

    @Override // com.yandex.passport.sloth.data.q
    public final com.yandex.passport.common.core.f getUid() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.appsflyer.internal.k.d(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bear(url=");
        com.appsflyer.internal.k.y(sb, this.b, ", uid=");
        sb.append(this.c);
        sb.append(", theme=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
