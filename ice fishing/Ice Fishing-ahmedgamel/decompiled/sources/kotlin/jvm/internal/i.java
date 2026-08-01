package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class i implements f, Serializable {
    private final int arity;

    public i(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        s.f38718a.getClass();
        String a9 = t.a(this);
        h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
