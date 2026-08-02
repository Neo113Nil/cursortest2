package yads;

import defpackage.j18;
import defpackage.mf60;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class sf0 extends Lambda implements tls {
    public final /* synthetic */ j18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(j18 j18Var) {
        super(1);
        this.b = j18Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.b.t() instanceof mf60) {
            this.b.resumeWith(new Result.Failure(th));
        }
        return zy11.a;
    }
}
