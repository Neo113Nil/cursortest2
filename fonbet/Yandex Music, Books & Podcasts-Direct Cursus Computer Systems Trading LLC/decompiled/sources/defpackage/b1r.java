package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class b1r extends ju2 {
    public static final int[] C = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A;
    public boolean B;

    public b1r(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static b1r g(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            xq0.x("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        b1r b1rVar = new b1r(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) b1rVar.i.getChildAt(0)).getMessageView().setText(charSequence);
        b1rVar.k = i;
        return b1rVar;
    }

    public final void h(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.B = false;
        } else {
            this.B = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new fq2(8, this, onClickListener));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0028, code lost:
    
        if (r1.isTouchExplorationEnabled() != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        x3n h0 = x3n.h0();
        AccessibilityManager accessibilityManager = this.A;
        int i = this.k;
        boolean z = false;
        if (i != -2) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z2 = this.B;
            if (i2 >= 29) {
                i = accessibilityManager.getRecommendedTimeoutMillis(i, (z2 ? 4 : 0) | 3);
            } else if (z2) {
            }
            gu2 gu2Var = this.t;
            synchronized (h0.a) {
                try {
                    if (h0.o0(gu2Var)) {
                        m1r m1rVar = (m1r) h0.c;
                        m1rVar.b = i;
                        ((Handler) h0.b).removeCallbacksAndMessages(m1rVar);
                        h0.K0((m1r) h0.c);
                        return;
                    }
                    m1r m1rVar2 = (m1r) h0.d;
                    if (m1rVar2 != null && m1rVar2.a.get() == gu2Var) {
                        z = true;
                    }
                    if (z) {
                        ((m1r) h0.d).b = i;
                    } else {
                        h0.d = new m1r(i, gu2Var);
                    }
                    m1r m1rVar3 = (m1r) h0.c;
                    if (m1rVar3 == null || !h0.X(m1rVar3, 4)) {
                        h0.c = null;
                        h0.N0();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i = -2;
        gu2 gu2Var2 = this.t;
        synchronized (h0.a) {
        }
    }
}
