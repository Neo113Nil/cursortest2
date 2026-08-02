package defpackage;

import android.view.View;
import com.yandex.go.tariffcard.ui.SectionSeparator$AnimationType;
import com.yandex.go.tariffcard.ui.view.MarginCardDivider;

/* loaded from: classes14.dex */
public final class v3q0 extends lys implements ig2 {
    public static final /* synthetic */ int U = 0;
    public final nhx0 S;
    public SectionSeparator$AnimationType T;

    public v3q0(MarginCardDivider marginCardDivider, nhx0 nhx0Var) {
        super(marginCardDivider);
        this.S = nhx0Var;
        this.T = SectionSeparator$AnimationType.DEFAULT;
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        r3q0 r3q0Var = (r3q0) obj;
        MarginCardDivider marginCardDivider = (MarginCardDivider) ((View) this.R);
        marginCardDivider.setType(r3q0Var.a);
        marginCardDivider.setColor(r3q0Var.c);
        marginCardDivider.setDividerHeight(r3q0Var.b);
        p3q0 p3q0Var = r3q0Var.d;
        marginCardDivider.updateMargins(Integer.valueOf(p3q0Var.a), Integer.valueOf(p3q0Var.b));
        this.T = r3q0Var.e;
    }

    @Override // defpackage.ig2
    public final sg2 n() {
        int i = u3q0.a[this.T.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return this.S.d;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.ig2
    public final boolean v() {
        int i = u3q0.a[this.T.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        w511.b();
        return false;
    }
}
