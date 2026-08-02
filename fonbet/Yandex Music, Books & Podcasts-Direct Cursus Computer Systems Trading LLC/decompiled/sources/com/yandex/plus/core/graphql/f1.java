package com.yandex.plus.core.graphql;

import defpackage.f1d;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 implements s6n {
    public final Object a;

    public f1(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.u0 u0Var = com.yandex.plus.core.graphql.adapter.u0.a;
        tj tjVar = uj.a;
        return new qhj(u0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "7b62af27c2d26d2112a96cbb9272dfc737c00e72ffeb09694270d8824903739b";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query InviteToFamilyWebUrl($language: LanguageISO639Scalar!) { familyInvite(input: { language: $language } ) { webViewInvite { webViewUrl skipText } inviteCancellationReason } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z("language");
        uj.g.a(r7fVar, fx6Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.a, ((f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "InviteToFamilyWebUrl";
    }

    public final String toString() {
        return f1d.j(new StringBuilder("InviteToFamilyWebUrlQuery(language="), this.a, ')');
    }
}
