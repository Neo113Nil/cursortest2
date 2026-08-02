package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class tow {
    public static final tow a;
    public static final tow b;
    public static final tow c;
    public static final tow d;
    public static final /* synthetic */ tow[] e;

    static {
        tow towVar = new tow("CATALOG_TRACK", 0);
        a = towVar;
        tow towVar2 = new tow("INFINITE", 1);
        b = towVar2;
        tow towVar3 = new tow("VIDEO_CLIP", 2);
        c = towVar3;
        tow towVar4 = new tow("UNKNOWN", 3);
        d = towVar4;
        e = new tow[]{towVar, towVar2, towVar3, towVar4};
    }

    public static tow valueOf(String str) {
        return (tow) Enum.valueOf(tow.class, str);
    }

    public static tow[] values() {
        return (tow[]) e.clone();
    }
}
