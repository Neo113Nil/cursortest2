package com.yandex.plus.bdui.scaffold;

import com.yandex.plus.bdui.query.e;
import com.yandex.plus.bdui.query.g;
import com.yandex.plus.bdui.query.h;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final g a;
    public final com.yandex.plus.bdui.plus.scaffold.a b;
    public final com.yandex.plus.bdui.shared.b c;
    public final boolean d;

    public b(e eVar, com.yandex.plus.bdui.plus.scaffold.a aVar, com.yandex.plus.bdui.shared.b bVar, boolean z) {
        aVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = aVar;
        this.c = bVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (h.b(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScaffoldUpdate(query=");
        sb.append(this.a);
        sb.append(", scaffold=");
        sb.append(this.b);
        sb.append(", shared=");
        sb.append(this.c);
        sb.append(", refreshing=");
        return dfi.j(sb, this.d, ')');
    }
}
