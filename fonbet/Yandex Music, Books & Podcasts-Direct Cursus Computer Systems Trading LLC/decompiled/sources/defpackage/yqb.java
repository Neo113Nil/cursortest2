package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class yqb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ crb s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqb(crb crbVar, int i, int i2) {
        super(0);
        this.r = i2;
        this.s = crbVar;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        Object obj;
        switch (this.r) {
            case 0:
                return Integer.valueOf(this.s.a.Z0(this.t));
            case 1:
                crb crbVar = this.s;
                qah qahVar = crbVar.c.c;
                if (qahVar != null) {
                    ype it = yhn.m(0, qahVar.a).iterator();
                    while (true) {
                        if (it.c) {
                            obj = it.next();
                            int intValue = ((Number) obj).intValue();
                            if (qahVar.c[intValue].a != 0) {
                                if (((Number) crbVar.f.l(new yqb(crbVar, intValue, 0))).intValue() == this.t) {
                                }
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        i = num.intValue();
                        return Integer.valueOf(i);
                    }
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                q0t Y0 = this.s.a.Y0();
                return Y0.a[this.t];
        }
    }
}
