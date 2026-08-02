package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q {

    @NotNull
    public static final d Companion = new d();
    public static final arf[] f = {btf.a(bwf.b, new g4(10)), null, null, null, null};
    public final n a;
    public final g b;
    public final l c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ q(int i, n nVar, g gVar, l lVar, Integer num, Boolean bool) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, c.a.getDescriptor());
            throw null;
        }
        this.a = nVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c) && Intrinsics.d(this.d, qVar.d) && Intrinsics.d(this.e, qVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        l lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresentationOptionsDto(openFormat=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", modalHeight=");
        sb.append(this.c);
        sb.append(", shadowAlpha=");
        sb.append(this.d);
        sb.append(", disableClose=");
        return com.appsflyer.internal.k.p(sb, this.e, ')');
    }
}
