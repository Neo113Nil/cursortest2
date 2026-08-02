package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class p0v implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sdr c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ onu g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    public /* synthetic */ p0v(k2v k2vVar, boolean z, sdr sdrVar, Function0 function0, Function0 function02, Function0 function03, onu onuVar, Function0 function04, boolean z2, int i) {
        this.j = k2vVar;
        this.b = z;
        this.c = sdrVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = onuVar;
        this.h = function04;
        this.i = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                w0v.d((k2v) this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R);
                break;
            default:
                l2v l2vVar = (l2v) this.j;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                w0v.d(l2vVar.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, hq5Var, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ p0v(l2v l2vVar, boolean z, sdr sdrVar, Function0 function0, Function0 function02, Function0 function03, onu onuVar, Function0 function04, boolean z2) {
        this.j = l2vVar;
        this.b = z;
        this.c = sdrVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = onuVar;
        this.h = function04;
        this.i = z2;
    }
}
