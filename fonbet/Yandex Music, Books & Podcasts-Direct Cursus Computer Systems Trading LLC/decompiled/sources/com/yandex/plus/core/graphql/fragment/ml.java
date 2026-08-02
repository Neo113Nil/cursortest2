package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ml {
    public final String a;
    public final String b;
    public final kl c;
    public final String d;

    public ml(String str, String str2, kl klVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = klVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        return Intrinsics.d(this.a, mlVar.a) && Intrinsics.d(this.b, mlVar.b) && Intrinsics.d(this.c, mlVar.c) && Intrinsics.d(this.d, mlVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        kl klVar = this.c;
        int hashCode3 = (hashCode2 + (klVar == null ? 0 : klVar.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(textColor=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", subscriptionProductTarget=");
        return dfi.i(sb, this.d, ')');
    }
}
