package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class dz6 implements dv8 {
    public final ny6 b;
    public final ahu c;
    public final g0c d;

    public dz6(ny6 ny6Var, ahu ahuVar, g0c g0cVar) {
        this.b = ny6Var;
        this.c = ahuVar;
        this.d = g0cVar;
    }

    @Override // defpackage.dv8
    public final boolean b(String str) {
        str.getClass();
        return Intrinsics.d(str, "cvv_confirm_fragment_cvv_input_type") || Intrinsics.d(str, "apply_button_progress") || Intrinsics.d(str, "card_input") || Intrinsics.d(str, "blur_animated") || Intrinsics.d(str, "spinner") || Intrinsics.d(str, "challengerTextField");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dv8
    public final View c(yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        xzbVar.getClass();
        FrameLayout frameLayout = new FrameLayout(gc8Var.getContext());
        String str = yu8Var.j;
        switch (str.hashCode()) {
            case -2004438503:
                if (str.equals("spinner")) {
                    View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.paymentsdk_dk_progress_layout, (ViewGroup) frameLayout, false);
                    if (((ProgressBar) dag.v(R.id.progress_bar, inflate)) != null) {
                        frameLayout.addView((LinearLayout) inflate);
                        return frameLayout;
                    }
                    jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progress_bar)));
                    return null;
                }
                return frameLayout;
            case -485753505:
                if (str.equals("cvv_confirm_fragment_cvv_input_type")) {
                    Context context = gc8Var.getContext();
                    context.getClass();
                    f2a f2aVar = new f2a(context, null, 0, 6, null);
                    f2aVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    f2aVar.setEventReporter(this.d);
                    frameLayout.addView(f2aVar);
                    return frameLayout;
                }
                return frameLayout;
            case 945008251:
                if (str.equals("blur_animated")) {
                    Context context2 = gc8Var.getContext();
                    context2.getClass();
                    frameLayout.addView(new b17(context2, null, 2, null));
                    return frameLayout;
                }
                return frameLayout;
            case 983673307:
                if (str.equals("card_input")) {
                    Context context3 = frameLayout.getContext();
                    context3.getClass();
                    c17 c17Var = new c17(context3, null, 2, null);
                    c17Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    frameLayout.addView(c17Var);
                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return frameLayout;
                }
                return frameLayout;
            case 1525678537:
                if (str.equals("apply_button_progress")) {
                    View inflate2 = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.paymentsdk_progress_layout, (ViewGroup) frameLayout, false);
                    if (inflate2 == null) {
                        jj4.j("rootView");
                        return null;
                    }
                    ProgressBar progressBar = (ProgressBar) inflate2;
                    Resources.Theme theme = frameLayout.getContext().getTheme();
                    theme.getClass();
                    progressBar.setIndeterminateTintList(ColorStateList.valueOf(bfg.E(theme, R.attr.paymentsdk_is_light_theme, true) ? -1 : -16777216));
                    frameLayout.addView(progressBar);
                    return frameLayout;
                }
                return frameLayout;
            case 1997126686:
                if (str.equals("challengerTextField")) {
                    Context context4 = frameLayout.getContext();
                    context4.getClass();
                    t17 t17Var = new t17(context4, null, 0, 6, null);
                    t17Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    frameLayout.addView(t17Var);
                    return frameLayout;
                }
                return frameLayout;
            default:
                return frameLayout;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.jvm.functions.Function1, uif] */
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
            if (childAt instanceof f2a) {
                f2a f2aVar = (f2a) childAt;
                this.b.a.invoke(f2aVar);
                vwb.W((EditText) f2aVar.a.d);
            } else {
                boolean z = childAt instanceof c17;
                ahu ahuVar = this.c;
                if (z) {
                    ahuVar.a.invoke(childAt);
                } else if (childAt instanceof b17) {
                    ahuVar.a.invoke(childAt);
                } else if (childAt instanceof t17) {
                    ahuVar.a.invoke(childAt);
                    ((t17) childAt).b();
                }
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
