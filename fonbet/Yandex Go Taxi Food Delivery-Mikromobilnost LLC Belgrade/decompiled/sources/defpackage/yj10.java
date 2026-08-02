package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class yj10 implements bk10 {
    public final int a;
    public final Drawable b;
    public final zj10 c;
    public final int d;

    public yj10(int i, Drawable drawable, zj10 zj10Var, int i2) {
        this.a = i;
        this.b = drawable;
        this.c = zj10Var;
        this.d = i2;
    }

    @Override // defpackage.bk10
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj10)) {
            return false;
        }
        yj10 yj10Var = (yj10) obj;
        return this.a == yj10Var.a && jl40.l(this.b, yj10Var.b) && jl40.l(this.c, yj10Var.c) && this.d == yj10Var.d;
    }

    @Override // defpackage.bk10
    public final Drawable f() {
        return this.b;
    }

    @Override // defpackage.bk10
    public final zj10 getBackground() {
        return this.c;
    }

    @Override // defpackage.bk10
    public final int getIcon() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Drawable drawable = this.b;
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Avatar(icon=" + this.a + ", image=" + this.b + ", background=" + this.c + ", foreground=" + this.d + Extension.C_BRAKE;
    }
}
