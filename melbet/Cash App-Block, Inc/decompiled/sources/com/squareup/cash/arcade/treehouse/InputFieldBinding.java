package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;

/* loaded from: classes5.dex */
public final class InputFieldBinding implements ChangeListener, Widget {
    public Boolean autoCorrectEnabled;
    public int capitalization;
    public final ParcelableSnapshotMutableState helperText$delegate;
    public int imeAction;
    public final ParcelableSnapshotMutableState isError$delegate;
    public final ParcelableSnapshotMutableState isPassword$delegate;
    public final ParcelableSnapshotMutableState keyboardOptions$delegate;
    public boolean keyboardOptionsChanged;
    public int keyboardType;
    public final ParcelableSnapshotMutableState label$delegate;
    public final ParcelableSnapshotMutableState leadingIcon$delegate;
    public final ParcelableSnapshotMutableState leadingIconContentDescription$delegate;
    public final ParcelableSnapshotMutableState lineLimits$delegate;
    public final ParcelableSnapshotMutableState onChange$delegate;
    public final ParcelableSnapshotMutableState onFocusChange$delegate;
    public final ParcelableSnapshotMutableState onKeyboardAction$delegate;
    public final ParcelableSnapshotMutableState onLeadingIconClick$delegate;
    public final ParcelableSnapshotMutableState onTrailingIconClick$delegate;
    public final ParcelableSnapshotMutableState placeholder$delegate;
    public final ParcelableSnapshotMutableState readOnly$delegate;
    public Boolean showKeyboardOnFocus;
    public final ParcelableSnapshotMutableState trailingIcon$delegate;
    public final ParcelableSnapshotMutableState trailingIconContentDescription$delegate;
    public final RadioBinding$value$1 value;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public final TextFieldState composeTextFieldState = new TextFieldState((String) null, 3);
    public app.cash.arcade.values.TextFieldState treehouseTextFieldState = new app.cash.arcade.values.TextFieldState((String) null, 0, 0, 15);
    public final ParcelableSnapshotMutableState enabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);

    public final class PasswordOutputTransformation implements OutputTransformation {
        public static final PasswordOutputTransformation INSTANCE = new PasswordOutputTransformation();

        @Override // androidx.compose.foundation.text.input.OutputTransformation
        public final void transformOutput(TextFieldBuffer textFieldBuffer) {
            int length = textFieldBuffer.buffer.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                textFieldBuffer.replace(i, i2, "•");
                i = i2;
            }
        }
    }

    public InputFieldBinding(Context context) {
        this.value = new RadioBinding$value$1(context, this, 2);
        Boolean bool = Boolean.FALSE;
        this.readOnly$delegate = Updater.mutableStateOf$default(bool);
        this.isError$delegate = Updater.mutableStateOf$default(bool);
        this.isPassword$delegate = Updater.mutableStateOf$default(bool);
        this.label$delegate = Updater.mutableStateOf$default(null);
        this.leadingIcon$delegate = Updater.mutableStateOf$default(null);
        this.leadingIconContentDescription$delegate = Updater.mutableStateOf$default(null);
        this.onLeadingIconClick$delegate = Updater.mutableStateOf$default(null);
        this.trailingIcon$delegate = Updater.mutableStateOf$default(null);
        this.trailingIconContentDescription$delegate = Updater.mutableStateOf$default(null);
        this.onTrailingIconClick$delegate = Updater.mutableStateOf$default(null);
        this.helperText$delegate = Updater.mutableStateOf$default(null);
        this.placeholder$delegate = Updater.mutableStateOf$default(null);
        this.onKeyboardAction$delegate = Updater.mutableStateOf$default(null);
        this.lineLimits$delegate = Updater.mutableStateOf$default(TextFieldLineLimits.SingleLine.INSTANCE);
        this.capitalization = -1;
        this.keyboardType = 0;
        this.imeAction = -1;
        this.keyboardOptions$delegate = Updater.mutableStateOf$default(new KeyboardOptions(this.capitalization, this.autoCorrectEnabled, this.keyboardType, this.imeAction, this.showKeyboardOnFocus, 80));
        this.onChange$delegate = Updater.mutableStateOf$default(null);
        this.onFocusChange$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.ChangeListener
    public final void onEndChanges() {
        if (this.keyboardOptionsChanged) {
            this.keyboardOptionsChanged = false;
            this.keyboardOptions$delegate.setValue(new KeyboardOptions(this.capitalization, this.autoCorrectEnabled, this.keyboardType, this.imeAction, this.showKeyboardOnFocus, 80));
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
