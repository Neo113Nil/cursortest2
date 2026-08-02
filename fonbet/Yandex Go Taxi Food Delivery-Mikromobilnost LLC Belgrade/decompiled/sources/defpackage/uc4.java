package defpackage;

@gsq0(with = tc4.class)
/* loaded from: classes9.dex */
public final class uc4 {
    public static final sc4 Companion = new sc4();
    public final zzs a;
    public final zzs b;

    public uc4(zzs zzsVar, zzs zzsVar2) {
        this.a = zzsVar;
        this.b = zzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc4)) {
            return false;
        }
        uc4 uc4Var = (uc4) obj;
        return this.a.equals(uc4Var.a) && this.b.equals(uc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
