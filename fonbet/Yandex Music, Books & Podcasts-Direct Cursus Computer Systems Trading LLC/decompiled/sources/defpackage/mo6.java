package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class mo6 implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mo6(List list, yci yciVar, o0k o0kVar, float f, int i, boolean z, wn5 wn5Var, int i2) {
        float f2 = vt0.a;
        float f3 = vt0.a;
        this.h = list;
        this.b = yciVar;
        this.c = o0kVar;
        this.d = f;
        this.e = i;
        this.f = z;
        this.i = wn5Var;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(i2 | 1);
                vut.r((String) obj6, (lzs) obj5, (yci) obj4, (o0k) obj3, this.d, this.f, (hq5) obj, R, this.g);
                break;
            case 1:
                float f = vt0.a;
                float f2 = vt0.a;
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.g | 1);
                ild.k((List) obj6, (yci) obj4, (o0k) obj3, this.d, this.e, this.f, (wn5) obj5, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(i2 | 1);
                p1g.i((ukd) obj6, this.d, (b95) obj5, (d85) obj4, this.f, (wn5) obj3, (hq5) obj, R3, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(i2 | 1);
                pcg.a(this.d, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.f, (hq5) obj, R4, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mo6(ukd ukdVar, float f, b95 b95Var, d85 d85Var, boolean z, wn5 wn5Var, int i, int i2) {
        this.h = ukdVar;
        this.d = f;
        this.i = b95Var;
        this.b = d85Var;
        this.f = z;
        this.c = wn5Var;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ mo6(String str, lzs lzsVar, yci yciVar, o0k o0kVar, float f, boolean z, int i, int i2) {
        this.h = str;
        this.i = lzsVar;
        this.b = yciVar;
        this.c = o0kVar;
        this.d = f;
        this.f = z;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ mo6(float f, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, int i, int i2) {
        this.d = f;
        this.h = function0;
        this.i = function02;
        this.b = function03;
        this.c = function04;
        this.f = z;
        this.e = i;
        this.g = i2;
    }
}
