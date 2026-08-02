package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i86 implements vzb {
    public final List a;

    public i86(List list) {
        this.a = list;
    }

    @Override // defpackage.vzb
    public final List a(xzb xzbVar) {
        return this.a;
    }

    @Override // defpackage.vzb
    public final ja8 b(xzb xzbVar, Function1 function1) {
        return ja8.b0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i86) {
            return Intrinsics.d(this.a, ((i86) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 16;
    }
}
