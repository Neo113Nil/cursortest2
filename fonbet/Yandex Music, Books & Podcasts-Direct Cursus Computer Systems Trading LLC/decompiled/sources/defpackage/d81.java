package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d81 extends e81 {
    public final List b;
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(List list, boolean z) {
        super(b81.Wave);
        list.getClass();
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d81)) {
            return false;
        }
        d81 d81Var = (d81) obj;
        return Intrinsics.d(this.b, d81Var.b) && this.c == d81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "WaveFamiliarTabState(tracks=" + this.b + ", isLoading=" + this.c + ")";
    }
}
