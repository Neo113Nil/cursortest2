package u1;

/* loaded from: classes.dex */
public final class s implements Appendable {

    /* renamed from: n, reason: collision with root package name */
    public final Appendable f41168n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41169u = true;

    public s(Appendable appendable) {
        this.f41168n = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        boolean z3 = this.f41169u;
        Appendable appendable = this.f41168n;
        if (z3) {
            this.f41169u = false;
            appendable.append("  ");
        }
        this.f41169u = c9 == '\n';
        appendable.append(c9);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i6) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z3 = this.f41169u;
        Appendable appendable = this.f41168n;
        boolean z6 = false;
        if (z3) {
            this.f41169u = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == '\n') {
            z6 = true;
        }
        this.f41169u = z6;
        appendable.append(charSequence, i, i6);
        return this;
    }
}
