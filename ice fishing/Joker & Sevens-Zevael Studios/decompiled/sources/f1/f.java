package f1;

import android.content.Context;
import android.os.Build;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2242f = true;

    /* renamed from: a, reason: collision with root package name */
    public final y1.r f2243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2244b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public j1.b f2245c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2246d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2247e;

    public f(y1.r rVar) {
        this.f2243a = rVar;
        d dVar = new d(this);
        this.f2247e = dVar;
        if (rVar.isAttachedToWindow()) {
            Context context = rVar.getContext();
            if (!this.f2246d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.f2246d = true;
            }
        }
        rVar.addOnAttachStateChangeListener(new e(0, this));
    }

    @Override // f1.u
    public final void a(i1.b bVar) {
        synchronized (this.f2244b) {
            if (!bVar.f3029s) {
                bVar.f3029s = true;
                bVar.b();
            }
        }
    }

    @Override // f1.u
    public final i1.b b() {
        i1.d iVar;
        i1.b bVar;
        synchronized (this.f2244b) {
            try {
                y1.r rVar = this.f2243a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    rVar.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    iVar = new i1.g();
                } else if (f2242f) {
                    try {
                        iVar = new i1.e(this.f2243a, new p(), new h1.b());
                    } catch (Throwable unused) {
                        f2242f = false;
                        iVar = new i1.i(c(this.f2243a));
                    }
                } else {
                    iVar = new i1.i(c(this.f2243a));
                }
                bVar = new i1.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final j1.a c(y1.r rVar) {
        j1.b bVar = this.f2245c;
        if (bVar != null) {
            return bVar;
        }
        j1.b bVar2 = new j1.b(rVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        rVar.addView(bVar2, -1);
        this.f2245c = bVar2;
        return bVar2;
    }
}
