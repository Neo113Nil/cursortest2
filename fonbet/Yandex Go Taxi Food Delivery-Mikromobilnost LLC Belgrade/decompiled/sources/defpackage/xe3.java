package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class xe3 {
    public static final xe3 d;
    public final int a;
    public final int b;
    public final ImmutableSet c;

    static {
        xe3 xe3Var;
        if (tw21.a >= 33) {
            ImmutableSet.a aVar = new ImmutableSet.a();
            for (int i = 1; i <= 10; i++) {
                aVar.g(Integer.valueOf(tw21.s(i)));
            }
            xe3Var = new xe3(2, aVar.i());
        } else {
            xe3Var = new xe3(2, 10);
        }
        d = xe3Var;
    }

    public xe3(int i, Set set) {
        this.a = i;
        ImmutableSet m = ImmutableSet.m(set);
        this.c = m;
        h221 it = m.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3Var = (xe3) obj;
        return this.a == xe3Var.a && this.b == xe3Var.b && Objects.equals(this.c, xe3Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        ImmutableSet immutableSet = this.c;
        return i + (immutableSet == null ? 0 : immutableSet.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public xe3(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
