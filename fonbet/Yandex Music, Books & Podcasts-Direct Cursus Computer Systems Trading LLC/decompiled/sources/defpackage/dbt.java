package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dbt {
    public static final dbt a;
    public static final dbt b;
    public static final dbt c;
    public static final dbt d;
    public static final /* synthetic */ dbt[] e;

    static {
        dbt dbtVar = new dbt("SUCCESSFUL", 0);
        a = dbtVar;
        dbt dbtVar2 = new dbt("REREGISTER", 1);
        b = dbtVar2;
        dbt dbtVar3 = new dbt("CANCELLED", 2);
        c = dbtVar3;
        dbt dbtVar4 = new dbt("ALREADY_SELECTED", 3);
        d = dbtVar4;
        e = new dbt[]{dbtVar, dbtVar2, dbtVar3, dbtVar4};
    }

    public static dbt valueOf(String str) {
        return (dbt) Enum.valueOf(dbt.class, str);
    }

    public static dbt[] values() {
        return (dbt[]) e.clone();
    }
}
