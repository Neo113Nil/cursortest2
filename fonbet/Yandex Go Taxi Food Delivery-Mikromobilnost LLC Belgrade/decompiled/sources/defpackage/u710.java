package defpackage;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* loaded from: classes11.dex */
public final /* synthetic */ class u710 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDatePicker b;

    public /* synthetic */ u710(MaterialDatePicker materialDatePicker, int i) {
        this.a = i;
        this.b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MaterialDatePicker materialDatePicker = this.b;
        switch (i) {
            case 0:
                materialDatePicker.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                materialDatePicker.onPositiveButtonClick(view);
                break;
            default:
                materialDatePicker.onNegativeButtonClick(view);
                break;
        }
    }
}
