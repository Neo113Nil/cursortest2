package B0;

import O.h0;
import O.j0;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class e implements L0.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43b;

    public e(M.f fVar, boolean z2) {
        this.f43b = fVar;
        this.f42a = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // L0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0 a(View view, j0 j0Var, L0.p pVar) {
        boolean z2;
        boolean z3;
        h0 h0Var = j0Var.f819a;
        G.c f2 = h0Var.f(7);
        G.c f3 = h0Var.f(32);
        int i = f2.f262b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f43b;
        bottomSheetBehavior.f2415w = i;
        boolean f4 = L0.m.f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.f2407o) {
            int a2 = j0Var.a();
            bottomSheetBehavior.f2414v = a2;
            paddingBottom = a2 + pVar.f523d;
        }
        boolean z4 = bottomSheetBehavior.f2408p;
        int i2 = f2.f261a;
        if (z4) {
            paddingLeft = (f4 ? pVar.f522c : pVar.f520a) + i2;
        }
        boolean z5 = bottomSheetBehavior.f2409q;
        int i3 = f2.f263c;
        if (z5) {
            paddingRight = (f4 ? pVar.f520a : pVar.f522c) + i3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f2411s || marginLayoutParams.leftMargin == i2) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i2;
            z2 = true;
        }
        if (bottomSheetBehavior.f2412t && marginLayoutParams.rightMargin != i3) {
            marginLayoutParams.rightMargin = i3;
            z2 = true;
        }
        if (bottomSheetBehavior.f2413u) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = f2.f262b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
                if (z6) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = this.f42a;
                if (z3) {
                    bottomSheetBehavior.f2405m = f3.f264d;
                }
                if (!bottomSheetBehavior.f2407o || z3) {
                    bottomSheetBehavior.O();
                }
                return j0Var;
            }
        }
        z6 = z2;
        if (z6) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = this.f42a;
        if (z3) {
        }
        if (!bottomSheetBehavior.f2407o) {
        }
        bottomSheetBehavior.O();
        return j0Var;
    }

    public boolean b() {
        return this.f42a;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((M.f) this.f43b) == null) {
            return b();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            e eVar = M.g.f601a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return b();
        }
        return false;
    }

    public e(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f43b = bottomSheetBehavior;
        this.f42a = z2;
    }
}
