package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class j1a extends kvc implements yp8, p7t {
    public final /* synthetic */ q7t l;

    public j1a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new q7t();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 0) {
            super.addView(view, 0, layoutParams);
        } else {
            xq0.x("ViewWrapper can host only one child view");
        }
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.l.d(view);
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.l.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        KeyEvent.Callback child = getChild();
        yp8 yp8Var = child instanceof yp8 ? (yp8) child : null;
        if (yp8Var != null) {
            yp8Var.g(e23Var, op8Var, view);
        }
    }

    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        yp8 yp8Var = child instanceof yp8 ? (yp8) child : null;
        if (yp8Var != null) {
            return yp8Var.getDivBorderDrawer();
        }
        return null;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        yp8 yp8Var = child instanceof yp8 ? (yp8) child : null;
        if (yp8Var != null) {
            return yp8Var.getNeedClipping();
        }
        return true;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.l.h(view);
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        KeyEvent.Callback child = getChild();
        yp8 yp8Var = child instanceof yp8 ? (yp8) child : null;
        if (yp8Var == null) {
            return;
        }
        yp8Var.setNeedClipping(z);
    }

    public j1a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ j1a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public j1a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
