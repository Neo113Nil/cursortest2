package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends j {
    public final Uri a;
    public final boolean b;
    public final i c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final boolean h;

    public e(Uri uri, boolean z, i iVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2) {
        uri.getClass();
        this.a = uri;
        this.b = z;
        this.c = iVar;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = bool4;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && Intrinsics.d(this.d, eVar.d) && Intrinsics.d(this.e, eVar.e) && Intrinsics.d(this.f, eVar.f) && Intrinsics.d(this.g, eVar.g) && this.h == eVar.h;
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        i iVar = this.c;
        int hashCode = (e + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Simple(url=");
        sb.append(this.a);
        sb.append(", shouldOpenInBrowser=");
        sb.append(this.b);
        sb.append(", webViewFormat=");
        sb.append(this.c);
        sb.append(", showToolbar=");
        sb.append(this.d);
        sb.append(", showDash=");
        sb.append(this.e);
        sb.append(", showCross=");
        sb.append(this.f);
        sb.append(", showArrow=");
        sb.append(this.g);
        sb.append(", needAuth=");
        return dfi.j(sb, this.h, ')');
    }
}
