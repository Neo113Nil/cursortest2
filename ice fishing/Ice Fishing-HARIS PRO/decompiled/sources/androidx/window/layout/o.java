package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t0.C0349a;
import t0.C0350b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f2241a;

    public o() {
        D1.h.j("verificationMode", 3);
        this.f2241a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (D1.i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || j.b(sidecarDeviceState) != j.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (D1.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return D1.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (D1.i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(j.c(sidecarWindowLayoutInfo), j.c(sidecarWindowLayoutInfo2));
    }

    public final z e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        D1.i.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new z(u1.o.f4473a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        j.d(sidecarDeviceState2, j.b(sidecarDeviceState));
        return new z(f(j.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
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
    public final f g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        e eVar;
        e eVar2;
        D1.i.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C0349a.a(this.f2241a, sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", k.f2237b).d("Feature bounds must not be 0", l.f2238b).d("TYPE_FOLD must have 0 area", m.f2239b).d("Feature be pinned to either left or top", n.f2240b).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            eVar = e.f2226g;
        } else {
            if (type != 2) {
                return null;
            }
            eVar = e.f2227h;
        }
        int b2 = j.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                eVar2 = e.e;
                if (b2 != 3) {
                }
            } else {
                eVar2 = e.f2225f;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            D1.i.d(rect, "feature.rect");
            return new f(new C0350b(rect), eVar, eVar2);
        }
        return null;
    }
}
