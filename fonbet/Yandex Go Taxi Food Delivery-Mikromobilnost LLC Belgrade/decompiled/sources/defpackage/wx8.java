package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public abstract class wx8 extends lys {
    public g18 S;

    public wx8(dy8 dy8Var) {
        super(dy8Var);
        GoLinearLayout goLinearLayout = dy8Var.a;
        c.D((int) Math.max(c.i(104.0f, goLinearLayout), c.F(104.0f, goLinearLayout)), goLinearLayout.getLayoutParams().height, goLinearLayout);
        goLinearLayout.setBackground(c0());
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((dy8) ((zo31) this.R)).a.setBackground(c0());
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        e0((ux8) obj);
        OneShotPreDrawListener.add(((dy8) ((zo31) this.R)).a, new uz(10, this));
    }

    public final RippleDrawable c0() {
        int argb;
        int i = p0h0.carousel_item_drawable;
        View view = this.a;
        Drawable k = c.k(i, view);
        int c = c.c(xng0.bgMinor, view);
        if (lhc.c(c) < 0.25d) {
            argb = lhc.b(0.050000012f, c, -1);
        } else {
            int alpha = Color.alpha(c);
            int b = m810.b(Color.red(c) * 0.95f);
            if (b > 255) {
                b = 255;
            }
            int b2 = m810.b(Color.green(c) * 0.95f);
            if (b2 > 255) {
                b2 = 255;
            }
            int b3 = m810.b(Color.blue(c) * 0.95f);
            argb = Color.argb(alpha, b, b2, b3 <= 255 ? b3 : 255);
        }
        return new RippleDrawable(ColorStateList.valueOf(argb), k, null);
    }

    public final void d0(String str, pav pavVar) {
        zo31 zo31Var = (zo31) this.R;
        g18 g18Var = this.S;
        if (g18Var != null) {
            g18Var.cancel();
        }
        if (str == null || str.length() == 0) {
            ((dy8) zo31Var).c.setImageResource(p0h0.ic_carousel_requirement_empty_image);
            return;
        }
        nac nacVar = (nac) pavVar.a(((dy8) zo31Var).c);
        nacVar.i = new ju8(2, this);
        this.S = nacVar.c(str);
    }

    public abstract void e0(ux8 ux8Var);
}
