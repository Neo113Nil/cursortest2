package yads;

import defpackage.bp5;
import defpackage.k171;
import defpackage.sls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class bp3 extends Lambda implements sls {
    public final /* synthetic */ k171 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp3(k171 k171Var) {
        super(0);
        this.b = k171Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ((bp5) this.b.a).a.resumeWith(null);
        return zy11.a;
    }
}
