package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sp5 implements ScrollCaptureCallback {
    public final qfp a;
    public final aqe b;
    public final fc6 c;
    public final AndroidComposeView d;
    public final tf6 e;
    public final f3e f;

    public sp5(qfp qfpVar, aqe aqeVar, tf6 tf6Var, fc6 fc6Var, AndroidComposeView androidComposeView) {
        this.a = qfpVar;
        this.b = aqeVar;
        this.c = fc6Var;
        this.d = androidComposeView;
        this.e = gld.X(tf6Var, r48.a);
        this.f = new f3e(aqeVar.d - aqeVar.b, new rp5(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r4 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sp5 sp5Var, ScrollCaptureSession scrollCaptureSession, aqe aqeVar, cg6 cg6Var) {
        qp5 qp5Var;
        nm6 nm6Var;
        int i;
        int i2;
        int i3;
        Object b;
        gx3 gx3Var;
        sp5 sp5Var2;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        int i5;
        int d;
        int d2;
        if (cg6Var instanceof qp5) {
            qp5Var = (qp5) cg6Var;
            int i6 = qp5Var.q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                qp5Var.q = i6 - Integer.MIN_VALUE;
                Object obj = qp5Var.o;
                nm6Var = nm6.a;
                i = qp5Var.q;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = aqeVar.b;
                    i3 = aqeVar.d;
                    f3e f3eVar = sp5Var.f;
                    qp5Var.j = sp5Var;
                    qp5Var.k = scrollCaptureSession;
                    qp5Var.l = aqeVar;
                    qp5Var.m = i2;
                    qp5Var.n = i3;
                    qp5Var.q = 1;
                    int i7 = f3eVar.a;
                    if (i2 > i3) {
                        xq0.o(f1d.e(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        xq0.o(f1d.e(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = f3eVar.b;
                    if (f < f2 || i3 > i7 + f2) {
                        b = f3eVar.b((f < f2 ? i2 : i3 - i7) - f2, qp5Var);
                        if (b != nm6Var) {
                            b = Unit.a;
                        }
                        if (b != nm6Var) {
                            b = Unit.a;
                        }
                    } else {
                        b = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = qp5Var.n;
                        i4 = qp5Var.m;
                        aqeVar = qp5Var.l;
                        scrollCaptureSession2 = (ScrollCaptureSession) qp5Var.k;
                        sp5Var2 = qp5Var.j;
                        qgg.h0(obj);
                        f3e f3eVar2 = sp5Var2.f;
                        d = yhn.d(i4 - eeh.b(f3eVar2.b), 0, f3eVar2.a);
                        f3e f3eVar3 = sp5Var2.f;
                        d2 = yhn.d(i5 - eeh.b(f3eVar3.b), 0, f3eVar3.a);
                        int i9 = aqeVar.a;
                        int i10 = aqeVar.c;
                        if (d != d2) {
                            return aqe.e;
                        }
                        Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -d);
                            aqe aqeVar2 = sp5Var2.b;
                            lockHardwareCanvas.translate(-aqeVar2.a, -aqeVar2.b);
                            sp5Var2.d.getRootView().draw(lockHardwareCanvas);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            int b2 = eeh.b(sp5Var2.f.b);
                            return new aqe(i9, d + b2, i10, d2 + b2);
                        } catch (Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = qp5Var.n;
                    int i12 = qp5Var.m;
                    aqeVar = qp5Var.l;
                    ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) qp5Var.k;
                    sp5 sp5Var3 = qp5Var.j;
                    qgg.h0(obj);
                    i2 = i12;
                    scrollCaptureSession = scrollCaptureSession3;
                    i3 = i11;
                    sp5Var = sp5Var3;
                }
                gx3Var = gx3.K;
                qp5Var.j = sp5Var;
                qp5Var.k = scrollCaptureSession;
                qp5Var.l = aqeVar;
                qp5Var.m = i2;
                qp5Var.n = i3;
                qp5Var.q = 2;
                if (bzf.D(qp5Var.getContext()).P(gx3Var, qp5Var) != nm6Var) {
                    sp5Var2 = sp5Var;
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i2;
                    i5 = i3;
                    f3e f3eVar22 = sp5Var2.f;
                    d = yhn.d(i4 - eeh.b(f3eVar22.b), 0, f3eVar22.a);
                    f3e f3eVar32 = sp5Var2.f;
                    d2 = yhn.d(i5 - eeh.b(f3eVar32.b), 0, f3eVar32.a);
                    int i92 = aqeVar.a;
                    int i102 = aqeVar.c;
                    if (d != d2) {
                    }
                }
                return nm6Var;
            }
        }
        qp5Var = new qp5(sp5Var, cg6Var);
        Object obj2 = qp5Var.o;
        nm6Var = nm6.a;
        i = qp5Var.q;
        if (i != 0) {
        }
        gx3Var = gx3.K;
        qp5Var.j = sp5Var;
        qp5Var.k = scrollCaptureSession;
        qp5Var.l = aqeVar;
        qp5Var.m = i2;
        qp5Var.n = i3;
        qp5Var.q = 2;
        if (bzf.D(qp5Var.getContext()).P(gx3Var, qp5Var) != nm6Var) {
        }
        return nm6Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        x97.y(this.e, l8j.c, null, new vv4(this, runnable, (Continuation) null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        rar y = x97.y(this.e, null, null, new v3(this, scrollCaptureSession, rect, consumer, (Continuation) null, 23), 3);
        y.R(new up5(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new tp5(0, y));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(uwf.C(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((x6k) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
