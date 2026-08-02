package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q0g {
    public static final q0g a;
    public static final q0g b;
    public static final q0g c;
    public static final /* synthetic */ q0g[] d;

    static {
        q0g q0gVar = new q0g("ADD_LIKE", 0);
        a = q0gVar;
        q0g q0gVar2 = new q0g("SET_NEUTRAL", 1);
        b = q0gVar2;
        q0g q0gVar3 = new q0g("ADD_DISLIKE", 2);
        c = q0gVar3;
        d = new q0g[]{q0gVar, q0gVar2, q0gVar3};
    }

    public static q0g valueOf(String str) {
        return (q0g) Enum.valueOf(q0g.class, str);
    }

    public static q0g[] values() {
        return (q0g[]) d.clone();
    }
}
