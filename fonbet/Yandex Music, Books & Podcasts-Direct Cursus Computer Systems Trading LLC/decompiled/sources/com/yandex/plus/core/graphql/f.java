package com.yandex.plus.core.graphql;

import defpackage.dfi;
import defpackage.fx6;
import defpackage.k5r;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements s6n {
    public final Object a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.d dVar = com.yandex.plus.core.graphql.adapter.d.a;
        tj tjVar = uj.a;
        return new qhj(dVar, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "c85ca64da6db6512aaee70c33897674eca050fb0535130e4d72588b5e7022f99";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query CollectContactsWebUrl($language: LanguageISO639Scalar!, $serviceName: String!, $theme: String!) { collectUserContacts(input: { language: $language widgetServiceName: $serviceName theme: $theme } ) { webViewUrl skipText alreadyCollected } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z("language");
        uj.g.a(r7fVar, fx6Var, this.a);
        r7fVar.Z("serviceName");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, this.b);
        r7fVar.Z("theme");
        tjVar.a(r7fVar, fx6Var, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && this.c.equals(fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "CollectContactsWebUrl";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectContactsWebUrlQuery(language=");
        sb.append(this.a);
        sb.append(", serviceName=");
        sb.append(this.b);
        sb.append(", theme=");
        return dfi.i(sb, this.c, ')');
    }
}
