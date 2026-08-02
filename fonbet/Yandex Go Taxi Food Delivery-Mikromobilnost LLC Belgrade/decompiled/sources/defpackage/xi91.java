package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.VerticalTranslation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimation$Name;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class xi91 {
    public static final uh a = new uh(-1);
    public static final uh b = new uh(null);
    public static final uh c = new uh(null);
    public static final uh d = new uh(null);

    public static final void a(a aVar, fid fidVar, int i) {
        Lifecycle lifecycle;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1747448730);
        int i2 = 1;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new tcp0();
                btsVar.o0(Q);
            }
            tcp0 tcp0Var = (tcp0) Q;
            pey peyVar = (pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            wj6 wj6Var = tcp0Var.x;
            if (!peyVar.equals(tcp0Var.c)) {
                pey peyVar2 = tcp0Var.c;
                if (peyVar2 != null && (lifecycle = peyVar2.getLifecycle()) != null) {
                    lifecycle.d(wj6Var);
                }
                tcp0Var.c = peyVar;
                peyVar.getLifecycle().a(wj6Var);
            }
            boolean e = btsVar.e(tcp0Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new qq31(i2, tcp0Var);
                btsVar.o0(Q2);
            }
            zpn.a(tcp0Var, (tls) Q2, btsVar);
            sb2.c(new vvf0[]{f5z.a.a(tcp0Var), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().a(tcp0Var), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(tcp0Var)}, wwg.S(1815725786, true, new k2z0(aVar, 28), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ux51(i, i2, aVar);
        }
    }

    public static final lx80 b(pdk pdkVar, boolean z, rvo rvoVar) {
        Float d2;
        Float d3;
        Expression expression = pdkVar.e;
        Expression expression2 = pdkVar.b;
        Expression expression3 = pdkVar.h;
        int i = ebl.a[((DivAnimation$Name) expression.a(rvoVar)).ordinal()];
        r3 = null;
        Float valueOf = null;
        r3 = null;
        Float valueOf2 = null;
        if (i == 1) {
            if (z) {
                if (expression3 != null) {
                    d2 = d(Double.valueOf(((Number) expression3.a(rvoVar)).doubleValue()));
                }
                d2 = null;
            } else {
                if (expression2 != null) {
                    d2 = d(Double.valueOf(((Number) expression2.a(rvoVar)).doubleValue()));
                }
                d2 = null;
            }
            if (z) {
                d3 = d(expression2 != null ? (Double) expression2.a(rvoVar) : null);
            } else {
                d3 = d(expression3 != null ? (Double) expression3.a(rvoVar) : null);
            }
            return new VerticalTranslation(d2 != null ? d2.floatValue() : -1.0f, d3 != null ? d3.floatValue() : 0.0f);
        }
        if (i == 2) {
            if (z) {
                Double d4 = expression3 != null ? (Double) expression3.a(rvoVar) : null;
                if (d4 != null) {
                    float doubleValue = (float) d4.doubleValue();
                    valueOf2 = Float.valueOf(doubleValue >= 0.0f ? doubleValue : 0.0f);
                }
            } else {
                Double d5 = expression2 != null ? (Double) expression2.a(rvoVar) : null;
                if (d5 != null) {
                    float doubleValue2 = (float) d5.doubleValue();
                    valueOf2 = Float.valueOf(doubleValue2 >= 0.0f ? doubleValue2 : 0.0f);
                }
            }
            return new com.yandex.div.core.view2.animations.a(valueOf2 != null ? valueOf2.floatValue() : 1.0f, 0.5f, 0.5f);
        }
        if (i == 3) {
            return null;
        }
        if (z) {
            Double d6 = expression3 != null ? (Double) expression3.a(rvoVar) : null;
            if (d6 != null) {
                valueOf = Float.valueOf(y6i0.c((float) d6.doubleValue(), 0.0f, 1.0f));
            }
        } else {
            Double d7 = expression2 != null ? (Double) expression2.a(rvoVar) : null;
            if (d7 != null) {
                valueOf = Float.valueOf(y6i0.c((float) d7.doubleValue(), 0.0f, 1.0f));
            }
        }
        Fade fade = new Fade(valueOf != null ? valueOf.floatValue() : 1.0f);
        fade.d0(z ? 1 : 2);
        return fade;
    }

    public static final String c(String str) {
        if (evu0.z(str, '*')) {
            return str;
        }
        l9s l9sVar = new l9s((List) new ojj().b("+# ### ###-##-##"), false, true);
        l9sVar.d(0, str);
        return l9sVar.b();
    }

    public static final Float d(Double d2) {
        if (d2 != null) {
            return Float.valueOf(y6i0.c((float) d2.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
