package defpackage;

import android.graphics.RenderNode;
import android.view.View;
import androidx.core.view.b;

/* loaded from: classes11.dex */
public abstract class tja1 {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void b(View view) {
        b.p(view, new ei(0));
    }

    public static void c(float[] fArr, float f) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }

    public static void d(RenderNode renderNode, nja1 nja1Var) {
        renderNode.setRenderEffect(null);
    }
}
