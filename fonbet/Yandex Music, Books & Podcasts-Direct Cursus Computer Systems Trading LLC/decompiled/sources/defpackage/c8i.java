package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c8i implements f8i, a8i {
    public final String a;
    public final String b;
    public final String c;
    public final gde d;
    public final List e;

    public c8i(String str, String str2, String str3, gde gdeVar, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gdeVar;
        this.e = list;
    }

    @Override // defpackage.a8i
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8i)) {
            return false;
        }
        c8i c8iVar = (c8i) obj;
        return this.a.equals(c8iVar.a) && this.b.equals(c8iVar.b) && this.c.equals(c8iVar.c) && this.d == c8iVar.d && Intrinsics.d(this.e, c8iVar.e);
    }

    @Override // defpackage.a8i
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("OldEntityData(id=", this.a, ", title=", this.b, ", deeplink=");
        m.append(this.c);
        m.append(", imagesLayoutType=");
        m.append(this.d);
        m.append(", covers=");
        return vz1.u(m, this.e, ")");
    }
}
