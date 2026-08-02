package defpackage;

import androidx.compose.ui.focus.c;

/* loaded from: classes10.dex */
public final class wjx {
    public final u5t0 a;
    public xjx b;
    public dur c;

    public wjx(u5t0 u5t0Var) {
        this.a = u5t0Var;
    }

    public final boolean a(int i) {
        tls tlsVar;
        u5t0 u5t0Var;
        if (i == 7) {
            xjx xjxVar = this.b;
            if (xjxVar == null) {
                xjxVar = null;
            }
            tlsVar = xjxVar.a;
        } else if (i == 2) {
            xjx xjxVar2 = this.b;
            if (xjxVar2 == null) {
                xjxVar2 = null;
            }
            tlsVar = xjxVar2.b;
        } else if (i == 6) {
            xjx xjxVar3 = this.b;
            if (xjxVar3 == null) {
                xjxVar3 = null;
            }
            tlsVar = xjxVar3.c;
        } else if (i == 5) {
            xjx xjxVar4 = this.b;
            if (xjxVar4 == null) {
                xjxVar4 = null;
            }
            tlsVar = xjxVar4.d;
        } else if (i == 3) {
            xjx xjxVar5 = this.b;
            if (xjxVar5 == null) {
                xjxVar5 = null;
            }
            tlsVar = xjxVar5.e;
        } else if (i == 4) {
            xjx xjxVar6 = this.b;
            if (xjxVar6 == null) {
                xjxVar6 = null;
            }
            tlsVar = xjxVar6.f;
        } else {
            if (i != 1 && i != 0) {
                ny61.r("invalid ImeAction");
                return false;
            }
            tlsVar = null;
        }
        if (tlsVar != null) {
            tlsVar.invoke(this);
            return true;
        }
        if (i == 6) {
            dur durVar = this.c;
            ((c) (durVar != null ? durVar : null)).j(1, true);
            return true;
        }
        if (i == 5) {
            dur durVar2 = this.c;
            ((c) (durVar2 != null ? durVar2 : null)).j(2, true);
            return true;
        }
        if (i != 7 || (u5t0Var = this.a) == null) {
            return false;
        }
        ((wqh) u5t0Var).a();
        return true;
    }
}
