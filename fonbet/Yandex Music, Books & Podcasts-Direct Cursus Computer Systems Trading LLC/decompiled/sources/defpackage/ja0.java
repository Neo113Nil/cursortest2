package defpackage;

import com.yandex.music.core.ui.compose.draggable.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ja0 {
    public Function1 b;
    public Function0 c;
    public tm0 d;
    public uf7 e;
    public final x6k g;
    public final x6k h;
    public final t6k k;
    public final x6k l;
    public final x6k m;
    public final ca0 n;
    public Function1 a = new u10(18);
    public final mqi f = new mqi();
    public final zx7 i = szf.U(new q90(this, 0));
    public final t6k j = new t6k(Float.NaN);

    public ja0(Object obj) {
        this.g = szf.g0(obj);
        this.h = szf.g0(obj);
        szf.T(ehv.h, new q90(this, 1));
        this.k = new t6k(0.0f);
        this.l = szf.g0(null);
        this.m = szf.g0(new ml7(c5b.a, new float[0]));
        this.n = new ca0(this);
    }

    public static void k(ja0 ja0Var, ml7 ml7Var) {
        Object value;
        t6k t6kVar = ja0Var.j;
        zx7 zx7Var = ja0Var.i;
        if (Float.isNaN(t6kVar.e())) {
            value = zx7Var.getValue();
        } else {
            value = ml7Var.a(ja0Var.j.e());
            if (value == null) {
                value = zx7Var.getValue();
            }
        }
        ja0Var.j(ml7Var, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, hqi hqiVar, ryc rycVar, cg6 cg6Var) {
        y90 y90Var;
        int i;
        Throwable th;
        mqi mqiVar;
        if (cg6Var instanceof y90) {
            y90Var = (y90) cg6Var;
            int i2 = y90Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y90Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = y90Var.j;
                nm6 nm6Var = nm6.a;
                i = y90Var.l;
                x6k x6kVar = this.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (c().a.indexOf(obj) == -1) {
                        if (((Boolean) this.a.invoke(obj)).booleanValue()) {
                            this.h.setValue(obj);
                            h(obj);
                        }
                        return Unit.a;
                    }
                    try {
                        mqiVar = this.f;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        aa0 aa0Var = new aa0(this, obj, rycVar, continuation, 1);
                        y90Var.l = 1;
                        if (mqiVar.b(hqiVar, aa0Var, y90Var) == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        x6kVar.setValue(null);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        qgg.h0(obj2);
                    } catch (Throwable th4) {
                        th = th4;
                        x6kVar.setValue(null);
                        throw th;
                    }
                }
                x6kVar.setValue(null);
                return Unit.a;
            }
        }
        y90Var = new y90(this, cg6Var);
        Object obj22 = y90Var.j;
        nm6 nm6Var2 = nm6.a;
        i = y90Var.l;
        x6k x6kVar2 = this.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        x6kVar2.setValue(null);
        return Unit.a;
    }

    public final float b(float f) {
        float e = e(f);
        float g = e - g();
        this.n.a(e, 0.0f);
        return g;
    }

    public final ml7 c() {
        return (ml7) this.m.getValue();
    }

    public final boolean d() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float e(float f) {
        float f2;
        t6k t6kVar = this.j;
        float e = (Float.isNaN(t6kVar.e()) ? 0.0f : t6kVar.e()) + f;
        float c = c().c();
        float[] fArr = c().b;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            float f3 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    f3 = Math.max(f3, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            f2 = f3;
        }
        return yhn.c(e, c, f2);
    }

    public final float f(Enum r4, Enum r5) {
        float d = c().d(r4);
        float d2 = c().d(r5);
        float c = (yhn.c(this.j.e(), Math.min(d, d2), Math.max(d, d2)) - d) / (d2 - d);
        if (Float.isNaN(c)) {
            return 1.0f;
        }
        if (c < 1.0E-6f) {
            return 0.0f;
        }
        if (c > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(c);
    }

    public final float g() {
        t6k t6kVar = this.j;
        if (!Float.isNaN(t6kVar.e())) {
            return t6kVar.e();
        }
        xq0.q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(Object obj) {
        this.g.setValue(obj);
    }

    public final Object i(float f, cg6 cg6Var) {
        if (!d()) {
            xq0.x("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
            return null;
        }
        Object value = this.g.getValue();
        ml7 c = c();
        float g = g();
        Function1 function1 = this.b;
        if (function1 == null) {
            Intrinsics.j("positionalThreshold");
            throw null;
        }
        Function0 function0 = this.c;
        if (function0 != null) {
            Object d = a.d(c, g, f, function1, function0);
            return ((Boolean) this.a.invoke(d)).booleanValue() ? a.k(this, d, f, cg6Var) : a.k(this, value, f, cg6Var);
        }
        Intrinsics.j("velocityThreshold");
        throw null;
    }

    public final void j(ml7 ml7Var, Object obj) {
        ml7Var.getClass();
        if (Intrinsics.d(c(), ml7Var)) {
            return;
        }
        this.m.setValue(ml7Var);
        mqi mqiVar = this.f;
        boolean g = mqiVar.b.g();
        x6k x6kVar = this.l;
        if (g) {
            try {
                ca0 ca0Var = this.n;
                float d = c().d(obj);
                if (!Float.isNaN(d)) {
                    ca0Var.a(d, 0.0f);
                    x6kVar.setValue(null);
                }
                h(obj);
                this.h.setValue(obj);
                mqiVar.c();
            } catch (Throwable th) {
                mqiVar.c();
                throw th;
            }
        }
        if (g) {
            return;
        }
        x6kVar.setValue(obj);
    }
}
