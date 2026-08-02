package defpackage;

/* loaded from: classes5.dex */
public abstract class ydr {
    public static final js3 a;
    public static final js3 b;

    static {
        int i = 2;
        a = new js3("NONE", i);
        b = new js3("PENDING", i);
    }

    public static final xdr a(Object obj) {
        if (obj == null) {
            obj = ugj.a;
        }
        return new xdr(obj);
    }
}
