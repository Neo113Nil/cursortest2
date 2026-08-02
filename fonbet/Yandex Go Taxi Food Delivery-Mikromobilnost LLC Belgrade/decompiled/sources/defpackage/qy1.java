package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qy1 {
    public static final qy1 f = new qy1(0);
    public final zzs a;
    public final CharSequence b;
    public final CharSequence c;
    public final Drawable d;
    public final boolean e;

    public qy1(zzs zzsVar, CharSequence charSequence, CharSequence charSequence2, BitmapDrawable bitmapDrawable, boolean z) {
        this.a = zzsVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = bitmapDrawable;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        return jl40.l(this.a, qy1Var.a) && jl40.l(this.b, qy1Var.b) && jl40.l(this.c, qy1Var.c) && jl40.l(this.d, qy1Var.d) && this.e == qy1Var.e;
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Drawable drawable = this.d;
        return Boolean.hashCode(this.e) + ((b + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltpinBBubble(point=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", selectedText=");
        sb.append((Object) this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", selected=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public qy1() {
        this(0);
    }

    public /* synthetic */ qy1(int i) {
        this(zzs.f, "", "", null, false);
    }
}
