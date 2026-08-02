package com.plaid.internal;

import com.google.gson.Gson;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class G5 {
    public final Gson a;
    public final SocketFactory b;

    public G5(Gson gson, int i) {
        this.a = (i & 1) != 0 ? null : gson;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return false;
        }
        G5 g5 = (G5) obj;
        return Intrinsics.areEqual(this.a, g5.a) && Intrinsics.areEqual(this.b, g5.b);
    }

    public final int hashCode() {
        Gson gson = this.a;
        int hashCode = (gson == null ? 0 : gson.hashCode()) * 31;
        SocketFactory socketFactory = this.b;
        return hashCode + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    public final String toString() {
        return "PlaidRetrofitOptions(gson=" + this.a + ", socketFactory=" + this.b + ")";
    }

    public G5() {
        this(null, 3);
    }
}
