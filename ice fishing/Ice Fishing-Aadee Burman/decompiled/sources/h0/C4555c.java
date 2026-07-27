package h0;

import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.h;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4555c implements V {

    /* renamed from: a, reason: collision with root package name */
    public final C4557e[] f37944a;

    public C4555c(C4557e... initializers) {
        h.e(initializers, "initializers");
        this.f37944a = initializers;
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4556d c4556d) {
        N n9 = null;
        for (C4557e c4557e : this.f37944a) {
            if (c4557e.f37945a.equals(cls)) {
                n9 = new N();
            }
        }
        if (n9 != null) {
            return n9;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
