package W;

import E0.i;
import U.k;
import U.l;
import U.n;
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
import w.C0268F;
import w.G;
import w.H;
import w.S;

/* loaded from: classes.dex */
public abstract class e {
    public static U.c a(l lVar, FoldingFeature foldingFeature) {
        U.b bVar;
        U.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = U.b.f1011l;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = U.b.f1012m;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = U.b.f1009j;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = U.b.f1010k;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        R.b bVar3 = new R.b(bounds);
        Rect c2 = lVar.f1035a.c();
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
        return new U.c(new R.b(bounds2), bVar, bVar2);
    }

    public static k b(l lVar, WindowLayoutInfo windowLayoutInfo) {
        U.c cVar;
        i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i.d(foldingFeature, "feature");
                cVar = a(lVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }

    public static k c(Context context, WindowLayoutInfo windowLayoutInfo) {
        l lVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(windowLayoutInfo, "info");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i3 = n.f1038b;
            return b(n.a((Activity) context), windowLayoutInfo);
        }
        int i4 = n.f1038b;
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
                    lVar = n.a((Activity) context);
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
                    S b2 = (i5 >= 30 ? new H() : i5 >= 29 ? new G() : new C0268F()).b();
                    i.d(b2, "Builder().build()");
                    lVar = new l(rect, b2);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        S a2 = S.a(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        lVar = new l(bounds, a2);
        return b(lVar, windowLayoutInfo);
    }
}
