package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yandex.passport.internal.ui.e;

/* loaded from: classes11.dex */
public final class x610 extends AlertDialog.a {
    public static final int e = iog0.alertDialogStyle;
    public static final int f = g2i0.MaterialAlertDialog_MaterialComponents;
    public static final int g = eng0.materialAlertDialogTheme;
    public final MaterialShapeDrawable c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x610(Context context, int i) {
        super(r5, r8 != null ? r8.data : 0);
        int i2 = g;
        TypedValue a = z610.a(i2, context);
        int i3 = a == null ? 0 : a.data;
        int i4 = e;
        int i5 = f;
        Context b = g810.b(context, null, i4, i5);
        b = i3 != 0 ? new ContextThemeWrapper(b, i3) : b;
        TypedValue a2 = z610.a(i2, context);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        this.d = zib1.g(context2, i4, i5);
        int T = vez0.T(context2, z610.f(context2, eng0.colorSurface, x610.class.getCanonicalName()));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, z2i0.MaterialAlertDialog, i4, i5);
        int color = obtainStyledAttributes.getColor(z2i0.MaterialAlertDialog_backgroundTint, T);
        obtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i4, i5);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            materialShapeDrawable.setCornerSize(dimension);
        }
        this.c = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a a() {
        throw null;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a b(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a c(int i) {
        super.c(i);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        MaterialShapeDrawable materialShapeDrawable = this.c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) materialShapeDrawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, rect));
        return create;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a d(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.e(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a f(int i, DialogInterface.OnClickListener onClickListener) {
        super.f(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a g(e eVar) {
        this.a.n = eVar;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a i(int i) {
        throw null;
    }

    public final x610 j(DialogInterface.OnClickListener onClickListener) {
        return (x610) super.setNegativeButton(R.string.cancel, onClickListener);
    }

    public final x610 k(DialogInterface.OnClickListener onClickListener) {
        return (x610) super.setPositiveButton(R.string.ok, onClickListener);
    }

    public final void l(String str, ow4 ow4Var) {
        super.h(str, ow4Var);
    }

    public final x610 m(String str) {
        return (x610) super.setTitle(str);
    }

    public final void n() {
        super.i(R.string.dialog_alert_title);
    }

    public final x610 o(View view) {
        return (x610) super.setView(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (x610) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (x610) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a setTitle(CharSequence charSequence) {
        return (x610) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.a
    public final AlertDialog.a setView(View view) {
        return (x610) super.setView(view);
    }
}
