package yads;

import defpackage.ae71;
import defpackage.sls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class gp3 extends Lambda implements sls {
    public final /* synthetic */ ae71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp3(ae71 ae71Var) {
        super(0);
        this.b = ae71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        this.b.a.onInitializationCompleted();
        return zy11.a;
    }
}
