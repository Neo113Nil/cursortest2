package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dba {
    public static final dba a;
    public static final dba b;
    public static final /* synthetic */ dba[] c;

    static {
        dba dbaVar = new dba("ADDED", 0);
        a = dbaVar;
        dba dbaVar2 = new dba("REMOVED", 1);
        b = dbaVar2;
        c = new dba[]{dbaVar, dbaVar2};
    }

    public static dba valueOf(String str) {
        return (dba) Enum.valueOf(dba.class, str);
    }

    public static dba[] values() {
        return (dba[]) c.clone();
    }
}
