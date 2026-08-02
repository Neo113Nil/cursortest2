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

    public static void a(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = 0;
        if (z6) {
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    private static float a(com.anythink.basead.ui.b bVar, boolean z6, x xVar) {
        return a(bVar, z6, xVar, true);
    }

    public static float a(com.anythink.basead.ui.b bVar, boolean z6, x xVar, boolean z9) {
        int i;
        y yVar;
        y yVar2;
        if (xVar == null || (yVar2 = xVar.f14954o) == null) {
            i = 1;
        } else if (z6) {
            i = yVar2.q();
        } else {
            i = yVar2.r();
        }
        float f2 = 1.0f;
        if (bVar != null) {
            if (i == 2) {
                f2 = 1.5f;
            } else if (i == 3) {
                f2 = 0.75f;
            } else if (i == 4) {
                f2 = 0.5f;
            }
            a(bVar, f2, (z6 && z9) ? 1.0d : (xVar == null || (yVar = xVar.f14954o) == null) ? 1.0d : yVar.bz());
        }
        return f2;
    }

    public static void a(com.anythink.basead.ui.b bVar, float f2, double d9) {
        if (bVar != null) {
            bVar.setClickAreaScaleFactor(f2);
            bVar.setClickViewAlpha(d9);
        }
    }

    public static boolean a(long j6, x xVar) {
        y yVar;
        if (xVar != null && (yVar = xVar.f14954o) != null && yVar.bA() < 0) {
            return true;
        }
        if (j6 <= 0) {
            return false;
        }
        return xVar == null || xVar.f14954o == null || System.currentTimeMillis() - j6 > xVar.f14954o.bA();
    }
}
