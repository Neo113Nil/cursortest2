package com.google.android.material.timepicker;

import O.K;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class r implements n {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final p f2763c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2764d;
    public final ChipTextInputComboView e;

    /* renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f2765f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f2766g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f2767h;
    public final MaterialButtonToggleGroup i;

    public r(LinearLayout linearLayout, k kVar) {
        p pVar = new p(0, this);
        this.f2763c = pVar;
        p pVar2 = new p(1, this);
        this.f2764d = pVar2;
        this.f2761a = linearLayout;
        this.f2762b = kVar;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f2765f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (kVar.f2742c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.i = materialButtonToggleGroup;
            materialButtonToggleGroup.f2435c.add(new s(1, this));
            this.i.setVisibility(0);
            g();
        }
        t tVar = new t(1, this);
        chipTextInputComboView2.setOnClickListener(tVar);
        chipTextInputComboView.setOnClickListener(tVar);
        i iVar = kVar.f2741b;
        EditText editText = chipTextInputComboView2.f2664c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = iVar;
        editText.setFilters(inputFilterArr);
        i iVar2 = kVar.f2740a;
        EditText editText2 = chipTextInputComboView.f2664c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = iVar2;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f2663b;
        EditText editText3 = textInputLayout.getEditText();
        this.f2766g = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f2663b;
        EditText editText4 = textInputLayout2.getEditText();
        this.f2767h = editText4;
        o oVar = new o(chipTextInputComboView2, chipTextInputComboView, kVar);
        K.l(chipTextInputComboView2.f2662a, new q(linearLayout.getContext(), kVar, 0));
        K.l(chipTextInputComboView.f2662a, new q(linearLayout.getContext(), kVar, 1));
        editText3.addTextChangedListener(pVar2);
        editText4.addTextChangedListener(pVar);
        d(kVar);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(oVar);
        editText5.setOnKeyListener(oVar);
        editText6.setOnKeyListener(oVar);
    }

    public final void a(int i) {
        this.f2762b.f2744f = i;
        this.e.setChecked(i == 12);
        this.f2765f.setChecked(i == 10);
        g();
    }

    public final void b() {
        k kVar = this.f2762b;
        this.e.setChecked(kVar.f2744f == 12);
        this.f2765f.setChecked(kVar.f2744f == 10);
    }

    @Override // com.google.android.material.timepicker.n
    public final void c() {
        this.f2761a.setVisibility(0);
        a(this.f2762b.f2744f);
    }

    public final void d(k kVar) {
        p pVar = this.f2764d;
        EditText editText = this.f2766g;
        editText.removeTextChangedListener(pVar);
        p pVar2 = this.f2763c;
        EditText editText2 = this.f2767h;
        editText2.removeTextChangedListener(pVar2);
        Locale locale = this.f2761a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(kVar.e));
        String format2 = String.format(locale, "%02d", Integer.valueOf(kVar.b()));
        ChipTextInputComboView chipTextInputComboView = this.e;
        String a2 = k.a(chipTextInputComboView.getResources(), format, "%02d");
        chipTextInputComboView.f2662a.setText(a2);
        if (!TextUtils.isEmpty(a2)) {
            p pVar3 = chipTextInputComboView.f2665d;
            EditText editText3 = chipTextInputComboView.f2664c;
            editText3.removeTextChangedListener(pVar3);
            editText3.setText(a2);
            editText3.addTextChangedListener(pVar3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f2765f;
        String a3 = k.a(chipTextInputComboView2.getResources(), format2, "%02d");
        chipTextInputComboView2.f2662a.setText(a3);
        if (!TextUtils.isEmpty(a3)) {
            p pVar4 = chipTextInputComboView2.f2665d;
            EditText editText4 = chipTextInputComboView2.f2664c;
            editText4.removeTextChangedListener(pVar4);
            editText4.setText(a3);
            editText4.addTextChangedListener(pVar4);
        }
        editText.addTextChangedListener(pVar);
        editText2.addTextChangedListener(pVar2);
        g();
    }

    @Override // com.google.android.material.timepicker.n
    public final void e() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.f2761a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) focusedChild.getContext().getSystemService(InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.n
    public final void f() {
        d(this.f2762b);
    }

    public final void g() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.i;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.f2762b.f2745g == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }
}
