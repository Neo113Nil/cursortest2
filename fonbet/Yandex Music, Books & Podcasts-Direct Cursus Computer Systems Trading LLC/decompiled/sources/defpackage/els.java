package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class els implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lls b;

    public /* synthetic */ els(lls llsVar, int i) {
        this.a = i;
        this.b = llsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r8 > 0.0f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r8 < 0.0f) goto L33;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        int i = 1;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                Object obj3 = gq5.a;
                if (K == obj3) {
                    K = new nls();
                    oq5Var2.k0(K);
                }
                Object obj4 = (nls) K;
                Unit unit = Unit.a;
                boolean f = oq5Var2.f(obj4);
                lls llsVar = this.b;
                boolean h = f | oq5Var2.h(llsVar);
                Object K2 = oq5Var2.K();
                if (h || K2 == obj3) {
                    K2 = new v0r(obj4, llsVar, null, 25);
                    oq5Var2.k0(K2);
                }
                gld.w(oq5Var2, unit, (Function2) K2);
                boolean h2 = oq5Var2.h(llsVar);
                Object K3 = oq5Var2.K();
                if (h2 || K3 == obj3) {
                    Object w4iVar = new w4i(2, llsVar, lls.class, "onDrag", "onDrag(II)V", 0, 20);
                    oq5Var2.k0(w4iVar);
                    K3 = w4iVar;
                }
                Function2 function2 = (Function2) ((h9f) K3);
                boolean h3 = oq5Var2.h(llsVar);
                Object K4 = oq5Var2.K();
                if (h3 || K4 == obj3) {
                    K4 = new r3s(4, llsVar);
                    oq5Var2.k0(K4);
                }
                Function1 function1 = (Function1) K4;
                boolean h4 = oq5Var2.h(llsVar);
                Object K5 = oq5Var2.K();
                if (h4 || K5 == obj3) {
                    K5 = new els(llsVar, i);
                    oq5Var2.k0(K5);
                }
                Function2 function22 = (Function2) K5;
                boolean h5 = oq5Var2.h(llsVar);
                Object K6 = oq5Var2.K();
                if (h5 || K6 == obj3) {
                    K6 = new gls(llsVar, 4);
                    oq5Var2.k0(K6);
                }
                q5g.o(function2, function1, function22, (Function0) K6, ild.C(915316495, new k0r(17, llsVar, obj4), oq5Var2), oq5Var2, 24576);
            default:
                lls llsVar2 = this.b;
                jyr jyrVar = llsVar2.q;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                hls hlsVar = llsVar2.m;
                int i2 = -1;
                int i3 = hlsVar == null ? -1 : ils.a[hlsVar.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        View view = llsVar2.getView();
                        float translationX = view != null ? view.getTranslationX() : 0.0f;
                        boolean z = Math.abs(translationX) > ((Number) llsVar2.s.getValue()).floatValue();
                        boolean z2 = Math.abs(floatValue) > ((float) ((Number) jyrVar.getValue()).intValue());
                        if (z || z2) {
                            if (!z ? floatValue > 0.0f : translationX > 0.0f) {
                                i2 = 1;
                            }
                            View view2 = llsVar2.getView();
                            float translationX2 = view2 != null ? view2.getTranslationX() : 0.0f;
                            float f2 = i2 * llsVar2.getResources().getDisplayMetrics().widthPixels;
                            rar rarVar = llsVar2.l;
                            if (rarVar != null) {
                                rarVar.g(null);
                            }
                            ValueAnimator valueAnimator = llsVar2.k;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            tqn tqnVar = new tqn();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationX2, f2);
                            ofFloat.setDuration(300L);
                            ofFloat.setInterpolator(new DecelerateInterpolator());
                            ofFloat.addUpdateListener(new hr2(17, llsVar2));
                            ofFloat.addListener(new jls(tqnVar, 0));
                            ofFloat.addListener(new kls(tqnVar, llsVar2, 0));
                            ofFloat.start();
                            llsVar2.k = ofFloat;
                        } else {
                            llsVar2.y();
                        }
                    } else if (i3 != 2) {
                        b6e.s();
                        break;
                    } else {
                        Dialog dialog = llsVar2.getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            boolean z3 = ((float) (llsVar2.j - window.getAttributes().y)) > ((Number) llsVar2.r.getValue()).floatValue();
                            if (Math.abs(floatValue2) > ((Number) jyrVar.getValue()).intValue()) {
                                int ordinal = llsVar2.A().ordinal();
                                if (ordinal == 0) {
                                    break;
                                } else if (ordinal != 1) {
                                    b6e.s();
                                    break;
                                } else {
                                    break;
                                }
                            }
                            i = 0;
                            if (z3 || i != 0) {
                                llsVar2.z();
                            } else {
                                llsVar2.y();
                            }
                        }
                    }
                } else {
                    llsVar2.y();
                }
                break;
        }
        return Unit.a;
    }
}
