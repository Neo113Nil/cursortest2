package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.gamericefishpro.space.fa.k;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k {
    public final /* synthetic */ ChipTextInputComboView d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.d = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.d;
        if (zIsEmpty) {
            chipTextInputComboView.d.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.d;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}
