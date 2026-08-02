package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o7a implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o7a(float f, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.b = f;
        this.c = function0;
        this.d = function02;
        this.f = function03;
        this.g = function04;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qld.i((s7a) this.f, this.b, this.c, (yci) this.g, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ocg.f(this.b, this.c, this.d, (Function0) this.f, (Function0) this.g, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o7a(s7a s7aVar, float f, Function0 function0, yci yciVar, Function0 function02, int i) {
        this.f = s7aVar;
        this.b = f;
        this.c = function0;
        this.g = yciVar;
        this.d = function02;
        this.e = i;
    }
}
