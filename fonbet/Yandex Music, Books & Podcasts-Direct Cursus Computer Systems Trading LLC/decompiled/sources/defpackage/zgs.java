package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zgs implements ahs {
    public final String a;
    public final int b;
    public final List c;
    public final List d;
    public final String e;

    public zgs(int i, String str, String str2, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgs)) {
            return false;
        }
        zgs zgsVar = (zgs) obj;
        return Intrinsics.d(this.a, zgsVar.a) && this.b == zgsVar.b && Intrinsics.d(this.c, zgsVar.c) && Intrinsics.d(this.d, zgsVar.d) && Intrinsics.d(this.e, zgsVar.e);
    }

    @Override // defpackage.ahs
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int d = k5r.d(k5r.d(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "WithMeta(title=", this.a, ", placeholderIconRes=", ", titles=");
        l.append(this.c);
        l.append(", covers=");
        l.append(this.d);
        l.append(", text=");
        return su4.o(l, this.e, ")");
    }
}
