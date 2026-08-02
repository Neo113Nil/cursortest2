package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final /* synthetic */ class i92 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ i92(int i, IntRange intRange, Function1 function1, int i2, m2k m2kVar, yci yciVar, int i3, int i4) {
        this.b = i;
        this.g = intRange;
        this.h = function1;
        this.c = i2;
        this.i = m2kVar;
        this.d = yciVar;
        this.e = i3;
        this.f = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                n7w.w((String) this.g, (ges) this.h, (Map) this.i, this.d, this.b, this.c, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                ivf.j(this.b, (IntRange) this.g, (Function1) this.h, this.c, (m2k) this.i, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i92(String str, ges gesVar, Map map, yci yciVar, int i, int i2, int i3, int i4) {
        this.g = str;
        this.h = gesVar;
        this.i = map;
        this.d = yciVar;
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.f = i4;
    }
}
