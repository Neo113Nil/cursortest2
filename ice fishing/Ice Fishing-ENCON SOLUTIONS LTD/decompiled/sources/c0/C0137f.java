package c0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2643a;

    public C0137f() {
        C1.a.m(3, "verificationMode");
        this.f2643a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC0132a.b(sidecarDeviceState) != AbstractC0132a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0132a.c(sidecarWindowLayoutInfo), AbstractC0132a.c(sidecarWindowLayoutInfo2));
    }

    public final Z.j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.i.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new Z.j(r.f3416a);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        AbstractC0132a.d(sidecarDeviceState, AbstractC0132a.b(state));
        return new Z.j(f(AbstractC0132a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z.c g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z.c g(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        Z.b bVar;
        Z.b bVar2;
        kotlin.jvm.internal.i.e(feature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) W.a.a(this.f2643a, feature).d("Type must be either TYPE_FOLD or TYPE_HINGE", C0133b.f2639e).d("Feature bounds must not be 0", C0134c.f2640e).d("TYPE_FOLD must have 0 area", C0135d.f2641e).d("Feature be pinned to either left or top", C0136e.f2642e).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = Z.b.f1926g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = Z.b.f1927h;
        }
        int b2 = AbstractC0132a.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                bVar2 = Z.b.f1924e;
                if (b2 != 3) {
                }
            } else {
                bVar2 = Z.b.f1925f;
            }
            Rect rect = feature.getRect();
            kotlin.jvm.internal.i.d(rect, "feature.rect");
            return new Z.c(new W.b(rect), bVar, bVar2);
        }
        return null;
    }
}
