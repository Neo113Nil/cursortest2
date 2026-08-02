package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m5t implements o5t {
    public final String a;
    public final zsq b;
    public final List c;
    public final boolean d;

    public m5t(String str, zsq zsqVar, List list, boolean z) {
        str.getClass();
        zsqVar.getClass();
        list.getClass();
        this.a = str;
        this.b = zsqVar;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5t)) {
            return false;
        }
        m5t m5tVar = (m5t) obj;
        return Intrinsics.d(this.a, m5tVar.a) && Intrinsics.d(this.b, m5tVar.b) && Intrinsics.d(this.c, m5tVar.c) && this.d == m5tVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Launch(slideId=" + this.a + ", analyticsInfo=" + this.b + ", previews=" + this.c + ", mute=" + this.d + ")";
    }
}
