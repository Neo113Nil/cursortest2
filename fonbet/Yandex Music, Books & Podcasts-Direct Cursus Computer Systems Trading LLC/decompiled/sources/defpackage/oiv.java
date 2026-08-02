package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class oiv implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ihv c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oiv(xjv xjvVar, boolean z, boolean z2, ihv ihvVar, int i) {
        this.f = xjvVar;
        this.b = z;
        this.d = z2;
        this.c = ihvVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wiv.e((xjv) this.f, this.b, this.d, this.c, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wiv.c(this.b, (yci) this.f, this.c, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oiv(boolean z, yci yciVar, ihv ihvVar, boolean z2, int i) {
        this.b = z;
        this.f = yciVar;
        this.c = ihvVar;
        this.d = z2;
        this.e = i;
    }
}
