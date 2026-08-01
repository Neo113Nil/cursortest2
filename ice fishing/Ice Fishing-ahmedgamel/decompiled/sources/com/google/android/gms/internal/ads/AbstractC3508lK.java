package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3508lK {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C3616nK c() {
        if (this instanceof C3616nK) {
            return (C3616nK) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final C3724pK d() {
        if (this instanceof C3724pK) {
            return (C3724pK) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C4209yK c4209yK = new C4209yK(new androidx.fragment.app.Y(sb));
            c4209yK.f35139A = 1;
            NF.l(c4209yK, this);
            return sb.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }
}
