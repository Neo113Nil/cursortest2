package defpackage;

import java.nio.charset.CharacterCodingException;

/* loaded from: classes5.dex */
public class uxe extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;
    public final int a;

    public uxe(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.a = 1007;
    }

    public uxe(int i, String str) {
        super(str);
        this.a = i;
    }

    public uxe(int i) {
        this.a = i;
    }
}
