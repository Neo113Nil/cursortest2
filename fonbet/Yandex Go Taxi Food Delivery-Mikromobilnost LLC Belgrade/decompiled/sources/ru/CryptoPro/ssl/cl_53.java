package ru.CryptoPro.ssl;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class cl_53 {
    public byte[] a;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof cl_53) {
            return Arrays.equals(((cl_53) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
