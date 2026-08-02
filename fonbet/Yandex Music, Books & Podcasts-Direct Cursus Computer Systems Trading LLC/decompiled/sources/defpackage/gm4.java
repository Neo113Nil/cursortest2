package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class gm4 extends ot0 {
    public final /* synthetic */ Method l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Class n;

    public gm4(Method method, Object obj, Class cls) {
        this.l = method;
        this.m = obj;
        this.n = cls;
    }

    @Override // defpackage.ot0
    public final Object N() {
        return this.l.invoke(this.m, this.n);
    }

    public final String toString() {
        return this.n.getName();
    }
}
