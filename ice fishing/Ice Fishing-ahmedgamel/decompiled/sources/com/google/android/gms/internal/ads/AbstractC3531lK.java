package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3531lK {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C3639nK c() {
        if (this instanceof C3639nK) {
            return (C3639nK) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final C3747pK d() {
        if (this instanceof C3747pK) {
            return (C3747pK) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C4232yK c4232yK = new C4232yK(new androidx.fragment.app.Y(sb));
            c4232yK.f35925A = 1;
            NF.l(c4232yK, this);
            return sb.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }
}
