package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xgh {
    public static final fs7 b;
    public static final xgh c;
    public static final xgh d;
    public static final xgh e;
    public static final xgh f;
    public static final xgh g;
    public static final xgh h;
    public static final /* synthetic */ xgh[] i;
    public static final /* synthetic */ rdb j;
    public final String a;

    static {
        xgh xghVar = new xgh("PLAY", 0, "PLAY");
        xgh xghVar2 = new xgh("PAUSE", 1, "PAUSE");
        xgh xghVar3 = new xgh("PREVIOUS", 2, "REWIND");
        xgh xghVar4 = new xgh("PREVIOUS_BLOCKED", 3, "REWIND_BLOCKED");
        xgh xghVar5 = new xgh("PREVIOUS_PODCAST", 4, "REWIND_PODCAST");
        c = xghVar5;
        xgh xghVar6 = new xgh("NEXT", 5, "SKIP");
        xgh xghVar7 = new xgh("NEXT_PODCAST", 6, "SKIP_PODCAST");
        d = xghVar7;
        xgh xghVar8 = new xgh("NEXT_BLOCKED", 7, "SKIP_BLOCKED");
        xgh xghVar9 = new xgh("ADD_LIKE", 8, "ADD_LIKE");
        e = xghVar9;
        xgh xghVar10 = new xgh("REMOVE_LIKE", 9, "REMOVE_LIKE");
        f = xghVar10;
        xgh xghVar11 = new xgh("NO_LIKE", 10, "NO_LIKE");
        xgh xghVar12 = new xgh("ADD_DISLIKE", 11, "ADD_DISLIKE");
        g = xghVar12;
        xgh xghVar13 = new xgh("REMOVE_DISLIKE", 12, "REMOVE_DISLIKE");
        h = xghVar13;
        xgh[] xghVarArr = {xghVar, xghVar2, xghVar3, xghVar4, xghVar5, xghVar6, xghVar7, xghVar8, xghVar9, xghVar10, xghVar11, xghVar12, xghVar13, new xgh("NO_DISLIKE", 13, "NO_DISLIKE"), new xgh("STOP", 14, "STOP")};
        i = xghVarArr;
        j = new rdb(xghVarArr);
        b = new fs7(27);
    }

    public xgh(String str, int i2, String str2) {
        this.a = "ru.yandex.music.action.".concat(str2);
        ordinal();
    }

    public static xgh valueOf(String str) {
        return (xgh) Enum.valueOf(xgh.class, str);
    }

    public static xgh[] values() {
        return (xgh[]) i.clone();
    }
}
