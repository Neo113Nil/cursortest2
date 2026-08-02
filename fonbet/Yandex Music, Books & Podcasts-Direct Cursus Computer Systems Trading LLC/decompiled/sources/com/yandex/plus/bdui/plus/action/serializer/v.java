package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();
    public static final arf[] c;
    public final com.yandex.plus.bdui.query.b a;
    public final com.yandex.plus.bdui.action.a b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new s(0)), btf.a(bwfVar, new s(1))};
    }

    public /* synthetic */ v(int i, com.yandex.plus.bdui.query.b bVar, com.yandex.plus.bdui.action.a aVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, t.a.getDescriptor());
            throw null;
        }
        this.a = bVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteDto(actionQuery=");
        sb.append(this.a);
        sb.append(", fallback=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }

    public v(com.yandex.plus.bdui.query.b bVar, com.yandex.plus.bdui.action.a aVar) {
        bVar.getClass();
        this.a = bVar;
        this.b = aVar;
    }
}
