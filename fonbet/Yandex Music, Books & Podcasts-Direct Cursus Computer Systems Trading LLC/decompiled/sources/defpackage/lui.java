package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lui implements zqi {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public lui(String str, String str2, String str3, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lui)) {
            return false;
        }
        lui luiVar = (lui) obj;
        return this.a.equals(luiVar.a) && this.b.equals(luiVar.b) && Intrinsics.d(this.c, luiVar.c) && Intrinsics.d(this.d, luiVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("MyShelfPromotionBlock(id=", this.a, ", title=", this.b, ", description=");
        m.append(this.c);
        m.append(", entities=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
