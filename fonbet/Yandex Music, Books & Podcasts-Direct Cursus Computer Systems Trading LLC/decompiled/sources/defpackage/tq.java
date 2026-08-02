package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class tq {
    public static final rre a;
    public static final tq b;
    public static final tq c;
    public static final tq d;
    public static final /* synthetic */ tq[] e;

    static {
        tq tqVar = new tq("ALBUM", 0);
        b = tqVar;
        tq tqVar2 = new tq("PODCAST", 1);
        c = tqVar2;
        tq tqVar3 = new tq("BOOK", 2);
        d = tqVar3;
        e = new tq[]{tqVar, tqVar2, tqVar3};
        a = new rre(13);
    }

    public static tq valueOf(String str) {
        return (tq) Enum.valueOf(tq.class, str);
    }

    public static tq[] values() {
        return (tq[]) e.clone();
    }
}
