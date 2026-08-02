package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class v4k {
    public static final lo3 a = new lo3(1);

    public static final gh0 a(lo3 lo3Var) {
        lo3Var.getClass();
        ArrayList arrayList = lo3Var.b;
        gh0 gh0Var = (gh0) (!arrayList.isEmpty() ? arrayList.remove(0) : null);
        return gh0Var == null ? hld.p() : gh0Var;
    }
}
