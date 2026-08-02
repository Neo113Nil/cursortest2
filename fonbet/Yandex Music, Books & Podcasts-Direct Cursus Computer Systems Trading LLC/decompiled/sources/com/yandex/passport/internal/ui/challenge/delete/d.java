package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.ui.progress.g b;
    public final com.yandex.passport.common.ui.a c;
    public final Map d;

    public d(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.progress.g gVar, com.yandex.passport.common.ui.a aVar, Map map) {
        map.getClass();
        this.a = fVar;
        this.b = gVar;
        this.c = aVar;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c && Intrinsics.d(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteAccountProperties(uid=");
        sb.append(this.a);
        sb.append(", progressProperties=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", headers=");
        return k5r.p(sb, this.d, ')');
    }
}
