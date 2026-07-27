package F3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: F3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0313g extends C3.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1033q;

    public C0313g(C3.k kVar, RectF rectF) {
        super(kVar);
        this.f1033q = rectF;
    }

    @Override // C3.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f1035Q = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public C0313g(C0313g c0313g) {
        super(c0313g);
        this.f1033q = c0313g.f1033q;
    }
}
