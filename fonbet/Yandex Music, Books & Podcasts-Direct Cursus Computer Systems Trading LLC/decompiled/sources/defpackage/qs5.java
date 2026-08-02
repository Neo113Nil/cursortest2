package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qs5 extends ozm {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public qs5(Function1 function1) {
        super(bs5.t);
        this.c = new rs5(function1);
    }

    @Override // defpackage.ozm
    public final qzm a(Object obj) {
        switch (this.b) {
            case 0:
                return new qzm(this, obj, obj == null, null, true);
            default:
                return new qzm(this, obj, obj == null, (n2r) this.c, true);
        }
    }

    @Override // defpackage.ozm
    public vwt b() {
        switch (this.b) {
            case 0:
                return (rs5) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs5(Function0 function0) {
        super(function0);
        ehv ehvVar = ehv.h;
        this.c = ehvVar;
    }
}
