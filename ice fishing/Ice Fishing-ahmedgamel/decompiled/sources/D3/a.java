package D3;

import android.graphics.Typeface;
import com.bumptech.glide.g;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f605a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.c f606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f607c;

    public a(n4.c cVar, Typeface typeface) {
        this.f605a = typeface;
        this.f606b = cVar;
    }

    @Override // com.bumptech.glide.g
    public final void v(int i) {
        if (this.f607c) {
            return;
        }
        A3.d dVar = (A3.d) this.f606b.f39658u;
        if (dVar.j(this.f605a)) {
            dVar.h(false);
        }
    }

    @Override // com.bumptech.glide.g
    public final void w(Typeface typeface, boolean z6) {
        if (this.f607c) {
            return;
        }
        A3.d dVar = (A3.d) this.f606b.f39658u;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
