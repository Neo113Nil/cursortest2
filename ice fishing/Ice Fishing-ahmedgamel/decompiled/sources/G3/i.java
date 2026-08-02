package G3;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i extends X2.a {
    @Override // X2.a
    public final void j(u uVar, float f2, float f9) {
        uVar.d(f9 * f2, 180.0f, 90.0f);
        float f10 = f9 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f10, f10);
        qVar.f1162f = 180.0f;
        qVar.f1163g = 90.0f;
        ((ArrayList) uVar.f1174f).add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        ((ArrayList) uVar.f1175g).add(oVar);
        uVar.f1172d = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d9 = 270.0f;
        uVar.f1170b = (((float) Math.cos(Math.toRadians(d9))) * f12) + f11;
        uVar.f1171c = (f12 * ((float) Math.sin(Math.toRadians(d9)))) + f11;
    }
}
