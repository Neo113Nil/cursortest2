package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class jxq implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ jxq(int i, Function0 function0, yci yciVar, Function0 function02, boolean z, boolean z2, int i2, int i3) {
        this.b = i;
        this.g = function0;
        this.h = yciVar;
        this.i = function02;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qgg.r((String) this.g, this.c, (jzb) this.h, (ges) this.i, this.d, this.b, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wdg.l((List) this.g, this.b, this.c, this.d, (Function1) this.h, (yci) this.i, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                v5g.h(this.b, (Function0) this.g, (yci) this.h, (Function0) this.i, this.c, this.d, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jxq(String str, boolean z, jzb jzbVar, ges gesVar, boolean z2, int i, int i2, int i3) {
        this.g = str;
        this.c = z;
        this.h = jzbVar;
        this.i = gesVar;
        this.d = z2;
        this.b = i;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ jxq(List list, int i, boolean z, boolean z2, Function1 function1, yci yciVar, int i2, int i3) {
        this.g = list;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.h = function1;
        this.i = yciVar;
        this.e = i2;
        this.f = i3;
    }
}
