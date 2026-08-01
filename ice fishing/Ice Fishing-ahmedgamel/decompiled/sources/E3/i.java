package E3;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i extends A8.b {
    @Override // A8.b
    public final void h(u uVar, float f3, float f9) {
        uVar.d(f9 * f3, 180.0f, 90.0f);
        float f10 = f9 * 2.0f * f3;
        q qVar = new q(0.0f, 0.0f, f10, f10);
        qVar.f820f = 180.0f;
        qVar.f821g = 90.0f;
        ((ArrayList) uVar.f832f).add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        ((ArrayList) uVar.f833g).add(oVar);
        uVar.f830d = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f828b = (((float) Math.cos(Math.toRadians(d2))) * f12) + f11;
        uVar.f829c = (f12 * ((float) Math.sin(Math.toRadians(d2)))) + f11;
    }
}
