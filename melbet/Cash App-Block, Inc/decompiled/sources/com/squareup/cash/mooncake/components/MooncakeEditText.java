package com.squareup.cash.mooncake.components;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.core.graphics.ColorUtils;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.util.Strings;
import com.squareup.util.android.ColorsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class MooncakeEditText extends AppCompatEditText {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy inputMethodManager$delegate;
    public boolean suppressSoftInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.inputMethodManager$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new CameraX$$ExternalSyntheticLambda0(context, 10));
        setPadding(0, 0, 0, 0);
        setGravity(16);
        setBackground(null);
        setSingleLine(true);
        Strings.applyStyle(this, TextStyles.input);
        setTextColor(ColorsKt.colorStateListOf(new Pair(new int[]{R.attr.state_enabled}, Integer.valueOf(colorPalette.label)), new Pair(new int[]{-16842910}, Integer.valueOf(colorPalette.disabledLabel))));
        setHintTextColor(colorPalette.placeholderLabel);
        int i = colorPalette.cursor;
        setHighlightColor(ColorUtils.setAlphaComponent(i, 102));
        Context context2 = getContext();
        context2.getClass();
        setTextCursorDrawable(PlatformKt.getDrawableCompat(context2, com.squareup.cash.R.drawable.default_cursor, Integer.valueOf(i)));
        Drawable textSelectHandleLeft = getTextSelectHandleLeft();
        if (textSelectHandleLeft != null) {
            textSelectHandleLeft.mutate();
            textSelectHandleLeft.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
            setTextSelectHandleLeft(textSelectHandleLeft);
        }
        Drawable textSelectHandleRight = getTextSelectHandleRight();
        if (textSelectHandleRight != null) {
            textSelectHandleRight.mutate();
            textSelectHandleRight.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
            setTextSelectHandleRight(textSelectHandleRight);
        }
        Drawable textSelectHandle = getTextSelectHandle();
        if (textSelectHandle != null) {
            textSelectHandle.mutate();
            textSelectHandle.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
            setTextSelectHandle(textSelectHandle);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MooncakeEditText);
        obtainStyledAttributes.getClass();
        setSuppressSoftInput(obtainStyledAttributes.getBoolean(0, this.suppressSoftInput));
        obtainStyledAttributes.recycle();
    }

    public final void hideKeyboard() {
        IBinder applicationWindowToken = getApplicationWindowToken();
        if (applicationWindowToken != null) {
            ((InputMethodManager) this.inputMethodManager$delegate.getValue()).hideSoftInputFromWindow(applicationWindowToken, 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.suppressSoftInput && z) {
            hideKeyboard();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.suppressSoftInput) {
            hideKeyboard();
            clearComposingText();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.suppressSoftInput) {
            return super.onTouchEvent(motionEvent);
        }
        boolean hasFocus = hasFocus();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!hasFocus) {
            Editable text = getText();
            text.getClass();
            setSelection(text.length());
        }
        hideKeyboard();
        return onTouchEvent;
    }

    public final void setSuppressSoftInput(boolean z) {
        setShowSoftInputOnFocus(!z);
        this.suppressSoftInput = z;
    }

    public /* synthetic */ MooncakeEditText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
