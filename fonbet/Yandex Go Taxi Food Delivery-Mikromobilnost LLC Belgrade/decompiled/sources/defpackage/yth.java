package defpackage;

import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class yth {
    public final n6w0 a;
    public final dvi b;
    public final dr00 c;
    public final ah00 d;
    public final xth e = new xth(0, this);

    public yth(n6w0 n6w0Var, dvi dviVar, dr00 dr00Var, ah00 ah00Var) {
        this.a = n6w0Var;
        this.b = dviVar;
        this.c = dr00Var;
        this.d = ah00Var;
    }

    public final void a(boolean z) {
        r0 r0Var = this.b.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        fi6 fi6Var = new fi6();
        n6w0 n6w0Var = this.a;
        fi6Var.e(n6w0Var.a());
        if (fi6Var.i()) {
            return;
        }
        BoundingBox g = fi6Var.g();
        wth wthVar = n6w0Var.a().size() == 1 ? new wth(0) : null;
        dr00 dr00Var = this.c;
        if (wthVar != null) {
            ((fr00) dr00Var).a(g, z, wthVar);
        } else {
            ((fr00) dr00Var).a(g, z, null);
        }
    }

    public final void b(DeliveryTrackingModalView deliveryTrackingModalView, ScreenRect screenRect) {
        gh00 gh00Var = (gh00) this.d;
        gh00Var.a.g(deliveryTrackingModalView, screenRect, false, 200L);
        if (((Boolean) this.b.a.getValue()).booleanValue()) {
            fi6 fi6Var = new fi6();
            n6w0 n6w0Var = this.a;
            fi6Var.e(n6w0Var.a());
            if (fi6Var.i()) {
                return;
            }
            BoundingBox g = fi6Var.g();
            wth wthVar = n6w0Var.a().size() == 1 ? new wth(0) : null;
            gh00Var.g.g(g, null, 400.0f, wthVar != null ? new yu0(6, wthVar) : null);
        }
    }
}
