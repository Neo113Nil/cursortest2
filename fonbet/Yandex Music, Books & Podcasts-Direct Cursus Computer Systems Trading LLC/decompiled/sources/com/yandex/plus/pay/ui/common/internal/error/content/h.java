package com.yandex.plus.pay.ui.common.internal.error.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k e;
    public final f f;
    public final f g;

    public h(String str, String str2, String str3, String str4, k kVar, f fVar, f fVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = kVar;
        this.f = fVar;
        this.g = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c) && Intrinsics.d(this.d, hVar.d) && Intrinsics.d(this.e, hVar.e) && Intrinsics.d(this.f, hVar.f) && Intrinsics.d(this.g, hVar.g);
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
        k kVar = this.e;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        f fVar = this.f;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.g;
        return hashCode6 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentErrorContent(title=" + this.a + ", subtitle=" + this.b + ", errorCode=" + this.c + ", errorCodeContentDescription=" + this.d + ", hint=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ')';
    }
}
