package M;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1791e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1793b;

    /* renamed from: c, reason: collision with root package name */
    public int f1794c;

    /* renamed from: d, reason: collision with root package name */
    public char f1795d;

    static {
        for (int i = 0; i < 1792; i++) {
            f1791e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f1792a = charSequence;
        this.f1793b = charSequence.length();
    }

    public final byte a() {
        int i = this.f1794c - 1;
        CharSequence charSequence = this.f1792a;
        char charAt = charSequence.charAt(i);
        this.f1795d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1794c);
            this.f1794c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1794c--;
        char c9 = this.f1795d;
        return c9 < 1792 ? f1791e[c9] : Character.getDirectionality(c9);
    }
}
