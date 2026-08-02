package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.VisibleRegionUtils;
import java.util.Collection;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.map_common.map.process.a;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes8.dex */
public final /* synthetic */ class v65 implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v65(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hr7
    public final void h(final CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                x65 x65Var = (x65) obj;
                if (cameraUpdateReason != CameraUpdateReason.APPLICATION) {
                    x65Var.c = null;
                    x65Var.b(!z);
                    break;
                } else {
                    Point point = x65Var.c;
                    gh00 gh00Var = (gh00) x65Var.b;
                    Point target = gh00Var.e.d.getTarget();
                    if (!z) {
                        if (point != target) {
                            x65Var.c = target;
                            if (gh00Var.f(cameraPosition.getTarget(), target) > x65Var.g) {
                                x65Var.b(true);
                                break;
                            }
                        }
                    } else {
                        x65Var.c = null;
                        x65Var.b(false);
                        break;
                    }
                }
                break;
            case 1:
                ((tls) obj).invoke(cameraPosition);
                break;
            case 2:
                b bVar = (b) obj;
                if (z && bVar.q) {
                    bVar.h();
                    bVar.q = false;
                }
                if (!z && bVar.r && !bVar.s && cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    bVar.s = true;
                    bVar.e();
                    break;
                }
                break;
            case 3:
                final a4e0 a4e0Var = (a4e0) obj;
                if (z) {
                    mbp0 mbp0Var = a4e0Var.w;
                    xm00 xm00Var = a4e0Var.x;
                    if (!xm00Var.n().isEmpty()) {
                        CameraPosition cameraPosition2 = a4e0Var.z;
                        if (!jl40.j(cameraPosition2 != null ? Float.valueOf(cameraPosition2.getZoom()) : null, cameraPosition.getZoom())) {
                            a4e0Var.z = cameraPosition;
                            a.b(mbp0Var, xm00Var.n(), 100, new tls() { // from class: z3e0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i4 = i3;
                                    zy11 zy11Var = zy11.a;
                                    a4e0 a4e0Var2 = a4e0Var;
                                    CameraPosition cameraPosition3 = cameraPosition;
                                    Collection collection = (Collection) obj2;
                                    switch (i4) {
                                        case 0:
                                            d0a1.d(collection, cameraPosition3.getZoom(), VisibleRegionUtils.getBounds(((gh00) ((ah00) a4e0Var2.b)).e.f()));
                                            break;
                                        default:
                                            d0a1.c(collection, cameraPosition3.getZoom(), VisibleRegionUtils.getBounds(((gh00) ((ah00) a4e0Var2.b)).e.f()));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            a.b(mbp0Var, a4e0Var.y.n(), 50, new tls() { // from class: z3e0
                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    int i4 = i2;
                                    zy11 zy11Var = zy11.a;
                                    a4e0 a4e0Var2 = a4e0Var;
                                    CameraPosition cameraPosition3 = cameraPosition;
                                    Collection collection = (Collection) obj2;
                                    switch (i4) {
                                        case 0:
                                            d0a1.d(collection, cameraPosition3.getZoom(), VisibleRegionUtils.getBounds(((gh00) ((ah00) a4e0Var2.b)).e.f()));
                                            break;
                                        default:
                                            d0a1.c(collection, cameraPosition3.getZoom(), VisibleRegionUtils.getBounds(((gh00) ((ah00) a4e0Var2.b)).e.f()));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            });
                            break;
                        }
                    }
                }
                break;
            default:
                i iVar = (i) obj;
                if (!z) {
                    iVar.x.a(cameraPosition);
                    break;
                } else {
                    iVar.Hg(cameraPosition);
                    break;
                }
        }
    }
}
