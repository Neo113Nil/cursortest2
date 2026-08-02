package defpackage;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class v09 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v09(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                hh9 hh9Var = (hh9) this.b;
                if (hh9Var.getItemAnimator() == null) {
                    hh9Var.setItemAnimator((von) this.c);
                    break;
                }
                break;
            case 1:
                evj evjVar = (evj) this.b;
                view.getClass();
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    vtm vtmVar = (vtm) this.c;
                    d7r d7rVar = (d7r) evjVar.f;
                    if (d7rVar != null) {
                        evjVar.f = null;
                        ((aqd) vtmVar.a).m().postOnAnimation(new zvh(29, vtmVar, d7rVar));
                        break;
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                pcg.x((ImageView) this.b, (View) this.c);
                break;
        }
    }
}
