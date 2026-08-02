package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class abl implements f8l, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ nbl a;

    public abl(nbl nblVar) {
        this.a = nblVar;
    }

    @Override // defpackage.f8l
    public final void N(i8l i8lVar, e8l e8lVar) {
        xgc xgcVar = e8lVar.a;
        boolean a = xgcVar.a(4, 5, 13);
        nbl nblVar = this.a;
        if (a) {
            float[] fArr = nbl.g1;
            nblVar.l();
        }
        if (xgcVar.a(4, 5, 7, 13)) {
            float[] fArr2 = nbl.g1;
            nblVar.n();
        }
        if (xgcVar.a(8, 13)) {
            float[] fArr3 = nbl.g1;
            nblVar.o();
        }
        if (xgcVar.a(9, 13)) {
            float[] fArr4 = nbl.g1;
            nblVar.q();
        }
        if (xgcVar.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = nbl.g1;
            nblVar.k();
        }
        if (xgcVar.a(11, 0, 13)) {
            float[] fArr6 = nbl.g1;
            nblVar.r();
        }
        if (xgcVar.a(12, 13)) {
            float[] fArr7 = nbl.g1;
            nblVar.m();
        }
        if (xgcVar.a(2, 13)) {
            float[] fArr8 = nbl.g1;
            nblVar.s();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nbl nblVar = this.a;
        ImageView imageView = nblVar.w;
        View view2 = nblVar.B;
        View view3 = nblVar.A;
        View view4 = nblVar.z;
        sbl sblVar = nblVar.a;
        i8l i8lVar = nblVar.P0;
        if (i8lVar == null) {
            return;
        }
        sblVar.g();
        if (nblVar.n == view) {
            if (i8lVar.V0(9)) {
                i8lVar.b0();
                return;
            }
            return;
        }
        if (nblVar.m == view) {
            if (i8lVar.V0(7)) {
                i8lVar.K();
                return;
            }
            return;
        }
        if (nblVar.p == view) {
            if (i8lVar.c() == 4 || !i8lVar.V0(12)) {
                return;
            }
            i8lVar.F0();
            return;
        }
        if (nblVar.q == view) {
            if (i8lVar.V0(11)) {
                i8lVar.G0();
                return;
            }
            return;
        }
        if (nblVar.o == view) {
            if (dvt.i0(i8lVar, nblVar.U0)) {
                dvt.P(i8lVar);
                return;
            } else {
                if (i8lVar.V0(1)) {
                    i8lVar.b();
                    return;
                }
                return;
            }
        }
        if (nblVar.t == view) {
            if (i8lVar.V0(15)) {
                int g = i8lVar.g();
                int i = nblVar.Z0;
                for (int i2 = 1; i2 <= 2; i2++) {
                    int i3 = (g + i2) % 3;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2 && (i & 2) != 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    g = i3;
                }
                i8lVar.w0(g);
                return;
            }
            return;
        }
        if (nblVar.u == view) {
            if (i8lVar.V0(14)) {
                i8lVar.h0(!i8lVar.C0());
                return;
            }
            return;
        }
        if (view4 == view) {
            sblVar.f();
            nblVar.d(nblVar.f, view4);
            return;
        }
        if (view3 == view) {
            sblVar.f();
            nblVar.d(nblVar.g, view3);
        } else if (view2 == view) {
            sblVar.f();
            nblVar.d(nblVar.i, view2);
        } else if (imageView == view) {
            sblVar.f();
            nblVar.d(nblVar.h, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nbl nblVar = this.a;
        if (nblVar.f1) {
            nblVar.a.g();
        }
    }
}
