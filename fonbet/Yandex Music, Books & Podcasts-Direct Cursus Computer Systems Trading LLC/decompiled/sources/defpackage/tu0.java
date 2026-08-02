package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ tu0(Object obj, Object obj2, yci yciVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.f = obj2;
        this.g = yciVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                jf0.a((qzm[]) this.e, (pu0) this.f, this.b, (Function2) this.g, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bcx.d((Function0) this.e, (yci) this.f, this.b, (pyc) this.g, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vq1.g((yci) this.e, (bci) this.f, this.b, (Function1) this.g, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                v3g.e((w3g) this.e, (ges) this.f, (yci) this.g, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                qhi.b((String) this.e, (qmu) this.f, (yci) this.g, this.b, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                ivf.g((jmj) this.e, (yci) this.f, this.b, (hmj) this.g, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tu0(Object obj, Object obj2, boolean z, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.g = obj3;
        this.c = i;
        this.d = i2;
    }
}
