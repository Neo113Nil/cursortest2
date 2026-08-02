package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes15.dex */
public final class vbv implements fev, rdq0 {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ vbv(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        this.a.element = bgq0Var;
    }

    @Override // defpackage.fev
    public void onCancel(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onError(hev hevVar, n9o n9oVar) {
    }

    @Override // defpackage.fev
    public void onStart(hev hevVar) {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.drawable.Drawable] */
    @Override // defpackage.fev
    public void onSuccess(hev hevVar, u3v0 u3v0Var) {
        this.a.element = u3v0Var.a;
    }
}
