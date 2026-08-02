package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vr0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                es0 es0Var = (es0) this.b;
                if (!es0Var.getInternalPopup().a()) {
                    es0Var.f.l(es0Var.getTextDirection(), es0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = es0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                bs0 bs0Var = (bs0) this.b;
                es0 es0Var2 = bs0Var.G;
                if (!es0Var2.isAttachedToWindow() || !es0Var2.getGlobalVisibleRect(bs0Var.E)) {
                    bs0Var.dismiss();
                    break;
                } else {
                    bs0Var.s();
                    bs0Var.f();
                    break;
                }
                break;
            case 2:
                q54 q54Var = (q54) this.b;
                ArrayList arrayList = q54Var.h;
                if (q54Var.a() && arrayList.size() > 0 && !((p54) arrayList.get(0)).a.y) {
                    View view = q54Var.o;
                    if (view == null || !view.isShown()) {
                        q54Var.dismiss();
                        break;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((p54) it.next()).a.f();
                        }
                        break;
                    }
                }
                break;
            case 3:
                aqh aqhVar = (aqh) this.b;
                aqhVar.E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = aqhVar.H;
                if (hashSet != null && hashSet.size() != 0) {
                    qph qphVar = new qph(aqhVar, 0);
                    int firstVisiblePosition = aqhVar.E.getFirstVisiblePosition();
                    boolean z = false;
                    for (int i = 0; i < aqhVar.E.getChildCount(); i++) {
                        View childAt = aqhVar.E.getChildAt(i);
                        if (aqhVar.H.contains((irh) aqhVar.F.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(aqhVar.O0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(qphVar);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                    }
                    break;
                } else {
                    aqhVar.i(true);
                    break;
                }
            default:
                ebr ebrVar = (ebr) this.b;
                eyh eyhVar = ebrVar.h;
                if (ebrVar.a() && !eyhVar.y) {
                    View view2 = ebrVar.m;
                    if (view2 == null || !view2.isShown()) {
                        ebrVar.dismiss();
                        break;
                    } else {
                        eyhVar.f();
                        break;
                    }
                }
                break;
        }
    }
}
