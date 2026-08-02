package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.ActionMode;

/* loaded from: classes3.dex */
public abstract class ActionBar {
    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract int getDisplayOptions();

    public Context getThemedContext() {
        return null;
    }

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public void onConfigurationChanged() {
    }

    public void onDestroy() {
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    public abstract void setBackgroundDrawable(ColorDrawable colorDrawable);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutParams);

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayShowCustomEnabled();

    public abstract void setDisplayShowHomeEnabled();

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setStackedBackgroundDrawable(ColorDrawable colorDrawable) {
    }

    public abstract void setTitle();

    public abstract void setTitle(CharSequence charSequence);

    public void setWindowTitle(CharSequence charSequence) {
    }

    public ActionMode startActionMode(AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-2, -2);
            this.gravity = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
