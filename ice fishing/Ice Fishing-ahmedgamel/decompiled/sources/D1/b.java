package D1;

import F1.e;
import F1.h;
import N1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.gms.internal.ads.C2991bm;
import r1.d;
import u1.u;
import u1.x;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class b implements x, u {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f623n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f624u;

    public b(Drawable drawable, int i) {
        this.f624u = i;
        g.c(drawable, "Argument must not be null");
        this.f623n = drawable;
    }

    @Override // u1.x
    public final void a() {
        C2941aq c2941aq;
        C2941aq c2941aq2;
        C2941aq c2941aq3;
        switch (this.f624u) {
            case 0:
                break;
            default:
                F1.c cVar = (F1.c) this.f623n;
                cVar.stop();
                cVar.f917w = true;
                h hVar = (h) cVar.f914n.f664b;
                hVar.f933c.clear();
                Bitmap bitmap = hVar.f941l;
                if (bitmap != null) {
                    hVar.f935e.d(bitmap);
                    hVar.f941l = null;
                }
                hVar.f936f = false;
                e eVar = hVar.i;
                p pVar = hVar.f934d;
                if (eVar != null) {
                    pVar.i(eVar);
                    hVar.i = null;
                }
                e eVar2 = hVar.f940k;
                if (eVar2 != null) {
                    pVar.i(eVar2);
                    hVar.f940k = null;
                }
                e eVar3 = hVar.f942m;
                if (eVar3 != null) {
                    pVar.i(eVar3);
                    hVar.f942m = null;
                }
                d dVar = hVar.f931a;
                dVar.f40367l = null;
                byte[] bArr = dVar.i;
                C2991bm c2991bm = dVar.f40359c;
                if (bArr != null && (c2941aq3 = (C2941aq) c2991bm.f29324v) != null) {
                    c2941aq3.k(bArr);
                }
                int[] iArr = dVar.f40365j;
                if (iArr != null && (c2941aq2 = (C2941aq) c2991bm.f29324v) != null) {
                    c2941aq2.k(iArr);
                }
                Bitmap bitmap2 = dVar.f40368m;
                if (bitmap2 != null) {
                    ((InterfaceC5104a) c2991bm.f29323u).d(bitmap2);
                }
                dVar.f40368m = null;
                dVar.f40360d = null;
                dVar.f40374s = null;
                byte[] bArr2 = dVar.f40361e;
                if (bArr2 != null && (c2941aq = (C2941aq) c2991bm.f29324v) != null) {
                    c2941aq.k(bArr2);
                }
                hVar.f939j = true;
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        switch (this.f624u) {
            case 0:
                Drawable drawable = this.f623n;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((F1.c) this.f623n).f914n.f664b;
                d dVar = hVar.f931a;
                return (dVar.f40365j.length * 4) + dVar.f40360d.limit() + dVar.i.length + hVar.f943n;
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f624u) {
            case 0:
                return this.f623n.getClass();
            default:
                return F1.c.class;
        }
    }

    @Override // u1.x
    public final Object get() {
        Drawable drawable = this.f623n;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // u1.u
    public void initialize() {
        switch (this.f624u) {
            case 1:
                ((h) ((F1.c) this.f623n).f914n.f664b).f941l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f623n;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof F1.c) {
                        ((h) ((F1.c) drawable).f914n.f664b).f941l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    private final void b() {
    }
}
