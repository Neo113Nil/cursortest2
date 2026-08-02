package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p5n {
    public static final p5n a;
    public static final p5n b;
    public static final p5n c;
    public static final p5n d;
    public static final /* synthetic */ p5n[] e;

    static {
        p5n p5nVar = new p5n("Low", 0);
        a = p5nVar;
        p5n p5nVar2 = new p5n("High", 1);
        b = p5nVar2;
        p5n p5nVar3 = new p5n("Lossless", 2);
        c = p5nVar3;
        p5n p5nVar4 = new p5n("Auto", 3);
        d = p5nVar4;
        e = new p5n[]{p5nVar, p5nVar2, p5nVar3, p5nVar4};
    }

    public static p5n valueOf(String str) {
        return (p5n) Enum.valueOf(p5n.class, str);
    }

    public static p5n[] values() {
        return (p5n[]) e.clone();
    }
}
