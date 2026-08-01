package B3;

import S0.f;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f190n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextPaint f191u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f192v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f193w;

    public c(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.f193w = dVar;
        this.f190n = context;
        this.f191u = textPaint;
        this.f192v = fVar;
    }

    @Override // S0.f
    public final void p(int i) {
        this.f192v.p(i);
    }

    @Override // S0.f
    public final void q(Typeface typeface, boolean z3) {
        this.f193w.g(this.f190n, this.f191u, typeface);
        this.f192v.q(typeface, z3);
    }
}
