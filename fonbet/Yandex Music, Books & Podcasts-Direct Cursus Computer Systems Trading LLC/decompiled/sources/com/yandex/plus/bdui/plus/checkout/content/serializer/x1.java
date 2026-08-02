package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t e;

    public /* synthetic */ x1(int i, String str, String str2, String str3, String str4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar) {
        if (30 != (i & 30)) {
            u7g.V(i, 30, v1.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.a, x1Var.a) && Intrinsics.d(this.b, x1Var.b) && Intrinsics.d(this.c, x1Var.c) && Intrinsics.d(this.d, x1Var.d) && Intrinsics.d(this.e, x1Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar = this.e;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "TariffOrOptionDto(name=" + this.a + ", title=" + this.b + ", text=" + this.c + ", additionText=" + this.d + ", image=" + this.e + ')';
    }
}
