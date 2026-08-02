package com.yandex.plus.bdui.flex.action;

import defpackage.k5r;
import defpackage.md;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends md {
    public final com.yandex.plus.bdui.action.a a;
    public final Map b;

    public e(com.yandex.plus.bdui.action.a aVar, Map map) {
        aVar.getClass();
        this.a = aVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexAction(plusAction=");
        sb.append(this.a);
        sb.append(", payload=");
        return k5r.p(sb, this.b, ')');
    }
}
