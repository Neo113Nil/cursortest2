package com.yandex.passport.sloth.data;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends o0 implements p, q {
    public final com.yandex.passport.common.core.f b;
    public final long c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j, com.yandex.passport.common.core.f fVar, o oVar) {
        super(k.AccountDeleteForever);
        fVar.getClass();
        this.b = fVar;
        this.c = j;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.b, tVar.b) && this.c == tVar.c && this.d == tVar.d;
    }

    @Override // com.yandex.passport.sloth.data.p
    public final o getTheme() {
        return this.d;
    }

    @Override // com.yandex.passport.sloth.data.q
    public final com.yandex.passport.common.core.f getUid() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + tlm.c(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AccountDeleteForever(uid=" + this.b + ", locationId=" + this.c + ", theme=" + this.d + ')';
    }
}
