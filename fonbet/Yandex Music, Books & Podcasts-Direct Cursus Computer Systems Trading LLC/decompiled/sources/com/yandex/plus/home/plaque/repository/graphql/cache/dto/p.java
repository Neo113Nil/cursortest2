package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class p implements x {

    @NotNull
    public static final o Companion = new o();
    public static final arf[] d = {btf.a(bwf.b, new com.yandex.plus.home.graphql.configuration.a(15)), null, null};
    public final List a;
    public final s b;
    public final s c;

    public /* synthetic */ p(int i, List list, s sVar, s sVar2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, n.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = sVar;
        this.c = sVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.a, pVar.a) && Intrinsics.d(this.b, pVar.b) && Intrinsics.d(this.c, pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LinearGradient(colors=" + this.a + ", startPoint=" + this.b + ", endPoint=" + this.c + ')';
    }

    public p(ArrayList arrayList, s sVar, s sVar2) {
        this.a = arrayList;
        this.b = sVar;
        this.c = sVar2;
    }
}
