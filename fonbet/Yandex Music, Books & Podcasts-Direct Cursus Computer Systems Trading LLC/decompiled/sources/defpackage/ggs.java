package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ggs implements rjc {
    public final Throwable a;

    public ggs(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        throw this.a;
    }
}
