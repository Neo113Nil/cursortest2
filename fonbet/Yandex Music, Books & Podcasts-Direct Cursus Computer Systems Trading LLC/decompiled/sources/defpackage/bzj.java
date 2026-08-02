package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bzj {
    public static final bzj a;
    public static final bzj b;
    public static final /* synthetic */ bzj[] c;

    static {
        bzj bzjVar = new bzj("Move", 0);
        a = bzjVar;
        bzj bzjVar2 = new bzj("Menu", 1);
        b = bzjVar2;
        c = new bzj[]{bzjVar, bzjVar2};
    }

    public static bzj valueOf(String str) {
        return (bzj) Enum.valueOf(bzj.class, str);
    }

    public static bzj[] values() {
        return (bzj[]) c.clone();
    }
}
