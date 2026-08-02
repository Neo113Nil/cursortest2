package com.yandex.plus.core.graphql.daily.progress;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final arf[] h = {null, null, null, btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(28)), null, null, null};
    public final String a;
    public final k b;
    public final k c;
    public final List d;
    public final k e;
    public final double f;
    public final k g;

    public /* synthetic */ n(int i, String str, k kVar, k kVar2, List list, k kVar3, double d, k kVar4) {
        if (118 != (i & 118)) {
            u7g.V(i, 118, l.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = kVar;
        this.c = kVar2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        this.e = kVar3;
        this.f = d;
        this.g = kVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.a, nVar.a) && Intrinsics.d(this.b, nVar.b) && Intrinsics.d(this.c, nVar.c) && Intrinsics.d(this.d, nVar.d) && Intrinsics.d(this.e, nVar.e) && Double.compare(this.f, nVar.f) == 0 && Intrinsics.d(this.g, nVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int d = k5r.d(k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a), 31, this.c.a);
        List list = this.d;
        return this.g.a.hashCode() + k5r.b(this.f, k5r.d((d + (list != null ? list.hashCode() : 0)) * 31, 31, this.e.a), 31);
    }

    public final String toString() {
        return "ProgressDataResponse(scoreTextWithReplacers=" + this.a + ", scoreTextColor=" + this.b + ", blankTextColor=" + this.c + ", replacers=" + this.d + ", backgroundColor=" + this.e + ", progressPercent=" + this.f + ", progressColor=" + this.g + ')';
    }
}
