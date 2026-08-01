package M;

/* loaded from: classes.dex */
public final class a {
    public static final byte[] e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f588a;

    /* renamed from: b, reason: collision with root package name */
    public final int f589b;

    /* renamed from: c, reason: collision with root package name */
    public int f590c;

    /* renamed from: d, reason: collision with root package name */
    public char f591d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f588a = charSequence;
        this.f589b = charSequence.length();
    }

    public final byte a() {
        int i = this.f590c - 1;
        CharSequence charSequence = this.f588a;
        char charAt = charSequence.charAt(i);
        this.f591d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f590c);
            this.f590c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f590c--;
        char c2 = this.f591d;
        return c2 < 1792 ? e[c2] : Character.getDirectionality(c2);
    }
}
