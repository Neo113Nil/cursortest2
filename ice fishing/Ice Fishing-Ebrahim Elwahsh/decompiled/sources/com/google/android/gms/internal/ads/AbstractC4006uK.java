package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.uK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4006uK {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C4114wK c() {
        if (this instanceof C4114wK) {
            return (C4114wK) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final C4222yK d() {
        if (this instanceof C4222yK) {
            return (C4222yK) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            HK hk = new HK(new androidx.fragment.app.Y(sb));
            hk.f25352A = 1;
            QF.k(hk, this);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
