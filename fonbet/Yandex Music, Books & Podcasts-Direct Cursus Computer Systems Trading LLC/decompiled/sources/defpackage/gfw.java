package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gfw {
    public static final gfw a;
    public static final gfw b;
    public static final gfw c;
    public static final gfw d;
    public static final gfw e;
    public static final /* synthetic */ gfw[] f;

    static {
        gfw gfwVar = new gfw("ACTIVE", 0);
        a = gfwVar;
        gfw gfwVar2 = new gfw("PASSIVE", 1);
        b = gfwVar2;
        gfw gfwVar3 = new gfw("TRANSITION", 2);
        c = gfwVar3;
        gfw gfwVar4 = new gfw("EMPTY", 3);
        d = gfwVar4;
        gfw gfwVar5 = new gfw("DISABLED", 4);
        e = gfwVar5;
        f = new gfw[]{gfwVar, gfwVar2, gfwVar3, gfwVar4, gfwVar5};
    }

    public static gfw valueOf(String str) {
        return (gfw) Enum.valueOf(gfw.class, str);
    }

    public static gfw[] values() {
        return (gfw[]) f.clone();
    }
}
