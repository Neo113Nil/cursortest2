package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes9.dex */
public final class tq11 implements Comparable {
    public final int a;

    public /* synthetic */ tq11(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return String.valueOf(i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jl40.q(this.a ^ Integer.MIN_VALUE, ((tq11) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tq11) {
            return this.a == ((tq11) obj).a;
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
