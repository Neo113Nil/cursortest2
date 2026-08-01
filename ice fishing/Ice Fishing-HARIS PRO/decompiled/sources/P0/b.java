package P0;

import a.AbstractC0078a;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0078a f896h;
    public final /* synthetic */ d i;

    public b(d dVar, AbstractC0078a abstractC0078a) {
        this.i = dVar;
        this.f896h = abstractC0078a;
    }

    @Override // F.b
    public final void g(int i) {
        this.i.f909m = true;
        this.f896h.R(i);
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f910n = Typeface.create(typeface, dVar.f902c);
        dVar.f909m = true;
        this.f896h.S(dVar.f910n, false);
    }
}
