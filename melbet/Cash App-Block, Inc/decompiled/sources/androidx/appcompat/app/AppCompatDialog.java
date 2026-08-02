package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import com.squareup.cash.R;

/* loaded from: classes3.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    public AppCompatDelegate mDelegate;
    public final AppCompatDialog$$ExternalSyntheticLambda0 mKeyDispatcher;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatDialog(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.mKeyDispatcher = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        delegate.setTheme(i);
        delegate.onCreate(null);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return KeyEventDispatcher.dispatchKeyEvent(this.mKeyDispatcher, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return getDelegate().findViewById(i);
    }

    public final AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }
}
