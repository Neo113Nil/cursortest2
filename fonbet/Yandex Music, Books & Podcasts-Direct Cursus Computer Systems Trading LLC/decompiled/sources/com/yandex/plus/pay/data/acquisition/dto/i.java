package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final arf[] j;
    public final String a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Map f;
    public final String g;
    public final Boolean h;
    public final String i;

    static {
        bwf bwfVar = bwf.b;
        j = new arf[]{null, btf.a(bwfVar, new com.yandex.plus.home.repository.api.model.webconfig.q(29)), btf.a(bwfVar, new f(0)), btf.a(bwfVar, new f(1)), btf.a(bwfVar, new f(2)), btf.a(bwfVar, new f(3)), null, null, null};
    }

    public /* synthetic */ i(int i, String str, Set set, Set set2, Set set3, Set set4, Map map, String str2, Boolean bool, String str3) {
        if (511 != (i & 511)) {
            u7g.V(i, 511, g.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.f = map;
        this.g = str2;
        this.h = bool;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b) && Intrinsics.d(this.c, iVar.c) && Intrinsics.d(this.d, iVar.d) && Intrinsics.d(this.e, iVar.e) && Intrinsics.d(this.f, iVar.f) && Intrinsics.d(this.g, iVar.g) && Intrinsics.d(this.h, iVar.h) && Intrinsics.d(this.i, iVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.c;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.d;
        int hashCode4 = (hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.e;
        int hashCode5 = (hashCode4 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Map map = this.f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.i;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Context(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", targetsAndFeatures=");
        sb.append(this.c);
        sb.append(", testIds=");
        sb.append(this.d);
        sb.append(", flags=");
        sb.append(this.e);
        sb.append(", restrictions=");
        sb.append(this.f);
        sb.append(", countryCode=");
        sb.append(this.g);
        sb.append(", isNativePaymentEnabled=");
        sb.append(this.h);
        sb.append(", storeId=");
        return dfi.i(sb, this.i, ')');
    }

    public i(String str, Set set, Set set2, Set set3, Set set4, Map map, String str2, Boolean bool, String str3) {
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.f = map;
        this.g = str2;
        this.h = bool;
        this.i = str3;
    }
}
