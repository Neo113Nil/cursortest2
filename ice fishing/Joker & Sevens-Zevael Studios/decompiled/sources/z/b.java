package z;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8936a = 1;

    public static final a c(String str, int i10) {
        WeakHashMap weakHashMap = p0.f9003u;
        return new a(str, i10);
    }

    public static final n0 d(String str, int i10) {
        WeakHashMap weakHashMap = p0.f9003u;
        return new n0(new y(0, 0, 0, 0), str);
    }

    public static p0 e(m0.r rVar) {
        p0 p0Var;
        View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f607f);
        WeakHashMap weakHashMap = p0.f9003u;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new p0(view);
                    weakHashMap.put(view, obj);
                }
                p0Var = (p0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h10 = rVar.h(p0Var) | rVar.h(view);
        Object M = rVar.M();
        if (h10 || M == m0.l.f4646a) {
            M = new b0.l0(26, p0Var, view);
            rVar.i0(M);
        }
        m0.z.d(p0Var, (oc.c) M, rVar);
        return p0Var;
    }

    @Override // z.g
    public void b(v1.g0 g0Var, int i10, int[] iArr, int[] iArr2) {
        switch (this.f8936a) {
            case 0:
                i.c(i10, iArr, iArr2, false);
                break;
            default:
                i.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f8936a) {
            case 0:
                return "Arrangement#Bottom";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
