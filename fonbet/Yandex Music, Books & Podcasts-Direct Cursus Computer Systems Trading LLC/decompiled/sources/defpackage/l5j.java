package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l5j {
    public final u9b a;
    public final List b;
    public final lt c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final u9b h;
    public final u9b i;
    public final String j;
    public final boolean k;
    public final String l;

    public l5j(u9b u9bVar, List list, lt ltVar, String str, Integer num, Integer num2, Integer num3, u9b u9bVar2, u9b u9bVar3, String str2, boolean z, String str3) {
        this.a = u9bVar;
        this.b = list;
        this.c = ltVar;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = u9bVar2;
        this.i = u9bVar3;
        this.j = str2;
        this.k = z;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5j)) {
            return false;
        }
        l5j l5jVar = (l5j) obj;
        return Intrinsics.d(this.a, l5jVar.a) && this.b.equals(l5jVar.b) && this.c.equals(l5jVar.c) && Intrinsics.d(this.d, l5jVar.d) && Intrinsics.d(this.e, l5jVar.e) && Intrinsics.d(this.f, l5jVar.f) && Intrinsics.d(this.g, l5jVar.g) && Intrinsics.d(this.h, l5jVar.h) && Intrinsics.d(this.i, l5jVar.i) && this.j.equals(l5jVar.j) && this.k == l5jVar.k && Intrinsics.d(this.l, l5jVar.l);
    }

    public final int hashCode() {
        u9b u9bVar = this.a;
        int hashCode = (this.c.hashCode() + k5r.d((u9bVar == null ? 0 : u9bVar.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        u9b u9bVar2 = this.h;
        int hashCode6 = (hashCode5 + (u9bVar2 == null ? 0 : u9bVar2.hashCode())) * 31;
        u9b u9bVar3 = this.i;
        int e = k5r.e(k5r.c((hashCode6 + (u9bVar3 == null ? 0 : u9bVar3.hashCode())) * 31, 31, this.j), 31, this.k);
        String str2 = this.l;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Item(cover=" + this.a + ", artists=" + this.b + ", album=" + this.c + ", releaseDate=" + this.d + ", artistColor=" + this.e + ", artistColorDark=" + this.f + ", albumColor=" + this.g + ", artistCover=" + this.h + ", artistCoverDark=" + this.i + ", contentDescription=" + this.j + ", hasTrailer=" + this.k + ", description=" + this.l + ")";
    }
}
