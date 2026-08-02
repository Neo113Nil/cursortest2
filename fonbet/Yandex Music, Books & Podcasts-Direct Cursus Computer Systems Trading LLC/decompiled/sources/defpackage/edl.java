package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class edl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jdl b;

    public /* synthetic */ edl(jdl jdlVar, int i) {
        this.a = i;
        this.b = jdlVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Pair pair;
        Float f;
        switch (this.a) {
            case 0:
                Context requireContext = this.b.requireContext();
                requireContext.getClass();
                y5g.o0(requireContext, (String) obj);
                return Unit.a;
            case 1:
                ((Boolean) obj).getClass();
                CoordinatorLayout coordinatorLayout = this.b.t;
                if (coordinatorLayout != null) {
                    coordinatorLayout.requestLayout();
                    return Unit.a;
                }
                Intrinsics.j("coordinator");
                throw null;
            case 2:
                CoordinatorLayout coordinatorLayout2 = this.b.t;
                if (coordinatorLayout2 != null) {
                    coordinatorLayout2.requestLayout();
                    return Unit.a;
                }
                Intrinsics.j("coordinator");
                throw null;
            case 3:
                jdl jdlVar = this.b;
                ObjectAnimator objectAnimator = jdlVar.B;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ComposeView composeView = jdlVar.r;
                jdlVar.B = composeView != null ? o2g.i0(composeView) : null;
                return Unit.a;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                jdl jdlVar2 = this.b;
                ComposeView composeView2 = jdlVar2.r;
                if (composeView2 == null) {
                    return Unit.a;
                }
                if (composeView2.getHeight() == 0) {
                    i46 i46Var = new i46(composeView2, Boolean.TRUE, new hdl(composeView2, jdlVar2, floatValue));
                    composeView2.getViewTreeObserver().addOnPreDrawListener(i46Var);
                    composeView2.addOnAttachStateChangeListener(i46Var);
                } else {
                    jdl.A(jdlVar2, floatValue);
                }
                return Unit.a;
            case 5:
                hve hveVar = (hve) obj;
                if (hveVar instanceof eve) {
                    f = new Float(0.0f);
                    pair = new Pair(new Integer(4), Boolean.valueOf(((eve) hveVar).a));
                } else if (hveVar instanceof fve) {
                    f = new Float(1.0f);
                    pair = new Pair(new Integer(3), Boolean.valueOf(((fve) hveVar).a));
                } else {
                    if (!Intrinsics.d(hveVar, gve.a)) {
                        b6e.s();
                        return null;
                    }
                    pair = new Pair(new Integer(5), Boolean.FALSE);
                    f = null;
                }
                int intValue = ((Number) pair.a).intValue();
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                jdl jdlVar3 = this.b;
                BottomSheetBehavior bottomSheetBehavior = jdlVar3.s;
                if (bottomSheetBehavior == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                bottomSheetBehavior.setHideable(intValue == 5);
                BottomSheetBehavior bottomSheetBehavior2 = jdlVar3.s;
                if (bottomSheetBehavior2 == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                if (bottomSheetBehavior2.getState() != intValue) {
                    BottomSheetBehavior bottomSheetBehavior3 = jdlVar3.s;
                    if (bottomSheetBehavior3 == null) {
                        Intrinsics.j("behavior");
                        throw null;
                    }
                    bottomSheetBehavior3.setState(intValue);
                }
                BottomSheetBehavior bottomSheetBehavior4 = jdlVar3.s;
                if (bottomSheetBehavior4 == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                bottomSheetBehavior4.setDraggable(booleanValue);
                BottomSheetBehavior bottomSheetBehavior5 = jdlVar3.s;
                if (bottomSheetBehavior5 == null) {
                    Intrinsics.j("behavior");
                    throw null;
                }
                if (bottomSheetBehavior5.getState() != 2 && f != null) {
                    xdr xdrVar = jdlVar3.x;
                    xdrVar.getClass();
                    xdrVar.m(null, f);
                    azr azrVar = jdlVar3.y;
                    if (azrVar != null) {
                        ComposeView composeView3 = jdlVar3.r;
                        if (composeView3 == null) {
                            xq0.x("Required value was null.");
                            return null;
                        }
                        azrVar.b(composeView3, f.floatValue());
                    }
                }
                boolean z = hveVar instanceof fve;
                g1e g1eVar = jdlVar3.C;
                if (!z) {
                    if (g1eVar != null) {
                        g1eVar.remove();
                    }
                    jdlVar3.C = null;
                } else if (g1eVar == null) {
                    jdlVar3.C = new g1e(2, jdlVar3);
                    qpj onBackPressedDispatcher = jdlVar3.requireActivity().getOnBackPressedDispatcher();
                    g1e g1eVar2 = jdlVar3.C;
                    g1eVar2.getClass();
                    onBackPressedDispatcher.getClass();
                    onBackPressedDispatcher.b(g1eVar2);
                }
                return Unit.a;
            default:
                CoordinatorLayout coordinatorLayout3 = this.b.t;
                if (coordinatorLayout3 != null) {
                    coordinatorLayout3.requestLayout();
                    return Unit.a;
                }
                Intrinsics.j("coordinator");
                throw null;
        }
    }
}
