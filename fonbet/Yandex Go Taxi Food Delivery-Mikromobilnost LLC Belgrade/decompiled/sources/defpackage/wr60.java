package defpackage;

/* loaded from: classes2.dex */
public final class wr60 {
    public final CharSequence a;

    public wr60(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr60) && jl40.l(this.a, ((wr60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OfferBenefitContent(text=" + ((Object) this.a) + ')';
    }
}
