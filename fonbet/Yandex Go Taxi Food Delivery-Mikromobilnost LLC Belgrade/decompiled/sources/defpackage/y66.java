package defpackage;

import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.blur.core.BlurEffect$Progressive$Easing;
import com.yandex.go.blur.core.BlurEffect$Progressive$TileMode;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class y66 implements a76 {
    public final int a;
    public final BlurEffect$CoordinatesType b;
    public final Pair c;
    public final float d;
    public final Pair e;
    public final float f;
    public final BlurEffect$Progressive$Easing g;
    public final BlurEffect$Progressive$TileMode h;

    public y66(int i, BlurEffect$CoordinatesType blurEffect$CoordinatesType, Pair pair, float f, Pair pair2, float f2, BlurEffect$Progressive$Easing blurEffect$Progressive$Easing, BlurEffect$Progressive$TileMode blurEffect$Progressive$TileMode) {
        this.a = i;
        this.b = blurEffect$CoordinatesType;
        this.c = pair;
        this.d = f;
        this.e = pair2;
        this.f = f2;
        this.g = blurEffect$Progressive$Easing;
        this.h = blurEffect$Progressive$TileMode;
    }

    public static y66 b(y66 y66Var, float f) {
        return new y66(24, y66Var.b, y66Var.c, y66Var.d, y66Var.e, f, y66Var.g, y66Var.h);
    }

    @Override // defpackage.a76
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y66)) {
            return false;
        }
        y66 y66Var = (y66) obj;
        return this.a == y66Var.a && this.b == y66Var.b && this.c.equals(y66Var.c) && Float.compare(this.d, y66Var.d) == 0 && this.e.equals(y66Var.e) && Float.compare(this.f, y66Var.f) == 0 && this.g == y66Var.g && this.h == y66Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + g8e.c(this.f, (this.e.hashCode() + g8e.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Linear(radius=" + this.a + ", coordinatesType=" + this.b + ", start=" + this.c + ", startIntensity=" + this.d + ", end=" + this.e + ", endIntensity=" + this.f + ", easing=" + this.g + ", tileMode=" + this.h + Extension.C_BRAKE;
    }
}
