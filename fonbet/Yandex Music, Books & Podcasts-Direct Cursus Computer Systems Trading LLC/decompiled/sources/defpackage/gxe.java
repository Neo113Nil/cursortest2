package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gxe {
    public static final gxe a;
    public static final gxe b;
    public static final /* synthetic */ gxe[] c;

    static {
        gxe gxeVar = new gxe("Min", 0);
        a = gxeVar;
        gxe gxeVar2 = new gxe("Max", 1);
        b = gxeVar2;
        c = new gxe[]{gxeVar, gxeVar2};
    }

    public static gxe valueOf(String str) {
        return (gxe) Enum.valueOf(gxe.class, str);
    }

    public static gxe[] values() {
        return (gxe[]) c.clone();
    }
}
