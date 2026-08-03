package i1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import f1.o;
import f1.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: q, reason: collision with root package name */
    public static final l f3104q = new l(0);

    /* renamed from: g, reason: collision with root package name */
    public final j1.a f3105g;

    /* renamed from: h, reason: collision with root package name */
    public final p f3106h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.b f3107i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3108j;

    /* renamed from: k, reason: collision with root package name */
    public Outline f3109k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3110l;

    /* renamed from: m, reason: collision with root package name */
    public s2.c f3111m;

    /* renamed from: n, reason: collision with root package name */
    public s2.l f3112n;

    /* renamed from: o, reason: collision with root package name */
    public oc.c f3113o;

    /* renamed from: p, reason: collision with root package name */
    public b f3114p;

    public m(j1.a aVar, p pVar, h1.b bVar) {
        super(aVar.getContext());
        this.f3105g = aVar;
        this.f3106h = pVar;
        this.f3107i = bVar;
        setOutlineProvider(f3104q);
        this.f3110l = true;
        this.f3111m = h1.c.f2599a;
        this.f3112n = s2.l.f6396g;
        d.f3036a.getClass();
        this.f3113o = a.f3009i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p pVar = this.f3106h;
        f1.b bVar = pVar.f2276a;
        Canvas canvas2 = bVar.f2214a;
        bVar.f2214a = canvas;
        s2.c cVar = this.f3111m;
        s2.l lVar = this.f3112n;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.f3114p;
        oc.c cVar2 = this.f3113o;
        h1.b bVar3 = this.f3107i;
        a5.c cVar3 = bVar3.f2596h;
        h1.a aVar = ((h1.b) cVar3.f263i).f2595g;
        s2.c cVar4 = aVar.f2591a;
        s2.l lVar2 = aVar.f2592b;
        o t3 = cVar3.t();
        a5.c cVar5 = bVar3.f2596h;
        long x10 = cVar5.x();
        b bVar4 = (b) cVar5.f261g;
        cVar5.N(cVar);
        cVar5.P(lVar);
        cVar5.M(bVar);
        cVar5.Q(floatToRawIntBits);
        cVar5.f261g = bVar2;
        bVar.k();
        try {
            cVar2.invoke(bVar3);
            bVar.g();
            cVar5.N(cVar4);
            cVar5.P(lVar2);
            cVar5.M(t3);
            cVar5.Q(x10);
            cVar5.f261g = bVar4;
            pVar.f2276a.f2214a = canvas2;
            this.f3108j = false;
        } catch (Throwable th) {
            bVar.g();
            cVar5.N(cVar4);
            cVar5.P(lVar2);
            cVar5.M(t3);
            cVar5.Q(x10);
            cVar5.f261g = bVar4;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f3110l;
    }

    public final p getCanvasHolder() {
        return this.f3106h;
    }

    public final View getOwnerView() {
        return this.f3105g;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f3110l;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f3108j) {
            return;
        }
        this.f3108j = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f3110l != z10) {
            this.f3110l = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f3108j = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
