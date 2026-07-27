package z3;

import android.graphics.Typeface;
import com.bumptech.glide.e;
import w3.C5163b;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5274a extends e {

    /* renamed from: g, reason: collision with root package name */
    public final Typeface f42157g;

    /* renamed from: h, reason: collision with root package name */
    public final h8.d f42158h;
    public boolean i;

    public C5274a(h8.d dVar, Typeface typeface) {
        super(13);
        this.f42157g = typeface;
        this.f42158h = dVar;
    }

    @Override // com.bumptech.glide.e
    public final void u(int i) {
        if (this.i) {
            return;
        }
        C5163b c5163b = (C5163b) this.f42158h.f38261u;
        if (c5163b.j(this.f42157g)) {
            c5163b.h(false);
        }
    }

    @Override // com.bumptech.glide.e
    public final void v(Typeface typeface, boolean z8) {
        if (this.i) {
            return;
        }
        C5163b c5163b = (C5163b) this.f42158h.f38261u;
        if (c5163b.j(typeface)) {
            c5163b.h(false);
        }
    }
}
