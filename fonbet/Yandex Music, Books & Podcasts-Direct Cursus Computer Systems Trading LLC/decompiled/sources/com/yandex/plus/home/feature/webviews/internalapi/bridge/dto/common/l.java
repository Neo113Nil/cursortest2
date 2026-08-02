package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final i Companion = new i();
    public static final arf[] c = {btf.a(bwf.b, new g4(12)), null};
    public final k a;
    public final int b;

    public /* synthetic */ l(int i, k kVar, int i2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, h.a.getDescriptor());
            throw null;
        }
        this.a = kVar;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalHeight(type=");
        sb.append(this.a);
        sb.append(", value=");
        return vz1.r(sb, this.b, ')');
    }
}
