package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class sd1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fud c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ yci g;
    public final /* synthetic */ int h;

    public /* synthetic */ sd1(String str, fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = fudVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = yciVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ot0.a(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tt0.l(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
                break;
        }
        return Unit.a;
    }
}
