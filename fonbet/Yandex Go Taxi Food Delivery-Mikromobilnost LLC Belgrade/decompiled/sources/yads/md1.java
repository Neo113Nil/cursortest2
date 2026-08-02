package yads;

import defpackage.j18;
import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class md1 extends Lambda implements tls {
    public final /* synthetic */ j18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md1(j18 j18Var) {
        super(1);
        this.b = j18Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.b.resumeWith((String) obj);
        return zy11.a;
    }
}
