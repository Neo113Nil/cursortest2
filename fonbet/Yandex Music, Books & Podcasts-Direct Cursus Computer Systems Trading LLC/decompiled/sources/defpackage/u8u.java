package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u8u implements PointerInputEventHandler {
    public final /* synthetic */ float a;
    public final /* synthetic */ fvf b;
    public final /* synthetic */ i2u c;
    public final /* synthetic */ mm6 d;
    public final /* synthetic */ i2u e;
    public final /* synthetic */ aqi f;
    public final /* synthetic */ float g;

    public u8u(float f, fvf fvfVar, i2u i2uVar, mm6 mm6Var, i2u i2uVar2, aqi aqiVar, float f2) {
        this.a = f;
        this.b = fvfVar;
        this.c = i2uVar;
        this.d = mm6Var;
        this.e = i2uVar2;
        this.f = aqiVar;
        this.g = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s8u] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        final uqn uqnVar = new uqn();
        final x8a x8aVar = new x8a();
        final float f = this.a;
        final fvf fvfVar = this.b;
        final i2u i2uVar = this.c;
        final mm6 mm6Var = this.d;
        final i2u i2uVar2 = this.e;
        final aqi aqiVar = this.f;
        Object h = wna.h(pfmVar, new Function0() { // from class: s8u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long b = x8a.this.b(bzf.s(Float.MAX_VALUE, Float.MAX_VALUE));
                float f2 = w8u.a;
                if (i2uVar2.a() == null) {
                    uqn uqnVar2 = uqnVar;
                    float f3 = uqnVar2.a;
                    float f4 = f;
                    fvf fvfVar2 = fvfVar;
                    i2u i2uVar3 = i2uVar;
                    mm6 mm6Var2 = mm6Var;
                    Continuation continuation2 = null;
                    if (f3 >= 0.0f) {
                        if (f3 <= f4) {
                            x97.y(mm6Var2, null, null, new aq5(fvfVar2, continuation2, 5), 3);
                        } else if (fvfVar2.d()) {
                            i2uVar3.d.setValue(new b2u(Float.valueOf(yzt.c(b))));
                        }
                    } else if (Math.abs(f3) <= f4) {
                        x97.y(mm6Var2, null, null, new aq5(fvfVar2, continuation2, 6), 3);
                    } else if (((Number) aqiVar.getValue()).intValue() > 0) {
                        i2uVar3.d.setValue(new a2u(Float.valueOf(yzt.c(b))));
                    }
                    uqnVar2.a = 0.0f;
                }
                return Unit.a;
            }
        }, new bt5(mm6Var, x8aVar, i2uVar2, fvfVar, uqnVar, this.g), continuation, 5);
        return h == nm6.a ? h : Unit.a;
    }
}
