package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.concurrent.futures.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;

/* loaded from: classes15.dex */
public final /* synthetic */ class z50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ z50(xd51 xd51Var, zj41 zj41Var, int i, String str) {
        this.a = 14;
        this.c = xd51Var;
        this.w = zj41Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((a60) this.c).e(this.b, (Intent) this.w);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            case 1:
                ((uo7) this.c).c(this.b, (xo7) this.w);
                return;
            case 2:
                ((uo7) this.c).b(this.b, (ap7) this.w);
                return;
            case 3:
                CostCenterFieldsModalView.bindSelectView$lambda$0((CostCenterFieldsModalView) this.c, (jwe) this.w, this.b);
                return;
            case 4:
                ((qef0) ((pbj) this.c).x).c(this.b, this.w);
                return;
            case 5:
                mmm mmmVar = (mmm) this.c;
                ((nmm) this.w).onDrmSessionAcquired(mmmVar.a, mmmVar.b, this.b);
                return;
            case 6:
                no6 no6Var = (no6) this.c;
                final b bVar = (b) this.w;
                final int i = this.b;
                androidx.camera.camera2.internal.b bVar2 = (androidx.camera.camera2.internal.b) no6Var.b;
                if (!no6Var.a) {
                    hvo hvoVar = (hvo) no6Var.c;
                    synchronized (hvoVar.a) {
                        hvoVar.c = 0;
                    }
                    bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                no6Var.c();
                d6z.y("mRunningCompleter should be null when starting set a new exposure compensation value", ((b) no6Var.x) == null);
                d6z.y("mRunningCaptureResultListener should be null when starting set a new exposure compensation value", ((fvo) no6Var.y) == null);
                im7 im7Var = new im7() { // from class: fvo
                    @Override // defpackage.im7
                    public final boolean b(TotalCaptureResult totalCaptureResult) {
                        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                        int i2 = i;
                        b bVar3 = bVar;
                        if (num == null || num2 == null) {
                            if (num2 == null || num2.intValue() != i2) {
                                return false;
                            }
                            bVar3.b(Integer.valueOf(i2));
                            return true;
                        }
                        int intValue = num.intValue();
                        if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i2) {
                            return false;
                        }
                        bVar3.b(Integer.valueOf(i2));
                        return true;
                    }
                };
                no6Var.y = im7Var;
                no6Var.x = bVar;
                bVar2.r(im7Var);
                bVar2.F();
                return;
            case 7:
                t3r t3rVar = (t3r) this.c;
                RecyclerView recyclerView = (RecyclerView) this.w;
                int i2 = this.b + 1;
                if (!recyclerView.isComputingLayout() && recyclerView.getScrollState() == 0) {
                    recyclerView.invalidateItemDecorations();
                    return;
                } else {
                    if (i2 < 3) {
                        recyclerView.post(new z50(t3rVar, recyclerView, i2, 7));
                        return;
                    }
                    return;
                }
            case 8:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i3 = this.b;
                ruy ruyVar = (ruy) this.w;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    tuy tuyVar = (tuy) it.next();
                    if (!tuyVar.d) {
                        if (i3 != -1) {
                            tuyVar.b.a(i3);
                        }
                        tuyVar.c = true;
                        ruyVar.invoke(tuyVar.a);
                    }
                }
                return;
            case 9:
                fg10 fg10Var = (fg10) this.c;
                Pair pair = (Pair) this.w;
                ((j5h) fg10Var.b.h).onDrmSessionAcquired(((Integer) pair.first).intValue(), (sf10) pair.second, this.b);
                return;
            case 10:
                MtCollapsedRoutesView.renderRoutesState$lambda$0$2((MtCollapsedRoutesView) this.c, (igl0) this.w, this.b);
                return;
            case 11:
                ((au50) this.c).c(this.b, this.w);
                return;
            case 12:
                njp0 njp0Var = (njp0) this.c;
                int i4 = this.b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.w;
                njp0Var.a = i4;
                linearLayoutManager.v(njp0Var);
                return;
            case 13:
                ((ryz0) this.c).a(this.b, (b) this.w);
                return;
            case 14:
                xd51 xd51Var = (xd51) this.c;
                zj41 zj41Var = (zj41) this.w;
                int i5 = this.b;
                if (xd51Var.x) {
                    return;
                }
                je51 je51Var = xd51Var.a;
                Handler handler = xd51Var.w;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                if (zj41Var != xd51Var.A || i5 != 4401) {
                    if (zj41Var == xd51Var.C) {
                        handler.removeCallbacksAndMessages(xd51Var.c);
                        xd51Var.C = null;
                        je51Var.b(zj41Var);
                        if (je51Var.a()) {
                            xd51Var.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                handler.removeCallbacksAndMessages(xd51Var.b);
                y1k0 y1k0Var = xd51Var.y;
                if (y1k0Var != null) {
                    y1k0Var.close();
                }
                xd51Var.y = null;
                xd51Var.A = null;
                xd51Var.B = 0;
                z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
                z83.c(null, je51Var.i);
                c820 c820Var = je51Var.a;
                je51 je51Var2 = c820Var.A;
                n420 n420Var = c820Var.a;
                z83.g(null, c820Var.w.getLooper(), Looper.myLooper());
                z83.c(null, c820Var.F);
                bn3 bn3Var = c820Var.D;
                if (bn3Var == null) {
                    return;
                }
                if (!bn3Var.l() || c820Var.E) {
                    de51 de51Var = (de51) c820Var.G.h;
                    z83.g(null, de51Var.d, Looper.myLooper());
                    de51Var.a.edit().remove("xiva_secret_user").remove("xiva_secret_sign").remove("xiva_secret_ts").apply();
                    if (n420Var.g()) {
                        je51Var2.e();
                    }
                } else {
                    c820Var.E = true;
                    if (n420Var.g()) {
                        je51Var2.e();
                    }
                }
                if (n420Var.g()) {
                    je51Var2.e();
                    return;
                }
                return;
            default:
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.c;
                int i6 = this.b;
                ov71 ov71Var = (ov71) this.w;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    x181 x181Var = (x181) it2.next();
                    if (!x181Var.d) {
                        if (i6 != -1) {
                            x181Var.b.b(i6);
                        }
                        x181Var.c = true;
                        ov71Var.invoke(x181Var.a);
                    }
                }
                return;
        }
    }

    public /* synthetic */ z50(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
    }

    public /* synthetic */ z50(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
