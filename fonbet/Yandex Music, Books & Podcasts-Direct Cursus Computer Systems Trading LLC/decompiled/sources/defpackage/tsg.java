package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tsg {
    public static final tsg a;
    public static final tsg b;
    public static final tsg c;
    public static final /* synthetic */ tsg[] d;

    static {
        tsg tsgVar = new tsg("REQUESTS", 0);
        a = tsgVar;
        tsg tsgVar2 = new tsg("INCLUDE_ACCESS_TOKENS", 1);
        tsg tsgVar3 = new tsg("INCLUDE_RAW_RESPONSES", 2);
        tsg tsgVar4 = new tsg("CACHE", 3);
        tsg tsgVar5 = new tsg("APP_EVENTS", 4);
        b = tsgVar5;
        tsg tsgVar6 = new tsg("DEVELOPER_ERRORS", 5);
        c = tsgVar6;
        d = new tsg[]{tsgVar, tsgVar2, tsgVar3, tsgVar4, tsgVar5, tsgVar6, new tsg("GRAPH_API_DEBUG_WARNING", 6), new tsg("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static tsg valueOf(String str) {
        return (tsg) Enum.valueOf(tsg.class, str);
    }

    public static tsg[] values() {
        return (tsg[]) d.clone();
    }
}
