package D3;

import android.graphics.Typeface;
import com.bumptech.glide.g;

/* loaded from: classes2.dex */
public final class b extends F.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f608h;
    public final /* synthetic */ d i;

    public b(d dVar, g gVar) {
        this.i = dVar;
        this.f608h = gVar;
    }

    @Override // F.b
    public final void g(int i) {
        this.i.f624m = true;
        this.f608h.v(i);
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f625n = Typeface.create(typeface, dVar.f615c);
        dVar.f624m = true;
        this.f608h.w(dVar.f625n, false);
    }
}
