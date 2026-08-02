package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sow {
    public static final sow a;
    public static final sow b;
    public static final sow c;
    public static final sow d;
    public static final sow e;
    public static final sow f;
    public static final sow g;
    public static final /* synthetic */ sow[] h;

    static {
        sow sowVar = new sow("RECOMMENDED", 0);
        a = sowVar;
        sow sowVar2 = new sow("ON_DEMAND", 1);
        b = sowVar2;
        sow sowVar3 = new sow("SEARCH", 2);
        c = sowVar3;
        sow sowVar4 = new sow("ARTIST", 3);
        d = sowVar4;
        sow sowVar5 = new sow("OWN", 4);
        e = sowVar5;
        sow sowVar6 = new sow("EDITORIAL_CHOICE", 5);
        f = sowVar6;
        sow sowVar7 = new sow("UNKNOWN", 6);
        g = sowVar7;
        h = new sow[]{sowVar, sowVar2, sowVar3, sowVar4, sowVar5, sowVar6, sowVar7};
    }

    public static sow valueOf(String str) {
        return (sow) Enum.valueOf(sow.class, str);
    }

    public static sow[] values() {
        return (sow[]) h.clone();
    }
}
