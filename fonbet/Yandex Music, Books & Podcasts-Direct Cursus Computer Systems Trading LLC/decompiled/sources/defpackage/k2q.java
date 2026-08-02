package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k2q {
    public static final k2q a;
    public static final k2q b;
    public static final k2q c;
    public static final k2q d;
    public static final k2q e;
    public static final /* synthetic */ k2q[] f;

    static {
        k2q k2qVar = new k2q("DEFAULT", 0);
        a = k2qVar;
        k2q k2qVar2 = new k2q("NO_ERROR", 1);
        b = k2qVar2;
        k2q k2qVar3 = new k2q("AUTH_ERROR", 2);
        c = k2qVar3;
        k2q k2qVar4 = new k2q("NETWORK_ERROR", 3);
        d = k2qVar4;
        k2q k2qVar5 = new k2q("DATA_ERROR", 4);
        e = k2qVar5;
        f = new k2q[]{k2qVar, k2qVar2, k2qVar3, k2qVar4, k2qVar5};
    }

    public static k2q valueOf(String str) {
        return (k2q) Enum.valueOf(k2q.class, str);
    }

    public static k2q[] values() {
        return (k2q[]) f.clone();
    }
}
