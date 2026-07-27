package M;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1760e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1762b;

    /* renamed from: c, reason: collision with root package name */
    public int f1763c;

    /* renamed from: d, reason: collision with root package name */
    public char f1764d;

    static {
        for (int i = 0; i < 1792; i++) {
            f1760e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f1761a = charSequence;
        this.f1762b = charSequence.length();
    }

    public final byte a() {
        int i = this.f1763c - 1;
        CharSequence charSequence = this.f1761a;
        char charAt = charSequence.charAt(i);
        this.f1764d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1763c);
            this.f1763c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1763c--;
        char c9 = this.f1764d;
        return c9 < 1792 ? f1760e[c9] : Character.getDirectionality(c9);
    }
}
