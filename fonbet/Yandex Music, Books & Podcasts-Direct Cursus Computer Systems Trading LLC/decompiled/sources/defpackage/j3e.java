package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j3e implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yci b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ j3e(yci yciVar, boolean z, int i, int i2, int i3) {
        this.b = yciVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.e | 1);
                zsd.v(this.d, R, this.f, (hq5) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.e | 1);
                q7g.j(this.d, R2, this.f, (hq5) obj, this.b, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ j3e(boolean z, int i, yci yciVar, int i2, int i3) {
        this.c = z;
        this.d = i;
        this.b = yciVar;
        this.e = i2;
        this.f = i3;
    }
}
