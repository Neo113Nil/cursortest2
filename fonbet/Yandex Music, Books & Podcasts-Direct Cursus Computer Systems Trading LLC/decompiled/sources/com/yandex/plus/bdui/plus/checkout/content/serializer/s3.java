package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s3 {

    @NotNull
    public static final r3 Companion = new r3();
    public static final arf[] d;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{btf.a(bwfVar, new q0(16)), btf.a(bwfVar, new q0(17)), btf.a(bwfVar, new q0(18))};
    }

    public /* synthetic */ s3(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, q3.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return Intrinsics.d(this.a, s3Var.a) && Intrinsics.d(this.b, s3Var.b) && Intrinsics.d(this.c, s3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.c;
        return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(primary=");
        sb.append(this.a);
        sb.append(", secondary=");
        sb.append(this.b);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.c, ')');
    }
}
