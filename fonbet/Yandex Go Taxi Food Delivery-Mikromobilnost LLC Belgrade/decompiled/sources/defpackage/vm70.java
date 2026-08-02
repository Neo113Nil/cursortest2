package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vm70 implements xm70 {
    public final int a;

    public /* synthetic */ vm70(int i) {
        this.a = i;
    }

    public static final /* synthetic */ vm70 a(int i) {
        return new vm70(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vm70) {
            return this.a == ((vm70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Res(value=", Extension.C_BRAKE);
    }
}
