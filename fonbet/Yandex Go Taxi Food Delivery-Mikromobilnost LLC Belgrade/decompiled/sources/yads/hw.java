package yads;

import defpackage.a981;
import defpackage.wls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class hw extends Lambda implements wls {
    public final /* synthetic */ a981 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(a981 a981Var) {
        super(2);
        this.b = a981Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        this.b.a((String) obj, (String) obj2);
        return zy11.a;
    }
}
