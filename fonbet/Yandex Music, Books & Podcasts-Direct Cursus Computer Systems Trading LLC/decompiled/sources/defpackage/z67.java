package defpackage;

/* loaded from: classes5.dex */
public enum z67 {
    c("PROBING_1", "probing 1"),
    d("PROBING_2", "probing 2"),
    e("PROBING_3", "probing 3"),
    f("ANNOUNCING_1", "announcing 1"),
    g("ANNOUNCING_2", "announcing 2"),
    h("ANNOUNCED", "announced"),
    i("CANCELING_1", "canceling 1"),
    j("CANCELING_2", "canceling 2"),
    k("CANCELING_3", "canceling 3"),
    l("CANCELED", "canceled"),
    m("CLOSING", "closing"),
    n("CLOSED", "closed");

    public final String a;
    public final int b;

    z67(String str, String str2) {
        this.a = str2;
        this.b = r2;
    }

    public final z67 a() {
        int ordinal = ordinal();
        z67 z67Var = h;
        z67 z67Var2 = l;
        z67 z67Var3 = n;
        switch (ordinal) {
            case 0:
                return d;
            case 1:
                return e;
            case 2:
                return f;
            case 3:
                return g;
            case 4:
            case 5:
                return z67Var;
            case 6:
                return j;
            case 7:
                return k;
            case 8:
            case 9:
                return z67Var2;
            case 10:
            case 11:
                return z67Var3;
            default:
                return this;
        }
    }

    public final boolean b() {
        return this.b == 3;
    }

    public final boolean c() {
        return this.b == 5;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
