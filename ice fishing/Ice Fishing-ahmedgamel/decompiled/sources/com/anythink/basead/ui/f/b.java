package com.anythink.basead.ui.f;

import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class b {

    public interface a {
        void a(int i, int i6);
    }

    public static void a(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        if (z3) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    private static float a(com.anythink.basead.ui.b bVar, boolean z3, x xVar) {
        return a(bVar, z3, xVar, true);
    }

    public static float a(com.anythink.basead.ui.b bVar, boolean z3, x xVar, boolean z6) {
        int i;
        y yVar;
        y yVar2;
        if (xVar == null || (yVar2 = xVar.f14168o) == null) {
            i = 1;
        } else if (z3) {
            i = yVar2.q();
        } else {
            i = yVar2.r();
        }
        float f3 = 1.0f;
        if (bVar != null) {
            if (i == 2) {
                f3 = 1.5f;
            } else if (i == 3) {
                f3 = 0.75f;
            } else if (i == 4) {
                f3 = 0.5f;
            }
            a(bVar, f3, (z3 && z6) ? 1.0d : (xVar == null || (yVar = xVar.f14168o) == null) ? 1.0d : yVar.bz());
        }
        return f3;
    }

    public static void a(com.anythink.basead.ui.b bVar, float f3, double d2) {
        if (bVar != null) {
            bVar.setClickAreaScaleFactor(f3);
            bVar.setClickViewAlpha(d2);
        }
    }

    public static boolean a(long j6, x xVar) {
        y yVar;
        if (xVar != null && (yVar = xVar.f14168o) != null && yVar.bA() < 0) {
            return true;
        }
        if (j6 <= 0) {
            return false;
        }
        return xVar == null || xVar.f14168o == null || System.currentTimeMillis() - j6 > xVar.f14168o.bA();
    }
}
