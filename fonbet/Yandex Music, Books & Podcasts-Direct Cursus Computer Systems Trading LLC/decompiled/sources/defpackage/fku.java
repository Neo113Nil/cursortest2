package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fku {
    public static final fku a;
    public static final fku b;
    public static final /* synthetic */ fku[] c;

    static {
        fku fkuVar = new fku("Enabled", 0);
        a = fkuVar;
        fku fkuVar2 = new fku("Disabled", 1);
        b = fkuVar2;
        c = new fku[]{fkuVar, fkuVar2};
    }

    public static fku valueOf(String str) {
        return (fku) Enum.valueOf(fku.class, str);
    }

    public static fku[] values() {
        return (fku[]) c.clone();
    }
}
