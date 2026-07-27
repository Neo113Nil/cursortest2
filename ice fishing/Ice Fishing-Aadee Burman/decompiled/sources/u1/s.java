package u1;

/* loaded from: classes.dex */
public final class s implements Appendable {

    /* renamed from: n, reason: collision with root package name */
    public final Appendable f41165n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41166u = true;

    public s(Appendable appendable) {
        this.f41165n = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        boolean z3 = this.f41166u;
        Appendable appendable = this.f41165n;
        if (z3) {
            this.f41166u = false;
            appendable.append("  ");
        }
        this.f41166u = c9 == '\n';
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
        boolean z3 = this.f41166u;
        Appendable appendable = this.f41165n;
        boolean z6 = false;
        if (z3) {
            this.f41166u = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == '\n') {
            z6 = true;
        }
        this.f41166u = z6;
        appendable.append(charSequence, i, i6);
        return this;
    }
}
