package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cwk {
    public static final cwk a;
    public static final cwk b;
    public static final /* synthetic */ cwk[] c;

    static {
        cwk cwkVar = new cwk("Play", 0);
        a = cwkVar;
        cwk cwkVar2 = new cwk("Pause", 1);
        b = cwkVar2;
        c = new cwk[]{cwkVar, cwkVar2};
    }

    public static cwk valueOf(String str) {
        return (cwk) Enum.valueOf(cwk.class, str);
    }

    public static cwk[] values() {
        return (cwk[]) c.clone();
    }
}
