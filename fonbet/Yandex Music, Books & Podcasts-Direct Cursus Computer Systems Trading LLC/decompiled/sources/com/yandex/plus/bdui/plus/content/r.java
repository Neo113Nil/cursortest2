package com.yandex.plus.bdui.plus.content;

import defpackage.f1d;
import defpackage.k5r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public final n a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final l e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final com.yandex.plus.bdui.action.a i;

    public r(n nVar, boolean z, boolean z2, List list, l lVar, Map map, Map map2, Map map3, com.yandex.plus.bdui.action.a aVar) {
        list.getClass();
        this.a = nVar;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = lVar;
        this.f = map;
        this.g = map2;
        this.h = map3;
        this.i = aVar;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b == rVar.b && this.c == rVar.c && Intrinsics.d(this.d, rVar.d) && this.e.equals(rVar.e) && this.f.equals(rVar.f) && this.g.equals(rVar.g) && this.h.equals(rVar.h) && Intrinsics.d(this.i, rVar.i);
    }

    public final int hashCode() {
        int b = f1d.b(this.h, f1d.b(this.g, f1d.b(this.f, (this.e.hashCode() + k5r.d(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.i;
        return b + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusWebContent(navigation=");
        sb.append(this.a);
        sb.append(", ignoreJSInterfaces=");
        sb.append(this.b);
        sb.append(", disableJS=");
        sb.append(this.c);
        sb.append(", plugins=");
        sb.append(this.d);
        sb.append(", loadingSettings=");
        sb.append(this.e);
        sb.append(", transitionUrlActions=");
        sb.append(this.f);
        sb.append(", transitionAnchorActions=");
        sb.append(this.g);
        sb.append(", webActions=");
        sb.append(this.h);
        sb.append(", onBackAction=");
        return com.appsflyer.internal.k.o(sb, this.i, ')');
    }
}
