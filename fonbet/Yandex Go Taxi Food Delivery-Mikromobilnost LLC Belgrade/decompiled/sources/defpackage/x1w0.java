package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates.HeaderTranslationDelegate$State;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsView;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class x1w0 extends RecyclerView.g {
    public final /* synthetic */ SuperAppMainScreenFlexModalView a;

    public x1w0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView) {
        this.a = superAppMainScreenFlexModalView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r1 > 0) goto L17;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        lbw0 lbw0Var;
        lbw0Var = this.a.appBar;
        lbw0Var.getClass();
        if (i == 0) {
            PaymentWidgetsView p = wwg.p(recyclerView);
            ubu ubuVar = (ubu) lbw0Var.e.getValue();
            ubuVar.getClass();
            Rect bounds = p != null ? p.bounds() : null;
            if (bounds == null) {
                return;
            }
            int height = ubuVar.a.getHeight();
            int i2 = bounds.bottom - height;
            if (i2 < bounds.height()) {
                if (i2 > bounds.height() / 2) {
                    i2 = bounds.top - height;
                }
                recyclerView.smoothScrollBy(0, i2, null, 200);
            }
            i2 = 0;
            recyclerView.smoothScrollBy(0, i2, null, 200);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        tyz0 tyz0Var;
        tyz0 tyz0Var2;
        lbw0 lbw0Var;
        float translationY;
        float f;
        float f2;
        Rect bounds;
        tyz0 tyz0Var3;
        SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = this.a;
        tyz0Var = superAppMainScreenFlexModalView.totalRecyclerViewScrolledRepository;
        r0 r0Var = ((uhr) tyz0Var).a;
        r0Var.m(null, Integer.valueOf(Math.max(0, ((Number) r0Var.getValue()).intValue() + i2)));
        if (!recyclerView.canScrollVertically(-1)) {
            tyz0Var3 = superAppMainScreenFlexModalView.totalRecyclerViewScrolledRepository;
            x4e.z(0, ((uhr) tyz0Var3).a, null);
        }
        tyz0Var2 = superAppMainScreenFlexModalView.totalRecyclerViewScrolledRepository;
        int intValue = ((Number) ((uhr) tyz0Var2).a.getValue()).intValue();
        lbw0Var = superAppMainScreenFlexModalView.appBar;
        zbw0 zbw0Var = lbw0Var.b;
        PaymentWidgetsView p = wwg.p(recyclerView);
        scu scuVar = (scu) lbw0Var.d.getValue();
        int i3 = scuVar.c - intValue;
        scuVar.c = intValue;
        View view = scuVar.a;
        float f3 = 0.0f;
        if (scuVar.b && i3 != 0 && (i3 <= 0 || scuVar.d != HeaderTranslationDelegate$State.TranslatedToZero)) {
            Integer valueOf = (p == null || (bounds = p.bounds()) == null) ? null : Integer.valueOf(bounds.bottom);
            if (valueOf == null) {
                translationY = view.getTranslationY();
            } else if (valueOf.intValue() < view.getTranslationY() + view.getHeight()) {
                translationY = view.getTranslationY();
            } else {
                if (valueOf.intValue() >= view.getHeight()) {
                    f = 0.0f;
                } else if (valueOf.intValue() <= 0) {
                    f = -view.getHeight();
                } else {
                    translationY = view.getTranslationY();
                }
                f2 = -view.getHeight();
                if (f2 <= 0.0f) {
                    ny61.g(x4e.f("Cannot coerce value to an empty range: maximum 0.0 is less than minimum ", Extension.DOT_CHAR, f2));
                    return;
                }
                if (f2 == 0.0f) {
                    scuVar.a(HeaderTranslationDelegate$State.TranslatedToZero);
                } else {
                    if (f <= f2) {
                        scuVar.a(HeaderTranslationDelegate$State.TranslatedToMinimum);
                        f = f2;
                    } else if (f >= 0.0f) {
                        scuVar.a(HeaderTranslationDelegate$State.TranslatedToZero);
                    } else {
                        scuVar.a(HeaderTranslationDelegate$State.Translating);
                    }
                    view.setTranslationY(f);
                }
                f = 0.0f;
                view.setTranslationY(f);
            }
            f = translationY + i3;
            f2 = -view.getHeight();
            if (f2 <= 0.0f) {
            }
        }
        n9u n9uVar = (n9u) lbw0Var.f.getValue();
        View view2 = n9uVar.a;
        Rect bounds2 = p != null ? p.bounds() : null;
        if (view2.isLaidOut()) {
            n9uVar.a(intValue, bounds2);
        } else {
            Rect a = bounds2 != null ? rza1.a(bounds2) : null;
            t0d t0dVar = n9uVar.c;
            if (t0dVar != null) {
                view2.removeCallbacks(t0dVar);
            }
            t0d t0dVar2 = new t0d(n9uVar, intValue, a, 2);
            n9uVar.c = t0dVar2;
            view2.post(t0dVar2);
        }
        acw0 acw0Var = (acw0) zbw0Var;
        acw0Var.a(lbw0Var.a);
        View view3 = ((ubu) lbw0Var.e.getValue()).a;
        Rect bounds3 = p != null ? p.bounds() : null;
        if (bounds3 != null) {
            int measuredHeight = view3.getMeasuredHeight() + view3.getTop();
            f3 = y6i0.c(bounds3.bottom < measuredHeight ? 0.0f : bounds3.top > measuredHeight ? 1.0f : ((r2 - measuredHeight) * 1.0f) / bounds3.height(), 0.0f, 1.0f);
        }
        r0 r0Var2 = acw0Var.d;
        Float valueOf2 = Float.valueOf(f3);
        r0Var2.getClass();
        r0Var2.m(null, valueOf2);
        if (recyclerView.getScrollState() != 0) {
            r0 r0Var3 = acw0Var.c;
            Float valueOf3 = Float.valueOf(f3);
            r0Var3.getClass();
            r0Var3.m(null, valueOf3);
        }
        superAppMainScreenFlexModalView.updateStatusBarThemeByFloatingHeaderPosition();
    }
}
