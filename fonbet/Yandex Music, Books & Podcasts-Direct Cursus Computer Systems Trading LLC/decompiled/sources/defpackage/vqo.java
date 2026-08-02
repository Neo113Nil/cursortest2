package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vqo implements dv8 {
    public final ahu b;

    public vqo(ahu ahuVar) {
        this.b = ahuVar;
    }

    @Override // defpackage.dv8
    public final jf9 a(yu8 yu8Var, ff9 ff9Var) {
        ff9Var.getClass();
        return gos.c;
    }

    @Override // defpackage.dv8
    public final boolean b(String str) {
        str.getClass();
        return Intrinsics.d(str, "search_field");
    }

    @Override // defpackage.dv8
    public final View c(yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        xzbVar.getClass();
        FrameLayout frameLayout = new FrameLayout(gc8Var.getContext());
        if (Intrinsics.d(yu8Var.j, "search_field")) {
            Context context = gc8Var.getContext();
            context.getClass();
            u37 u37Var = new u37(context, null, 2, null);
            u37Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(u37Var);
        }
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.dv8
    public final void e(View view, yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        view.getClass();
        xzbVar.getClass();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof u37) {
                this.b.a.invoke(childAt);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.dv8
    public final void d(View view, yu8 yu8Var) {
    }
}
