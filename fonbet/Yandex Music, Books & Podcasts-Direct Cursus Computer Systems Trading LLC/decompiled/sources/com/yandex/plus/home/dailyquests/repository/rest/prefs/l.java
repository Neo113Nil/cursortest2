package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l implements y {

    @NotNull
    public static final c Companion = new c();
    public static final arf[] k = {null, null, null, null, null, btf.a(bwf.b, new com.yandex.plus.core.graphql.daily.progress.s(22)), null, null, null, null};
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final k f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ l(int i, long j, String str, String str2, String str3, String str4, k kVar, String str5, String str6, String str7, String str8) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, b.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = kVar;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    @Override // com.yandex.plus.home.dailyquests.repository.rest.prefs.y
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && Intrinsics.d(this.d, lVar.d) && Intrinsics.d(this.e, lVar.e) && Intrinsics.d(this.f, lVar.f) && Intrinsics.d(this.g, lVar.g) && Intrinsics.d(this.h, lVar.h) && Intrinsics.d(this.i, lVar.i) && Intrinsics.d(this.j, lVar.j);
    }

    public final int hashCode() {
        int c = k5r.c(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (this.f.hashCode() + k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e)) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoneDailyQuestDao(createdAt=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", popupId=");
        sb.append(this.c);
        sb.append(", deeplink=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", lightImageUrl=");
        sb.append(this.g);
        sb.append(", darkImageUrl=");
        sb.append(this.h);
        sb.append(", lightCompletedImageUrl=");
        sb.append(this.i);
        sb.append(", darkCompletedImageUrl=");
        return dfi.i(sb, this.j, ')');
    }

    public l(long j, String str, String str2, String str3, String str4, k kVar, String str5, String str6, String str7, String str8) {
        str.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = kVar;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }
}
