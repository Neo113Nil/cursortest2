package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class tnl {
    public static final tnl a;
    public static final tnl b;
    public static final tnl c;
    public static final tnl d;
    public static final tnl e;
    public static final tnl f;
    public static final /* synthetic */ tnl[] g;

    static {
        tnl tnlVar = new tnl("IDLE", 0);
        a = tnlVar;
        tnl tnlVar2 = new tnl("PREPARING", 1);
        b = tnlVar2;
        tnl tnlVar3 = new tnl("BUFFERING", 2);
        c = tnlVar3;
        tnl tnlVar4 = new tnl("READY", 3);
        d = tnlVar4;
        tnl tnlVar5 = new tnl("COMPLETED", 4);
        e = tnlVar5;
        tnl tnlVar6 = new tnl("ERROR", 5);
        f = tnlVar6;
        g = new tnl[]{tnlVar, tnlVar2, tnlVar3, tnlVar4, tnlVar5, tnlVar6};
    }

    public static tnl valueOf(String str) {
        return (tnl) Enum.valueOf(tnl.class, str);
    }

    public static tnl[] values() {
        return (tnl[]) g.clone();
    }
}
