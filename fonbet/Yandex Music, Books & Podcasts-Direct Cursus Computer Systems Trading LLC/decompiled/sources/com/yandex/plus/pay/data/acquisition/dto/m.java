package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m {

    @NotNull
    public static final e Companion = new e();
    public final i a;
    public final c b;

    public /* synthetic */ m(int i, i iVar, c cVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, d.a.getDescriptor());
            throw null;
        }
        this.a = iVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.a, mVar.a) && Intrinsics.d(this.b, mVar.b);
    }

    public final int hashCode() {
        i iVar = this.a;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        c cVar = this.b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayAcquisitionGetSmartOffersRequestDto(context=" + this.a + ", geoLocation=" + this.b + ')';
    }

    public m(i iVar) {
        this.a = iVar;
        this.b = null;
    }
}
