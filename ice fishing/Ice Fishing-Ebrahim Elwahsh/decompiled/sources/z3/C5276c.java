package z3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bumptech.glide.e;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5276c extends e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f42160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextPaint f42161h;
    public final /* synthetic */ e i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C5277d f42162j;

    public C5276c(C5277d c5277d, Context context, TextPaint textPaint, e eVar) {
        super(13);
        this.f42162j = c5277d;
        this.f42160g = context;
        this.f42161h = textPaint;
        this.i = eVar;
    }

    @Override // com.bumptech.glide.e
    public final void u(int i) {
        this.i.u(i);
    }

    @Override // com.bumptech.glide.e
    public final void v(Typeface typeface, boolean z8) {
        this.f42162j.g(this.f42160g, this.f42161h, typeface);
        this.i.v(typeface, z8);
    }
}
