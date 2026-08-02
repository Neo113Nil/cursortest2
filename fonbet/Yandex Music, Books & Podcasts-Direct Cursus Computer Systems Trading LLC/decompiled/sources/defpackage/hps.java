package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hps {
    public final String a;
    public final List b;

    public hps(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hps)) {
            return false;
        }
        hps hpsVar = (hps) obj;
        return Intrinsics.d(this.a, hpsVar.a) && Intrinsics.d(this.b, hpsVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dfi.h("TopDisplayBlockData(background=", this.a, ", items=", ")", this.b);
    }
}
