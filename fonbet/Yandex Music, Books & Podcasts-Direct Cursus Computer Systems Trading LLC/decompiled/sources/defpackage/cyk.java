package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cyk {
    public static final cyk a;
    public static final cyk b;
    public static final cyk c;
    public static final cyk d;
    public static final /* synthetic */ cyk[] e;

    static {
        cyk cykVar = new cyk("NONE", 0);
        a = cykVar;
        cyk cykVar2 = new cyk("ACTIVE", 1);
        b = cykVar2;
        cyk cykVar3 = new cyk("YNISON", 2);
        c = cykVar3;
        cyk cykVar4 = new cyk("GLAGOL", 3);
        d = cykVar4;
        e = new cyk[]{cykVar, cykVar2, cykVar3, cykVar4};
    }

    public static cyk valueOf(String str) {
        return (cyk) Enum.valueOf(cyk.class, str);
    }

    public static cyk[] values() {
        return (cyk[]) e.clone();
    }
}
