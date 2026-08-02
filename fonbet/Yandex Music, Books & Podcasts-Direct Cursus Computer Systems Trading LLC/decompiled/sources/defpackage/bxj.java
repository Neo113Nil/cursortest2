package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bxj {
    public static final bxj a;
    public static final bxj b;
    public static final /* synthetic */ bxj[] c;

    static {
        bxj bxjVar = new bxj("Vertical", 0);
        a = bxjVar;
        bxj bxjVar2 = new bxj("Horizontal", 1);
        b = bxjVar2;
        c = new bxj[]{bxjVar, bxjVar2};
    }

    public static bxj valueOf(String str) {
        return (bxj) Enum.valueOf(bxj.class, str);
    }

    public static bxj[] values() {
        return (bxj[]) c.clone();
    }
}
