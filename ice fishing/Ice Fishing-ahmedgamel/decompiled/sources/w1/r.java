package w1;

/* loaded from: classes.dex */
public final class r implements Appendable {

    /* renamed from: n, reason: collision with root package name */
    public final Appendable f41551n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41552u = true;

    public r(Appendable appendable) {
        this.f41551n = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        boolean z6 = this.f41552u;
        Appendable appendable = this.f41551n;
        if (z6) {
            this.f41552u = false;
            appendable.append("  ");
        }
        this.f41552u = c9 == '\n';
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
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z6 = this.f41552u;
        Appendable appendable = this.f41551n;
        boolean z9 = false;
        if (z6) {
            this.f41552u = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i4 - 1) == '\n') {
            z9 = true;
        }
        this.f41552u = z9;
        appendable.append(charSequence, i, i4);
        return this;
    }
}
