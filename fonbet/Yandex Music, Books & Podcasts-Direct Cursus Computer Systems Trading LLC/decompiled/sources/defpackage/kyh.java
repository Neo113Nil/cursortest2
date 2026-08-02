package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kyh {
    public static final kyh a;
    public static final kyh b;
    public static final /* synthetic */ kyh[] c;

    static {
        kyh kyhVar = new kyh("Books", 0);
        a = kyhVar;
        kyh kyhVar2 = new kyh("Podcasts", 1);
        b = kyhVar2;
        c = new kyh[]{kyhVar, kyhVar2};
    }

    public static kyh valueOf(String str) {
        return (kyh) Enum.valueOf(kyh.class, str);
    }

    public static kyh[] values() {
        return (kyh[]) c.clone();
    }
}
