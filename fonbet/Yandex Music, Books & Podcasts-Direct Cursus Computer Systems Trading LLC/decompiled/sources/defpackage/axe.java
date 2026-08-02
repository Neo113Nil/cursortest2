package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class axe {
    public static final axe a;
    public static final axe b;
    public static final /* synthetic */ axe[] c;

    static {
        axe axeVar = new axe("Connecting", 0);
        a = axeVar;
        axe axeVar2 = new axe("Connected", 1);
        b = axeVar2;
        c = new axe[]{axeVar, axeVar2};
    }

    public static axe valueOf(String str) {
        return (axe) Enum.valueOf(axe.class, str);
    }

    public static axe[] values() {
        return (axe[]) c.clone();
    }
}
