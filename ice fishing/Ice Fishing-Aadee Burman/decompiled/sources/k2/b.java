package k2;

/* loaded from: classes.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: n, reason: collision with root package name */
    public final int f38579n;

    b(int i) {
        this.f38579n = i;
    }

    public static b a(int i) {
        for (b bVar : values()) {
            if (bVar.f38579n == i) {
                return bVar;
            }
        }
        return null;
    }
}
