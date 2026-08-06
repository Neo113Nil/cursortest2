package b0;

import Z.j;
import Z.k;
import Z.m;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import y.F;
import y.G;
import y.H;
import y.Q;

/* loaded from: classes.dex */
public abstract class e {
    public static Z.c a(k kVar, FoldingFeature foldingFeature) {
        Z.b bVar;
        Z.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = Z.b.f1926g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = Z.b.f1927h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = Z.b.f1924e;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = Z.b.f1925f;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        W.b bVar3 = new W.b(bounds);
        Rect c2 = kVar.f1948a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != c2.width() && bVar3.a() != c2.height()) {
            return null;
        }
        if (bVar3.b() < c2.width() && bVar3.a() < c2.height()) {
            return null;
        }
        if (bVar3.b() == c2.width() && bVar3.a() == c2.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new Z.c(new W.b(bounds2), bVar, bVar2);
    }

    public static j b(k kVar, WindowLayoutInfo info) {
        Z.c cVar;
        i.e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                i.d(feature, "feature");
                cVar = a(kVar, feature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new j(arrayList);
    }

    public static j c(Context context, WindowLayoutInfo info) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(info, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = m.f1951b;
            return b(m.a((Activity) context), info);
        }
        int i4 = m.f1951b;
        if (i2 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z2 = context2 instanceof Activity;
                if (!z2 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        i.d(context2, "iterator.baseContext");
                    }
                }
                if (z2) {
                    kVar = m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    i.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i5 = Build.VERSION.SDK_INT;
                    Q b2 = (i5 >= 30 ? new H() : i5 >= 29 ? new G() : new F()).b();
                    i.d(b2, "Builder().build()");
                    kVar = new k(rect, b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Q a2 = Q.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new k(bounds, a2);
        return b(kVar, info);
    }
}
