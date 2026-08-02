package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p4q {
    public static final p4q a;
    public static final p4q b;
    public static final p4q c;
    public static final /* synthetic */ p4q[] d;

    static {
        p4q p4qVar = new p4q("MIX", 0);
        a = p4qVar;
        p4q p4qVar2 = new p4q("DEFAULT", 1);
        b = p4qVar2;
        p4q p4qVar3 = new p4q("Q2V", 2);
        c = p4qVar3;
        d = new p4q[]{p4qVar, p4qVar2, p4qVar3};
    }

    public static p4q valueOf(String str) {
        return (p4q) Enum.valueOf(p4q.class, str);
    }

    public static p4q[] values() {
        return (p4q[]) d.clone();
    }
}
