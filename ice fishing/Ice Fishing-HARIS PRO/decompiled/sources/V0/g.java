package V0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends S0.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1275q;

    public g(S0.k kVar, RectF rectF) {
        super(kVar);
        this.f1275q = rectF;
    }

    @Override // S0.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1277x = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1275q = gVar.f1275q;
    }
}
