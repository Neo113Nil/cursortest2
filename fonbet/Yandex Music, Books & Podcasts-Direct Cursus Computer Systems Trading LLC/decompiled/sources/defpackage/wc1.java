package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wc1 {
    public static final wc1 a;
    public static final /* synthetic */ wc1[] b;

    static {
        wc1 wc1Var = new wc1("GenericLink", 0);
        a = wc1Var;
        b = new wc1[]{wc1Var, new wc1("ArtistDonation", 1)};
    }

    public static wc1 valueOf(String str) {
        return (wc1) Enum.valueOf(wc1.class, str);
    }

    public static wc1[] values() {
        return (wc1[]) b.clone();
    }
}
