package com.google.android.material.timepicker;

import O.K;
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
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Chip f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f2664c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2665d;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f2662a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f2663b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f2664c = editText;
        editText.setVisibility(4);
        p pVar = new p(2, this);
        this.f2665d = pVar;
        editText.addTextChangedListener(pVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = K.f747a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2662a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2664c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        Chip chip = this.f2662a;
        chip.setChecked(z2);
        int i = z2 ? 0 : 4;
        EditText editText = this.f2664c;
        editText.setVisibility(i);
        chip.setVisibility(z2 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new D.a(2, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2662a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f2662a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f2662a.toggle();
    }
}
