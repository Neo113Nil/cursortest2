package u1;

/* loaded from: classes.dex */
public final class r implements Appendable {

    /* renamed from: n, reason: collision with root package name */
    public final Appendable f41182n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41183u = true;

    public r(Appendable appendable) {
        this.f41182n = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) {
        boolean z8 = this.f41183u;
        Appendable appendable = this.f41182n;
        if (z8) {
            this.f41183u = false;
            appendable.append("  ");
        }
        this.f41183u = c4 == '\n';
        appendable.append(c4);
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
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z8 = this.f41183u;
        Appendable appendable = this.f41182n;
        boolean z9 = false;
        if (z8) {
            this.f41183u = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i4 - 1) == '\n') {
            z9 = true;
        }
        this.f41183u = z9;
        appendable.append(charSequence, i, i4);
        return this;
    }
}
