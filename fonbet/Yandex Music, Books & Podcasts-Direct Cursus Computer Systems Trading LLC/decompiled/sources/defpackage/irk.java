package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class irk {
    public static final irk a;
    public static final irk b;
    public static final irk c;
    public static final /* synthetic */ irk[] d;

    static {
        irk irkVar = new irk("FullUpdate", 0);
        a = irkVar;
        irk irkVar2 = new irk("PartialUpdate", 1);
        b = irkVar2;
        irk irkVar3 = new irk("OnlyNewEntities", 2);
        c = irkVar3;
        d = new irk[]{irkVar, irkVar2, irkVar3};
    }

    public static irk valueOf(String str) {
        return (irk) Enum.valueOf(irk.class, str);
    }

    public static irk[] values() {
        return (irk[]) d.clone();
    }
}
