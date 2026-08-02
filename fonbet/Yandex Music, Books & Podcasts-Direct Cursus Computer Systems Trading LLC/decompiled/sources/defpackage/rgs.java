package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rgs implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ pyc d;
    public final /* synthetic */ pyc e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rgs(Object obj, float f, float f2, pyc pycVar, pyc pycVar2, int i, int i2) {
        this.a = i2;
        this.g = obj;
        this.b = f;
        this.c = f2;
        this.d = pycVar;
        this.e = pycVar2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qgg.n((ahs) this.g, this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                qgg.p((ugs) this.g, this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }
}
