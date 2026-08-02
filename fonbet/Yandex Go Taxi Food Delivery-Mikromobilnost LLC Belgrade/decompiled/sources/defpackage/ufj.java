package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.TextAlign;

/* loaded from: classes6.dex */
public final class ufj implements xfj {
    public final Integer a;
    public final Drawable b;
    public final CharSequence c;
    public final wfj d;
    public final TextAlign e;
    public final boolean f;
    public final wp2 g;
    public final String h;

    public ufj(Integer num, Drawable drawable, CharSequence charSequence, wfj wfjVar, TextAlign textAlign, boolean z, wp2 wp2Var, String str) {
        this.a = num;
        this.b = drawable;
        this.c = charSequence;
        this.d = wfjVar;
        this.e = textAlign;
        this.f = z;
        this.g = wp2Var;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufj)) {
            return false;
        }
        ufj ufjVar = (ufj) obj;
        return jl40.l(this.a, ufjVar.a) && jl40.l(this.b, ufjVar.b) && jl40.l(this.c, ufjVar.c) && this.d.equals(ufjVar.d) && this.e == ufjVar.e && this.f == ufjVar.f && jl40.l(this.g, ufjVar.g) && jl40.l(this.h, ufjVar.h);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Drawable drawable = this.b;
        int b = n.b(this.g, unr0.e((this.e.hashCode() + ((this.d.hashCode() + smw0.b((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Ready(bgColor=" + this.a + ", leadIcon=" + this.b + ", title=" + ((Object) this.c) + ", trail=" + this.d + ", titleAlign=" + this.e + ", ignoreMaxCommunicationsCount=" + this.f + ", bgAppColor=" + this.g + ", leadIconUrl=" + this.h + Extension.C_BRAKE;
    }
}
