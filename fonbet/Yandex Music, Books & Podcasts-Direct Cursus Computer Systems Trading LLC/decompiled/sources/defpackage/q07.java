package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q07 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ u07 b;

    public /* synthetic */ q07(u07 u07Var, int i) {
        this.a = i;
        this.b = u07Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        int i2 = 0;
        u07 u07Var = this.b;
        switch (i) {
            case 0:
                f6j f6jVar = (f6j) obj;
                if (Intrinsics.d(f6jVar, f6j.a)) {
                    z07 A = u07Var.A();
                    if (A.B == null) {
                        A.B = Boolean.FALSE;
                    }
                    u07Var.z = false;
                    gc8 gc8Var = u07Var.l;
                    if (gc8Var != null) {
                        gc8Var.N("card_input_screen_nfc_visibility", "gone");
                    }
                } else if (Intrinsics.d(f6jVar, f6j.b)) {
                    z07 A2 = u07Var.A();
                    if (A2.B == null) {
                        A2.B = Boolean.TRUE;
                    }
                    if (u07Var.A) {
                        u07Var.z = true;
                        gc8 gc8Var2 = u07Var.l;
                        if (gc8Var2 != null) {
                            gc8Var2.N("card_input_screen_nfc_visibility", "visible");
                        }
                    }
                } else if (Intrinsics.d(f6jVar, f6j.c)) {
                    u07Var.z = false;
                    gc8 gc8Var3 = u07Var.l;
                    if (gc8Var3 != null) {
                        gc8Var3.N("card_input_screen_nfc_visibility", "gone");
                    }
                }
                break;
            case 1:
                hw8 hw8Var = (hw8) obj;
                gc8 gc8Var4 = u07Var.l;
                if (gc8Var4 == null || !Intrinsics.d(gc8Var4.getParent(), (FrameLayout) u07Var.y().c)) {
                    gc8 gc8Var5 = new gc8((vb8) u07Var.w.getValue(), null, 0, 6, null);
                    gc8Var5.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    gc8Var5.setId(View.generateViewId());
                    u07Var.l = gc8Var5;
                }
                if (((FrameLayout) u07Var.y().c).getChildCount() == 0) {
                    ((FrameLayout) u07Var.y().c).addView(u07Var.l);
                }
                gc8 gc8Var6 = u07Var.l;
                if (gc8Var6 != null) {
                    rv8 rv8Var = hw8Var.a;
                    gc8Var6.M(rv8Var, new dw8(rv8Var.b));
                }
                gc8 gc8Var7 = u07Var.l;
                if (gc8Var7 != null) {
                    gc8Var7.post(new jt6(5, hw8Var, u07Var));
                }
                ((x60) u07Var.z()).a(gut.m1(d0n.DK_BIND));
                dzf viewLifecycleOwner = u07Var.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
                dq7 dq7Var = ca8.a;
                x97.y(F, j5h.a, null, new r07(u07Var, null, i2), 2);
                break;
            default:
                e6j e6jVar = (e6j) obj;
                String str = e6jVar.a;
                String str2 = e6jVar.b;
                k17 k17Var = u07Var.h;
                if (k17Var != null) {
                    k17Var.post(new cy1(9, u07Var, str, str2));
                }
                ((x60) u07Var.z()).a(gut.f0());
                break;
        }
        return Unit.a;
    }
}
