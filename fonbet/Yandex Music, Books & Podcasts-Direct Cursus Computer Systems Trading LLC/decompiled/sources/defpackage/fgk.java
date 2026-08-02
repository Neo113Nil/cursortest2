package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fgk {
    public static final fgk a;
    public static final fgk b;
    public static final /* synthetic */ fgk[] c;

    static {
        fgk fgkVar = new fgk("SUCCESS", 0);
        a = fgkVar;
        fgk fgkVar2 = new fgk("WAIT_FOR_PROCESSING", 1);
        b = fgkVar2;
        c = new fgk[]{fgkVar, fgkVar2};
    }

    public static fgk valueOf(String str) {
        return (fgk) Enum.valueOf(fgk.class, str);
    }

    public static fgk[] values() {
        return (fgk[]) c.clone();
    }
}
