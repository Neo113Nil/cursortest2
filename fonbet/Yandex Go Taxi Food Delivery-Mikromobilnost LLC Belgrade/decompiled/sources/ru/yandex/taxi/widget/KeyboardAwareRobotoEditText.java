package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.iog0;
import defpackage.xd2;
import defpackage.yjx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J)\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\fJ\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0012¢\u0006\u0004\b2\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00105¨\u00067"}, d2 = {"Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "Lru/yandex/taxi/widget/RobotoEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "checkRefocusOnShow", "()V", "tryToShowKeyboard", "Lyjx;", "onCloseListener", "setOnCloseListener", "(Lyjx;)V", "", "hideKeyboardOnDetach", "setHideKeyboardOnDetach", "(Z)V", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onKeyPreIme", "(ILandroid/view/KeyEvent;)Z", "hasWindowFocus", "onWindowFocusChanged", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "requestFocus", "(ILandroid/graphics/Rect;)Z", "clearFocus", "focusable", "setFocusable", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "touchable", "setTouchable", "Lyjx;", "focusWasRequested", "Z", "isTouchable", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class KeyboardAwareRobotoEditText extends RobotoEditText {
    private boolean focusWasRequested;
    private boolean hideKeyboardOnDetach;
    private boolean isTouchable;
    private yjx onCloseListener;

    public /* synthetic */ KeyboardAwareRobotoEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? iog0.editTextStyle : i);
    }

    private final void checkRefocusOnShow() {
        if (this.focusWasRequested && hasWindowFocus() && isFocusable() && isFocusableInTouchMode()) {
            super.requestFocus();
        }
    }

    private final void tryToShowKeyboard() {
        if (getShowSoftInputOnFocus()) {
            post(new xd2(this, 1));
        }
    }

    @Override // android.view.View
    public void clearFocus() {
        this.focusWasRequested = false;
        super.clearFocus();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.hideKeyboardOnDetach) {
            Object systemService = getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused && hasWindowFocus()) {
            tryToShowKeyboard();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        yjx yjxVar;
        if (keyCode == 4 && event.getAction() == 1 && (yjxVar = this.onCloseListener) != null) {
            yjxVar.onClose();
        }
        return super.onKeyPreIme(keyCode, event);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.isTouchable) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0 && isShown() && !isFocused()) {
            checkRefocusOnShow();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus && isFocused()) {
            tryToShowKeyboard();
        }
        checkRefocusOnShow();
    }

    @Override // android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        this.focusWasRequested = true;
        if (!isShown()) {
            return false;
        }
        if (isFocused() && hasWindowFocus()) {
            tryToShowKeyboard();
            return true;
        }
        this.focusWasRequested = false;
        return super.requestFocus(direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        if (!focusable) {
            this.focusWasRequested = false;
        }
        super.setFocusable(focusable);
    }

    public final void setHideKeyboardOnDetach(boolean hideKeyboardOnDetach) {
        this.hideKeyboardOnDetach = hideKeyboardOnDetach;
    }

    public final void setOnCloseListener(yjx onCloseListener) {
        this.onCloseListener = onCloseListener;
    }

    public final void setTouchable(boolean touchable) {
        this.isTouchable = touchable;
    }

    public KeyboardAwareRobotoEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public KeyboardAwareRobotoEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTouchable = true;
        this.hideKeyboardOnDetach = true;
    }

    public KeyboardAwareRobotoEditText(Context context) {
        this(context, null, 0, 6, null);
    }
}
