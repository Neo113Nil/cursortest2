package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class sht {
    public static final jyr a = btf.b(new hft(3));
    public static final jyr b = btf.b(new hft(4));

    public static final void a(Context context, Dialog dialog) {
        context.getClass();
        dialog.getClass();
        Window window = dialog.getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ColorDrawable(weo.M(context, R.attr.navigationBarColor))});
            layerDrawable.setLayerInsetTop(1, displayMetrics.heightPixels);
            window.setBackgroundDrawable(layerDrawable);
        }
    }

    public static final DisplayMetrics b(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    public static final void c(float f, boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setAlpha(f);
            }
            if (z && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    c(f, true, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static final void d(TextView textView, CharSequence charSequence) {
        textView.getClass();
        e(textView, charSequence);
    }

    public static final void e(TextView textView, CharSequence charSequence) {
        textView.getClass();
        if (charSequence == null || StringsKt.U(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
