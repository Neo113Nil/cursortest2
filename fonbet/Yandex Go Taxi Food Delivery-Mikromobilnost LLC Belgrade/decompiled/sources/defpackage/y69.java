package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.x;

/* loaded from: classes6.dex */
public class y69 extends x {
    public c0 f;
    public b0 g;

    public static int l(View view, d0 d0Var, boolean z) {
        float y;
        int height;
        if (z) {
            y = view.getX();
            height = view.getWidth();
        } else {
            y = view.getY();
            height = view.getHeight();
        }
        return ((int) ((height / 2.0f) + y)) - (d0Var.f() / 2);
    }

    public static View m(RecyclerView.e eVar, d0 d0Var) {
        int abs;
        int d0 = eVar.d0();
        View view = null;
        if (d0 == 0) {
            return null;
        }
        int f = d0Var.f() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < d0; i2++) {
            View c0 = eVar.c0(i2);
            if (c0 != null && (abs = Math.abs(((int) (c0.getX() + (c0.getWidth() / 2))) - f)) < i) {
                view = c0;
                i = abs;
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L11;
     */
    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(RecyclerView.e eVar, View view) {
        c0 c0Var;
        int[] iArr = new int[2];
        if (eVar.I()) {
            b0 b0Var = this.g;
            if (b0Var != null) {
                if (!jl40.l(b0Var.a, eVar)) {
                    b0Var = null;
                }
            }
            b0Var = new b0(eVar);
            this.g = b0Var;
            iArr[0] = l(view, b0Var, true);
        } else {
            iArr[0] = 0;
        }
        if (!eVar.J()) {
            iArr[1] = 0;
            return iArr;
        }
        c0 c0Var2 = this.f;
        if (c0Var2 != null) {
            c0Var = jl40.l(c0Var2.a, eVar) ? c0Var2 : null;
        }
        c0Var = new c0(eVar);
        this.f = c0Var;
        iArr[1] = l(view, c0Var, false);
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View e(RecyclerView.e eVar) {
        b0 b0Var;
        c0 c0Var;
        if (eVar.J()) {
            c0 c0Var2 = this.f;
            if (c0Var2 != null) {
                c0Var = jl40.l(c0Var2.a, eVar) ? c0Var2 : null;
            }
            c0Var = new c0(eVar);
            this.f = c0Var;
            return m(eVar, c0Var);
        }
        if (!eVar.I()) {
            return null;
        }
        b0 b0Var2 = this.g;
        if (b0Var2 != null) {
            b0Var = jl40.l(b0Var2.a, eVar) ? b0Var2 : null;
        }
        b0Var = new b0(eVar);
        this.g = b0Var;
        return m(eVar, b0Var);
    }
}
