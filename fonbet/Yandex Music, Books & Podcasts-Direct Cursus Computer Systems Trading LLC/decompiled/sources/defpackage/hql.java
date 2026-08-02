package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hql {
    public static final hql a;
    public static final hql b;
    public static final /* synthetic */ hql[] c;

    static {
        hql hqlVar = new hql("Expand", 0);
        a = hqlVar;
        hql hqlVar2 = new hql("Collapse", 1);
        b = hqlVar2;
        c = new hql[]{hqlVar, hqlVar2};
    }

    public static hql valueOf(String str) {
        return (hql) Enum.valueOf(hql.class, str);
    }

    public static hql[] values() {
        return (hql[]) c.clone();
    }
}
