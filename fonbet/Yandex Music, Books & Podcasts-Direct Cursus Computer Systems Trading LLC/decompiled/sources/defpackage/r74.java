package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class r74 extends x74 {
    public final String c;
    public final String d;
    public final ek4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r74(String str, String str2, ek4 ek4Var) {
        super(u74.d, R.drawable.ic_chromecast_24);
        str.getClass();
        str2.getClass();
        this.c = str;
        this.d = str2;
        this.e = ek4Var;
    }

    @Override // defpackage.x74
    public final String a() {
        return this.c;
    }

    @Override // defpackage.x74
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r74)) {
            return false;
        }
        r74 r74Var = (r74) obj;
        return Intrinsics.d(this.c, r74Var.c) && Intrinsics.d(this.d, r74Var.d) && this.e == r74Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ChromeCast(id=", this.c, ", title=", this.d, ", deviceType=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
