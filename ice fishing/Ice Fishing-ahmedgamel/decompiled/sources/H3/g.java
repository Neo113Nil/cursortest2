package H3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class g extends E3.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1120q;

    public g(E3.k kVar, RectF rectF) {
        super(kVar);
        this.f1120q = rectF;
    }

    @Override // E3.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1122Q = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1120q = gVar.f1120q;
    }
}
