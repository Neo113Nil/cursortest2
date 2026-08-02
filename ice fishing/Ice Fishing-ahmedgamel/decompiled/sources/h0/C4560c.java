package h0;

import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.h;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4560c implements V {

    /* renamed from: a, reason: collision with root package name */
    public final C4562e[] f37970a;

    public C4560c(C4562e... initializers) {
        h.e(initializers, "initializers");
        this.f37970a = initializers;
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4561d c4561d) {
        N n9 = null;
        for (C4562e c4562e : this.f37970a) {
            if (c4562e.f37971a.equals(cls)) {
                n9 = new N();
            }
        }
        if (n9 != null) {
            return n9;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
