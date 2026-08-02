package defpackage;

import com.yandex.go.taxi.order.map.overlay.c0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class y080 implements s080, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ y080(c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    @Override // defpackage.s080
    public final void a(int i, int i2) {
        int i3 = this.a;
        c0 c0Var = this.b;
        switch (i3) {
            case 0:
                c0Var.C1 = ((gh00) c0Var.K).j();
                r0 r0Var = c0Var.h0.a;
                tdt0 tdt0Var = new tdt0(i, i2);
                r0Var.getClass();
                r0Var.m(null, tdt0Var);
                break;
            default:
                c0Var.C1 = ((gh00) c0Var.K).j();
                r0 r0Var2 = c0Var.h0.a;
                tdt0 tdt0Var2 = new tdt0(i, i2);
                r0Var2.getClass();
                r0Var2.m(null, tdt0Var2);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof s080) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof s080) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(2, this.b, c0.class, "showTextPinCallback", "showTextPinCallback(II)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
