package defpackage;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import androidx.compose.material3.a0;
import coil3.size.ViewSizeResolver$size$3$preDrawListener$1;
import com.yandex.go.tariffcard.ui.model.CarouselWithPosition$Position;
import java.util.List;
import ru.yandex.taxi.widgets.data.repository.t;

/* loaded from: classes10.dex */
public final class ze5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ze5(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                KeyEvent keyEvent = ((eix) obj).a;
                oz40 oz40Var = (oz40) this.c;
                a0 a0Var = (a0) ((svz0) this.b);
                if (!a0Var.b()) {
                    oz40Var.setValue(Boolean.FALSE);
                } else if (c9y.f(keyEvent) == 2 && mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.u)) {
                    ((oz40) this.w).setValue(Boolean.FALSE);
                    a0Var.a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                bix0 bix0Var = (bix0) obj;
                oz8 oz8Var = (oz8) this.b;
                if ((oz8Var != null ? oz8Var.b : null) == CarouselWithPosition$Position.ABOVE_MULTI_TARIFFS) {
                    bix0Var.a((kix0) this.c, null);
                }
                bix0Var.a((kix0) this.w, null);
                return zy11.a;
            case 2:
                su31 su31Var = (su31) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = (ViewSizeResolver$size$3$preDrawListener$1) this.w;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                } else {
                    ((pdi0) su31Var).b().getViewTreeObserver().removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                }
                return zy11.a;
            default:
                t tVar = (t) this.b;
                String str = (String) this.c;
                j18 j18Var = (j18) this.w;
                synchronized (tVar.o) {
                    List list = (List) tVar.n.get(str);
                    if (list != null) {
                        list.remove(j18Var);
                        if (list.isEmpty()) {
                            tVar.n.remove(str);
                        }
                    }
                }
                return zy11.a;
        }
    }
}
