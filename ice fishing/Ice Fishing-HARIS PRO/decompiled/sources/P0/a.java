package P0;

import a.AbstractC0078a;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends AbstractC0078a {
    public final Typeface e;

    /* renamed from: f, reason: collision with root package name */
    public final B.b f894f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f895g;

    public a(B.b bVar, Typeface typeface) {
        this.e = typeface;
        this.f894f = bVar;
    }

    @Override // a.AbstractC0078a
    public final void R(int i) {
        if (this.f895g) {
            return;
        }
        L0.b bVar = (L0.b) this.f894f.f10b;
        if (bVar.j(this.e)) {
            bVar.h(false);
        }
    }

    @Override // a.AbstractC0078a
    public final void S(Typeface typeface, boolean z2) {
        if (this.f895g) {
            return;
        }
        L0.b bVar = (L0.b) this.f894f.f10b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
