package yads;

import defpackage.mc71;
import defpackage.tls;
import defpackage.vl81;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class si3 extends Lambda implements tls {
    public final /* synthetic */ vl81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si3(vl81 vl81Var) {
        super(1);
        this.b = vl81Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.b.a.invoke(new mc71((String) obj));
        return zy11.a;
    }
}
