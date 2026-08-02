package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pxk implements wxk {
    public final un6 a;
    public final String b;
    public final String c;
    public final u7g d;

    public pxk(un6 un6Var, String str, String str2, jbu jbuVar) {
        str.getClass();
        this.a = un6Var;
        this.b = str;
        this.c = str2;
        this.d = jbuVar;
    }

    @Override // defpackage.wxk
    public final un6 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxk)) {
            return false;
        }
        pxk pxkVar = (pxk) obj;
        return this.a.equals(pxkVar.a) && Intrinsics.d(this.b, pxkVar.b) && Intrinsics.d(this.c, pxkVar.c) && Intrinsics.d(this.d, pxkVar.d);
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
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        u7g u7gVar = this.d;
        return hashCode + (u7gVar != null ? u7gVar.hashCode() : 0);
    }

    public final String toString() {
        return "Generative(coverUiData=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", videoShot=" + this.d + ")";
    }
}
