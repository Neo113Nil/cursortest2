package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.vb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {
    public final String a;
    public final String b;
    public final z c;
    public final vb d;

    public n(String str, String str2, z zVar, vb vbVar) {
        this.a = str;
        this.b = str2;
        this.c = zVar;
        this.d = vbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && Intrinsics.d(this.b, nVar.b) && Intrinsics.d(this.c, nVar.c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        z zVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnCardPaymentButton(__typename=" + this.a + ", bankName=" + this.b + ", widgetUrls=" + this.c + ", paymentMethod=" + this.d + ')';
    }
}
