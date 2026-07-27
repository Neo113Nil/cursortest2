package com.anythink.basead.ui.f;

import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class b {

    public interface a {
        void a(int i, int i4);
    }

    public static void a(View view, boolean z8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        if (z8) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    private static float a(com.anythink.basead.ui.b bVar, boolean z8, x xVar) {
        return a(bVar, z8, xVar, true);
    }

    public static float a(com.anythink.basead.ui.b bVar, boolean z8, x xVar, boolean z9) {
        int i;
        y yVar;
        y yVar2;
        if (xVar == null || (yVar2 = xVar.f14325o) == null) {
            i = 1;
        } else if (z8) {
            i = yVar2.q();
        } else {
            i = yVar2.r();
        }
        float f6 = 1.0f;
        if (bVar != null) {
            if (i == 2) {
                f6 = 1.5f;
            } else if (i == 3) {
                f6 = 0.75f;
            } else if (i == 4) {
                f6 = 0.5f;
            }
            a(bVar, f6, (z8 && z9) ? 1.0d : (xVar == null || (yVar = xVar.f14325o) == null) ? 1.0d : yVar.bz());
        }
        return f6;
    }

    public static void a(com.anythink.basead.ui.b bVar, float f6, double d2) {
        if (bVar != null) {
            bVar.setClickAreaScaleFactor(f6);
            bVar.setClickViewAlpha(d2);
        }
    }

    public static boolean a(long j9, x xVar) {
        y yVar;
        if (xVar != null && (yVar = xVar.f14325o) != null && yVar.bA() < 0) {
            return true;
        }
        if (j9 <= 0) {
            return false;
        }
        return xVar == null || xVar.f14325o == null || System.currentTimeMillis() - j9 > xVar.f14325o.bA();
    }
}
