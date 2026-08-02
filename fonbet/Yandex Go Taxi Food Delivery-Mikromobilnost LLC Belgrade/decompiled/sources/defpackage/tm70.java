package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tm70 implements xm70 {
    public final int a;

    public /* synthetic */ tm70(int i) {
        this.a = i;
    }

    public static final /* synthetic */ tm70 a(int i) {
        return new tm70(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tm70) {
            return this.a == ((tm70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ColoredCar(value=", Extension.C_BRAKE);
    }
}
