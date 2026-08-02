package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class dum {
    public static final dum a;
    public static final dum b;
    public static final dum c;
    public static final dum d;
    public static final dum e;
    public static final dum f;
    public static final /* synthetic */ dum[] g;

    static {
        dum dumVar = new dum("MANAGE_SUBSCRIPTION", 0);
        a = dumVar;
        dum dumVar2 = new dum("SETTINGS", 1);
        b = dumVar2;
        dum dumVar3 = new dum("RESTORE_PURCHASE", 2);
        c = dumVar3;
        dum dumVar4 = new dum("DELETE_ACCOUNT", 3);
        d = dumVar4;
        dum dumVar5 = new dum("WIZARD", 4);
        e = dumVar5;
        dum dumVar6 = new dum("LOGOUT", 5);
        f = dumVar6;
        g = new dum[]{dumVar, dumVar2, dumVar3, dumVar4, dumVar5, dumVar6};
    }

    public static dum valueOf(String str) {
        return (dum) Enum.valueOf(dum.class, str);
    }

    public static dum[] values() {
        return (dum[]) g.clone();
    }
}
