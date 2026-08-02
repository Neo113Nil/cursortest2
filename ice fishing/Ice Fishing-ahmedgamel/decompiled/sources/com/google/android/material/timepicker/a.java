package com.google.android.material.timepicker;

import A3.m;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f36939n;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f36939n = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f36939n;
        if (isEmpty) {
            chipTextInputComboView.f36908n.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a9 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f36908n;
        if (TextUtils.isEmpty(a9)) {
            a9 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a9);
    }
}
