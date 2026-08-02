package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.material3.p;

/* loaded from: classes12.dex */
public final /* synthetic */ class x1c implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ x1c(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        m2k0 m2k0Var = (m2k0) obj;
        switch (i) {
            case 0:
                m2k0Var.b(((Number) aVar.e()).floatValue());
                break;
            case 1:
                float floatValue = ((Number) aVar.e()).floatValue();
                float d = p.d(m2k0Var, floatValue);
                float e = p.e(m2k0Var, floatValue);
                m2k0Var.v(e == 0.0f ? 1.0f : d / e);
                m2k0Var.B(p.a);
                break;
            case 2:
                m2k0Var.b(((Number) aVar.e()).floatValue());
                break;
            case 3:
                m2k0Var.b(((Number) aVar.e()).floatValue());
                break;
            case 4:
                m2k0Var.G(((Number) aVar.e()).floatValue());
                break;
            default:
                m2k0Var.b(((Number) aVar.e()).floatValue());
                break;
        }
        return zy11Var;
    }
}
