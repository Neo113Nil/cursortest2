package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* loaded from: classes10.dex */
public final class t82 {
    public static final t82 a = new t82();

    public static PointerIcon b(Context context, wvd0 wvd0Var) {
        return wvd0Var instanceof tb2 ? PointerIcon.getSystemIcon(context, ((tb2) wvd0Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    public final void a(View view, wvd0 wvd0Var) {
        PointerIcon b = b(view.getContext(), wvd0Var);
        if (jl40.l(view.getPointerIcon(), b)) {
            return;
        }
        view.setPointerIcon(b);
    }
}
