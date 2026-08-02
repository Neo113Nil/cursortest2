package defpackage;

/* loaded from: classes9.dex */
public final class qx11 extends jse {
    public static final qx11 b = new qx11();

    @Override // defpackage.jse
    public final jse P(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        sb61 sb61Var = (sb61) fseVar.get(sb61.b);
        if (sb61Var != null) {
            sb61Var.a = true;
        } else {
            w511.x("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.jse
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
