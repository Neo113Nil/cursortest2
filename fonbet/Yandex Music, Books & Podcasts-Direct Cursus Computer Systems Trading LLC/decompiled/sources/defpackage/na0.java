package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class na0 {
    public Float a;
    public Float b;
    public Float c;
    public Boolean d;
    public final ja0 e;
    public final x6k f;

    public na0(lf3 lf3Var, Function0 function0) {
        lf3Var.getClass();
        this.e = a.a(lf3Var, new u10(19), function0, weo.S(0, 0, null, 7), ghh.s(2), new u10(18));
        this.f = szf.g0(Boolean.FALSE);
    }

    public final boolean a() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final void b(final boolean z) {
        this.f.setValue(Boolean.valueOf(!z));
        final Float f = this.b;
        final Float f2 = this.a;
        final Float f3 = this.c;
        final Boolean bool = this.d;
        if (f2 == null || f == null || f3 == null || bool == null) {
            xq0.q("Unexpected behaviour, positionHidedPlayer and positionCollapsedPlayer must be initialized");
        } else {
            ja0.k(this.e, a.b(new Function1() { // from class: la0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    poa poaVar = (poa) obj;
                    poaVar.getClass();
                    poaVar.a(lf3.b, 0.0f);
                    if (bool.booleanValue()) {
                        lf3 lf3Var = lf3.a;
                        Float f4 = f3;
                        poaVar.a(lf3Var, f4.floatValue());
                        poaVar.a(lf3.c, f4.floatValue());
                    } else {
                        lf3 lf3Var2 = lf3.a;
                        float floatValue = f2.floatValue();
                        if (floatValue < 0.0f) {
                            floatValue = 0.0f;
                        }
                        poaVar.a(lf3Var2, floatValue);
                        if (z) {
                            lf3 lf3Var3 = lf3.c;
                            float floatValue2 = f.floatValue();
                            poaVar.a(lf3Var3, floatValue2 >= 0.0f ? floatValue2 : 0.0f);
                        }
                    }
                    return Unit.a;
                }
            }));
        }
    }

    public final void c(float f, float f2, int i, boolean z, int i2, float f3, int i3) {
        String b = cma.b(f3);
        StringBuilder sb = new StringBuilder("updatePositionAnchors { pCP: ");
        sb.append(f);
        sb.append(", pHP: ");
        sb.append(f2);
        sb.append(", mHPx: ");
        sb.append(i);
        sb.append(", fHCP: ");
        sb.append(z);
        sb.append(", nI: ");
        sb.append(i2);
        sb.append(", cPH: ");
        sb.append(b);
        sb.append(", bO: ");
        ssg.a(3, "PlayerScreen", f1d.i(sb, i3, " }"), null);
        Float f4 = this.a;
        if ((f4 == null || f4.floatValue() != f) && f < 0.0f) {
            dfi.r("Unexpected behaviour probably small screen", "PlayerScreen");
        }
        Float f5 = this.a;
        if (f5 != null && f5.floatValue() < 0.0f && f >= 0.0f) {
            dfi.r("recalculated to the correct value ", "PlayerScreen");
        }
        this.b = Float.valueOf(f2);
        this.a = Float.valueOf(f);
        this.c = Float.valueOf(i);
        this.d = Boolean.valueOf(z);
        b(!a());
    }
}
