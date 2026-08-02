package defpackage;

import android.graphics.Typeface;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rbz {
    public final String a;
    public final float b;
    public final float c;
    public final Typeface d;
    public final int e;
    public final boolean f;

    public rbz(String str, float f, float f2, Typeface typeface, int i, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = typeface;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbz)) {
            return false;
        }
        rbz rbzVar = (rbz) obj;
        return this.a.equals(rbzVar.a) && Float.compare(this.b, rbzVar.b) == 0 && Float.compare(this.c, rbzVar.c) == 0 && jl40.l(this.d, rbzVar.d) && this.e == rbzVar.e && this.f == rbzVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + oyr.b(this.e, (this.d.hashCode() + g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "TitleParams(text=" + this.a + ", titleSize=" + this.b + ", titleLineHeight=" + this.c + ", titleFont=" + this.d + ", textColor=" + this.e + ", ignoreTopGuideline=" + this.f + Extension.C_BRAKE;
    }
}
