package S0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d extends R.j {
    @Override // R.j
    public final void v(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        double d2 = f3;
        double d3 = f2;
        uVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d2 * d3), (float) (Math.sin(Math.toRadians(RecyclerView.f2111C0)) * d2 * d3));
    }
}
