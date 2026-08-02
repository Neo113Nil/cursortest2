package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class act implements osa {
    public final int a;
    public final int b;
    public final kya c;

    public act(int i, kya kyaVar, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? nya.a : kyaVar);
    }

    @Override // defpackage.tm0
    public final rzt a(oct octVar) {
        return new rnj(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof act) {
            act actVar = (act) obj;
            if (actVar.a == this.a && actVar.b == this.b && Intrinsics.d(actVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.osa, defpackage.tm0
    public final tzt a(oct octVar) {
        return new rnj(this.a, this.b, this.c);
    }

    public act(int i, int i2, kya kyaVar) {
        this.a = i;
        this.b = i2;
        this.c = kyaVar;
    }
}
