package yads;

import defpackage.e371;
import defpackage.l281;
import defpackage.vl81;
import defpackage.wls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class qi3 extends Lambda implements wls {
    public final /* synthetic */ vl81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi3(vl81 vl81Var) {
        super(2);
        this.b = vl81Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (l281.a[((ba0) obj).ordinal()] == 1) {
            this.b.a.invoke(new e371(booleanValue));
        }
        return zy11.a;
    }
}
