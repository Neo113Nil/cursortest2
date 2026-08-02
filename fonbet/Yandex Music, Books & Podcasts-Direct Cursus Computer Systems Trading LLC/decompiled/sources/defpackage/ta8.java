package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ta8 implements koo {
    public final ua8 a;
    public final /* synthetic */ loo b;

    public ta8(loo looVar, ua8 ua8Var) {
        this.a = ua8Var;
        this.b = looVar;
    }

    @Override // defpackage.koo
    public final joo a(String str, Function0 function0) {
        return this.b.a(str, function0);
    }

    @Override // defpackage.koo
    public final boolean c(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.koo
    public final Map d() {
        return this.b.d();
    }

    @Override // defpackage.koo
    public final Object e(String str) {
        return this.b.e(str);
    }
}
