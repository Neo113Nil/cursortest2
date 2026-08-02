package defpackage;

import android.widget.Button;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialDatePicker;

/* loaded from: classes11.dex */
public final class v710 extends o070 {
    public final /* synthetic */ MaterialDatePicker a;

    public v710(MaterialDatePicker materialDatePicker) {
        this.a = materialDatePicker;
    }

    @Override // defpackage.o070
    public final void a() {
        Button button;
        button = this.a.confirmButton;
        button.setEnabled(false);
    }

    @Override // defpackage.o070
    public final void b(Object obj) {
        Button button;
        DateSelector dateSelector;
        MaterialDatePicker materialDatePicker = this.a;
        materialDatePicker.updateHeader(materialDatePicker.getHeaderText());
        button = materialDatePicker.confirmButton;
        dateSelector = materialDatePicker.getDateSelector();
        button.setEnabled(dateSelector.isSelectionComplete());
    }
}
