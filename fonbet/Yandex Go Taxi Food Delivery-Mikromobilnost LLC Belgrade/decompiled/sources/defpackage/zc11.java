package defpackage;

import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zc11 {
    public static final zc11 d = new zc11(0);
    public final CompanionHeader.Animation a;
    public final CompanionHeader.AnimationSettings b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zc11(int i) {
        this(r3, CompanionHeader.AnimationSettings.c, false);
        CompanionHeader.Animation animation = CompanionHeader.Animation.UNSUPPORTED;
        CompanionHeader.AnimationSettings.Companion.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc11)) {
            return false;
        }
        zc11 zc11Var = (zc11) obj;
        return this.a == zc11Var.a && jl40.l(this.b, zc11Var.b) && this.c == zc11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TravelCompanionStatusAnimation(type=");
        sb.append(this.a);
        sb.append(", settings=");
        sb.append(this.b);
        sb.append(", shouldPlay=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public zc11(CompanionHeader.Animation animation, CompanionHeader.AnimationSettings animationSettings, boolean z) {
        this.a = animation;
        this.b = animationSettings;
        this.c = z;
    }

    public zc11() {
        this(0);
    }
}
