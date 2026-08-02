package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class h7o extends g7o implements bzc {
    public final int j;

    public h7o(int i, Continuation continuation) {
        super(continuation);
        this.j = i;
    }

    @Override // defpackage.bzc
    public final int getArity() {
        return this.j;
    }

    @Override // defpackage.kq2
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        ern.a.getClass();
        return frn.a(this);
    }
}
