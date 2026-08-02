package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public enum b81 {
    Collection("collection"),
    Wave("wave");

    public static final mvt b;
    public static final List c;
    public final String a;

    static {
        b81 b81Var = Collection;
        b81 b81Var2 = Wave;
        b = new mvt(14);
        c = u75.h(b81Var, b81Var2);
    }

    b81(String str) {
        this.a = str;
    }
}
