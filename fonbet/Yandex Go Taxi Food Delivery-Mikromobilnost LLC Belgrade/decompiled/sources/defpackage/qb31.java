package defpackage;

import android.animation.ArgbEvaluator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class qb31 extends x0 {
    public static final ArgbEvaluator U = new ArgbEvaluator();
    public final hf31 N;
    public final RobotoTextView O;
    public final RobotoTextView P;
    public float Q;
    public final int R;
    public final int S;
    public final int T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qb31(ho4 ho4Var, hf31 hf31Var) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) ho4Var.c;
        this.N = hf31Var;
        RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
        this.O = robotoTextView;
        RobotoTextView robotoTextView2 = (RobotoTextView) ho4Var.b;
        this.P = robotoTextView2;
        int t = qje.t(xng0.textMinor, frameLayout.getContext());
        this.R = t;
        int t2 = qje.t(xng0.textMain, frameLayout.getContext());
        this.S = t2;
        this.T = 3;
        robotoTextView.setTextColor(((Integer) U.evaluate(this.Q, Integer.valueOf(t), Integer.valueOf(t2))).intValue());
        robotoTextView2.setTextTypeface(3);
    }
}
