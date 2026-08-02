package com.yandex.plus.bdui.plus.action.serializer;

import com.yandex.passport.sloth.command.data.k0;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();
    public static final arf[] c = {null, btf.a(bwf.b, new k0(27))};
    public final long a;
    public final com.yandex.plus.bdui.action.a b;

    public /* synthetic */ k(int i, long j, com.yandex.plus.bdui.action.a aVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, i.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && Intrinsics.d(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DelayDto(delay=");
        sb.append(this.a);
        sb.append(", action=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }

    public k(long j, com.yandex.plus.bdui.action.a aVar) {
        aVar.getClass();
        this.a = j;
        this.b = aVar;
    }
}
