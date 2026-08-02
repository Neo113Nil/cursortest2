package com.yandex.plus.core.graphql;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {
    public final String a;
    public final o b;
    public final p c;
    public final n d;
    public final r e;
    public final q f;

    public s(String str, o oVar, p pVar, n nVar, r rVar, q qVar) {
        str.getClass();
        this.a = str;
        this.b = oVar;
        this.c = pVar;
        this.d = nVar;
        this.e = rVar;
        this.f = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.a, sVar.a) && Intrinsics.d(this.b, sVar.b) && Intrinsics.d(this.c, sVar.c) && Intrinsics.d(this.d, sVar.d) && Intrinsics.d(this.e, sVar.e) && Intrinsics.d(this.f, sVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o oVar = this.b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        p pVar = this.c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        n nVar = this.d;
        int hashCode4 = (hashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        r rVar = this.e;
        int hashCode5 = (hashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        q qVar = this.f;
        return hashCode5 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentButton(__typename=" + this.a + ", onNewCardPaymentButton=" + this.b + ", onNewSbpPaymentButton=" + this.c + ", onCardPaymentButton=" + this.d + ", onSbpPaymentButton=" + this.e + ", onNewYBPaymentButton=" + this.f + ')';
    }
}
