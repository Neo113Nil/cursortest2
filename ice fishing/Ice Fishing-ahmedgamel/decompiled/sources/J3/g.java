package J3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class g extends G3.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1476q;

    public g(G3.k kVar, RectF rectF) {
        super(kVar);
        this.f1476q = rectF;
    }

    @Override // G3.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1478Q = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1476q = gVar.f1476q;
    }
}
