package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final Integer g;

    public /* synthetic */ q(int i, String str, String str2, String str3, int i2, String str4, String str5, Integer num) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c) && this.d == qVar.d && Intrinsics.d(this.e, qVar.e) && Intrinsics.d(this.f, qVar.f) && Intrinsics.d(this.g, qVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c(f1d.a(this.d, k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        String str3 = this.f;
        int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MainPart(lightImageUrl=" + this.a + ", darkImageUrl=" + this.b + ", title=" + this.c + ", progressPercent=" + this.d + ", progressFallbackText=" + this.e + ", progressHint=" + this.f + ", daysLeftUntilDeadline=" + this.g + ')';
    }

    public q(String str, String str2, String str3, int i, String str4, String str5, Integer num) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = num;
    }
}
