package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wd5 implements xd5 {
    public final String a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final sdl e;

    public wd5(String str, String str2, Integer num, boolean z, sdl sdlVar) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = z;
        this.e = sdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd5)) {
            return false;
        }
        wd5 wd5Var = (wd5) obj;
        return this.a.equals(wd5Var.a) && Intrinsics.d(this.b, wd5Var.b) && Intrinsics.d(this.c, wd5Var.c) && this.d == wd5Var.d && this.e.equals(wd5Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return this.e.hashCode() + k5r.e((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(title=", this.a, ", imageUrl=", this.b, ", colorInt=");
        m.append(this.c);
        m.append(", isTintable=");
        m.append(this.d);
        m.append(", informer=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
