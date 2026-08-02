package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends j {
    public final Uri a;
    public final i b;
    public final d c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final String l;

    public f(Uri uri, i iVar, d dVar, Integer num, String str, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2) {
        this.a = uri;
        this.b = iVar;
        this.c = dVar;
        this.d = num;
        this.e = str;
        this.f = num2;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
        this.j = bool4;
        this.k = bool5;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b == fVar.b && this.c == fVar.c && Intrinsics.d(this.d, fVar.d) && Intrinsics.d(this.e, fVar.e) && Intrinsics.d(this.f, fVar.f) && Intrinsics.d(this.g, fVar.g) && Intrinsics.d(this.h, fVar.h) && Intrinsics.d(this.i, fVar.i) && Intrinsics.d(this.j, fVar.j) && Intrinsics.d(this.k, fVar.k) && Intrinsics.d(this.l, fVar.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.l;
        return hashCode11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Smart(url=");
        sb.append(this.a);
        sb.append(", webViewFormat=");
        sb.append(this.b);
        sb.append(", modalHeightType=");
        sb.append(this.c);
        sb.append(", modalHeightValue=");
        sb.append(this.d);
        sb.append(", screenId=");
        sb.append(this.e);
        sb.append(", shadowAlpha=");
        sb.append(this.f);
        sb.append(", disableClose=");
        sb.append(this.g);
        sb.append(", showToolbar=");
        sb.append(this.h);
        sb.append(", showDash=");
        sb.append(this.i);
        sb.append(", showCross=");
        sb.append(this.j);
        sb.append(", showArrow=");
        sb.append(this.k);
        sb.append(", message=");
        return dfi.i(sb, this.l, ')');
    }
}
