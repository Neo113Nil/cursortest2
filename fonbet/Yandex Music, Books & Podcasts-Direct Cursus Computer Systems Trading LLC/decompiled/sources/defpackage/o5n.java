package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o5n {
    public static final o5n a;
    public static final o5n b;
    public static final o5n c;
    public static final o5n d;
    public static final o5n e;
    public static final /* synthetic */ o5n[] f;

    static {
        o5n o5nVar = new o5n("AUTO", 0);
        a = o5nVar;
        o5n o5nVar2 = new o5n("LOW", 1);
        b = o5nVar2;
        o5n o5nVar3 = new o5n("NORMAL", 2);
        c = o5nVar3;
        o5n o5nVar4 = new o5n("HIGH_LEGACY", 3);
        d = o5nVar4;
        o5n o5nVar5 = new o5n("LOSSLESS", 4);
        e = o5nVar5;
        f = new o5n[]{o5nVar, o5nVar2, o5nVar3, o5nVar4, o5nVar5};
    }

    public static o5n valueOf(String str) {
        return (o5n) Enum.valueOf(o5n.class, str);
    }

    public static o5n[] values() {
        return (o5n[]) f.clone();
    }
}
