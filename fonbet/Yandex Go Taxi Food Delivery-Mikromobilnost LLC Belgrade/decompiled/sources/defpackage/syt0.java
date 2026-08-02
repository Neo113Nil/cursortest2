package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class syt0 implements Continuation, wse {
    public final Continuation a;
    public final fse b;

    public syt0(fse fseVar, Continuation continuation) {
        this.a = continuation;
        this.b = fseVar;
    }

    @Override // defpackage.wse
    public final wse getCallerFrame() {
        return (wse) this.a;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
