package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cj0 implements Choreographer.FrameCallback {
    public final /* synthetic */ zt3 a;
    public final /* synthetic */ Function1 b;

    public cj0(zt3 zt3Var, dj0 dj0Var, Function1 function1) {
        this.a = zt3Var;
        this.b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object t7oVar;
        Function1 function1 = this.b;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        this.a.resumeWith(t7oVar);
    }
}
