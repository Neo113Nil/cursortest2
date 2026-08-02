package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class hm4 extends ot0 {
    public final /* synthetic */ Method l;
    public final /* synthetic */ Class m;
    public final /* synthetic */ int n;

    public hm4(Method method, Class cls, int i) {
        this.l = method;
        this.m = cls;
        this.n = i;
    }

    @Override // defpackage.ot0
    public final Object N() {
        return this.l.invoke(null, this.m, Integer.valueOf(this.n));
    }

    public final String toString() {
        return this.m.getName();
    }
}
