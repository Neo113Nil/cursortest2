package defpackage;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class aur extends cg6 implements bzc {
    private final int arity;

    public aur(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // defpackage.bzc
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.kq2
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ern.a.getClass();
        return frn.a(this);
    }
}
