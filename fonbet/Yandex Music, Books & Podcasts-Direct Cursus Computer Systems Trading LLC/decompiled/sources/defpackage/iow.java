package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class iow {
    public static final iow a;
    public static final iow b;
    public static final iow c;
    public static final iow d;
    public static final iow e;
    public static final iow f;
    public static final iow g;
    public static final iow h;
    public static final /* synthetic */ iow[] i;

    static {
        iow iowVar = new iow("BASED_ON_ENTITY", 0);
        a = iowVar;
        iow iowVar2 = new iow("MY_MUSIC", 1);
        b = iowVar2;
        iow iowVar3 = new iow("MY_CACHED_MUSIC", 2);
        c = iowVar3;
        iow iowVar4 = new iow("SEARCH", 3);
        d = iowVar4;
        iow iowVar5 = new iow("MUSIC_HISTORY", 4);
        e = iowVar5;
        iow iowVar6 = new iow("MUSIC_HISTORY_SEARCH", 5);
        f = iowVar6;
        iow iowVar7 = new iow("FAMILIAR_FROM_COLLECTION", 6);
        g = iowVar7;
        iow iowVar8 = new iow("FAMILIAR_FROM_WAVE", 7);
        h = iowVar8;
        i = new iow[]{iowVar, iowVar2, iowVar3, iowVar4, iowVar5, iowVar6, iowVar7, iowVar8};
    }

    public static iow valueOf(String str) {
        return (iow) Enum.valueOf(iow.class, str);
    }

    public static iow[] values() {
        return (iow[]) i.clone();
    }
}
