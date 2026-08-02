package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kgs {
    public static final kgs a;
    public static final /* synthetic */ kgs[] b;

    static {
        kgs kgsVar = new kgs("Circle", 0);
        a = kgsVar;
        b = new kgs[]{kgsVar, new kgs("Line", 1)};
    }

    public static kgs valueOf(String str) {
        return (kgs) Enum.valueOf(kgs.class, str);
    }

    public static kgs[] values() {
        return (kgs[]) b.clone();
    }
}
