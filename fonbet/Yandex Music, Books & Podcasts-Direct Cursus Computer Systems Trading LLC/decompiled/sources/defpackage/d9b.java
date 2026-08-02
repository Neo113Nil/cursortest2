package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d9b {
    public static final d9b a;
    public static final d9b b;
    public static final d9b c;
    public static final d9b d;
    public static final /* synthetic */ d9b[] e;

    static {
        d9b d9bVar = new d9b("Prolongation", 0);
        a = d9bVar;
        d9b d9bVar2 = new d9b("SkipToOffline", 1);
        b = d9bVar2;
        d9b d9bVar3 = new d9b("CreateQueueWithSeeds", 2);
        c = d9bVar3;
        d9b d9bVar4 = new d9b("CreateQueueWithPassiveSession", 3);
        d = d9bVar4;
        e = new d9b[]{d9bVar, d9bVar2, d9bVar3, d9bVar4};
    }

    public static d9b valueOf(String str) {
        return (d9b) Enum.valueOf(d9b.class, str);
    }

    public static d9b[] values() {
        return (d9b[]) e.clone();
    }
}
