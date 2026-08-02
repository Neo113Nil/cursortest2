package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class tg7 {
    public final String a;
    public final dsc b;
    public final dsc c;
    public final int d;
    public final int e;

    public tg7(String str, dsc dscVar, dsc dscVar2, int i, int i2) {
        vq1.v(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            e7o.e();
            throw null;
        }
        this.a = str;
        dscVar.getClass();
        this.b = dscVar;
        dscVar2.getClass();
        this.c = dscVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tg7.class == obj.getClass()) {
            tg7 tg7Var = (tg7) obj;
            if (this.d == tg7Var.d && this.e == tg7Var.e && this.a.equals(tg7Var.a) && this.b.equals(tg7Var.b) && this.c.equals(tg7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + k5r.c((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
