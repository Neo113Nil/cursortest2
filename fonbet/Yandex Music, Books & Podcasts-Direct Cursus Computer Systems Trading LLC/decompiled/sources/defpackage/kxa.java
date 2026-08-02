package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kxa {
    public static final kxa a;
    public static final /* synthetic */ kxa[] b;

    static {
        kxa kxaVar = new kxa("SIMPLE", 0);
        a = kxaVar;
        b = new kxa[]{kxaVar};
    }

    public static kxa valueOf(String str) {
        return (kxa) Enum.valueOf(kxa.class, str);
    }

    public static kxa[] values() {
        return (kxa[]) b.clone();
    }
}
