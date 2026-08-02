package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class mo1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ float f;
    public final /* synthetic */ gar g;
    public final /* synthetic */ wn5 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ mo1(List list, float f, float f2, yci yciVar, float f3, gar garVar, wn5 wn5Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = list;
        this.c = f;
        this.d = f2;
        this.e = yciVar;
        this.f = f3;
        this.g = garVar;
        this.h = wn5Var;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xee.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                xee.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1), this.j);
                break;
        }
        return Unit.a;
    }
}
