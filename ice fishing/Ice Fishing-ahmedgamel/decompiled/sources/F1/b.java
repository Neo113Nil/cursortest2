package F1;

import H1.e;
import H1.h;
import P1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p;
import com.google.android.gms.internal.ads.C2964aq;
import t1.d;
import w1.t;
import w1.w;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class b implements w, t {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f967n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f968u;

    public b(Drawable drawable, int i) {
        this.f968u = i;
        g.c(drawable, "Argument must not be null");
        this.f967n = drawable;
    }

    @Override // w1.w
    public final void a() {
        C2964aq c2964aq;
        C2964aq c2964aq2;
        C2964aq c2964aq3;
        switch (this.f968u) {
            case 0:
                break;
            default:
                H1.c cVar = (H1.c) this.f967n;
                cVar.stop();
                cVar.f1202w = true;
                h hVar = (h) cVar.f1199n.f644b;
                hVar.f1218c.clear();
                Bitmap bitmap = hVar.f1226l;
                if (bitmap != null) {
                    hVar.f1220e.b(bitmap);
                    hVar.f1226l = null;
                }
                hVar.f1221f = false;
                e eVar = hVar.i;
                p pVar = hVar.f1219d;
                if (eVar != null) {
                    pVar.i(eVar);
                    hVar.i = null;
                }
                e eVar2 = hVar.f1225k;
                if (eVar2 != null) {
                    pVar.i(eVar2);
                    hVar.f1225k = null;
                }
                e eVar3 = hVar.f1227m;
                if (eVar3 != null) {
                    pVar.i(eVar3);
                    hVar.f1227m = null;
                }
                d dVar = hVar.f1216a;
                dVar.f40871l = null;
                byte[] bArr = dVar.i;
                S0.e eVar4 = dVar.f40863c;
                if (bArr != null && (c2964aq3 = (C2964aq) eVar4.f2909v) != null) {
                    c2964aq3.k(bArr);
                }
                int[] iArr = dVar.f40869j;
                if (iArr != null && (c2964aq2 = (C2964aq) eVar4.f2909v) != null) {
                    c2964aq2.k(iArr);
                }
                Bitmap bitmap2 = dVar.f40872m;
                if (bitmap2 != null) {
                    ((InterfaceC5183a) eVar4.f2908u).b(bitmap2);
                }
                dVar.f40872m = null;
                dVar.f40864d = null;
                dVar.f40878s = null;
                byte[] bArr2 = dVar.f40865e;
                if (bArr2 != null && (c2964aq = (C2964aq) eVar4.f2909v) != null) {
                    c2964aq.k(bArr2);
                }
                hVar.f1224j = true;
                break;
        }
    }

    @Override // w1.w
    public final int b() {
        switch (this.f968u) {
            case 0:
                Drawable drawable = this.f967n;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((H1.c) this.f967n).f1199n.f644b;
                d dVar = hVar.f1216a;
                return (dVar.f40869j.length * 4) + dVar.f40864d.limit() + dVar.i.length + hVar.f1228n;
        }
    }

    @Override // w1.w
    public final Class c() {
        switch (this.f968u) {
            case 0:
                return this.f967n.getClass();
            default:
                return H1.c.class;
        }
    }

    @Override // w1.w
    public final Object get() {
        Drawable drawable = this.f967n;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // w1.t
    public void initialize() {
        switch (this.f968u) {
            case 1:
                ((h) ((H1.c) this.f967n).f1199n.f644b).f1226l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f967n;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof H1.c) {
                        ((h) ((H1.c) drawable).f1199n.f644b).f1226l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    private final void d() {
    }
}
