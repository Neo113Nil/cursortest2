package com.google.android.material.dialog;

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
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    public final MaterialShapeDrawable background;
    public final Rect backgroundInsets;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialAlertDialogBuilder(Context context) {
        super(r0 != 0 ? new ContextThemeWrapper(r14, r0) : r14, R.style.MiSnapTheme_Dialog);
        TypedValue resolve = MaterialAttributes.resolve(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i = resolve == null ? 0 : resolve.data;
        Context wrap = MaterialThemeOverlay.wrap(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        ViewUtils.checkCompatibleTheme(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = R$styleable.MaterialAlertDialog;
        ViewUtils.checkTextAppearance(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.backgroundInsets = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int resolveColor = MaterialColors.resolveColor(context2, MaterialAttributes.resolveTypedValueOrThrow(context2, R.attr.colorSurface, MaterialAlertDialogBuilder.class.getCanonicalName()));
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes2.getColor(4, resolveColor);
        obtainStyledAttributes2.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= RecyclerView.DECELERATION_RATE) {
            materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.drawableState.shapeAppearance.withCornerSize(dimension));
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        MaterialShapeDrawable materialShapeDrawable = this.background;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(decorView.getElevation());
        }
        Rect rect = this.backgroundInsets;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) materialShapeDrawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, rect));
        return create;
    }

    public final void setMessage(int i) {
        AlertController.AlertParams alertParams = this.P;
        alertParams.mMessage = alertParams.mContext.getText(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    public final void setTitle(int i) {
        AlertController.AlertParams alertParams = this.P;
        alertParams.mTitle = alertParams.mContext.getText(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final MaterialAlertDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final MaterialAlertDialogBuilder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    public final MaterialAlertDialogBuilder setTitle(String str) {
        return (MaterialAlertDialogBuilder) super.setTitle((CharSequence) str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }
}
