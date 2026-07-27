package k2;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4631b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: n, reason: collision with root package name */
    public final int f38699n;

    EnumC4631b(int i) {
        this.f38699n = i;
    }

    public static EnumC4631b a(int i) {
        for (EnumC4631b enumC4631b : values()) {
            if (enumC4631b.f38699n == i) {
                return enumC4631b;
            }
        }
        return null;
    }
}
