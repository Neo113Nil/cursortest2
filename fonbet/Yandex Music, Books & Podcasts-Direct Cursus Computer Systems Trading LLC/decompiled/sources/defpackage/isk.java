package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class isk {
    public static final isk a;
    public static final isk b;
    public static final /* synthetic */ isk[] c;

    static {
        isk iskVar = new isk("UNCHANGED", 0);
        a = iskVar;
        isk iskVar2 = new isk("TRANSLUCENT", 1);
        isk iskVar3 = new isk("OPAQUE", 2);
        b = iskVar3;
        c = new isk[]{iskVar, iskVar2, iskVar3};
    }

    public static isk valueOf(String str) {
        return (isk) Enum.valueOf(isk.class, str);
    }

    public static isk[] values() {
        return (isk[]) c.clone();
    }
}
