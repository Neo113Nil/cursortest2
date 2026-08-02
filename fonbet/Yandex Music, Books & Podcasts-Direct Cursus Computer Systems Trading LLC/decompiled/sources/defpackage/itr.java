package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class itr {
    public static final ovk b;
    public static final /* synthetic */ itr[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        itr[] itrVarArr = {new itr("Popular", 0, "popular"), new itr("New", 1, "new"), new itr("Asc", 2, "asc"), new itr("Desc", 3, "desc")};
        c = itrVarArr;
        d = new rdb(itrVarArr);
        b = new ovk();
    }

    public itr(String str, int i, String str2) {
        this.a = str2;
    }

    public static itr valueOf(String str) {
        return (itr) Enum.valueOf(itr.class, str);
    }

    public static itr[] values() {
        return (itr[]) c.clone();
    }
}
