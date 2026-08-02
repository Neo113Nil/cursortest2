package defpackage;

import android.text.TextUtils;
import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class qyg {
    public final String a;
    public final a b;
    public final a c;
    public final int d;
    public final int e;

    public qyg(String str, a aVar, a aVar2, int i, int i2) {
        d6z.l(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            w511.q();
            throw null;
        }
        this.a = str;
        aVar.getClass();
        this.b = aVar;
        aVar2.getClass();
        this.c = aVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qyg.class == obj.getClass()) {
            qyg qygVar = (qyg) obj;
            if (this.d == qygVar.d && this.e == qygVar.e && this.a.equals(qygVar.a) && this.b.equals(qygVar.b) && this.c.equals(qygVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + unr0.b((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
