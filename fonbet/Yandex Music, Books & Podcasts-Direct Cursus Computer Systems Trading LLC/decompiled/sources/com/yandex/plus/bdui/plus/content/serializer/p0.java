package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public static final arf[] f;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new b(6)), btf.a(bwfVar, new b(7)), btf.a(bwfVar, new b(8)), btf.a(bwfVar, new b(9)), btf.a(bwfVar, new b(10))};
    }

    public /* synthetic */ p0(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4, com.yandex.plus.bdui.action.a aVar5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, n0.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.a, p0Var.a) && Intrinsics.d(this.b, p0Var.b) && Intrinsics.d(this.c, p0Var.c) && Intrinsics.d(this.d, p0Var.d) && Intrinsics.d(this.e, p0Var.e);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.action.a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar3 = this.c;
        int hashCode3 = (hashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar4 = this.d;
        int hashCode4 = (hashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar5 = this.e;
        return hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogActionsDto(logClick=");
        sb.append(this.a);
        sb.append(", logViewShown=");
        sb.append(this.b);
        sb.append(", logViewDisappeared=");
        sb.append(this.c);
        sb.append(", logFocusAcquired=");
        sb.append(this.d);
        sb.append(", logFocusLost=");
        return com.appsflyer.internal.k.o(sb, this.e, ')');
    }
}
