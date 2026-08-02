package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bjk {
    public static final bjk a;
    public static final bjk b;
    public static final /* synthetic */ bjk[] c;

    static {
        bjk bjkVar = new bjk("BDU", 0);
        a = bjkVar;
        bjk bjkVar2 = new bjk("BDU_OPTION", 1);
        b = bjkVar2;
        c = new bjk[]{bjkVar, bjkVar2};
    }

    public static bjk valueOf(String str) {
        return (bjk) Enum.valueOf(bjk.class, str);
    }

    public static bjk[] values() {
        return (bjk[]) c.clone();
    }
}
