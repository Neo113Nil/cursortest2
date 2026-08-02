package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k3q implements q3q {
    public static final k3q a;
    public static final k3q b;
    public static final k3q c;
    public static final k3q d;
    public static final /* synthetic */ k3q[] e;

    static {
        k3q k3qVar = new k3q("Popular", 0);
        a = k3qVar;
        k3q k3qVar2 = new k3q("FamiliarFromCollection", 1);
        b = k3qVar2;
        k3q k3qVar3 = new k3q("FamiliarFromWave", 2);
        c = k3qVar3;
        k3q k3qVar4 = new k3q("MusicHistory", 3);
        d = k3qVar4;
        e = new k3q[]{k3qVar, k3qVar2, k3qVar3, k3qVar4};
    }

    public static k3q valueOf(String str) {
        return (k3q) Enum.valueOf(k3q.class, str);
    }

    public static k3q[] values() {
        return (k3q[]) e.clone();
    }
}
