package com.yandex.plus.core.network.header;

import com.yandex.plus.bdui.plus.checkout.h;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements Comparable {
    public final String a;
    public final a b;
    public final jyr c = btf.b(new h(17, this));

    public b(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        bVar.getClass();
        if (a().compareTo(bVar.a()) < 0) {
            return -1;
        }
        return a().compareTo(bVar.a()) > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return Intrinsics.d(bVar != null ? bVar.a() : null, a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
