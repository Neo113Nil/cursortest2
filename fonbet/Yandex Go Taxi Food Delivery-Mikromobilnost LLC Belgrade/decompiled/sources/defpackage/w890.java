package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.f0;

/* loaded from: classes6.dex */
public final class w890 extends f0 {
    public int f;
    public c0 g;
    public b0 h;

    public w890(int i) {
        this.f = i;
    }

    public static int l(RecyclerView.e eVar, View view, d0 d0Var) {
        float y;
        int height;
        int f;
        if (eVar.I()) {
            y = view.getX();
            height = view.getWidth() / 2;
        } else {
            y = view.getY();
            height = view.getHeight() / 2;
        }
        int i = (int) (y + height);
        if (eVar.f0()) {
            f = (d0Var.l() / 2) + d0Var.k();
        } else {
            f = d0Var.f() / 2;
        }
        return i - f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(RecyclerView.e eVar, View view) {
        c0 c0Var;
        b0 b0Var;
        int[] iArr = new int[2];
        if (eVar.I()) {
            b0 b0Var2 = this.h;
            if (b0Var2 != null) {
                b0Var = jl40.l(b0Var2.a, eVar) ? b0Var2 : null;
            }
            b0Var = new b0(eVar);
            this.h = b0Var;
            iArr[0] = l(eVar, view, b0Var);
            return iArr;
        }
        if (eVar.J()) {
            c0 c0Var2 = this.g;
            if (c0Var2 != null) {
                c0Var = jl40.l(c0Var2.a, eVar) ? c0Var2 : null;
            }
            c0Var = new c0(eVar);
            this.g = c0Var;
            iArr[1] = l(eVar, view, c0Var);
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.e1
    public final int f(RecyclerView.e eVar, int i, int i2) {
        urk urkVar = (urk) eVar;
        if (urkVar.D() != 0) {
            i = i2;
        } else if (eVar.b.getLayoutDirection() != 0) {
            i = -i;
        }
        int e = i < 0 ? urkVar.e() : urkVar.C();
        if (e != -1) {
            return e;
        }
        int a = urkVar.a();
        int b = urkVar.b();
        if (b == a) {
            if (b == -1) {
                return 0;
            }
        } else if (i < 0) {
            return a;
        }
        return b;
    }

    public final void m(int i) {
        this.f = i;
    }
}
