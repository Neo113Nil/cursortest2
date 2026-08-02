package defpackage;

import android.view.View;
import com.yandex.bricks.Brick;
import com.yandex.bricks.c;

/* loaded from: classes11.dex */
public final class xj6 implements fk6 {
    public final Brick a;
    public final View b;
    public boolean c = false;
    public m6 w = null;

    public xj6(Brick brick, View view) {
        this.a = brick;
        this.b = view;
    }

    @Override // defpackage.fk6
    public final View getView() {
        View view = this.b;
        if (view.getParent() != null) {
            return view;
        }
        ny61.k();
        return null;
    }

    @Override // defpackage.fk6
    public final fk6 insert(Brick brick) {
        Brick brick2 = this.a;
        if (brick == brick2) {
            return this;
        }
        xj6 xj6Var = (xj6) brick2.replaceThisBrickWith(brick);
        m6 m6Var = this.w;
        if (m6Var != null) {
            View view = brick.getView();
            c cVar = (c) m6Var.b;
            cVar.c = brick;
            cVar.b = xj6Var;
            cVar.a = view;
            this.w = null;
        }
        this.c = true;
        return xj6Var;
    }

    @Override // defpackage.fk6
    public final boolean isUsed() {
        return this.c;
    }

    @Override // defpackage.fk6
    public final void setOnInsertListener(ek6 ek6Var) {
        this.w = (m6) ek6Var;
    }
}
