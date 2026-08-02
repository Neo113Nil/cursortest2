package com.miteksystems.misnap.controller.a;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class s$b extends net.idrnd.misnap.iad.a {
    public final byte[] a;

    public s$b(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s$b) && this.a.equals(((s$b) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Success(payload=" + Arrays.toString(this.a) + ')';
    }
}
