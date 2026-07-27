package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPGsonOkHttp {
    public static final byte[] CatchingFishDaggerWebsocket = new byte[1792];
    public int CatchingFishCoroutine;
    public final CharSequence CatchingFishParcelableFAB;
    public char CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    static {
        for (int i = 0; i < 1792; i++) {
            CatchingFishDaggerWebsocket[i] = Character.getDirectionality(i);
        }
    }

    public CatchingFishMVPGsonOkHttp(CharSequence charSequence) {
        this.CatchingFishParcelableFAB = charSequence;
        this.CatchingFishSnackbar = charSequence.length();
    }

    public final byte CatchingFishParcelableFAB() {
        int i = this.CatchingFishCoroutine - 1;
        CharSequence charSequence = this.CatchingFishParcelableFAB;
        char charAt = charSequence.charAt(i);
        this.CatchingFishReduxKtor = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.CatchingFishCoroutine);
            this.CatchingFishCoroutine -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.CatchingFishCoroutine--;
        char c = this.CatchingFishReduxKtor;
        return c < 1792 ? CatchingFishDaggerWebsocket[c] : Character.getDirectionality(c);
    }
}
