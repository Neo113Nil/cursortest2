package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v8 {
    public final String a;
    public final com.yandex.plus.core.graphql.type.w b;
    public final String c;
    public final String d;
    public final r8 e;
    public final s8 f;
    public final t8 g;
    public final q8 h;
    public final u8 i;

    public v8(String str, com.yandex.plus.core.graphql.type.w wVar, String str2, String str3, r8 r8Var, s8 s8Var, t8 t8Var, q8 q8Var, u8 u8Var) {
        this.a = str;
        this.b = wVar;
        this.c = str2;
        this.d = str3;
        this.e = r8Var;
        this.f = s8Var;
        this.g = t8Var;
        this.h = q8Var;
        this.i = u8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return this.a.equals(v8Var.a) && this.b == v8Var.b && Intrinsics.d(this.c, v8Var.c) && Intrinsics.d(this.d, v8Var.d) && this.e.equals(v8Var.e) && Intrinsics.d(this.f, v8Var.f) && this.g.equals(v8Var.g) && this.h.equals(v8Var.h) && Intrinsics.d(this.i, v8Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.core.graphql.type.w wVar = this.b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        s8 s8Var = this.f;
        int hashCode5 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode4 + (s8Var == null ? 0 : s8Var.hashCode())) * 31)) * 31)) * 31;
        u8 u8Var = this.i;
        return hashCode5 + (u8Var != null ? u8Var.hashCode() : 0);
    }

    public final String toString() {
        return "Invoice(id=" + this.a + ", invoiceStatus=" + this.b + ", form=" + this.c + ", paymentMethodId=" + this.d + ", paidAmount=" + this.e + ", payment=" + this.f + ", totalAmount=" + this.g + ", invoicePollingParams=" + this.h + ", widgetQrCodeParams=" + this.i + ')';
    }
}
