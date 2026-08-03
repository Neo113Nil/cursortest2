package d2;

import ac.o;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import bc.a0;
import e2.n;
import f1.d0;
import java.util.function.Consumer;
import m0.z;
import y1.r;
import yc.n1;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final n f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.j f1636b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1637c;

    /* renamed from: d, reason: collision with root package name */
    public final r f1638d;

    /* renamed from: e, reason: collision with root package name */
    public final dd.e f1639e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1640f;

    public d(n nVar, s2.j jVar, dd.e eVar, j jVar2, r rVar) {
        this.f1635a = nVar;
        this.f1636b = jVar;
        this.f1637c = jVar2;
        this.f1638d = rVar;
        this.f1639e = new dd.e(eVar.f1851g.d(f.f1642g));
        this.f1640f = new h(jVar.f6394d - jVar.f6392b, new c(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, ScrollCaptureSession scrollCaptureSession, s2.j jVar, hc.c cVar) {
        a aVar;
        int i10;
        gc.a aVar2;
        int i11;
        int i12;
        b bVar;
        ScrollCaptureSession scrollCaptureSession2;
        int i13;
        s2.j jVar2;
        int i14;
        int h10;
        int h11;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i15 = aVar.f1627m;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f1627m = i15 - Integer.MIN_VALUE;
                Object obj = aVar.f1625k;
                i10 = aVar.f1627m;
                aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    i11 = jVar.f6392b;
                    i12 = jVar.f6394d;
                    h hVar = dVar.f1640f;
                    aVar.f1621g = scrollCaptureSession;
                    aVar.f1622h = jVar;
                    aVar.f1623i = i11;
                    aVar.f1624j = i12;
                    aVar.f1627m = 1;
                    int i16 = hVar.f1646a;
                    if (i11 > i12) {
                        throw new IllegalArgumentException(a4.d.f(i11, i12, "Expected min=", " ≤ max=").toString());
                    }
                    int i17 = i12 - i11;
                    if (i17 > i16) {
                        throw new IllegalArgumentException(a4.d.f(i17, i16, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f10 = i11;
                    float f11 = hVar.f1648c;
                    Object obj2 = o.f277a;
                    if (f10 < f11 || i12 > i16 + f11) {
                        Object a6 = hVar.a((f10 < f11 ? i11 : i12 - i16) - f11, aVar);
                        if (a6 != aVar2) {
                            a6 = obj2;
                        }
                        if (a6 == aVar2) {
                            obj2 = a6;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = aVar.f1624j;
                        i14 = aVar.f1623i;
                        jVar2 = aVar.f1622h;
                        scrollCaptureSession2 = a1.c.g(aVar.f1621g);
                        v6.a.W(obj);
                        h hVar2 = dVar.f1640f;
                        h10 = uc.e.h(i14 - a0.I(hVar2.f1648c), 0, hVar2.f1646a);
                        h hVar3 = dVar.f1640f;
                        h11 = uc.e.h(i13 - a0.I(hVar3.f1648c), 0, hVar3.f1646a);
                        int i18 = jVar2.f6391a;
                        int i19 = jVar2.f6393c;
                        if (h10 != h11) {
                            return s2.j.f6390e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i18, -h10);
                            s2.j jVar3 = dVar.f1636b;
                            lockHardwareCanvas.translate(-jVar3.f6391a, -jVar3.f6392b);
                            dVar.f1638d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int I = a0.I(dVar.f1640f.f1648c);
                            return new s2.j(i18, h10 + I, i19, h11 + I);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i20 = aVar.f1624j;
                    int i21 = aVar.f1623i;
                    s2.j jVar4 = aVar.f1622h;
                    ScrollCaptureSession g8 = a1.c.g(aVar.f1621g);
                    v6.a.W(obj);
                    i11 = i21;
                    jVar = jVar4;
                    i12 = i20;
                    scrollCaptureSession = g8;
                }
                bVar = b.f1628h;
                aVar.f1621g = scrollCaptureSession;
                aVar.f1622h = jVar;
                aVar.f1623i = i11;
                aVar.f1624j = i12;
                aVar.f1627m = 2;
                if (z.p(aVar.getContext()).l(bVar, aVar) != aVar2) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i13 = i12;
                    jVar2 = jVar;
                    i14 = i11;
                    h hVar22 = dVar.f1640f;
                    h10 = uc.e.h(i14 - a0.I(hVar22.f1648c), 0, hVar22.f1646a);
                    h hVar32 = dVar.f1640f;
                    h11 = uc.e.h(i13 - a0.I(hVar32.f1648c), 0, hVar32.f1646a);
                    int i182 = jVar2.f6391a;
                    int i192 = jVar2.f6393c;
                    if (h10 != h11) {
                    }
                }
                return aVar2;
            }
        }
        aVar = new a(dVar, cVar);
        Object obj3 = aVar.f1625k;
        i10 = aVar.f1627m;
        aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        bVar = b.f1628h;
        aVar.f1621g = scrollCaptureSession;
        aVar.f1622h = jVar;
        aVar.f1623i = i11;
        aVar.f1624j = i12;
        aVar.f1627m = 2;
        if (z.p(aVar.getContext()).l(bVar, aVar) != aVar2) {
        }
        return aVar2;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        yc.a0.q(this.f1639e, n1.f8880h, new c0.d(this, runnable, null, 2), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final r1 q10 = yc.a0.q(this.f1639e, null, new bd.o(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        q10.k(new a0.a0(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: d2.e
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                r1.this.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(d0.r(this.f1636b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f1640f.f1648c = 0.0f;
        this.f1637c.f1649a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
