package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jwm {
    public static final jwm a;
    public static final jwm b;
    public static final /* synthetic */ jwm[] c;

    static {
        jwm jwmVar = new jwm("DEFAULT", 0);
        a = jwmVar;
        jwm jwmVar2 = new jwm("SIMPLE", 1);
        b = jwmVar2;
        c = new jwm[]{jwmVar, jwmVar2};
    }

    public static jwm valueOf(String str) {
        return (jwm) Enum.valueOf(jwm.class, str);
    }

    public static jwm[] values() {
        return (jwm[]) c.clone();
    }
}
