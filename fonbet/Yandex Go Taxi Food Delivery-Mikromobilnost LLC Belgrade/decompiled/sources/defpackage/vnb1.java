package defpackage;

import android.widget.FrameLayout;
import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes11.dex */
public abstract class vnb1 {
    public static au2 a;

    public static final void a(f530 f530Var, wp2 wp2Var, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1505558159);
        int i2 = i | 54;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sb2.b(psy0.a.a(f7b1.d(btsVar, 6)), wwg.S(134358193, true, new k2z0(aVar), btsVar), btsVar, 56);
            f530Var = c530.a;
            wp2Var = tp2.a;
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        wp2 wp2Var2 = wp2Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(f530Var2, wp2Var2, aVar, i, 12);
        }
    }

    public static final void b(FrameLayout frameLayout, Runnable runnable, Runnable runnable2, boolean z, NavigationDirection navigationDirection) {
        long j = z ? 0L : 20L;
        if (frameLayout.getHeight() == 0) {
            runnable.run();
            runnable2.run();
            return;
        }
        int i = j030.a[navigationDirection.ordinal()];
        float f = 0.0f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else {
                    runnable.run();
                    runnable2.run();
                    return;
                }
            }
            if (z) {
                frameLayout.setTranslationX(-frameLayout.getWidth());
            } else {
                f = frameLayout.getWidth();
            }
        } else if (z) {
            frameLayout.setTranslationX(frameLayout.getWidth());
        } else {
            f = -frameLayout.getWidth();
        }
        cma1.g(f, frameLayout).setListener(new AnimUtils$AnimationStartEndListener(runnable, runnable2)).setStartDelay(j).setDuration(200L);
    }
}
