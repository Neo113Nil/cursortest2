package B3;

import S0.f;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class b extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f189h;
    public final /* synthetic */ d i;

    public b(d dVar, f fVar) {
        this.i = dVar;
        this.f189h = fVar;
    }

    @Override // F.b
    public final void g(int i) {
        this.i.f205m = true;
        this.f189h.p(i);
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f206n = Typeface.create(typeface, dVar.f196c);
        dVar.f205m = true;
        this.f189h.q(dVar.f206n, false);
    }
}
