package defpackage;

import android.view.View;
import androidx.appcompat.widget.p;

/* loaded from: classes10.dex */
public final class ytz0 extends fu31 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object w;

    public ytz0(du31 du31Var) {
        this.a = 1;
        this.w = du31Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.fu31, defpackage.eu31
    public void onAnimationCancel(View view) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(view);
                break;
        }
    }

    @Override // defpackage.fu31, defpackage.eu31
    public final void onAnimationEnd(View view) {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((p) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                du31 du31Var = (du31) obj;
                if (i2 == du31Var.a.size()) {
                    eu31 eu31Var = du31Var.d;
                    if (eu31Var != null) {
                        eu31Var.onAnimationEnd(null);
                    }
                    this.c = 0;
                    this.b = false;
                    du31Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fu31, defpackage.eu31
    public final void onAnimationStart(View view) {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                ((p) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    eu31 eu31Var = ((du31) obj).d;
                    if (eu31Var != null) {
                        eu31Var.onAnimationStart(null);
                        break;
                    }
                }
                break;
        }
    }

    public ytz0(p pVar, int i) {
        this.a = 0;
        this.w = pVar;
        this.c = i;
        this.b = false;
    }
}
