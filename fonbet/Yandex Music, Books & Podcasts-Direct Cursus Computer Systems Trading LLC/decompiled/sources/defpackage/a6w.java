package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class a6w {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y5w a(z5 z5Var, tr5 tr5Var, wn5 wn5Var) {
        AndroidComposeView androidComposeView;
        y5w y5wVar;
        Object[] objArr = 0;
        if (fmd.a.compareAndSet(false, true)) {
            zi3 g = men.g(1, 6, null);
            x97.y(gld.e((CoroutineContext) bj0.n.getValue()), null, null, new akc((Object) g, (Continuation) (objArr == true ? 1 : 0), 17), 3);
            kma kmaVar = new kma(15, g);
            synchronized (g2r.b) {
                g2r.h = CollectionsKt.h0((Collection) g2r.h, kmaVar);
            }
            g2r.a();
        }
        if (z5Var.getChildCount() > 0) {
            View childAt = z5Var.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(z5Var.getContext(), tr5Var.i());
                    z5Var.addView(androidComposeView.getView(), a);
                }
                Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
                y5wVar = tag instanceof y5w ? (y5w) tag : null;
                if (y5wVar == null) {
                    y5wVar = new y5w(androidComposeView, new wr5(tr5Var, new gft(androidComposeView.getRoot())));
                    androidComposeView.getView().setTag(R.id.wrapped_composition_tag, y5wVar);
                }
                y5wVar.a(wn5Var);
                if (!Intrinsics.d(androidComposeView.getCoroutineContext(), tr5Var.i())) {
                    androidComposeView.setCoroutineContext(tr5Var.i());
                }
                return y5wVar;
            }
        } else {
            z5Var.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof y5w) {
        }
        if (y5wVar == null) {
        }
        y5wVar.a(wn5Var);
        if (!Intrinsics.d(androidComposeView.getCoroutineContext(), tr5Var.i())) {
        }
        return y5wVar;
    }
}
