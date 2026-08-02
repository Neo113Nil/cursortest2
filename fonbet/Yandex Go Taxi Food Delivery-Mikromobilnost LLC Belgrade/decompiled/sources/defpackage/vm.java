package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public abstract class vm extends x0 {
    public final ConstraintLayout N;
    public final RobotoTextView O;
    public final AppCompatImageView P;
    public final AppCompatImageView Q;

    public vm(rm rmVar) {
        super((ConstraintLayout) rmVar.b);
        this.N = (ConstraintLayout) rmVar.c;
        this.O = (RobotoTextView) rmVar.e;
        this.P = (AppCompatImageView) rmVar.f;
        this.Q = (AppCompatImageView) rmVar.g;
    }

    public abstract void W(r8i0 r8i0Var, s8i0 s8i0Var);
}
