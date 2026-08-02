package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dsj {
    public static final dsj a;
    public static final dsj b;
    public static final dsj c;
    public static final dsj d;
    public static final dsj e;
    public static final dsj f;
    public static final /* synthetic */ dsj[] g;

    static {
        dsj dsjVar = new dsj("CONTINUOUS", 0);
        a = dsjVar;
        dsj dsjVar2 = new dsj("TEXT", 1);
        b = dsjVar2;
        dsj dsjVar3 = new dsj("BINARY", 2);
        c = dsjVar3;
        dsj dsjVar4 = new dsj("PING", 3);
        d = dsjVar4;
        dsj dsjVar5 = new dsj("PONG", 4);
        e = dsjVar5;
        dsj dsjVar6 = new dsj("CLOSING", 5);
        f = dsjVar6;
        g = new dsj[]{dsjVar, dsjVar2, dsjVar3, dsjVar4, dsjVar5, dsjVar6};
    }

    public static dsj valueOf(String str) {
        return (dsj) Enum.valueOf(dsj.class, str);
    }

    public static dsj[] values() {
        return (dsj[]) g.clone();
    }
}
