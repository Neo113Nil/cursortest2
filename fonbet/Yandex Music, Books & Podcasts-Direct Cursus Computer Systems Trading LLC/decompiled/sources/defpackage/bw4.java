package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bw4 implements cw4 {
    public final List a;

    public bw4(n8g n8gVar) {
        n8gVar.getClass();
        this.a = n8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw4) && Intrinsics.d(this.a, ((bw4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Success(elements=", ")", this.a);
    }
}
