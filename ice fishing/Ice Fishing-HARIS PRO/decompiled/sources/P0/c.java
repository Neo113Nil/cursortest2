package P0;

import a.AbstractC0078a;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends AbstractC0078a {
    public final /* synthetic */ Context e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0078a f898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f899h;

    public c(d dVar, Context context, TextPaint textPaint, AbstractC0078a abstractC0078a) {
        this.f899h = dVar;
        this.e = context;
        this.f897f = textPaint;
        this.f898g = abstractC0078a;
    }

    @Override // a.AbstractC0078a
    public final void R(int i) {
        this.f898g.R(i);
    }

    @Override // a.AbstractC0078a
    public final void S(Typeface typeface, boolean z2) {
        this.f899h.g(this.e, this.f897f, typeface);
        this.f898g.S(typeface, z2);
    }
}
