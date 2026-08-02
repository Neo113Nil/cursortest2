package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qd6 implements rd6 {
    public final Integer a;
    public final Drawable b;
    public final String c;
    public final CharSequence d;
    public final CharSequence e;
    public final hk60 f;
    public final sls g;
    public final sls h;
    public final long i;
    public final sls j;
    public final Map k;
    public final Map l;

    public qd6(Integer num, BitmapDrawable bitmapDrawable, String str, CharSequence charSequence, CharSequence charSequence2, hk60 hk60Var, sls slsVar, bsf0 bsf0Var, long j, sls slsVar2, Map map, Map map2, int i) {
        long j2;
        num = (i & 1) != 0 ? null : num;
        bitmapDrawable = (i & 2) != 0 ? null : bitmapDrawable;
        str = (i & 4) != 0 ? null : str;
        charSequence2 = (i & 16) != 0 ? "" : charSequence2;
        sls slsVar3 = (i & 256) != 0 ? jk91.a : bsf0Var;
        if ((i & 512) != 0) {
            o430 o430Var = e3n.b;
            j2 = 0;
        } else {
            j2 = j;
        }
        Map f = (i & 2048) != 0 ? b.f() : map;
        Map map3 = (i & 4096) == 0 ? map2 : null;
        this.a = num;
        this.b = bitmapDrawable;
        this.c = str;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = hk60Var;
        this.g = slsVar;
        this.h = slsVar3;
        this.i = j2;
        this.j = slsVar2;
        this.k = f;
        this.l = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd6)) {
            return false;
        }
        qd6 qd6Var = (qd6) obj;
        return jl40.l(this.a, qd6Var.a) && jl40.l(this.b, qd6Var.b) && jl40.l(this.c, qd6Var.c) && jl40.l(this.d, qd6Var.d) && jl40.l(this.e, qd6Var.e) && jl40.l(this.f, qd6Var.f) && jl40.l(this.g, qd6Var.g) && jl40.l(this.h, qd6Var.h) && e3n.d(this.i, qd6Var.i) && jl40.l(this.j, qd6Var.j) && jl40.l(this.k, qd6Var.k) && jl40.l(this.l, qd6Var.l);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str = this.c;
        int a = nnm.a(nnm.a((this.f.hashCode() + unr0.e(smw0.b(smw0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, false)) * 31, 31, this.g), 31, this.h);
        o430 o430Var = e3n.b;
        int c = qv10.c(a, 31, this.i);
        sls slsVar = this.j;
        int d = unr0.d((c + (slsVar == null ? 0 : slsVar.hashCode())) * 31, 31, this.k);
        Map map = this.l;
        return d + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Ready(bgColor=" + this.a + ", leadIcon=" + this.b + ", leadIconUrl=" + this.c + ", title=" + ((Object) this.d) + ", subtitle=" + ((Object) this.e) + ", updateAnimation=false, trail=" + this.f + ", showCallback=" + this.g + ", delayedShowCallback=" + this.h + ", delayForCallback=" + e3n.p(this.i) + ", clickCallback=" + this.j + ", metaInfo=" + this.k + ", analyticsPayload=" + this.l + Extension.C_BRAKE;
    }
}
