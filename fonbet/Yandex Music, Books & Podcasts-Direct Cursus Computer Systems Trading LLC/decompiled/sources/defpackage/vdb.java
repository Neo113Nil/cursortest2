package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vdb {
    public static final qee a;
    public static final vdb b;
    public static final /* synthetic */ vdb[] c;

    /* JADX INFO: Fake field, exist only in values array */
    vdb EF0;

    static {
        vdb vdbVar = new vdb("TESTING", 0);
        vdb vdbVar2 = new vdb("PRODUCTION", 1);
        b = vdbVar2;
        c = new vdb[]{vdbVar, vdbVar2};
        a = new qee(22);
    }

    public static vdb valueOf(String str) {
        return (vdb) Enum.valueOf(vdb.class, str);
    }

    public static vdb[] values() {
        return (vdb[]) c.clone();
    }
}
