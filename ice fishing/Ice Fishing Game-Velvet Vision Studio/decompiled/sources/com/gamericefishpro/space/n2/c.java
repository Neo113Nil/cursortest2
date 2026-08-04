package com.gamericefishpro.space.n2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.c3.j;
import com.gamericefishpro.space.g5.y;
import com.gamericefishpro.space.i2.l1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.o2.o;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.o1;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.q0.u0;
import java.util.function.Consumer;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {
    public final o a;
    public final j b;
    public final l1 c;
    public final t d;
    public final com.gamericefishpro.space.ui.c e;
    public final g f;

    public c(o oVar, j jVar, com.gamericefishpro.space.ui.c cVar, l1 l1Var, t tVar) {
        this.a = oVar;
        this.b = jVar;
        this.c = l1Var;
        this.d = tVar;
        this.e = new com.gamericefishpro.space.ui.c(cVar.d.o(e.d));
        this.f = new g(jVar.d - jVar.b, new u0(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r4 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ScrollCaptureSession scrollCaptureSession, j jVar, com.gamericefishpro.space.vh.c cVar2) {
        a aVar;
        int i;
        int i2;
        Object objA;
        ScrollCaptureSession scrollCaptureSessionJ;
        int i3;
        j jVar2;
        int i4;
        b bVar;
        j jVar3;
        ScrollCaptureSession scrollCaptureSessionJ2;
        int iC;
        int iC2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i7 = aVar.z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.z = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object obj = aVar.w;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i8 = aVar.z;
        if (i8 != 0) {
            if (i8 == 1) {
                int i9 = aVar.v;
                int i10 = aVar.i;
                j jVar4 = aVar.e;
                ScrollCaptureSession scrollCaptureSessionJ3 = com.gamericefishpro.space.a4.b.j(aVar.d);
                com.gamericefishpro.space.wa.b.P(obj);
                i = i10;
                jVar = jVar4;
                i2 = i9;
                scrollCaptureSession = scrollCaptureSessionJ3;
            } else {
                if (i8 == 2) {
                    i3 = aVar.v;
                    i4 = aVar.i;
                    jVar2 = aVar.e;
                    scrollCaptureSessionJ = com.gamericefishpro.space.a4.b.j(aVar.d);
                    com.gamericefishpro.space.wa.b.P(obj);
                    bVar = b.e;
                    aVar.d = scrollCaptureSessionJ;
                    aVar.e = jVar2;
                    aVar.i = i4;
                    aVar.v = i3;
                    aVar.z = 3;
                    if (com.gamericefishpro.space.t0.i.s(aVar.getContext()).E(bVar, aVar) != aVar2) {
                        jVar3 = jVar2;
                        scrollCaptureSessionJ2 = scrollCaptureSessionJ;
                    }
                    return aVar2;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = aVar.v;
                i4 = aVar.i;
                jVar3 = aVar.e;
                scrollCaptureSessionJ2 = com.gamericefishpro.space.a4.b.j(aVar.d);
                com.gamericefishpro.space.wa.b.P(obj);
            }
            g gVar = cVar.f;
            iC = com.gamericefishpro.space.ji.f.c(i4 - com.gamericefishpro.space.gi.c.a(gVar.c), 0, gVar.a);
            g gVar2 = cVar.f;
            iC2 = com.gamericefishpro.space.ji.f.c(i3 - com.gamericefishpro.space.gi.c.a(gVar2.c), 0, gVar2.a);
            i5 = jVar3.a;
            i6 = jVar3.c;
            if (iC == iC2) {
                return j.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionJ2.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i5, -iC);
                j jVar5 = cVar.b;
                canvasLockHardwareCanvas.translate(-jVar5.a, -jVar5.b);
                cVar.d.getRootView().draw(canvasLockHardwareCanvas);
                int iA = com.gamericefishpro.space.gi.c.a(cVar.f.c);
                return new j(i5, iC + iA, i6, iC2 + iA);
            } finally {
                scrollCaptureSessionJ2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        com.gamericefishpro.space.wa.b.P(obj);
        i = jVar.b;
        i2 = jVar.d;
        g gVar3 = cVar.f;
        aVar.d = scrollCaptureSession;
        aVar.e = jVar;
        aVar.i = i;
        aVar.v = i2;
        aVar.z = 1;
        int i11 = gVar3.a;
        if (i > i2) {
            throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
        }
        int i12 = i2 - i;
        if (i12 > i11) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + i11).toString());
        }
        float f = i;
        float f2 = gVar3.c;
        if (f < f2 || i2 > i11 + f2) {
            objA = gVar3.a((((i12 / 2) + i) - (i11 / 2)) - f2, aVar);
            if (objA != aVar2) {
                objA = Unit.a;
            }
            if (objA != aVar2) {
                objA = Unit.a;
            }
        } else {
            objA = Unit.a;
        }
        scrollCaptureSessionJ = scrollCaptureSession;
        i3 = i2;
        jVar2 = jVar;
        i4 = i;
        bVar = b.e;
        aVar.d = scrollCaptureSessionJ;
        aVar.e = jVar2;
        aVar.i = i4;
        aVar.v = i3;
        aVar.z = 3;
        if (com.gamericefishpro.space.t0.i.s(aVar.getContext()).E(bVar, aVar) != aVar2) {
            jVar3 = jVar2;
            scrollCaptureSessionJ2 = scrollCaptureSessionJ;
            g gVar4 = cVar.f;
            iC = com.gamericefishpro.space.ji.f.c(i4 - com.gamericefishpro.space.gi.c.a(gVar4.c), 0, gVar4.a);
            g gVar5 = cVar.f;
            iC2 = com.gamericefishpro.space.ji.f.c(i3 - com.gamericefishpro.space.gi.c.a(gVar5.c), 0, gVar5.a);
            i5 = jVar3.a;
            i6 = jVar3.c;
            if (iC == iC2) {
                return j.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionJ2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iC);
            j jVar6 = cVar.b;
            canvasLockHardwareCanvas.translate(-jVar6.a, -jVar6.b);
            cVar.d.getRootView().draw(canvasLockHardwareCanvas);
            int iA2 = com.gamericefishpro.space.gi.c.a(cVar.f.c);
            return new j(i5, iC + iA2, i6, iC2 + iA2);
        }
        return aVar2;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        a0.u(this.e, o1.e, new com.gamericefishpro.space.b0.o(this, runnable, null, 15), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final s1 s1VarU = a0.u(this.e, null, new y(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        s1VarU.n(new d0(18, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: com.gamericefishpro.space.n2.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                s1VarU.c(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(com.gamericefishpro.space.o1.o.w(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
