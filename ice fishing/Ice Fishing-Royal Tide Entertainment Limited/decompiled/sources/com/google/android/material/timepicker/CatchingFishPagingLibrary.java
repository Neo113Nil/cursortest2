package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import kotlin.text.CatchingFishFluxToast;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary extends CatchingFishFluxToast {
    public final /* synthetic */ ChipTextInputComboView CatchingFishReduxKtor;

    public CatchingFishPagingLibrary(ChipTextInputComboView chipTextInputComboView) {
        this.CatchingFishReduxKtor = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.CatchingFishReduxKtor;
        if (isEmpty) {
            chipTextInputComboView.CatchingFishReduxKtor.setText(ChipTextInputComboView.CatchingFishParcelableFAB(chipTextInputComboView, "00"));
            return;
        }
        String CatchingFishParcelableFAB = ChipTextInputComboView.CatchingFishParcelableFAB(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.CatchingFishReduxKtor;
        if (TextUtils.isEmpty(CatchingFishParcelableFAB)) {
            CatchingFishParcelableFAB = ChipTextInputComboView.CatchingFishParcelableFAB(chipTextInputComboView, "00");
        }
        chip.setText(CatchingFishParcelableFAB);
    }
}
