package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k2v {
    public final a3v a;
    public final h1v b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final List f;
    public final i2v g;
    public final bzs h;
    public final jzb i;
    public final avo j;
    public final j2v k;

    public k2v(a3v a3vVar, h1v h1vVar, Integer num, Integer num2, Integer num3, List list, i2v i2vVar, bzs bzsVar, jzb jzbVar, avo avoVar, j2v j2vVar) {
        avoVar.getClass();
        j2vVar.getClass();
        this.a = a3vVar;
        this.b = h1vVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = list;
        this.g = i2vVar;
        this.h = bzsVar;
        this.i = jzbVar;
        this.j = avoVar;
        this.k = j2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2v)) {
            return false;
        }
        k2v k2vVar = (k2v) obj;
        return this.a.equals(k2vVar.a) && Intrinsics.d(this.b, k2vVar.b) && Intrinsics.d(this.c, k2vVar.c) && Intrinsics.d(this.d, k2vVar.d) && Intrinsics.d(this.e, k2vVar.e) && Intrinsics.d(this.f, k2vVar.f) && this.g.equals(k2vVar.g) && Intrinsics.d(this.h, k2vVar.h) && this.i == k2vVar.i && Intrinsics.d(this.j, k2vVar.j) && this.k == k2vVar.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h1v h1vVar = this.b;
        int hashCode2 = (hashCode + (h1vVar == null ? 0 : h1vVar.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.f;
        int hashCode6 = (this.g.hashCode() + ((hashCode5 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        bzs bzsVar = this.h;
        int hashCode7 = (hashCode6 + (bzsVar == null ? 0 : bzsVar.hashCode())) * 31;
        jzb jzbVar = this.i;
        return this.k.hashCode() + ((this.j.hashCode() + ((hashCode7 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "WaveScreenPlayableUiData(primaryEntityUiModel=" + this.a + ", cover=" + this.b + ", primaryColor=" + this.c + ", secondaryColor=" + this.d + ", wordsButtonColor=" + this.e + ", wordsGradient=" + this.f + ", playableTitle=" + this.g + ", trackParameters=" + this.h + ", explicitType=" + this.i + ", domainObject=" + this.j + ", playableType=" + this.k + ")";
    }
}
