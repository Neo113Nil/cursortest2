package com.yandex.plus.bdui.plus.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements com.yandex.plus.bdui.action.a {
    public final long a;
    public final com.yandex.plus.bdui.action.a b;

    public h(long j, com.yandex.plus.bdui.action.a aVar) {
        aVar.getClass();
        this.a = j;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && Intrinsics.d(this.b, hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusDelayAction(delay=");
        sb.append(this.a);
        sb.append(", action=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }
}
