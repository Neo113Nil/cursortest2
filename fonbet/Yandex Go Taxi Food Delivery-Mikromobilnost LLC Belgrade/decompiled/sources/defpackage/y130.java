package defpackage;

import android.view.View;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class y130 implements e230 {
    public static final /* synthetic */ int f = 0;
    public final boolean a;
    public final int b;
    public final sls c;
    public final i3y d;
    public final i3y e;

    public y130(int i, sls slsVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = slsVar;
        final int i2 = 0;
        this.d = a.a(new sls(this) { // from class: x130
            public final /* synthetic */ y130 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                y130 y130Var = this.b;
                switch (i3) {
                    case 0:
                        View view = (View) y130Var.c.invoke();
                        return Integer.valueOf(view != null ? view.getPaddingTop() : 0);
                    default:
                        View view2 = (View) y130Var.c.invoke();
                        return Integer.valueOf(view2 != null ? view2.getPaddingBottom() : 0);
                }
            }
        });
        final int i3 = 1;
        this.e = a.a(new sls(this) { // from class: x130
            public final /* synthetic */ y130 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                y130 y130Var = this.b;
                switch (i32) {
                    case 0:
                        View view = (View) y130Var.c.invoke();
                        return Integer.valueOf(view != null ? view.getPaddingTop() : 0);
                    default:
                        View view2 = (View) y130Var.c.invoke();
                        return Integer.valueOf(view2 != null ? view2.getPaddingBottom() : 0);
                }
            }
        });
    }

    @Override // defpackage.e230
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.e230
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y130)) {
            return false;
        }
        y130 y130Var = (y130) obj;
        return this.a == y130Var.a && this.b == y130Var.b && jl40.l(this.c, y130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ly3.r(xvz.p("Fullscreen(handleIme=", this.b, ", consume=", ", contentViewProvider=", this.a), this.c, Extension.C_BRAKE);
    }

    public y130() {
        this(0, new sq20(22), false);
    }

    public y130(int i, sls slsVar) {
        this(0, (i & 2) != 0 ? new sq20(22) : slsVar, (i & 1) == 0);
    }
}
