package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hb {
    public final String a;
    public final String b;
    public final gb c;
    public final String d;
    public final String e;
    public final fb f;
    public final eb g;

    public hb(String str, String str2, gb gbVar, String str3, String str4, fb fbVar, eb ebVar) {
        this.a = str;
        this.b = str2;
        this.c = gbVar;
        this.d = str3;
        this.e = str4;
        this.f = fbVar;
        this.g = ebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.d(this.a, hbVar.a) && Intrinsics.d(this.b, hbVar.b) && Intrinsics.d(this.c, hbVar.c) && Intrinsics.d(this.d, hbVar.d) && Intrinsics.d(this.e, hbVar.e) && Intrinsics.d(this.f, hbVar.f) && Intrinsics.d(this.g, hbVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gb gbVar = this.c;
        int hashCode3 = (hashCode2 + (gbVar == null ? 0 : gbVar.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        fb fbVar = this.f;
        int hashCode6 = (hashCode5 + (fbVar == null ? 0 : fbVar.hashCode())) * 31;
        eb ebVar = this.g;
        return hashCode6 + (ebVar != null ? ebVar.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayFragment(text=" + this.a + ", textColor=" + this.b + ", textColors=" + this.c + ", shape=" + this.d + ", imageUrl=" + this.e + ", background=" + this.f + ", attributedText=" + this.g + ')';
    }
}
