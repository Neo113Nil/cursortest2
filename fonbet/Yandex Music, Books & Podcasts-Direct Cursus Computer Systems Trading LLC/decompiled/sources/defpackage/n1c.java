package defpackage;

import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n1c {
    public static qsd a(xqv xqvVar, FoldingFeature foldingFeature) {
        psd psdVar;
        jpc jpcVar;
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            psdVar = psd.c;
        } else {
            if (type != 2) {
                return null;
            }
            psdVar = psd.d;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            jpcVar = jpc.c;
        } else {
            if (state != 2) {
                return null;
            }
            jpcVar = jpc.d;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        if (i > i3) {
            xq0.o(f1d.e(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            return null;
        }
        if (i2 > i4) {
            xq0.o(f1d.e(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
            return null;
        }
        Rect a = xqvVar.a.a();
        int i5 = i4 - i2;
        if (i5 == 0 && i3 - i == 0) {
            return null;
        }
        int i6 = i3 - i;
        if (i6 != a.width() && i5 != a.height()) {
            return null;
        }
        if (i6 < a.width() && i5 < a.height()) {
            return null;
        }
        if (i6 == a.width() && i5 == a.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new qsd(new mg3(bounds2), psdVar, jpcVar);
    }

    public static uqv b(xqv xqvVar, WindowLayoutInfo windowLayoutInfo) {
        qsd qsdVar;
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                qsdVar = a(xqvVar, foldingFeature);
            } else {
                qsdVar = null;
            }
            if (qsdVar != null) {
                arrayList.add(qsdVar);
            }
        }
        return new uqv(arrayList);
    }
}
