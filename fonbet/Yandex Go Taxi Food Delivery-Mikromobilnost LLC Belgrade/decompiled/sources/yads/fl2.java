package yads;

import defpackage.j18;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;

/* loaded from: classes7.dex */
public final class fl2 extends Lambda implements tls {
    public final /* synthetic */ j18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl2(j18 j18Var) {
        super(1);
        this.b = j18Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jk3 jk3Var = (jk3) obj;
        if (jk3Var.getCause() instanceof SerializationException) {
            throw jk3Var;
        }
        this.b.resumeWith(new Result(new Result.Failure(jk3Var)));
        return zy11.a;
    }
}
