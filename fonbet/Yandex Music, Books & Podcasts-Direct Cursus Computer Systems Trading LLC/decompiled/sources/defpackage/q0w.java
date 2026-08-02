package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q0w {
    public static final q0w a;
    public static final q0w b;
    public static final q0w c;
    public static final q0w d;
    public static final q0w e;
    public static final /* synthetic */ q0w[] f;

    static {
        q0w q0wVar = new q0w("SAVE", 0);
        a = q0wVar;
        q0w q0wVar2 = new q0w("SKIP", 1);
        b = q0wVar2;
        q0w q0wVar3 = new q0w("FINISH", 2);
        c = q0wVar3;
        q0w q0wVar4 = new q0w("NO_CONNECTION", 3);
        d = q0wVar4;
        q0w q0wVar5 = new q0w("UNKNOWN_ERROR", 4);
        e = q0wVar5;
        f = new q0w[]{q0wVar, q0wVar2, q0wVar3, q0wVar4, q0wVar5};
    }

    public static q0w valueOf(String str) {
        return (q0w) Enum.valueOf(q0w.class, str);
    }

    public static q0w[] values() {
        return (q0w[]) f.clone();
    }
}
