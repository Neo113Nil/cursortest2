package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class hja {
    public static final hja a;
    public static final hja b;
    public static final hja c;
    public static final hja d;
    public static final /* synthetic */ hja[] e;

    static {
        hja hjaVar = new hja("Permanent", 0);
        a = hjaVar;
        hja hjaVar2 = new hja("Auto", 1);
        b = hjaVar2;
        hja hjaVar3 = new hja("Smart", 2);
        c = hjaVar3;
        hja hjaVar4 = new hja("Temporary", 3);
        d = hjaVar4;
        e = new hja[]{hjaVar, hjaVar2, hjaVar3, hjaVar4};
    }

    public static hja valueOf(String str) {
        return (hja) Enum.valueOf(hja.class, str);
    }

    public static hja[] values() {
        return (hja[]) e.clone();
    }
}
