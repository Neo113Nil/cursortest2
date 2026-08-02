package com.google.android.material.timepicker;

import A3.p;
import O.X;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: n, reason: collision with root package name */
    public final Chip f36908n;

    /* renamed from: u, reason: collision with root package name */
    public final EditText f36909u;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C5248R.layout.material_time_chip, (ViewGroup) this, false);
        this.f36908n = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C5248R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f36909u = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(C5248R.id.material_label);
        WeakHashMap weakHashMap = X.f2142a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36908n.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36909u.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z6) {
        Chip chip = this.f36908n;
        chip.setChecked(z6);
        int i = z6 ? 0 : 4;
        EditText editText = this.f36909u;
        editText.setVisibility(i);
        chip.setVisibility(z6 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new p(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f36908n.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f36908n.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f36908n.toggle();
    }
}
