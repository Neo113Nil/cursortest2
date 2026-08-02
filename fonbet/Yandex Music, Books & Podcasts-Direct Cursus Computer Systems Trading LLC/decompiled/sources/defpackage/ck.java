package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ck implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n5g c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ pyc e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ck(wn5 wn5Var, pyc pycVar, n5g n5gVar, yci yciVar, Function2 function2, d85 d85Var, long j, int i, int i2) {
        this.a = 2;
        this.b = wn5Var;
        this.e = pycVar;
        this.c = n5gVar;
        this.d = yciVar;
        this.f = function2;
        this.j = d85Var;
        this.g = j;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                yd5.b((ek) this.b, (String) this.j, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                yd5.a((ek) this.b, (ik) this.j, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                kct.a((wn5) this.b, this.e, this.c, this.d, this.f, (d85) this.j, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ck(ek ekVar, Object obj, n5g n5gVar, yci yciVar, pyc pycVar, Function2 function2, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = ekVar;
        this.j = obj;
        this.c = n5gVar;
        this.d = yciVar;
        this.e = pycVar;
        this.f = function2;
        this.g = j;
        this.h = i;
        this.i = i2;
    }
}
