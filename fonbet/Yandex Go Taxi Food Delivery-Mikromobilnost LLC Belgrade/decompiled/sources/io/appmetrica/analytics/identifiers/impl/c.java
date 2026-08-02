package io.appmetrica.analytics.identifiers.impl;

import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes9.dex */
public final class c {
    public final IdentifierStatus a;
    public final a b;
    public final String c;

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdResult(status=");
        sb.append(this.a);
        sb.append(", advIdInfo=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return b64.p(sb, this.c, ')');
    }

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.a = identifierStatus;
        this.b = aVar;
        this.c = str;
    }
}
