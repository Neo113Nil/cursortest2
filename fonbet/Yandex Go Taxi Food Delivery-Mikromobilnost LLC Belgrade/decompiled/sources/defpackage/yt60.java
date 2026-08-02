package defpackage;

import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.masstransit.design.gradient.SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1;
import java.util.List;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class yt60 extends lys {
    public static final /* synthetic */ int V = 0;
    public final pav S;
    public final piq0 T;
    public final int U;

    public yt60(pxu pxuVar, pav pavVar) {
        super(pxuVar);
        this.S = pavVar;
        this.T = new piq0(pxuVar.a.getContext());
        this.U = c.d(otg0.route_end_fade_width, this.a);
        cvw.a0(c.h(100, this.a), pxuVar.b);
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        GoImageView goImageView = ((pxu) ((zo31) this.R)).c;
        piq0 piq0Var = this.T;
        SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 = new SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1(piq0Var, qje.t(xng0.bgMinor, piq0Var.a));
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1);
        goImageView.updateBackground(new eg4(paintDrawable));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        b0v b0vVar = (b0v) obj;
        pxu pxuVar = (pxu) ((zo31) this.R);
        pxuVar.d.render(b0vVar.a);
        GoLinearLayout goLinearLayout = pxuVar.e;
        GoConstraintLayout goConstraintLayout = pxuVar.a;
        goLinearLayout.removeAllViews();
        List list = b0vVar.b;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            RobotoTextView robotoTextView = new RobotoTextView(goConstraintLayout.getContext(), null, 0, 6, null);
            int i3 = mrg0.component_text_size_caption;
            View view = this.a;
            robotoTextView.setTextSize(0, c.d(i3, view));
            fh4.g(robotoTextView);
            robotoTextView.setTextTypeface(3);
            robotoTextView.setMaxLines(1);
            robotoTextView.setSingleLine();
            robotoTextView.setText((CharSequence) obj2);
            goLinearLayout.addView(robotoTextView);
            if (i != scc.f(list)) {
                l811 l811Var = b0vVar.c;
                ImageView goImageView = new GoImageView(goConstraintLayout.getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(tje.u(8, view.getContext()));
                marginLayoutParams.setMarginEnd(tje.u(8, view.getContext()));
                goImageView.setLayoutParams(marginLayoutParams);
                if (l811Var.a.length() > 0) {
                    ((nac) this.S.a(goImageView)).c(l811Var.a);
                } else {
                    goImageView.setImageDrawable(vng.t(l811Var.b, view.getContext()));
                }
                goLinearLayout.addView(goImageView);
            }
            i = i2;
        }
        OneShotPreDrawListener.add(goLinearLayout, new do91(10, pxuVar, this));
        gf91.c(pxuVar.b, b0vVar.d);
        GoImageView goImageView2 = pxuVar.c;
        piq0 piq0Var = this.T;
        SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1 = new SelectedRouteSideFadeGradientFactory$createFade$shaderFactory$1(piq0Var, qje.t(xng0.bgMinor, piq0Var.a));
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(selectedRouteSideFadeGradientFactory$createFade$shaderFactory$1);
        goImageView2.updateBackground(new eg4(paintDrawable));
    }
}
