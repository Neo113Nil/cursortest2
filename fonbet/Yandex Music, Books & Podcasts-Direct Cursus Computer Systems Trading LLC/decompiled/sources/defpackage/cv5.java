package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cv5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cv5(Function0 function0, int i, int i2) {
        this.a = 1;
        this.b = i;
        this.d = function0;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int R = rvf.R(this.c | 1);
                i4w.m((zu5) this.d, this.b, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wdp.R((Function0) this.d, (hq5) obj, this.b, rvf.R(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int R2 = rvf.R(this.c | 1);
                n7w.v((l0d) this.d, this.b, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).intValue();
                int R3 = rvf.R(this.c | 1);
                q5g.d((o0k) this.d, this.b, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cv5(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
