package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kfq {
    public static final /* synthetic */ int b = 0;
    public final int a = 3;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.d(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.d(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final uqv c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new uqv(c5b.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        ffq.d(sidecarDeviceState2, ffq.b(sidecarDeviceState));
        return new uqv(d(ffq.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qsd e = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r6 == 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qsd e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        psd psdVar;
        jpc jpcVar;
        sidecarDisplayFeature.getClass();
        ofc ofcVar = ofc.c;
        int i = this.a;
        if (i == 0) {
            throw null;
        }
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new owt(sidecarDisplayFeature, i, ofcVar).L("Type must be either TYPE_FOLD or TYPE_HINGE", gfq.r).L("Feature bounds must not be 0", hfq.r).L("TYPE_FOLD must have 0 area", ifq.r).L("Feature be pinned to either left or top", jfq.r).w();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type == 1) {
                psdVar = psd.c;
            } else if (type == 2) {
                psdVar = psd.d;
            }
            int b2 = ffq.b(sidecarDeviceState);
            if (b2 != 0 && b2 != 1) {
                if (b2 != 2) {
                    jpcVar = jpc.c;
                    if (b2 != 3) {
                    }
                } else {
                    jpcVar = jpc.d;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new qsd(new mg3(rect), psdVar, jpcVar);
            }
        }
        return null;
    }
}
