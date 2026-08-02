package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ies {
    public static final ies a;
    public static final ies b;
    public static final /* synthetic */ ies[] c;

    static {
        ies iesVar = new ies("Shown", 0);
        a = iesVar;
        ies iesVar2 = new ies("Hidden", 1);
        b = iesVar2;
        c = new ies[]{iesVar, iesVar2};
    }

    public static ies valueOf(String str) {
        return (ies) Enum.valueOf(ies.class, str);
    }

    public static ies[] values() {
        return (ies[]) c.clone();
    }
}
