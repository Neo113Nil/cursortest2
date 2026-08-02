package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uo4 {
    public final String a;
    public final Paint b;
    public final RectF c;
    public final float d;
    public final Paint e;
    public final kce0 f;

    public uo4(String str, Paint paint, RectF rectF, float f, Paint paint2, kce0 kce0Var) {
        this.a = str;
        this.b = paint;
        this.c = rectF;
        this.d = f;
        this.e = paint2;
        this.f = kce0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo4)) {
            return false;
        }
        uo4 uo4Var = (uo4) obj;
        return this.a.equals(uo4Var.a) && jl40.l(this.b, uo4Var.b) && this.c.equals(uo4Var.c) && Float.compare(this.d, uo4Var.d) == 0 && jl40.l(this.e, uo4Var.e) && this.f.equals(uo4Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + g8e.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "BalloonModel(text=" + this.a + ", balloonTextPaint=" + this.b + ", bounds=" + this.c + ", cornerRadius=" + this.d + ", paint=" + this.e + ", finalPosition=" + this.f + Extension.C_BRAKE;
    }
}
