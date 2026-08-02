package com.yandex.plus.bdui.content;

import com.yandex.plus.bdui.query.g;
import com.yandex.plus.bdui.query.h;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public final g a;
    public final a b;
    public final com.yandex.plus.bdui.shared.b c;
    public final boolean d;

    public d(g gVar, a aVar, com.yandex.plus.bdui.shared.b bVar, boolean z) {
        aVar.getClass();
        bVar.getClass();
        this.a = gVar;
        this.b = aVar;
        this.c = bVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (h.b(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentUpdate(query=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", shared=");
        sb.append(this.c);
        sb.append(", refreshing=");
        return dfi.j(sb, this.d, ')');
    }
}
