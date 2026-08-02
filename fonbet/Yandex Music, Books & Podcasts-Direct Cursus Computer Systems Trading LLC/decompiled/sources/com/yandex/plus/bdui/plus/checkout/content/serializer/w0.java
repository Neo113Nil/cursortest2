package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();
    public final boolean a;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 b;

    public /* synthetic */ w0(int i, boolean z, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, u0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = m1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && Intrinsics.d(this.b, w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MailAgreementDto(checkboxValue=" + this.a + ", agreementText=" + this.b + ')';
    }
}
