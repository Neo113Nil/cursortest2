package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f3952a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3953b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3954c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f3952a = identifierStatus;
        this.f3953b = aVar;
        this.f3954c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3952a == cVar.f3952a && kotlin.jvm.internal.i.a(this.f3953b, cVar.f3953b) && kotlin.jvm.internal.i.a(this.f3954c, cVar.f3954c);
    }

    public final int hashCode() {
        int hashCode = this.f3952a.hashCode() * 31;
        a aVar = this.f3953b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f3954c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f3952a + ", advIdInfo=" + this.f3953b + ", errorExplanation=" + this.f3954c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i2) {
        this(identifierStatus, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : str);
    }
}
