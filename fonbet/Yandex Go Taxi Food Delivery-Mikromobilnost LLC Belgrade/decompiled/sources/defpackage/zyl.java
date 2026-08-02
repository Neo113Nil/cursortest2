package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class zyl implements Comparable {
    public final int a;

    public /* synthetic */ zyl(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return oyr.j(i, "DocumentEpoch(epoch=", Extension.C_BRAKE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jl40.q(this.a, ((zyl) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zyl) {
            return this.a == ((zyl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
