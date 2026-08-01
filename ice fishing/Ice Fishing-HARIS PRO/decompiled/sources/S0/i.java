package S0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends R.j {
    @Override // R.j
    public final void v(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(RecyclerView.f2111C0, RecyclerView.f2111C0, f4, f4);
        qVar.f1133f = 180.0f;
        qVar.f1134g = 90.0f;
        uVar.f1144f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f1145g.add(oVar);
        uVar.f1143d = 270.0f;
        float f5 = (RecyclerView.f2111C0 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.f2111C0) / 2.0f;
        double d2 = 270.0f;
        uVar.f1141b = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        uVar.f1142c = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
