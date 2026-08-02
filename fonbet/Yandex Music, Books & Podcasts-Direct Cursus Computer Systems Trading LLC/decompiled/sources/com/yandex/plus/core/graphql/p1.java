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
public final class p1 implements s6n {
    public final Object a;

    public p1(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.a1 a1Var = com.yandex.plus.core.graphql.adapter.a1.a;
        tj tjVar = uj.a;
        return new qhj(a1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "d4068d913370277de002b4a355a3f82cbb9cf0a002c8dc4623588fda970c2e35";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query MailingAdsAgreement($language: LanguageISO639Scalar!) { voluntaryMailingAdsAgreement(input: { language: $language } ) { agreement { agreementDefaultStatus logic text { text parts { __typename ... on DecoratedTextReferencePartHighlight { name text url } } } } } }";
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
        return (obj instanceof p1) && Intrinsics.d(this.a, ((p1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "MailingAdsAgreement";
    }

    public final String toString() {
        return f1d.j(new StringBuilder("MailingAdsAgreementQuery(language="), this.a, ')');
    }
}
