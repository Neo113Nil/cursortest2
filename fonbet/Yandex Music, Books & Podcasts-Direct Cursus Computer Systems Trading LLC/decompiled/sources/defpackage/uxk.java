package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uxk implements wxk {
    public final un6 a;
    public final String b;
    public final CharSequence c;
    public final jzb d;

    public uxk(un6 un6Var, String str, String str2, jzb jzbVar) {
        str.getClass();
        str2.getClass();
        this.a = un6Var;
        this.b = str;
        this.c = str2;
        this.d = jzbVar;
    }

    @Override // defpackage.wxk
    public final jzb a() {
        return this.d;
    }

    @Override // defpackage.wxk
    public final un6 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxk)) {
            return false;
        }
        uxk uxkVar = (uxk) obj;
        return this.a.equals(uxkVar.a) && Intrinsics.d(this.b, uxkVar.b) && Intrinsics.d(this.c, uxkVar.c) && this.d == uxkVar.d;
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
        int hashCode = (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        jzb jzbVar = this.d;
        return hashCode + (jzbVar == null ? 0 : jzbVar.hashCode());
    }

    public final String toString() {
        return "VideoClip(coverUiData=" + this.a + ", title=" + this.b + ", subtitle=" + ((Object) this.c) + ", explicitType=" + this.d + ")";
    }
}
