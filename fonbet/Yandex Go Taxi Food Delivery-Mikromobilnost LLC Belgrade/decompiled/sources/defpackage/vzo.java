package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class vzo {
    public static g7u a(w751 w751Var, FoldingFeature foldingFeature) {
        mf1 mf1Var;
        bg1 bg1Var;
        int type = foldingFeature.getType();
        if (type == 1) {
            mf1Var = mf1.E;
        } else {
            if (type != 2) {
                return null;
            }
            mf1Var = mf1.F;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bg1Var = bg1.B;
        } else {
            if (state != 2) {
                return null;
            }
            bg1Var = bg1.C;
        }
        hi6 hi6Var = new hi6(foldingFeature.getBounds());
        Rect c = w751Var.a.c();
        if (hi6Var.a() == 0 && hi6Var.b() == 0) {
            return null;
        }
        if (hi6Var.b() != c.width() && hi6Var.a() != c.height()) {
            return null;
        }
        if (hi6Var.b() < c.width() && hi6Var.a() < c.height()) {
            return null;
        }
        if (hi6Var.b() == c.width() && hi6Var.a() == c.height()) {
            return null;
        }
        return new g7u(new hi6(foldingFeature.getBounds()), mf1Var, bg1Var);
    }

    public static v751 b(w751 w751Var, WindowLayoutInfo windowLayoutInfo) {
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            g7u a = foldingFeature instanceof FoldingFeature ? a(w751Var, foldingFeature) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new v751(arrayList);
    }

    public static v751 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        z751 z751Var = new z751(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return b((i >= 34 ? hwi.b : i >= 30 ? ji6.b : zoy0.x).k(context, z751Var.b), windowLayoutInfo);
        }
        if (context instanceof Activity) {
            return b(z751Var.a((Activity) context), windowLayoutInfo);
        }
        w511.x("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        return null;
    }
}
