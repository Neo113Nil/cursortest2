package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class aj6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ aj6(fvf fvfVar, ndc ndcVar, Function1 function1, yci yciVar, boolean z, boolean z2, int i, int i2) {
        this.a = 1;
        this.f = fvfVar;
        this.g = ndcVar;
        this.h = function1;
        this.b = yciVar;
        this.c = z;
        this.d = z2;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(24577);
                fj6.a(this.c, (h5l) this.f, (eml) this.g, (c6h) this.h, this.b, this.d, (hq5) obj, R, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                zyl.b((fvf) this.f, (ndc) this.g, (Function1) this.h, this.b, this.c, this.d, (hq5) obj, R2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wiv.d((xjv) this.f, (sdr) this.g, this.c, this.d, this.b, (ihv) this.h, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wiv.a((hkv) this.f, (xjv) this.g, this.c, this.d, this.b, (ihv) this.h, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ aj6(Object obj, Object obj2, boolean z, boolean z2, yci yciVar, ihv ihvVar, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.g = obj2;
        this.c = z;
        this.d = z2;
        this.b = yciVar;
        this.h = ihvVar;
        this.e = i;
    }

    public /* synthetic */ aj6(boolean z, h5l h5lVar, eml emlVar, c6h c6hVar, yci yciVar, boolean z2, int i, int i2) {
        this.a = 0;
        this.c = z;
        this.f = h5lVar;
        this.g = emlVar;
        this.h = c6hVar;
        this.b = yciVar;
        this.d = z2;
        this.e = i2;
    }
}
