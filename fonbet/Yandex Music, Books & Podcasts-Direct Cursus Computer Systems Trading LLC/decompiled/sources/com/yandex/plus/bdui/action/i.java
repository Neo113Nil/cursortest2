package com.yandex.plus.bdui.action;

import com.yandex.plus.bdui.m;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final m a;
    public final h b;
    public final com.yandex.plus.bdui.document.e c;
    public final Map d;

    public i(m mVar, h hVar, com.yandex.plus.bdui.document.e eVar, Map map) {
        this.a = mVar;
        this.b = hVar;
        this.c = eVar;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && Intrinsics.d(this.c, iVar.c) && Intrinsics.d(this.d, iVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        com.yandex.plus.bdui.document.e eVar = this.c;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Map map = this.d;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandlingContext(engineContext=");
        sb.append(this.a);
        sb.append(", documentContext=");
        sb.append(this.b);
        sb.append(", document=");
        sb.append(this.c);
        sb.append(", payload=");
        return k5r.p(sb, this.d, ')');
    }
}
