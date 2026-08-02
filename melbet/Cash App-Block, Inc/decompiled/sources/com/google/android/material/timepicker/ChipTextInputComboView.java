package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ClockFaceView;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Chip chip;
    public String chipText;
    public final EditText editText;
    public final ClockFaceView.AnonymousClass2 editTextAccessibilityDelegate;
    public boolean hasError;
    public final TextView label;
    public ColorStateList originalChipBackgroundColor;
    public int originalChipStrokeColor;
    public ColorStateList originalChipTextColor;
    public ColorStateList originalEditTextColor;
    public ColorStateList originalEditTextCursorColor;
    public ColorStateList originalLabelColor;
    public final TextInputLayout textInputLayout;
    public final EndCompoundLayout.AnonymousClass1 watcher;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.chipText = "";
        this.hasError = false;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.chip = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.textInputLayout = textInputLayout;
        EditText editText = textInputLayout.editText;
        this.editText = editText;
        editText.setVisibility(4);
        EndCompoundLayout.AnonymousClass1 anonymousClass1 = new EndCompoundLayout.AnonymousClass1(this, 1);
        this.watcher = anonymousClass1;
        editText.addTextChangedListener(anonymousClass1);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.label = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        this.editTextAccessibilityDelegate = new ClockFaceView.AnonymousClass2(this, 7);
    }

    public final String formatText(CharSequence charSequence) {
        try {
            return String.format(getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.chip.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Chip chip = this.chip;
        chip.setChecked(z);
        if (z) {
            chip.setText("");
            chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.chipText);
            chip.setImportantForAccessibility(1);
        }
        int i = z ? 0 : 4;
        EditText editText = this.editText;
        editText.setVisibility(i);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new ViewUtils$$ExternalSyntheticLambda0(editText, 0));
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.chip, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z) {
        this.editText.setCursorVisible(z);
    }

    public void setError(boolean z) {
        if (this.hasError == z) {
            return;
        }
        this.hasError = z;
        Chip chip = this.chip;
        TextInputLayout textInputLayout = this.textInputLayout;
        EditText editText = this.editText;
        TextView textView = this.label;
        if (!z) {
            chip.setChipBackgroundColor(this.originalChipBackgroundColor);
            chip.setTextColor(this.originalChipTextColor);
            editText.setTextColor(this.originalEditTextColor);
            textInputLayout.setBoxStrokeColor(this.originalChipStrokeColor);
            textView.setTextColor(this.originalLabelColor);
            textInputLayout.setCursorColor(this.originalEditTextCursorColor);
            return;
        }
        ChipDrawable chipDrawable = chip.chipDrawable;
        this.originalChipBackgroundColor = chipDrawable != null ? chipDrawable.chipBackgroundColor : null;
        this.originalChipTextColor = chip.getTextColors();
        this.originalEditTextColor = editText.getTextColors();
        this.originalLabelColor = textView.getTextColors();
        this.originalChipStrokeColor = textInputLayout.focusedStrokeColor;
        int resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorError));
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorErrorContainer);
        ColorStateList colorStateListOrNull2 = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorOnErrorContainer);
        if (colorStateListOrNull == null || colorStateListOrNull2 == null) {
            return;
        }
        chip.setChipBackgroundColor(colorStateListOrNull);
        chip.setTextColor(colorStateListOrNull2);
        editText.setTextColor(colorStateListOrNull2);
        textInputLayout.setBoxStrokeColor(resolveColor);
        textView.setTextColor(resolveColor);
        this.originalEditTextCursorColor = textInputLayout.cursorColor;
        textInputLayout.setCursorColor(colorStateListOrNull2);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.chip.setTag(i, obj);
    }

    public void setText(CharSequence charSequence) {
        String formatText = formatText(charSequence);
        this.chipText = formatText;
        this.chip.setText(formatText);
        if (TextUtils.isEmpty(formatText)) {
            return;
        }
        EditText editText = this.editText;
        EndCompoundLayout.AnonymousClass1 anonymousClass1 = this.watcher;
        editText.removeTextChangedListener(anonymousClass1);
        editText.setText(formatText);
        ViewCompat.setAccessibilityDelegate(editText, this.editTextAccessibilityDelegate);
        editText.addTextChangedListener(anonymousClass1);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.chip.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }
}
