package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tbl {
    public static final tbl a;
    public static final tbl b;
    public static final /* synthetic */ tbl[] c;

    static {
        tbl tblVar = new tbl("Default", 0);
        a = tblVar;
        tbl tblVar2 = new tbl("Large", 1);
        b = tblVar2;
        c = new tbl[]{tblVar, tblVar2};
    }

    public static tbl valueOf(String str) {
        return (tbl) Enum.valueOf(tbl.class, str);
    }

    public static tbl[] values() {
        return (tbl[]) c.clone();
    }
}
