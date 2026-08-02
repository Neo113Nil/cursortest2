package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ynv {
    public static final xnv Companion = new xnv();
    public final String a;

    public /* synthetic */ ynv(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, wnv.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynv) && jl40.l(this.a, ((ynv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("DefaultCard(paymentMethodId="), this.a, ')');
    }

    public ynv(String str) {
        this.a = str;
    }
}
