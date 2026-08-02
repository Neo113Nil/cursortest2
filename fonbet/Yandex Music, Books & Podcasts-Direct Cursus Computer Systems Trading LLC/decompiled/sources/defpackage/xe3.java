package defpackage;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetBehavior;
import com.yandex.passport.internal.ui.base.b;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xe3 extends se3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xe3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.se3
    public final void b(View view, float f) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                o3a A = ((t2a) this.b).A();
                if (A != null) {
                    Iterator it = A.l.a.iterator();
                    if (it.hasNext()) {
                        throw hrg.j(it);
                    }
                    return;
                }
                return;
            case 4:
                ((HomeLandingBottomSheetBehavior) this.b).slideOffset = f;
                return;
            case 5:
                s2e s2eVar = (s2e) this.b;
                if (0.0f > f || f > 1.0f) {
                    return;
                }
                s2eVar.a(f);
                s2eVar.p(view);
                return;
            case 6:
            case 7:
            default:
                return;
        }
    }

    @Override // defpackage.se3
    public final void c(int i, View view) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 5) {
                    ((ze3) obj).cancel();
                    return;
                }
                return;
            case 1:
                if (i == 5) {
                    af3.access$100((af3) obj);
                    return;
                }
                return;
            case 2:
                int i3 = cf3.j;
                ((cf3) obj).n(i);
                return;
            case 3:
            case 4:
                return;
            case 5:
                s2e s2eVar = (s2e) obj;
                xdr xdrVar = s2eVar.q;
                Integer valueOf = Integer.valueOf(i);
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                s2eVar.b(i);
                s2eVar.n(i);
                s2eVar.p(view);
                return;
            case 6:
                jdl jdlVar = (jdl) obj;
                BottomSheetBehavior bottomSheetBehavior = jdlVar.s;
                if (bottomSheetBehavior == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                bottomSheetBehavior.removeBottomSheetCallback(this);
                jdlVar.D();
                return;
            case 7:
                if (i == 4 || i == 5) {
                    b bVar = (b) obj;
                    Dialog dialog = bVar.getDialog();
                    dialog.getClass();
                    bVar.onCancel(dialog);
                    return;
                }
                return;
            default:
                if (i == 4 || i == 5) {
                    ((a0) obj).q.a(y1.b);
                    return;
                }
                return;
        }
    }

    private final void d(View view, float f) {
    }

    private final void e(View view, float f) {
    }

    private final void f(View view, float f) {
    }

    private final void g(View view, float f) {
    }

    private final void h(View view, float f) {
    }

    private final void i(View view, float f) {
    }

    private final void j(int i, View view) {
    }

    private final void k(int i, View view) {
    }
}
