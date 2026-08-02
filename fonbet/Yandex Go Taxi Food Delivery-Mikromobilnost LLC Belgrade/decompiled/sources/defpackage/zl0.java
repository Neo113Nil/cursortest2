package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleType;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zl0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final String h;
    public final Map i;
    public final boolean j;
    public final boolean k;
    public final ArrayList l;
    public final UpsaleStep m;
    public final UpsaleType n;
    public final ht60 o;

    public zl0(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, Map map, boolean z, boolean z2, ArrayList arrayList2, UpsaleStep upsaleStep, UpsaleType upsaleType, ht60 ht60Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = arrayList;
        this.h = str7;
        this.i = map;
        this.j = z;
        this.k = z2;
        this.l = arrayList2;
        this.m = upsaleStep;
        this.n = upsaleType;
        this.o = ht60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl0)) {
            return false;
        }
        zl0 zl0Var = (zl0) obj;
        return this.a.equals(zl0Var.a) && this.b.equals(zl0Var.b) && this.c.equals(zl0Var.c) && this.d.equals(zl0Var.d) && this.e.equals(zl0Var.e) && this.f.equals(zl0Var.f) && this.g.equals(zl0Var.g) && jl40.l(this.h, zl0Var.h) && this.i.equals(zl0Var.i) && this.j == zl0Var.j && this.k == zl0Var.k && this.l.equals(zl0Var.l) && this.m == zl0Var.m && this.n == zl0Var.n && jl40.l(this.o, zl0Var.o);
    }

    public final int hashCode() {
        int b = ly3.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (this.n.hashCode() + ((this.m.hashCode() + ly3.b(unr0.e(unr0.e(unr0.d((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31;
        ht60 ht60Var = this.o;
        return hashCode + (ht60Var != null ? ht60Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalOffer(offerName=" + this.a + ", offersBatchId=" + this.b + ", positionId=" + this.c + ", title=" + this.d + ", text=" + this.e + ", additionalText=" + this.f + ", benefits=" + this.g + ", disclaimer=" + this.h + ", iconImages=" + this.i + ", isAvailable=" + this.j + ", isSelected=" + this.k + ", offersToReplace=" + this.l + ", upsaleStep=" + this.m + ", upsaleType=" + this.n + ", offerSwitchToggle=" + this.o + ')';
    }
}
