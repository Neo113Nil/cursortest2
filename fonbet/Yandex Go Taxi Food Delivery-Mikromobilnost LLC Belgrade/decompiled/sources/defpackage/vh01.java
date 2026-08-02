package defpackage;

import android.view.View;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorItemView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class vh01 implements zo31 {
    public final TransferDateSelectorItemView a;
    public final RobotoTextView b;

    public vh01(TransferDateSelectorItemView transferDateSelectorItemView, RobotoTextView robotoTextView) {
        this.a = transferDateSelectorItemView;
        this.b = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
