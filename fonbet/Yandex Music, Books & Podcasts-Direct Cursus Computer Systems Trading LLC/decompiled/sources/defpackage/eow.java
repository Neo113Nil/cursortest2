package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class eow {
    public static final eow a;
    public static final /* synthetic */ eow[] b;

    static {
        eow eowVar = new eow("PLAYBACK_SPEED", 0);
        a = eowVar;
        b = new eow[]{eowVar};
    }

    public static eow valueOf(String str) {
        return (eow) Enum.valueOf(eow.class, str);
    }

    public static eow[] values() {
        return (eow[]) b.clone();
    }
}
