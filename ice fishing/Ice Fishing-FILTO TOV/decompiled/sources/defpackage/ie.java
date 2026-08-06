package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ie implements ScrollCaptureCallback {
    public final zt0 EljAMC1QTz;
    public final d01 GWasM1elztuh;
    public final ug OOA6hdeuvCS;
    public final c90 X1lG3V04pd;
    public final y20 Yi7zF1RB1;
    public final c xqGvceK5x;

    public ie(d01 d01Var, y20 y20Var, ug ugVar, c90 c90Var, c cVar) {
        this.GWasM1elztuh = d01Var;
        this.Yi7zF1RB1 = y20Var;
        this.X1lG3V04pd = c90Var;
        this.xqGvceK5x = cVar;
        this.OOA6hdeuvCS = new ug(ugVar.OOA6hdeuvCS.mOu10nynGul(hm.EljAMC1QTz));
        this.EljAMC1QTz = new zt0(y20Var.xqGvceK5x - y20Var.Yi7zF1RB1, new n91(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r9 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object GWasM1elztuh(ie ieVar, ScrollCaptureSession scrollCaptureSession, y20 y20Var, wg wgVar) {
        he heVar;
        int i;
        qh qhVar;
        int i2;
        int i3;
        XdwzlWIkSDqF xdwzlWIkSDqF;
        gh ghVar;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        y20 y20Var2;
        int i5;
        int encWxUiV2;
        int encWxUiV22;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (wgVar instanceof he) {
            heVar = (he) wgVar;
            int i6 = heVar.uFEq9NpZ;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                heVar.uFEq9NpZ = i6 - Integer.MIN_VALUE;
                Object obj = heVar.E7jCp8Ls;
                i = heVar.uFEq9NpZ;
                qhVar = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    i2 = y20Var.Yi7zF1RB1;
                    i3 = y20Var.xqGvceK5x;
                    zt0 zt0Var = ieVar.EljAMC1QTz;
                    heVar.encWxUiV2 = scrollCaptureSession;
                    heVar.mOu10nynGul = y20Var;
                    heVar.JFJ3QoxA = i2;
                    heVar.rQPn8YBR = i3;
                    heVar.uFEq9NpZ = 1;
                    int i7 = zt0Var.GWasM1elztuh;
                    if (i2 > i3) {
                        o4.OOA6hdeuvCS(mr0.mOu10nynGul("Expected min=", i2, " ≤ max=", i3));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        o4.OOA6hdeuvCS(mr0.mOu10nynGul("Expected range (", i8, ") to be ≤ viewportSize=", i7));
                        return null;
                    }
                    float f = i2;
                    float f2 = zt0Var.X1lG3V04pd;
                    Object obj2 = kc1.GWasM1elztuh;
                    if (f < f2 || i3 > i7 + f2) {
                        Object GWasM1elztuh = zt0Var.GWasM1elztuh((((i8 / 2) + i2) - (i7 / 2)) - f2, heVar);
                        if (GWasM1elztuh != qhVar) {
                            GWasM1elztuh = obj2;
                        }
                        if (GWasM1elztuh == qhVar) {
                            obj2 = GWasM1elztuh;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = heVar.rQPn8YBR;
                        i5 = heVar.JFJ3QoxA;
                        y20Var2 = heVar.mOu10nynGul;
                        scrollCaptureSession2 = m.encWxUiV2(heVar.encWxUiV2);
                        o50.A1EKNP6CxJ(obj);
                        zt0 zt0Var2 = ieVar.EljAMC1QTz;
                        encWxUiV2 = o50.encWxUiV2(i5 - vc0.MZhzXH72(zt0Var2.X1lG3V04pd), 0, zt0Var2.GWasM1elztuh);
                        zt0 zt0Var3 = ieVar.EljAMC1QTz;
                        encWxUiV22 = o50.encWxUiV2(i4 - vc0.MZhzXH72(zt0Var3.X1lG3V04pd), 0, zt0Var3.GWasM1elztuh);
                        int i9 = y20Var2.GWasM1elztuh;
                        int i10 = y20Var2.X1lG3V04pd;
                        if (encWxUiV2 != encWxUiV22) {
                            return y20.OOA6hdeuvCS;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -encWxUiV2);
                            y20 y20Var3 = ieVar.Yi7zF1RB1;
                            lockHardwareCanvas.translate(-y20Var3.GWasM1elztuh, -y20Var3.Yi7zF1RB1);
                            ieVar.xqGvceK5x.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int MZhzXH72 = vc0.MZhzXH72(ieVar.EljAMC1QTz.X1lG3V04pd);
                            return new y20(i9, encWxUiV2 + MZhzXH72, i10, encWxUiV22 + MZhzXH72);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = heVar.rQPn8YBR;
                    int i12 = heVar.JFJ3QoxA;
                    y20 y20Var4 = heVar.mOu10nynGul;
                    ScrollCaptureSession encWxUiV23 = m.encWxUiV2(heVar.encWxUiV2);
                    o50.A1EKNP6CxJ(obj);
                    i2 = i12;
                    y20Var = y20Var4;
                    i3 = i11;
                    scrollCaptureSession = encWxUiV23;
                }
                xdwzlWIkSDqF = XdwzlWIkSDqF.XnEVoBF0td1l;
                heVar.encWxUiV2 = scrollCaptureSession;
                heVar.mOu10nynGul = y20Var;
                heVar.JFJ3QoxA = i2;
                heVar.rQPn8YBR = i3;
                heVar.uFEq9NpZ = 2;
                ghVar = heVar.EljAMC1QTz;
                ghVar.getClass();
                if (o50.jivtDDk9H(ghVar).X1lG3V04pd(xdwzlWIkSDqF, heVar) != qhVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    y20Var2 = y20Var;
                    i5 = i2;
                    zt0 zt0Var22 = ieVar.EljAMC1QTz;
                    encWxUiV2 = o50.encWxUiV2(i5 - vc0.MZhzXH72(zt0Var22.X1lG3V04pd), 0, zt0Var22.GWasM1elztuh);
                    zt0 zt0Var32 = ieVar.EljAMC1QTz;
                    encWxUiV22 = o50.encWxUiV2(i4 - vc0.MZhzXH72(zt0Var32.X1lG3V04pd), 0, zt0Var32.GWasM1elztuh);
                    int i92 = y20Var2.GWasM1elztuh;
                    int i102 = y20Var2.X1lG3V04pd;
                    if (encWxUiV2 != encWxUiV22) {
                    }
                }
                return qhVar;
            }
        }
        heVar = new he(ieVar, wgVar);
        Object obj3 = heVar.E7jCp8Ls;
        i = heVar.uFEq9NpZ;
        qhVar = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        xdwzlWIkSDqF = XdwzlWIkSDqF.XnEVoBF0td1l;
        heVar.encWxUiV2 = scrollCaptureSession;
        heVar.mOu10nynGul = y20Var;
        heVar.JFJ3QoxA = i2;
        heVar.rQPn8YBR = i3;
        heVar.uFEq9NpZ = 2;
        ghVar = heVar.EljAMC1QTz;
        ghVar.getClass();
        if (o50.jivtDDk9H(ghVar).X1lG3V04pd(xdwzlWIkSDqF, heVar) != qhVar) {
        }
        return qhVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        fb1.MZhzXH72(this.OOA6hdeuvCS, hk0.EljAMC1QTz, new xqGvceK5x(this, runnable, null, 8), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final f51 MZhzXH72 = fb1.MZhzXH72(this.OOA6hdeuvCS, null, new i2(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        MZhzXH72.Mjvvu5DE(new NWXxPwoOUSX9(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: je
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                f51.this.GWasM1elztuh(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(l60.pog2g9KITJA(this.Yi7zF1RB1));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.EljAMC1QTz.X1lG3V04pd = 0.0f;
        this.X1lG3V04pd.GWasM1elztuh.setValue(Boolean.TRUE);
        runnable.run();
    }
}
