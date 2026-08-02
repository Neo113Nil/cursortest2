package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final String a;
    public final String b;
    public final b c;
    public final String d;
    public final a e;
    public final String f;
    public final String g;
    public final com.yandex.plus.core.graphql.type.b h;

    public c(String str, String str2, b bVar, String str3, a aVar, String str4, String str5, com.yandex.plus.core.graphql.type.b bVar2) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = str3;
        this.e = aVar;
        this.f = str4;
        this.g = str5;
        this.h = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && Intrinsics.d(this.d, cVar.d) && Intrinsics.d(this.e, cVar.e) && Intrinsics.d(this.f, cVar.f) && Intrinsics.d(this.g, cVar.g) && this.h == cVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.e;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return this.h.hashCode() + ((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ActionFragment(text=" + this.a + ", textColor=" + this.b + ", textColors=" + this.c + ", backgroundColor=" + this.d + ", backgroundColors=" + this.e + ", url=" + this.f + ", deeplink=" + this.g + ", actionType=" + this.h + ')';
    }
}
