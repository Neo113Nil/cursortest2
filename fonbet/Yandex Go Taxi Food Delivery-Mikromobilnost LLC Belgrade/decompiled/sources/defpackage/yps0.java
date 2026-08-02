package defpackage;

import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yps0 {
    public final xps0 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final i3y f;
    public final i3y g;

    public yps0(xps0 xps0Var, float f, float f2, float f3, float f4) {
        this.a = xps0Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: wps0
            public final /* synthetic */ yps0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float f5;
                float f6;
                int i2 = i;
                yps0 yps0Var = this.b;
                switch (i2) {
                    case 0:
                        f5 = 0.15f;
                        f6 = yps0Var.c;
                        break;
                    default:
                        f5 = 0.75f;
                        f6 = yps0Var.c;
                        break;
                }
                return Float.valueOf(f6 * f5);
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: wps0
            public final /* synthetic */ yps0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float f5;
                float f6;
                int i22 = i2;
                yps0 yps0Var = this.b;
                switch (i22) {
                    case 0:
                        f5 = 0.15f;
                        f6 = yps0Var.c;
                        break;
                    default:
                        f5 = 0.75f;
                        f6 = yps0Var.c;
                        break;
                }
                return Float.valueOf(f6 * f5);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yps0)) {
            return false;
        }
        yps0 yps0Var = (yps0) obj;
        return this.a.equals(yps0Var.a) && Float.compare(this.b, yps0Var.b) == 0 && Float.compare(this.c, yps0Var.c) == 0 && Float.compare(this.d, yps0Var.d) == 0 && Float.compare(this.e, yps0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlimeConfig(content=");
        sb.append(this.a);
        sb.append(", maxWidth=");
        sb.append(this.b);
        sb.append(", maxHeight=");
        vfc.x(sb, this.c, ", initialWidth=", this.d, ", initialHeight=");
        return uw51.i(sb, this.e, Extension.C_BRAKE);
    }
}
