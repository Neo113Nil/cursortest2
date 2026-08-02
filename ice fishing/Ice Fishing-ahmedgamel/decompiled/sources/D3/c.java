package D3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bumptech.glide.g;

/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f612d;

    public c(d dVar, Context context, TextPaint textPaint, g gVar) {
        this.f612d = dVar;
        this.f609a = context;
        this.f610b = textPaint;
        this.f611c = gVar;
    }

    @Override // com.bumptech.glide.g
    public final void v(int i) {
        this.f611c.v(i);
    }

    @Override // com.bumptech.glide.g
    public final void w(Typeface typeface, boolean z6) {
        this.f612d.g(this.f609a, this.f610b, typeface);
        this.f611c.w(typeface, z6);
    }
}
