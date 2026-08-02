package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* loaded from: classes3.dex */
public final class xj4 extends res {
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj4(ViewGroup viewGroup, int i) {
        super(1);
        this.b = i;
        this.c = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.b) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(editable);
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) this.c;
                Chip chip = chipTextInputComboView.a;
                if (!isEmpty) {
                    String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
                    if (TextUtils.isEmpty(a)) {
                        a = ChipTextInputComboView.a(chipTextInputComboView, "00");
                    }
                    chip.setText(a);
                    break;
                } else {
                    chip.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                    break;
                }
            default:
                ((a7b) this.c).a().a();
                break;
        }
    }

    @Override // defpackage.res, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.b) {
            case 1:
                ((a7b) this.c).a().b();
                break;
            default:
                super.beforeTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
