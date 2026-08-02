package yads;

import defpackage.a081;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class c70 extends Lambda implements sls {
    public static final c70 w = new c70();

    public c70() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 != null) {
            return a081Var2;
        }
        synchronized (a081.f) {
            a081Var = a081.g;
            if (a081Var == null) {
                a081Var = new a081();
                a081.g = a081Var;
            }
        }
        return a081Var;
    }
}
