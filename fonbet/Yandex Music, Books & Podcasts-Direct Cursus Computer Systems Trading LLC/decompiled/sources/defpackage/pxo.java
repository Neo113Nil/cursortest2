package defpackage;

import android.view.Window;

/* loaded from: classes3.dex */
public final class pxo implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pxo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // defpackage.na8
    public final void a() {
        switch (this.a) {
            case 0:
                vp5 vp5Var = (vp5) this.c;
                mxo mxoVar = (mxo) this.d;
                mxoVar.getClass();
                vp5Var.b.remove(mxoVar);
                lum lumVar = vp5Var.a;
                ((y1f) ((w1f) lumVar.c).c).f(!r2.isEmpty());
                if (this.b) {
                    lumVar.F();
                    break;
                }
                break;
            default:
                Window window = (Window) this.c;
                window.getClass();
                bzr bzrVar = (bzr) this.d;
                c9g.u(window, vyr.StatusBar, bzrVar.a);
                if (this.b) {
                    c9g.u(window, vyr.NavigationBar, bzrVar.b);
                    break;
                }
                break;
        }
    }
}
