package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class zs01 extends lys implements t7u {
    public static final /* synthetic */ int U = 0;
    public eiy S;
    public eiy T;

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ((ListItemComponent) ((View) this.R)).setTitle(((vs01) obj).a);
        g911 g911Var = g911.a;
        this.S = lob1.g(g911Var);
        this.T = lob1.g(g911Var);
    }

    @Override // defpackage.t7u
    public final eiy g() {
        return this.S;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        return this.T;
    }

    @Override // defpackage.t7u
    public final epu x() {
        return new dpu(((ListItemComponent) ((View) this.R)).getLeadImageView(), null);
    }
}
