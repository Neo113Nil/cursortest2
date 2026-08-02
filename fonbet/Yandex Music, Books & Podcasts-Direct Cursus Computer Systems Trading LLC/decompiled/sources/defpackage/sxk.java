package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sxk implements wxk {
    public final un6 a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final jzb e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final u7g i;
    public final boolean j;

    public sxk(un6 un6Var, String str, String str2, String str3, jzb jzbVar, boolean z, boolean z2, List list, ibu ibuVar, boolean z3) {
        str.getClass();
        list.getClass();
        this.a = un6Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = jzbVar;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = ibuVar;
        this.j = z3;
    }

    @Override // defpackage.wxk
    public final jzb a() {
        return this.e;
    }

    @Override // defpackage.wxk
    public final un6 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxk)) {
            return false;
        }
        sxk sxkVar = (sxk) obj;
        return this.a.equals(sxkVar.a) && Intrinsics.d(this.b, sxkVar.b) && Intrinsics.d(this.c, sxkVar.c) && Intrinsics.d(this.d, sxkVar.d) && this.e == sxkVar.e && this.f == sxkVar.f && this.g == sxkVar.g && Intrinsics.d(this.h, sxkVar.h) && Intrinsics.d(this.i, sxkVar.i) && this.j == sxkVar.j;
    }

    @Override // defpackage.wxk
    public final CharSequence getSubtitle() {
        return this.c;
    }

    @Override // defpackage.wxk
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jzb jzbVar = this.e;
        int d = k5r.d(k5r.e(k5r.e(k5r.e((hashCode2 + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.f), 31, true), 31, this.g), 31, this.h);
        u7g u7gVar = this.i;
        return Boolean.hashCode(this.j) + ((d + (u7gVar != null ? u7gVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Track(coverUiData=" + this.a + ", title=" + this.b + ", subtitle=" + ((Object) this.c) + ", subtitleYear=" + this.d + ", explicitType=" + this.e + ", showSharedButton=" + this.f + ", showOverflowButton=true, clickableTitles=" + this.g + ", artistsCovers=" + this.h + ", videoShot=" + this.i + ", hasLyrics=" + this.j + ")";
    }
}
