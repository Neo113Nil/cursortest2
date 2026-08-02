package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes9.dex */
public final class qu00 implements yu00 {
    public final /* synthetic */ uu00 a;
    public final /* synthetic */ uyg b;
    public final /* synthetic */ v5j0 c;
    public final /* synthetic */ yu00 d;

    public qu00(uu00 uu00Var, uyg uygVar, v5j0 v5j0Var, yu00 yu00Var) {
        this.a = uu00Var;
        this.b = uygVar;
        this.c = v5j0Var;
        this.d = yu00Var;
    }

    @Override // defpackage.yu00
    public final Object a(Map map, InputStream inputStream) {
        return kp50.c(inputStream, this.a, this.b, this.c, new in2(11, this.d, map, inputStream));
    }

    @Override // defpackage.yu00
    public final Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        return kp50.c(inputStream, this.a, this.b, this.c, new jo0(this.d, map, inputStream, wu00Var, 20));
    }
}
