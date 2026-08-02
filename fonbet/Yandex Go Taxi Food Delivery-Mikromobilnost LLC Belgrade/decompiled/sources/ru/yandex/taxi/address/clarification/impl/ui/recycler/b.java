package ru.yandex.taxi.address.clarification.impl.ui.recycler;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import defpackage.jr0;
import defpackage.lhc;
import defpackage.lrq0;
import defpackage.lys;
import defpackage.qje;
import defpackage.tje;
import defpackage.vbb;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class b extends lys {
    public static final /* synthetic */ int T = 0;
    public final c S;

    public b(c cVar, jr0 jr0Var) {
        super(jr0Var);
        this.S = cVar;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        c0();
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        c0();
        androidx.core.view.b.q(((jr0) ((zo31) this.R)).a, true);
        b0(new SeparatorViewHolder$bind$1(this, (lrq0) obj, null));
    }

    public final void c0() {
        RobotoTextView robotoTextView = ((jr0) ((zo31) this.R)).a;
        int t = qje.t(xng0.bgMinor, robotoTextView.getContext());
        float u = tje.u(6, robotoTextView.getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.5f), Color.red(t), Color.green(t), Color.blue(t));
        vbb vbbVar = new vbb(t, u);
        vbbVar.X(argb);
        vbbVar.Y(lhc.c(t) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
        robotoTextView.setBackground((Drawable) vbbVar.b);
        robotoTextView.setTextColor(qje.t(xng0.textMain, robotoTextView.getContext()));
    }
}
