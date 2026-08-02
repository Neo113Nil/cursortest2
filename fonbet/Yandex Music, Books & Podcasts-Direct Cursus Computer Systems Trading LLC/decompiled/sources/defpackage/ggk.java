package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ggk {
    public static final ggk a;
    public static final ggk b;
    public static final /* synthetic */ ggk[] c;

    static {
        ggk ggkVar = new ggk("SUCCESS", 0);
        a = ggkVar;
        ggk ggkVar2 = new ggk("WAIT_FOR_PROCESSING", 1);
        b = ggkVar2;
        c = new ggk[]{ggkVar, ggkVar2};
    }

    public static ggk valueOf(String str) {
        return (ggk) Enum.valueOf(ggk.class, str);
    }

    public static ggk[] values() {
        return (ggk[]) c.clone();
    }
}
